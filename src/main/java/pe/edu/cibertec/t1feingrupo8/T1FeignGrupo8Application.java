package pe.edu.cibertec.t1feingrupo8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo8Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo8Application.class, args);
    }
}
