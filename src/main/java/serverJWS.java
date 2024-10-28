import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class serverJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/myService",new BanqueService());
        System.out.println("Web Service deploye sur http://localhost:8000/myService");
    }
}
