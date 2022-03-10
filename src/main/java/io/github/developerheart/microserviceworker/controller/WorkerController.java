package io.github.developerheart.microserviceworker.controller;

import io.github.developerheart.microserviceworker.entity.Worker;
import io.github.developerheart.microserviceworker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

	@Autowired
	private WorkerService workerService;

	@GetMapping()
	public ResponseEntity<List<Worker>> listAll() {
		List<Worker> workerList = workerService.listAll();
		return ResponseEntity.ok(workerList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> byId(@PathVariable(name = "id") Long id) {
		Worker worker = workerService.findById(id);
		return ResponseEntity.ok(worker);
	}


}
