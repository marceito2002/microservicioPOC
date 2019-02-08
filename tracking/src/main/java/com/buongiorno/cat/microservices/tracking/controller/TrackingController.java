package com.buongiorno.cat.microservices.tracking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buongiorno.cat.microservices.tracking.model.TrackingOut;

@RestController
public class TrackingController {

	
		@RequestMapping(method = RequestMethod.GET, value = "/tracking/getTracking")		
		public String  getTracking (@RequestParam(value="name", defaultValue ="prueba") String name) {			
			return "Hello this is gettracking";			
		}


		@RequestMapping(method = RequestMethod.GET, value = "/tracking")		
		public String  getSoloTracking (@RequestParam(value="name", defaultValue ="prueba") String name) {			
			return "Hello this is SOLO ttracking";			
		}

}
