package com.mloine.docker.dockermloine;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author mloine
 * @Description docker 发布
 * @Date 2:10 下午 2020/3/1
 */
@EnableSwagger2Doc
@SpringBootApplication
public class DockerMloineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerMloineApplication.class, args);
    }

}
