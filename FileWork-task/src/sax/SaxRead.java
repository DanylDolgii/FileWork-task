package sax;

import org.xml.sax.SAXException;
import utils.Constants;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxRead {

    private static final String PATH = Constants.RES_PATH + "purchases.xml";

    public static void main(String[] args) {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {

            SAXParser saxParser = factory.newSAXParser();

            SaxHandler handler = new SaxHandler();
            saxParser.parse(PATH, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
