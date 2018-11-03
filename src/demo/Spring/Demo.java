package demo.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
			Resource resource = new ClassPathResource("applicationConfig.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			
			Student st = (Student)factory.getBean("agu");
			
			System.out.println(st.getId());
			System.out.println(st.getName());
			
			Student st2 = (Student)factory.getBean("agu");
			
			System.out.println(st2.getId());
			System.out.println(st2.getName());
			
	}

}
