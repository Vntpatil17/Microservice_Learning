package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.controllers.OrderController;
import com.example.demo.model.Address;
import com.example.demo.model.Order;

@Service
public class OrderService {

	Logger logger = LoggerFactory.getLogger(OrderService.class);

	public int create() {
		return 1;
	}

	public Order getOrder() {
		Order order = new Order();
		List<Address> addressList = new LinkedList<>();

		Address deliveryAddress = new Address();
		Address comunicationAdress = new Address();
		order.setId(1);
		order.setItem("Laptop");
		order.setPrice(1200);

		deliveryAddress.setStreet("Simple Road");
		deliveryAddress.setPin(400456);
		comunicationAdress.setStreet("MG Road");
		comunicationAdress.setPin(121199);

		addressList.add(deliveryAddress);
		addressList.add(comunicationAdress);
		order.setAdresses(addressList);
		return order;
	}

	public List<Order> getOrdersList() {
		List<Order> orderList = new LinkedList<>();
		Order ord1 = new Order(1, "Mobile", 2000, new LinkedList<>());
		Order ord2 = new Order(2, "Laptop", 12000, new LinkedList<>());
		orderList.add(ord1);
		orderList.add(ord2);
		return orderList;
	}

}
