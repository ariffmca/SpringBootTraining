package com.learn.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.daos.TopicDAO;
import com.learn.models.Topic;
import com.learn.services.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO topicDAO;
	
	@Override
	public List<Topic> getAllTopics() {
		return topicDAO.getAllTopics();
	}

	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicDAO.addTopic(topic);
	}

	@Override
	public void updateTopic(String id, Topic topic) {
		topicDAO.updateTopic(id, topic);
	}

	@Override
	public Topic getTopic(String id) {
		return topicDAO.getTopic(id);
	}

	@Override
	public void deleteTopic(String id) {
		topicDAO.deleteTopic(id);
	}

}
