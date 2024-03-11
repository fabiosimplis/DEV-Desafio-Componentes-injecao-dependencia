package com.devsuperior.desafio;

import com.devsuperior.desafio.entity.Order;
import com.devsuperior.desafio.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private OrderService orderService;
	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + order.getCode());
		System.out.println(String.format("Valor total: %.2f", orderService.total(order)));
	}
}
