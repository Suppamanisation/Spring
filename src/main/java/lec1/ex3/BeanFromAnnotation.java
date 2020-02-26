package lec1.ex3;

import lec1.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFromAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotation.xml");
        MyBean bean = context.getBean(MyBean.class);

        bean.print();
    }
}
