package lec1.ex2;

import lec1.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClass {
    @Bean(name="myBean")
    public MyBean getMyBean() {
        return new MyBean();
    }
}
