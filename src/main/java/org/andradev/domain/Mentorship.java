package org.andradev.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
	private LocalDate date;
	
	@Override
	public String toString() {
		return "Mentorship{" +
			"title='" + this.getTitle() + '\'' +
			", description='" + this.getDescription() + '\'' +
			", date=" + date +
			'}';
	}
	
	@Override
	public Double calculateXp() {
		return DEFAULT_XP + 20d;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
