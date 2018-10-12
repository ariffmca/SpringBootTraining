package com.learn.daos.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learn.daos.TopicDAO;
import com.learn.models.Topic;

@Repository
public class TopicDAOImpl implements TopicDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Topic> getAllTopics() {
		final String selectAllTopicsSQL = "select * from topics";
		List<Topic> topicList = jdbcTemplate.query(selectAllTopicsSQL,new RowMapper<Topic>(){
					@Override
					public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
						Topic topic = new Topic();
						topic.setId(rs.getString("id"));
						topic.setTopicName(rs.getString("topicName"));
						topic.setDescription(rs.getString("description"));
						return topic;
					}
		});
		return topicList;
	}

	@Override
	public void addTopic(Topic topic) {
		final String insertTopicSQL = "insert into topics values (id,topicName, description), (?,?,?)";
		jdbcTemplate.update(insertTopicSQL,topic.getId(),topic.getTopicName(),topic.getDescription());

	}

	@Override
	public void updateTopic(String id, Topic topic) {
		final String updateTopicSQL = "update table set id = ?, topicName = ? , description = ? where id =?";
		jdbcTemplate.update(updateTopicSQL,topic.getId(),topic.getTopicName(),topic.getDescription(),id);

	}

	@Override
	public Topic getTopic(String id) {
		final String selectTopicSQL = "select * from topics where id = ?";
		Topic topic = jdbcTemplate.queryForObject(selectTopicSQL,new Object[] {id},new RowMapper<Topic>(){
			@Override
			public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
				Topic topic = new Topic();
				topic.setId(rs.getString("id"));
				topic.setTopicName(rs.getString("topicName"));
				topic.setDescription(rs.getString("description"));
				return topic;
			}
		});
		return topic;
	}

	@Override
	public void deleteTopic(String id) {
		final String deleteTopicSQL = "delete from topics where id = ?";
		jdbcTemplate.update(deleteTopicSQL,id);

	}

}
