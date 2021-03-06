
package cn.edu.work.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherInterfaceImplService", targetNamespace = "http://work.edu.cn/", wsdlLocation = "http://127.0.0.1:12345/weather?wsdl")
public class WeatherInterfaceImplService
    extends Service
{

    private final static URL WEATHERINTERFACEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERINTERFACEIMPLSERVICE_EXCEPTION;
    private final static QName WEATHERINTERFACEIMPLSERVICE_QNAME = new QName("http://work.edu.cn/", "WeatherInterfaceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:12345/weather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERINTERFACEIMPLSERVICE_WSDL_LOCATION = url;
        WEATHERINTERFACEIMPLSERVICE_EXCEPTION = e;
    }

    public WeatherInterfaceImplService() {
        super(__getWsdlLocation(), WEATHERINTERFACEIMPLSERVICE_QNAME);
    }

    public WeatherInterfaceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERINTERFACEIMPLSERVICE_QNAME, features);
    }

    public WeatherInterfaceImplService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERINTERFACEIMPLSERVICE_QNAME);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERINTERFACEIMPLSERVICE_QNAME, features);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherInterfaceImpl
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterfaceImpl getWeatherInterfaceImplPort() {
        return super.getPort(new QName("http://work.edu.cn/", "WeatherInterfaceImplPort"), WeatherInterfaceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterfaceImpl
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterfaceImpl getWeatherInterfaceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://work.edu.cn/", "WeatherInterfaceImplPort"), WeatherInterfaceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERINTERFACEIMPLSERVICE_EXCEPTION!= null) {
            throw WEATHERINTERFACEIMPLSERVICE_EXCEPTION;
        }
        return WEATHERINTERFACEIMPLSERVICE_WSDL_LOCATION;
    }

}
