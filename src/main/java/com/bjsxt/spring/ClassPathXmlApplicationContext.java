package com.bjsxt.spring;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mark on 2016/6/29.
 */
public class ClassPathXmlApplicationContext implements BeanFactory{
    private Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() throws Exception {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(new File("bean.xml"));
        Element root = doc.getRootElement();
        List list = root.getChildren("bean");
        for(Object target:list){
            Element element = (Element)target;
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            System.out.println(id+" : "+clazz);
            Object o = Class.forName(clazz).newInstance();
            beans.put(id,o);
        }

    }

    public Object getBean(String name) {
        return beans.get(name);
    }
}
