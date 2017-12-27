package com.java4u.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(new Topic("Java", "Java Topic", "Java Description"),
				new Topic("Hibernate", "Hibernate Topic", "Hibernate Description"),
				new Topic("Spring", "Spring Framework Topic", "Spring Framework Description"));
	}

}
