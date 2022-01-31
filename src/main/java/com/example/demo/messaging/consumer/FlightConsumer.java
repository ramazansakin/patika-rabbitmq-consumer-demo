package com.example.demo.messaging.consumer;


import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Flight;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FlightConsumer {

//    @RabbitListener(queues = RabbitMQConfig.QUEUE)
//    public void consumeMessageFromQueue(Flight flight) {
//        System.out.println("Flight message received & consumed from queue : " + flight);
//    }

}
