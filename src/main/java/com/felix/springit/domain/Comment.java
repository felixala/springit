package com.felix.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Comment extends Auditable {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String body;

	@ManyToOne
	private Link link;

	public Comment() {

	}

	public Comment(@NotNull String body, Link link) {
		super();
		this.body = body;
		this.link = link;
	}

}
