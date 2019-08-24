package fromjava.server;

import javax.jws.WebMethod;

/**
 * comando para generar cliente
 * wsimport -d E:\eclipse\workspaces\jaxws-ri -p fromjava.server.client http://localhost:8080/Example_JAX_WS/IAddNumbers?wsdl
 */
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
//@SOAPBinding()
public interface IAddNumbers {
	
	@WebMethod
	public int addNumbers(int number1, int number2) throws AddNumbersException;

}
