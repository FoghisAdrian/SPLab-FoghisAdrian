package services;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Object> beans = new HashMap<>();

    public Context(String xmlFile) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(xmlFile);

            if (inputStream == null) {
                throw new FileNotFoundException("Cannot find " + xmlFile + " in classpath");
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("bean");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("id");
                    String className = element.getAttribute("class");

                    NodeList args = element.getElementsByTagName("constructor-arg");
                    Object obj;

                    if (args.getLength() > 0) {
                        String argValue = args.item(0).getAttributes().getNamedItem("value").getTextContent();
                        Constructor<?> constructor = Class.forName(className).getConstructor(String.class);
                        obj = constructor.newInstance(argValue);
                    } else {
                        obj = Class.forName(className).getConstructor().newInstance();
                    }

                    beans.put(id, obj);
                }
            }

            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String id) {
        return beans.get(id);
    }
}

