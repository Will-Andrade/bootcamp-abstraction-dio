package org.andradev.domain;

public class Course extends Content {
	private Integer workload;
	
	@Override
	public String toString() {
		return "Course{" +
			"title='" + this.getTitle() + '\'' +
			", description='" + this.getDescription() + '\'' +
			", workload=" + workload +
			'}';
	}
	
	@Override
	public Double calculateXp() {
		return DEFAULT_XP * workload;
	}
	
	public Integer getWorkload() {
		return workload;
	}
	
	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
}
