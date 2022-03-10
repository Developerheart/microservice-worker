package io.github.developerheart.microserviceworker.service;

import io.github.developerheart.microserviceworker.entity.Worker;
import io.github.developerheart.microserviceworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerRepository;

	public List<Worker> listAll() {
		return workerRepository.findAll();
	}


	public Worker findById(Long id) {
		return workerRepository.findById(id).orElseThrow();
	}
}
