package lec1.ex1;

import lec1.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        MyBean bean = context.getBean("myBean",MyBean.class);
        bean.print();
    }
}
