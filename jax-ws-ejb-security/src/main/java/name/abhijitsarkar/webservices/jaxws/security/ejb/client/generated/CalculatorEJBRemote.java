
package name.abhijitsarkar.webservices.jaxws.security.ejb.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorEJBRemote", targetNamespace = "http://ejb.security.jaxws.webservices.abhijitsarkar.name/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorEJBRemote {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://ejb.security.jaxws.webservices.abhijitsarkar.name/", className = "name.abhijitsarkar.webservices.jaxws.security.ejb.client.generated.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://ejb.security.jaxws.webservices.abhijitsarkar.name/", className = "name.abhijitsarkar.webservices.jaxws.security.ejb.client.generated.AddResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
