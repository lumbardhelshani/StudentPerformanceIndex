package server;


import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@EnableRabbit
//@EnableEurekaClient
@SpringBootApplication
public class StudentPerformanceIndexApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StudentPerformanceIndexApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentPerformanceIndexApplication.class, args);
    }
}
