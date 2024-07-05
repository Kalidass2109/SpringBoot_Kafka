package in.kali.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import in.kali.constants.AppConstants;

@Configuration
public class KafkaProducerConfig {
	
	//KafkaTemplate is predefined class, which used to communicate with kafka topic
	@Bean
	public KafkaTemplate<String, Object> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory()); //KafkaTemplate is predefined class, which is having a method to 
														//publish message to kafka topic
	}
	
	@Bean
	public ProducerFactory<String, Object> producerFactory(){
		
		Map<String, Object> configProps=new HashMap<>();
		
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class); //key is topic name
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class); //value will be the data
		
		return new DefaultKafkaProducerFactory<>(configProps);
	}

}
