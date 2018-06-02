package com.web;

import java.util.concurrent.atomic.AtomicLong;

import com.service.IServiceGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceController
{

	

	@Autowired
	IServiceGateway service;

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String sayHello( @RequestParam(name = "name", required = false, defaultValue = "Stranger") String name )
	{
		return name;
	}

	@RequestMapping(value = "/Animal-birdInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String birdInfo()
	{
		return service.birdInfo();
	}

	@RequestMapping(value = "/Animal-fishInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String fishInfo()
	{
		return service.fishInfo();
	}
}