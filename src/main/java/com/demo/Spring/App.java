package com.demo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
      ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
      Student std1=context.getBean(Student.class,"student");
      System.out.println(std1);
    }
}
