import jaxb.JaxbReader;
import jaxb.JaxbWriter;
import model.*;
import org.w3c.dom.Document;
import parser.OrderParserService;
import javax.xml.bind.JAXBException;
import javax.xml.validation.Schema;
import java.io.IOException;

import static validator.DomValidator.*;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        Schema schema = loadSchema("src/main/resources/order_delivery.xsd");
        Document document = parseXmlDom("src/main/resources/order_delivery.xml");
        validateXml(schema, document);

        OrderParserService parserService = new OrderParserService();
        parserService.start();

        //JAXB Read xml
        JaxbReader jaxbReader = new JaxbReader();
        OrderDelivery orderDeliveryRead = jaxbReader.unmarshall();
        System.out.println(orderDeliveryRead);


        //Order for Write in xml
        Courier courier = new Courier(1, "Андрій", "Колобок");
        PaymentType paymentType = new PaymentType(1, "Готівкою");
        DeliveryProvider deliveryProvider = new DeliveryProvider(1, "Glovo");
        Cafe cafe = new Cafe(1, "ComfortTown");
        Customer customer = new Customer(1, "Джавеліна", "Прекрасна", "+380937648576", "dja@gmail.com");
        OrderDelivery orderDeliveryWrite = new OrderDelivery(1, 1500, customer, courier, cafe, deliveryProvider, paymentType);

        //JAXB Write xml
        JaxbWriter jaxbWriter = new JaxbWriter();
        jaxbWriter.marshall(orderDeliveryWrite);


    }
}