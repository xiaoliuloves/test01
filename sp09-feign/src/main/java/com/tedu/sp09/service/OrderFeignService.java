package com.tedu.sp09.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tedu.sp01.pojo.Order;
import com.tedu.web.util.JsonResult;

@FeignClient(name = "order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {

	@GetMapping("/{orderId}")
	JsonResult<Order> getOrder(@PathVariable String orderId);
	
	@PostMapping("/")
	JsonResult addOrder();
}
