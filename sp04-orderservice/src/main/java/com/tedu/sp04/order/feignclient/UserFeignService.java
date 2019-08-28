package com.tedu.sp04.order.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;

public interface UserFeignService {

	@GetMapping("/{userId}")
	JsonResult<User> getUser(@PathVariable Integer userId);
	
	@GetMapping("/{userId}/addScore")
	JsonResult addScore(@PathVariable Integer userId,@RequestParam Integer score);
}
