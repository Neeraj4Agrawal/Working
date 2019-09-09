package com.qa.resources;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ReadSources {
	
	
	private Document domDocument;
	private Map<String, String> elementXml;

	public ReadSources() {
	}
	
	private Document parseXMl(String fileName) {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			domDocument = builder.parse(getFilePath(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return domDocument;
	}
	
	public Map<String, String> getValuesFromXml(String fileName, String tagName) {
		domDocument = parseXMl(fileName);
		elementXml = new HashMap<String, String>();
		NodeList nodeList = domDocument.getElementsByTagName(tagName);
		for (int j = 0; j < nodeList.item(0).getChildNodes().getLength(); j++) {
			if (j % 2 != 0) {
				elementXml.put(nodeList.item(0).getChildNodes().item(j).getNodeName(),
						nodeList.item(0).getChildNodes().item(j).getTextContent());
			}
		}
		return elementXml;
	}
	
	public String getFilePath(String sFilepath) {
		String sPath = System.getProperty("user.dir") + "\\src\\main\\java\\" + sFilepath;
		sPath = sPath.replace('\\', '/');
		File file = new File(sPath);
		if (file.exists()) {
			System.out.println("The File is Present wih the Path" + sPath);
		} else {
			System.out.print("File not Found");
		}
		return sPath;
	}

}
