package lec1.bean;

import org.springframework.stereotype.Service;

@Service
public class MyBean {
    public void print(){
        System.out.println("I've been called");
    }
}
