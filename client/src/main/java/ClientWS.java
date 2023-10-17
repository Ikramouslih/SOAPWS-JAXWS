import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {

        //Middleware that allows my application to connect to the web service
        BanqueService stub = new BanqueWS().getBanqueServicePort();

        //The convert method is belongs to an object that exists in another machine
        System.out.println(stub.convert(7600));

        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
