package studentinjection.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import studentinjection.model.Teacher;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Teacher teacherBean = (Teacher) context.getBean("teacherBean");
		teacherBean.showInfo();

		((ClassPathXmlApplicationContext) (context)).close();
	}
}
