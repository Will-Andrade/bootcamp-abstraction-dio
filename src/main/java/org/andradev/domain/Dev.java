package org.andradev.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> subscribedContent = new LinkedHashSet<>();
	private Set<Content> finishedContents = new LinkedHashSet<>();
	
	@Override
	public String toString() {
		return "Dev{" +
			"name='" + name + '\'' +
			", subscribedContent=" + subscribedContent +
			", finishedContents=" + finishedContents +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Dev dev = (Dev) o;
		return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(finishedContents, dev.finishedContents);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, subscribedContent, finishedContents);
	}
	
	public void subscribeBootcamp(Bootcamp bootcamp) {
		// Get all content of the bootcamp and add to this developer's content
		this.subscribedContent.addAll(bootcamp.getContents());
		
		// add this developer to the subscribed developers
		bootcamp.getSubscribedDevs().add(this);
	}
	
	// Calculate the percentage of completion of the bootcamp
	public void progress() {
		Optional<Content> content = this.subscribedContent.stream().findFirst();
		if (content.isPresent()) {
			this.finishedContents.add(content.get());
			this.subscribedContent.remove(content.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo.");
		}
	}
	
	public Double calculateTotalXP() {
		return this.finishedContents.stream().mapToDouble(Content::calculateXp).sum();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Content> getSubscribedContent() {
		return subscribedContent;
	}
	
	public void setSubscribedContent(Set<Content> subscribedContent) {
		this.subscribedContent = subscribedContent;
	}
	
	public Set<Content> getFinishedContents() {
		return finishedContents;
	}
	
	public void setFinishedContents(Set<Content> finishedContents) {
		this.finishedContents = finishedContents;
	}
}
