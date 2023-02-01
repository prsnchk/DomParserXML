package parser;

import model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class OrderParserService {

    public void start(){
        try {
            OrderDelivery orderDeliveryFromXml = new OrderDelivery();
            Customer customerFromXml = new Customer();
            Courier courierFromXml = new Courier();
            Cafe cafeFromXml = new Cafe();
            DeliveryProvider deliveryProviderFromXml = new DeliveryProvider();
            PaymentType paymentTypeFromXml = new PaymentType();


            File inputFile = new File("src/main/resources/order_delivery.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("order_delivery");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    orderDeliveryFromXml.setOrderID(Integer.parseInt(eElement.getAttribute("id")));
                    orderDeliveryFromXml.setPrice(Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent()));
                }
            }

            NodeList nList1 = doc.getElementsByTagName("customer");
            for (int temp = 0; temp < nList1.getLength(); temp++) {
                Node nNode = nList1.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    customerFromXml.setCustomerId(Integer.parseInt(eElement.getAttribute("id")));
                    customerFromXml.setFirstName(eElement.getElementsByTagName("first_name").item(0).getTextContent());
                    customerFromXml.setSecondName(eElement.getElementsByTagName("second_name").item(0).getTextContent());
                    customerFromXml.setPhone(eElement.getElementsByTagName("phone").item(0).getTextContent());
                    customerFromXml.setEmail(eElement.getElementsByTagName("email").item(0).getTextContent());
                }
            }

            NodeList nList2 = doc.getElementsByTagName("courier");
            for (int temp = 0; temp < nList2.getLength(); temp++) {
                Node nNode = nList2.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    courierFromXml.setId(Integer.parseInt(eElement.getAttribute("id")));
                    courierFromXml.setFirstName(eElement.getElementsByTagName("first_name").item(0).getTextContent());
                    courierFromXml.setLastName(eElement.getElementsByTagName("last_name").item(0).getTextContent());
                }
            }

            NodeList nList3 = doc.getElementsByTagName("cafe");
            for (int temp = 0; temp < nList3.getLength(); temp++) {
                Node nNode = nList3.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    cafeFromXml.setId(Integer.parseInt(eElement.getAttribute("id")));
                    cafeFromXml.setCafeName(eElement.getElementsByTagName("cafe_name").item(0).getTextContent());
                }
            }

            NodeList nList4 = doc.getElementsByTagName("delivery_provider");
            for (int temp = 0; temp < nList4.getLength(); temp++) {
                Node nNode = nList4.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    deliveryProviderFromXml.setId(Integer.parseInt(eElement.getAttribute("id")));
                    deliveryProviderFromXml.setProviderName(eElement.getElementsByTagName("provider_name").item(0).getTextContent());
                }
            }

            NodeList nList5 = doc.getElementsByTagName("payment_type");
            for (int temp = 0; temp < nList5.getLength(); temp++) {
                Node nNode = nList5.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    paymentTypeFromXml.setId(Integer.parseInt(eElement.getAttribute("id")));
                    paymentTypeFromXml.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                }
            }

            orderDeliveryFromXml.setCafe(cafeFromXml);
            orderDeliveryFromXml.setCourier(courierFromXml);
            orderDeliveryFromXml.setCustomer(customerFromXml);
            orderDeliveryFromXml.setPaymentType(paymentTypeFromXml);
            orderDeliveryFromXml.setDeliveryProvider(deliveryProviderFromXml);

            System.out.println(orderDeliveryFromXml.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

