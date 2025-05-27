import { XMLParser } from 'fast-xml-parser';

const endpoint = 'http://192.168.18.158:8094/ec.edu.monster.controlador/MovimientoController.svc?wsdl';

async function enviarSoap(xmlBody, metodo) {
  try {
    const response = await fetch(endpoint, {
      method: 'POST',
      headers: {
        'Content-Type': 'text/xml;charset=UTF-8',
        'SOAPAction': metodo
      },
      body: xmlBody
    });

    const text = await response.text();
    const parser = new XMLParser({ ignoreAttributes: false });
    const parsed = parser.parse(text);

    const result = parsed['soapenv:Envelope']?.['soapenv:Body']?.[`ns2:${metodo}Response`]?.return;

    return result || '0';
  } catch (error) {
    console.error('Error en enviarSoap:', error);
    return '0';
  }
}

export async function regDeposito(cuenta, importe) {
  const xml = `
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:con="http://controller.eurekabank.edu.ec/">
      <soapenv:Header/>
      <soapenv:Body>
        <con:RegistrarDeposito>
          <cuenta>${cuenta}</cuenta>
          <importe>${importe}</importe>
        </con:RegistrarDeposito>
      </soapenv:Body>
    </soapenv:Envelope>`;
  return await enviarSoap(xml, 'RegistrarDeposito');
}

export async function regRetiro(cuenta, importe) {
  const xml = `
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:con="http://controller.eurekabank.edu.ec/">
      <soapenv:Header/>
      <soapenv:Body>
        <con:RegistrarRetiro>
          <cuenta>${cuenta}</cuenta>
          <importe>${importe}</importe>
        </con:RegistrarRetiro>
      </soapenv:Body>
    </soapenv:Envelope>`;
  return await enviarSoap(xml, 'RegistrarRetiro');
}

export async function regTransferencia(cuentaOrigen, cuentaDestino, importe) {
  const xml = `
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:con="http://controller.eurekabank.edu.ec/">
      <soapenv:Header/>
      <soapenv:Body>
        <con:RegistrarTransferencia>
          <cuentaOrigen>${cuentaOrigen}</cuentaOrigen>
          <cuentaDestino>${cuentaDestino}</cuentaDestino>
          <importe>${importe}</importe>
        </con:RegistrarTransferencia>
      </soapenv:Body>
    </soapenv:Envelope>`;
  return await enviarSoap(xml, 'RegistrarTransferencia');
}
