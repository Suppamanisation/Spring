package lec1.ex2;

import lec1.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFromClass {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanClass.class);
        MyBean bean = context.getBean("myBean", MyBean.class);

        bean.print();
    }
}
