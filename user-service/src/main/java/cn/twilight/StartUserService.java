package cn.twilight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages={"cn.twilight.user"}
)
//@MapperScan("cn.twilight.user.dao")
@EnableJpaRepositories()
public class StartUserService {
    public static void main(String[] args) {
        SpringApplication.run(StartUserService.class,args);
    }
}
