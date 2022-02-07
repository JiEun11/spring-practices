package com.poscoict.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.poscoict.container.user.User1;

public class XmlConfigTest {

	public static void main(String[] args) {

//		testBeanFactory01();
		testBeanFactory02();
	}
	
	/* beanFactory를 구현한 test method..? */
	// XML Auto Configuration (Annotation Scanning)
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/poscoict/container/config/user/applicationContext1.xml"));

		User1 user1 = bf.getBean(User1.class); // User1타입의 bean을 하나 내놔
		System.out.println(user1.getName());

		// Bean id가 자동으로 설정 된다. : bean의 id 가져오기
		user1 = (User1) bf.getBean("user1");
		System.out.println(user1.getName());
	}

	// XML Bean Configuration (Explicit Configuration)
	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/poscoict/container/config/user/applicationContext2.xml"));

		User1 user1 = bf.getBean(User1.class); // User1타입의 bean을 하나 내놔
		System.out.println(user1.getName());

		// Bean id가 자동으로 설정 되지 않음.
		// 명시적으로 설정 해야한다.
		user1 = (User1) bf.getBean("user1");
		System.out.println(user1.getName());
	}
}
