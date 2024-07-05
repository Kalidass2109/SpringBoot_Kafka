package in.kali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.kali.constants.AppConstants;

@SpringBootApplication
public class KafkaProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerAppApplication.class, args);
	}
}
