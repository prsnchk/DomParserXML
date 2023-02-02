package jaxb;

import model.OrderDelivery;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileReader;
import java.io.IOException;

public class JaxbReader {
    public OrderDelivery unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(OrderDelivery.class);
        return (OrderDelivery) context.createUnmarshaller().unmarshal(new FileReader("src/main/resources/order_delivery.xml"));
    }
}