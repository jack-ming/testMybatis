package cn.com.jit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jack on 2018/7/5.
 */
@ImportResource({"classpath*:cn/com/jit/dao/user/*.xml"})
@SpringBootApplication
public class SpringBootMybatis {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatis.class, args);
    }

}
