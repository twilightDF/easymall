package cn.twilight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
        scanBasePackages={"cn.twilight.user"}
)
public class StartUserService {
    public static void main(String[] args) {
        SpringApplication.run(StartUserService.class,args);
    }
}
