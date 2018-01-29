package UC;

import javax.xml.ws.Endpoint;
import UC.ca.java.uc.UCImpl;

public class UCPublisher {
    public static void main(String args[]){
        System.out.println("/////");
        Endpoint.publish("http://localhost:9901/UC", new UCImpl());
        System.out.println("done");
    }
}
