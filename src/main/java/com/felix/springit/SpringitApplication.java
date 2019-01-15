package com.felix.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;

import com.felix.springit.config.SpringProperties;
import com.felix.springit.domain.Comment;
import com.felix.springit.domain.Link;
import com.felix.springit.repository.CommentRepository;
import com.felix.springit.repository.LinkRepository;

@SpringBootApplication
@EnableConfigurationProperties(SpringProperties.class)
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = Logger.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
			linkRepository.save(link);

			Comment comment = new Comment("What an awesome idea for a course!", link);
			commentRepository.save(comment);
			link.addComment(comment);
		};
	}

}