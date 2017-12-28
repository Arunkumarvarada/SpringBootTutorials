package com.java4u.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Topic")
public class Topic {

	@Id
	private String id;
	private String topicname;
	private String topicDescription;

	public Topic() {
		super();
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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

	public Topic(String id, String topicname, String topicDescription) {
		super();
		this.id = id;
		this.topicname = topicname;
		this.topicDescription = topicDescription;
	}

}
