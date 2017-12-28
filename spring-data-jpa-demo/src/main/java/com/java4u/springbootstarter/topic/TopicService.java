package com.java4u.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

//	public Topic getTopicById(String id) {
//		return topics.stream().filter(t -> t.getTopic().equals(id)).findFirst().get();
//	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

//	public void updateTopic(Topic topic, String id) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getTopic().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
//	}
//
//	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getTopic().equals(id));
//
//	}

}
