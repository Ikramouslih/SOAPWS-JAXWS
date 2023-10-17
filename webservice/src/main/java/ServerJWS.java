import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

//a http connector to the webservice that we have created
//when it is run, it generates the web service's wsdl
//http://localhost:9191/BanqueWS?wsdl
//wsdl is an XML file that describes the web service
public class ServerJWS {
    public static void main(String[] args) {
        //publish() Runs a http server
        //that will use the 9191 port
        //to consult the banqueService Web Service only
        //can be accessible by any ip address
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service deployed on http://0.0.0.0:9191/");
    }
}
