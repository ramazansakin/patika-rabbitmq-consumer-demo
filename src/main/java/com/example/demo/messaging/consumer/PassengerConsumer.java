package com.example.demo.messaging.consumer;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Passenger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PassengerConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Passenger passenger) {
        System.out.println("Passenger message received & consumed from queue : " + passenger);
    }

}
