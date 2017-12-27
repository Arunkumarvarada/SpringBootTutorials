package com.java4u.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java", "Java Topic", "Java Description"),
			new Topic("Hibernate", "Hibernate Topic", "Hibernate Description"),
			new Topic("Spring", "Spring Framework Topic", "Spring Framework Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getTopic().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size();i++) {
			Topic t= topics.get(i);
			if(t.getTopic().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getTopic().equals(id));
		
	}

}
