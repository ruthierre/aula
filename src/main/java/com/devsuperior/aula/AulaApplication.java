package com.devsuperior.aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aula.entities.Order;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter code: ");
		int code = sc.nextInt();
		System.out.print("Enter basic: ");
		double basic = sc.nextDouble();
		System.out.print("Enter discount: ");
		double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);

		System.out.println(order);
		sc.close();
	}

	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNING SPRING BOOT TEST");
	}

}
