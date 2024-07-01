package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.CricketersRepo;
import com.spring.model.Cricketers;

@RestController
public class CricketerController {

	@Autowired
	CricketersRepo repo;
	
	@GetMapping("cricketers")
	@ResponseBody
	public List<Cricketers> getCricketers(){
		return (List<Cricketers>) repo.findAll();
	}
	
	@GetMapping(path="cricketer/{cric_id}",produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Cricketers getCricketer(@PathVariable("cric_id") int cric_id){
		
		// If can't find the cricketer with the given ID, then it'll return empty cricketer
		return repo.findById(cric_id).orElse(new Cricketers());
	}
	
	
	@PostMapping(path="cricketer",consumes = {MediaType.APPLICATION_XML_VALUE})
	public Cricketers addCricketer(@RequestBody Cricketers cricketer){
		
		System.out.println(cricketer);
		repo.save(cricketer);
		return cricketer;
		
	}
	
	
	
}
