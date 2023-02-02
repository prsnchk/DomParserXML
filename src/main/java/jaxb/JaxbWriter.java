package jaxb;

import model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.io.IOException;

public class JaxbWriter {

    public void marshall(OrderDelivery orderDelivery) throws JAXBException, IOException {
        JAXBContext orderContext = JAXBContext.newInstance(OrderDelivery.class);
        Marshaller orderMarshaller = orderContext.createMarshaller();
        orderMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        orderMarshaller.marshal(orderDelivery, new FileOutputStream("src/main/resources/out_order_delivery.xml"));
    }
}
