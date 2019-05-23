package com.lifotech.vpp.microservices.receivetesting;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class MessageReceiveMDP {
    @JmsListener(destination = "positionQueue")
    public void processMessage(String message) {


        //System.out.println("WE ARE ATTEMPTING TO PROCESS A MESSAGE");

        //if (0 == 0) {
            //System.out.println("CHRASHED!!!");
            //throw new RuntimeException("REDEPLOYMENT -- STOPPED");
        //}

        System.out.println(message);
    }
}
