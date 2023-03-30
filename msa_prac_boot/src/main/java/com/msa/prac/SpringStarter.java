package com.msa.prac;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarter {

    public static void main(String[] args) {

        String a = "[{computerized_id=1460C741, sunro_id=노삼123}, {computerized_id=1460C112, sunro_id=노삼124}, {computerized_id=1460C741, sunro_id=노삼125}, {computerized_id=testGateway1, sunro_id=testGateway1}]";


        System.out.println(a);

        SpringApplication.run(SpringStarter.class);
    }
}

