package in.kali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.kali.constants.AppConstants;

@SpringBootApplication
public class KafkaConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerAppApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.ORDER_TOPIC, groupId = "group_kali_orders")
	public void getMsg(String order) {
		System.out.println("*** Msg Received From Kafka Topic ***");
		System.out.println(order);
		
		//logic to process
	}

}
