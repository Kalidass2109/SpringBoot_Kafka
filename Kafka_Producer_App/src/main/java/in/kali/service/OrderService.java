package in.kali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.kali.binding.Order;
import in.kali.constants.AppConstants;

@Service
public class OrderService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public String createOrder(Order order) {
		kafkaTemplate.send(AppConstants.ORDER_TOPIC, order);
		
		return "Order Created in kafka topic";
	}

}
