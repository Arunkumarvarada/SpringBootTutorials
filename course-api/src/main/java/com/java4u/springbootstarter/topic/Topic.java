package com.java4u.springbootstarter.topic;

public class Topic {

	private String topic;
	private String topicname;
	private String topicDescription;

	public Topic() {
		super();
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopicname() {
		return topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public Topic(String topic, String topicname, String topicDescription) {
		super();
		this.topic = topic;
		this.topicname = topicname;
		this.topicDescription = topicDescription;
	}

}
