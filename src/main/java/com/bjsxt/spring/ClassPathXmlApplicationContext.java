package com.bjsxt.spring;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.ObjectInput;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mark on 2016/6/29.
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() throws Exception {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(new File("bean.xml"));
        Element root = doc.getRootElement();
        List list = root.getChildren("bean");
        for (Object target : list) {
            Element element = (Element) target;
            String id =GetValuteByName(element,"id");
            String clazz =GetValuteByName(element,"class");
            System.out.println(id + " : " + clazz);
            Object o = Class.forName(clazz).newInstance();
            beans.put(id, o);
            for (Element propertyElement : (List<Element>) element.getChildren("property")) {
                String name =GetValuteByName(propertyElement,"name");   //userDAO
                String bean =GetValuteByName(propertyElement,"bean");   //u
                Object beanObject = beans.get(bean);   //UserDAOImpl   instance
                String methodName = "set" +name.substring(0,1).toUpperCase()+name.substring(1);   // could be setUserDAO
                System.out.println("Method Name : "+methodName);
                Method m = o.getClass().getMethod(methodName,beanObject.getClass().getInterfaces()[0]);
                m.invoke(o,beanObject);



            }
        }
    }

    private String GetValuteByName(Element element, String name) {
        return element.getAttributeValue(name);
    }

    public Object getBean(String name) {
        return beans.get(name);
    }
}
