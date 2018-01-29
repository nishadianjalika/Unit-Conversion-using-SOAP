package UCclient;

//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import java.net.URL;
//import UC.ca.java.uc.UC;
import client.UC;
import client.UCImplService;


public class UCClient {
    public static  void main (String[] args) throws Exception {
//        //System.out.println("11111");
//        URL url=new URL("http://localhost:9901/UC?wsdl");
//       // System.out.println("222222");
//        QName qname=new QName("http://uc.java.ca.UC/","UCImplService");
//        Service service=Service.create(url,qname);
//        //System.out.println("33333");
//        qname=new QName("http://uc.java.ca.UC/","UCImplPort");
//        UC uc=service.getPort(qname,UC.class);
        UCImplService ucimpl=new UCImplService();
        UC uc=ucimpl.getUCImplPort();


//        System.out.printf("DC to DF: 37 DC = %f DF%n", uc.c2f(37.0));
//        System.out.printf("CM to IN: 10 CM = %f IN%n", uc.cm2in(10));
//        System.out.printf("DF to DC: 212 DF = %f DC%n", uc.f2c(212.0));
//        System.out.printf("IN to CM: 10 IN = %f CM%n", uc.in2cm(10));

        System.out.printf("DC to DF: 37 DC = %f DF%n", uc.c2F(37.0));
        System.out.printf("CM to IN: 10 CM = %f IN%n", uc.cm2In(10));
        System.out.printf("DF to DC: 212 DF = %f DC%n", uc.f2C(212.0));
        System.out.printf("IN to CM: 10 IN = %f CM%n", uc.in2Cm(10));

    }

}
