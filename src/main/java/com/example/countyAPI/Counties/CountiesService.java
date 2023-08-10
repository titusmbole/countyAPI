package com.example.countyAPI.Counties;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CountiesService {
	@Autowired
    private CountiesRepository countiesRepositoy;
	
	
	public List<Counties> getAll() {
        try {
            List<Counties> counties= countiesRepositoy.findAll();
//        	List<Counties> counties = Arrays.asList(
//                    new Counties("Nairobi", 1L, "09/10/2022"),
//                    new Counties("Mombasa", 2L, "09/10/2022"),
//                    new Counties("Machakos", 3L, "09/10/2022")
//                    
//                );
            return counties;
        }catch (Exception e) {
//            log.info("Catched Error {} " + e);
            return null;
        }

    }
	
	
	
	

}
