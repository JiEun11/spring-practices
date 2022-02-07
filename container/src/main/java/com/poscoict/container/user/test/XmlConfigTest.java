package com.poscoict.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.poscoict.container.user.User;
import com.poscoict.container.user.User1;

public class XmlConfigTest {

	public static void main(String[] args) {

//		testBeanFactory01();
//		testBeanFactory02();
//		testApplicationContext01();
		testApplicationContext02();
	}
	
	// XML Bean Configuration (Explicit Configuration)
		private static void testApplicationContext02() {
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscoict/container/config/user/applicationContext2.xml");
			User user = null;
			// id로 bean 가져오기  
			user = (User) ac.getBean("user");
			System.out.println(user);
			
			//name으로 가져오기 
			user = (User) ac.getBean("usr");
			System.out.println(user);
			
			//Type으로 빈 가져오기 
			// 같은 타입의 빈이 두 개 이상 있으면, type으로 가져오기 실패 :error 발생함
			// 1. id + type
			// 2. name + type
			user = ac.getBean("user2",User.class);
			System.out.println(user);
			
			// 2개 parameter 생성자로 생성된 빈 가져오기 
			user = (User) ac.getBean("user3");
			System.out.println(user);
			
			// 2개 parameter 생성자로 생성된 빈 가져오기2 
			user = (User) ac.getBean("user4");
			System.out.println(user);
		}
		
	// XML Auto Configuration (Annotation Scanning)
	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscoict/container/config/user/applicationContext1.xml");

		User1 user1 = ac.getBean(User1.class); // User1타입의 bean을 하나 내놔
		System.out.println(user1.getName());

		// Bean id가 자동으로 설정 된다. : bean의 id 가져오기
		user1 = (User1) ac.getBean("user1");
		System.out.println(user1.getName());
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
