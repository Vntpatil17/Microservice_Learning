
package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService service;

	@PostMapping
	public int createOrder(String order) {
		logger.debug("creating an order throuh Post method");
		return service.create();
	}

	@GetMapping // (produces = "application/xml")
	public Order get() {
		logger.debug("Get Methods");
		return service.getOrder();
	}

	@GetMapping("/listall")
	public List<Order> getOrders() {

		logger.debug("Get list of all Orders");
		return service.getOrdersList();
	}
}