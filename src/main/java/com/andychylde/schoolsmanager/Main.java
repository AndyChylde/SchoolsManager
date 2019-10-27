package com.andychylde.schoolsmanager;

import com.andychylde.schoolsmanager.utils.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        Person aPerson = ctx.getBean("person", Person.class);
        aPerson.getPersonName().toString();
    }
}

