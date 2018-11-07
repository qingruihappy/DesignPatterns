package com.DesignPatterns.ad.factory6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class ClassPathXmlApplicationContext implements BeanFactory  {
	private Map<String, Object> container = new HashMap<String, Object>();
	
	public ClassPathXmlApplicationContext(String fileName) throws Exception{
		//解析xml的不用太关心这里。主要是理解spring的bean的工厂机制。
		SAXBuilder sb = new SAXBuilder();
		  Document doc = sb.build(this.getClass().getClassLoader()
				  .getResourceAsStream(fileName));
		  Element root = doc.getRootElement();
		  List list = XPath.selectNodes(root, "/beans/bean");
		  System.out.println(list.size());
		  
		  for (int i = 0; i < list.size(); i++) { 
		   Element bean = (Element) list.get(i);
		   String id = bean.getAttributeValue("id");
		   String clazz = bean.getAttributeValue("class");
		   Object o = Class.forName(clazz).newInstance();
		   //最关键的就是在这把它的id和对象全部放到一个map中来，所谓的容器其实就是一个map，
		   //当项目启动的时候就会把所有的在xml配置文件中配置的对象全部都加载一遍，等用到的时候就会从map中取出来
		   //
		   container.put(id, o);
		   System.out.println(id + " " + clazz);
		  }

	}
	
	@Override
	public Object getBean(String id) {
		
		return container.get(id);
	}

}
