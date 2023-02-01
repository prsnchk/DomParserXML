import org.w3c.dom.Document;
import parser.OrderParserService;

import javax.xml.validation.Schema;

import static validator.DomValidator.*;

public class Main {

    public static void main(String[] args) {
        Schema schema = loadSchema("src/main/resources/order_delivery.xsd");
        Document document = parseXmlDom("src/main/resources/order_delivery.xml");
        validateXml(schema, document);

        OrderParserService parserService = new OrderParserService();
        parserService.start();
    }
}