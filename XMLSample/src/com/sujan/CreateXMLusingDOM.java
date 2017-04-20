package com.sujan;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLusingDOM {

	public static void main(String[] args) {
		try{
			System.out.println("Inside try");
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.newDocument();//Using DocumentBuilder, create a DOM Object.Create new Document.
			
			Element studentsElement=doc.createElement("Students");//root element
			Element studentElement=doc.createElement("Student");
			Element nameElement=doc.createElement("Name");
			Element emailIdElement=doc.createElement("EmailId");
			
			Text nameText=doc.createTextNode("Sujan");
			Text emailIdText=doc.createTextNode("sujands23@gmail.com");
			
			nameElement.appendChild(nameText);
			emailIdElement.appendChild(emailIdText);
			
			studentElement.appendChild(nameElement);
			studentElement.appendChild(emailIdElement);
			
			studentsElement.appendChild(studentElement);
			
			doc.appendChild(studentsElement);
			
			TransformerFactory transformerFactory=TransformerFactory.newInstance();//Create a transformerFactoryObject.
			Transformer transformer=transformerFactory.newTransformer();//Use transformerFactoryObject to create transformerFactory.Use transformerFactory to create new Transformer.Using transformer, we will convert the data which is in DOM format to XML format.
			
			transformer.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("newXML.xml")));
			System.out.println("XML file generated");
		}
		catch(Exception ioe){
			ioe.printStackTrace();
		}
	}

}