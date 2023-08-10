package com.example.countyAPI.Counties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/counties")
public class CountiesController {
	
	public  CountiesController(){

    }
	
	@Autowired
    private CountiesService countiesService;
	
	
	@GetMapping("/get/all")
    public ResponseEntity<Object> getAllAdverts() {
        try {
            List<Counties> allCounties = countiesService.getAll();
            return new ResponseEntity<>(allCounties, HttpStatus.OK);
        } catch (Exception e) {
//            log.info("Error" + e);
            return null;
        }
    }
	
	
	
	
	
	
	

}
