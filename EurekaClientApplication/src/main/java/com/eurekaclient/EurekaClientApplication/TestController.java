package com.eurekaclient.EurekaClientApplication;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/")
	public Map<String,String> getData()
	{
		Map<String,String> map =new HashMap<String, String>();
		
		map.put("ITs Working", "Bro");
		return map;
		
	}
}
