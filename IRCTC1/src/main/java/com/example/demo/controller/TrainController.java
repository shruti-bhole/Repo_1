package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	TrainService trainService;
	
	@PostMapping("train")
	public ResponseEntity saveTrain(@RequestBody Train train) {
		trainService.postTrain(train);
		return new ResponseEntity("train saved!",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getTrains")
	public List<Train> gettingTrains(){
		return trainService.getAllTrain();
	}
}
