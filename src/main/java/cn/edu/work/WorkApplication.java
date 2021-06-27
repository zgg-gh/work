package cn.edu.work;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class WorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkApplication.class, args);
//		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
	}

}
