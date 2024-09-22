package org.andradev.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private LocalDate initDate = LocalDate.now();
	private LocalDate endDate = initDate.plusDays(45);
	private Set<Dev> subscribedDevs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bootcamp bootcamp = (Bootcamp) o;
		return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initDate, bootcamp.initDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(contents, bootcamp.contents);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, description, initDate, endDate, subscribedDevs, contents);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getInitDate() {
		return initDate;
	}
	
	public void setInitDate(LocalDate initDate) {
		this.initDate = initDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public Set<Dev> getSubscribedDevs() {
		return subscribedDevs;
	}
	
	public void setSubscribedDevs(Set<Dev> subscribedDevs) {
		this.subscribedDevs = subscribedDevs;
	}
	
	public Set<Content> getContents() {
		return contents;
	}
	
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
}
