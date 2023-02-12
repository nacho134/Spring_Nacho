package com.example.UT5_Spring.Inyecdep;

import com.example.UT5_Spring.model.Perro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InyeccionDependencias {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Perro p = (Perro) context.getBean("Perro");
        System.out.println("Bien hecho.");


    }
}
