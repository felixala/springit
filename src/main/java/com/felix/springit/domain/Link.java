package com.felix.springit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Link extends Auditable {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String title;

	@NotNull
	private String url;

	@OneToMany(mappedBy = "link")
	private List<Comment> comments = new ArrayList<>();

	public Link() {

	}

	public Link(@NotNull String title, @NotNull String url) {
		super();
		this.title = title;
		this.url = url;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

}
