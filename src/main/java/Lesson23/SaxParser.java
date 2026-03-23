package Lesson23;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaxParser extends DefaultHandler {

    private StringBuilder content = new StringBuilder();

    private String firstName;
    private String lastName;
    private String title;

    private FileWriter writer;

    public void parse() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            parser.parse(new File("./src/main/java/Lesson23/Shakespearean.xml"), this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startDocument() throws SAXException {
        firstName = null;
        lastName = null;
        title = null;
        writer = null;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        content.setLength(0);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = content.toString().trim();

        try {
            switch (qName) {
                case "firstName":
                    firstName = value;
                    break;

                case "lastName":
                    lastName = value;
                    break;

                case "title":
                    title = value;
                    createWriter();
                    break;

                case "line":
                    if (writer != null) {
                        writer.write(value + "\n");
                    }
                    break;
            }
        } catch (IOException e) {
            throw new SAXException(e);
        }
    }

    @Override
    public void endDocument() throws SAXException {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            throw new SAXException(e);
        }
    }

    private void createWriter() throws IOException {
        String fileName = firstName + "_" + lastName + "_" + title + ".txt";
        writer = new FileWriter(fileName);
    }
}