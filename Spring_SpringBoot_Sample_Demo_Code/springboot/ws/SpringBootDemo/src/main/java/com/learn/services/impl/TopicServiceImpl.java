package com.learn.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.Topic;
import com.learn.services.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	private List<Topic> topicList = new 
			ArrayList<Topic>(Arrays.asList(
				new Topic("T001", "Spring Framework", "A short Introduction"),
				new Topic("T002", "Spring MVC ", "A short MVC Introduction"),
				new Topic("T003", "Spring Boot", "A short SpringBoot Introduction"),
				new Topic("T003", "Maven", "A short Maven Introduction")
			));
	
	@Override
	public List<Topic> getAllTopics() {
		return topicList;
	}

	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicList.add(topic);
	}

	@Override
	public void updateTopic(String id, Topic topic) {
		for(int index=0; index <=topicList.size();index++) {
			Topic t = topicList.get(index);
			if(t.getId().equals(id)) {
				topicList.set(index, topic);
				return;
			}
		}
	}

	@Override
	public Topic getTopic(String id) {
		Topic topic =null;
		for(int index=0; index <=topicList.size();index++) {
			Topic t = topicList.get(index);
			if(t.getId().equals(id)) {
				topic =t;
				break;
			}
		}
		return topic;
	}

	@Override
	public void deleteTopic(String id) {
		for(int index=0; index <=topicList.size();index++) {
			Topic t = topicList.get(index);
			if(t.getId().equals(id)) {
				topicList.remove(index);
				break;
			}
		}
	}

}
