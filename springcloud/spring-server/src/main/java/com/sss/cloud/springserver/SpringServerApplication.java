package com.sss.cloud.springserver;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringServerApplication {
//sssssssssssssssss
    public static void main(String[] args) {
        SpringApplication.run(SpringServerApplication.class, args);
    }
}
