package io.github.developerheart.microserviceworker.repository;

import io.github.developerheart.microserviceworker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
