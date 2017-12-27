package com.java4u.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("Java", "Java Topic", "Java Description"),
			new Topic("Hibernate", "Hibernate Topic", "Hibernate Description"),
			new Topic("Spring", "Spring Framework Topic", "Spring Framework Description"));

	public List<Topic> getAllTopics() {
		return topics;
	}
}
