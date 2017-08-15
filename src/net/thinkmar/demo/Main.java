package net.thinkmar.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ReportService reportService = (ReportService) context.getBean("reportService");
        reportService.generateMonthlyReport(2011, 7);
    }
}
