package com.sujan;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXmlSAXParser {

	public static void main(String[] args) {
		System.out.println("Inside main() of ReadXmlSAXParser class");
		
		try {
			
			SAXParserFactory factory=SAXParserFactory.newInstance();//Create Object of SAXParserFactory.
			
			SAXParser saxParser=factory.newSAXParser();//Use SAXParserFactory to create SAXParser Object.
			
			
			
			DefaultHandler handler=new DefaultHandler();//Default handler for SAX handler class
			
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		
	}

}
