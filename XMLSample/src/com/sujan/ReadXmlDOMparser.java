package com.sujan;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlDOMparser {

	public static void main(String[] args) {
		
		try {
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();//DocumentBuilderFactory class allows to build DocumentBuilderFactory Object.newInstance() is a static method which returns DocumentBuilderFactory Object.
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.parse("Data.xml");
			
			NodeList studentList=doc.getElementsByTagName("student");//NodeList has number of nodes.Get number of nodes in nodeList and loop. 
			System.out.println(studentList.getLength());//Gives the number of nodes in nodeList.
			
			for(int i=0;i<studentList.getLength();i++){
				Node node=studentList.item(i);//Get each node present in NodeList.
				//System.out.println(node.getTextContent());
				
				if(node.getNodeType()==Node.ELEMENT_NODE){//There are different types of nodes.Element node, text node, comment node.Check if node is of type element node.
					Element student=(Element)node;//Get element node
					System.out.println("Attribute value : "+student.getAttribute("id"));//Grab the value of id attribute in Student element.
					
					NodeList nameList=student.getChildNodes();
					for(int j=0;j<nameList.getLength();j++){
						Node n=nameList.item(j);
						
						if(n.getNodeType()==n.ELEMENT_NODE){
							Element name=(Element)n;
							System.out.println("Tag name : "+name.getTagName() +" Value : "+name.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		catch(SAXException se){
			se.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}