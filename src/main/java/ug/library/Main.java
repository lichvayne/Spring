package ug.library;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("ug.library");
        Library library = (Library) context.getBean("library", Library.class);
        Book book = (Book) context.getBean("book",Book.class);
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new BookDecorator());
        proxyFactory.setTarget(book);
        Book bookProxy = (Book) proxyFactory.getProxy();
        System.out.println(bookProxy.getBookDetails());
    }
}
