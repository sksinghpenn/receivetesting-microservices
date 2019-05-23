package com.lifotech.vpp.microservices.receivetesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.io.IOException;


@SpringBootApplication
public class MessagetestingApplication {

    public static void main(String[] args) throws JMSException {

        ApplicationContext ctx = SpringApplication.run(MessagetestingApplication.class, args);

        JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
        System.out.println("Receive timeout : " + jmsTemplate.getReceiveTimeout());
        //jmsTemplate.setReceiveTimeout(1000);

        String message = (String)jmsTemplate.receiveAndConvert("positionQueue");

        System.out.println(message);


    }
}
