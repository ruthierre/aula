package com.devsuperior.aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner{

	@Autowired 
	private OrderService orderService;
		
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);

	}

	@Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        int code = sc.nextInt();
        System.out.print("Enter basic: ");
        double basic = sc.nextDouble();
        System.out.print("Enter discount: ");
        double discount = sc.nextDouble();
        Order order = new Order(code, basic, discount);
        sc.close();

        System.out.printf("Pedido código: %d%n", order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
    }

}
