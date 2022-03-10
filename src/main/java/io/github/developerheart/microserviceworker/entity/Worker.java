package io.github.developerheart.microserviceworker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "WORKER", schema = "MS_WORKER")
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "WORKER_ID")
	private Long id;

	@Column(name = "NAME", nullable = false, updatable = true)
	private String name;

	@Column(name = "DAILY_INCOME", updatable = true)
	private BigDecimal dailyIncome;

	public Worker() {

	}

	public Worker(Long id, String name, BigDecimal dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(BigDecimal dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Worker worker = (Worker) o;
		return Objects.equals(id, worker.id) && Objects.equals(name, worker.name) && Objects.equals(dailyIncome, worker.dailyIncome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, dailyIncome);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Worker.class.getSimpleName() + "[", "]")
			.add("id=" + id)
			.add("name='" + name + "'")
			.add("dailyIncome=" + dailyIncome)
			.toString();
	}
}

