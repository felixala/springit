package com.felix.springit;

import org.jboss.logging.Logger;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.felix.springit.config.SpringProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringProperties.class)
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = Logger.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
	
	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}
	
//	@Bean
//	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
//		return args -> {
//			Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
//			linkRepository.save(link);
//
//			Comment comment = new Comment("What an awesome idea for a course!", link);
//			commentRepository.save(comment);
//			link.addComment(comment);
//		};
//	}

}