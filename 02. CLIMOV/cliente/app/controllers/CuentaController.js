import { XMLParser } from 'fast-xml-parser';

const endpoint = 'http://192.168.18.158:8094/ec.edu.monster.controlador/MovimientoController.svc?wsdl';

/**
 * Obtiene los movimientos de una cuenta específica mediante SOAP.
 * @param {string} cuenta - Número de cuenta
 * @returns {Promise<Array>} - Lista de movimientos [{Cuenta, NroMov, Fecha, Tipo, Accion, Importe}]
 */
export async function traerMovimientos(cuenta) {
  const xml = `
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:con="http://controller.eurekabank.edu.ec/">
      <soapenv:Header/>
      <soapenv:Body>
        <con:ObtenerPorCuenta>
          <cuenta>${cuenta}</cuenta>
        </con:ObtenerPorCuenta>
      </soapenv:Body>
    </soapenv:Envelope>`;

  try {
    const res = await fetch(endpoint, {
      method: 'POST',
      headers: {
        'Content-Type': 'text/xml;charset=UTF-8',
        'SOAPAction': ''
      },
      body: xml
    });

    const xmlText = await res.text();

    const parser = new XMLParser({ ignoreAttributes: false });
    const parsed = parser.parse(xmlText);

    const movimientos = parsed['soapenv:Envelope']?.['soapenv:Body']?.['ns2:ObtenerPorCuentaResponse']?.return;

    if (!movimientos) return [];

    // Normalizamos para devolver siempre un array
    return Array.isArray(movimientos) ? movimientos : [movimientos];

  } catch (err) {
    console.error('Error al traer movimientos:', err);
    return [];
  }
}
