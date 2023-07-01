package xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignUser80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignUser80.class, args);
    }
}
