package Lesson23;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;

public class DomParser {
    public void parse() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File("./src/main/java/Lesson23/Shakespearean.xml"));
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            String firstName = root
                    .getElementsByTagName("firstName")
                    .item(0)
                    .getTextContent();

            String lastName = root
                    .getElementsByTagName("lastName")
                    .item(0)
                    .getTextContent();

            String title = root
                    .getElementsByTagName("title")
                    .item(0)
                    .getTextContent();

            NodeList nodeList = document.getElementsByTagName("line");


            try (FileWriter writer = new FileWriter(firstName + "_" + lastName + "_" + title + ".txt")) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    writer.write(nodeList.item(i).getTextContent() + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
