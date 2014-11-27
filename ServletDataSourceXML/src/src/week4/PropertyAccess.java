package src.week4;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class PropertyAccess implements IPropertyAccess{
	
	@Override
	public String getProperty(String property) {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		String statement = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse (new File("./WebContent/WEB-INF/properties.xml"));
			// normalize text representation
			
			doc.getDocumentElement ().normalize ();
			Element root = doc.getDocumentElement();
			NodeList nodeList = root.getElementsByTagName(property);
			statement= nodeList.item(0).getTextContent().toString();
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}

 
}
