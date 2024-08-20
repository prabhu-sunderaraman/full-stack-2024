package com.indium.springbootjdbclab03.dao;

import com.indium.springbootjdbclab03.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean containsTopic(String title) {
        String sql = "select count(*) from topics where title like ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, title);
        return count > 0;
    }

    public void insert(String title, int duration) {
        String sql = "insert into topics (title, duration) values (?, ?)";
        jdbcTemplate.update(sql, title, duration);
    }

    public List<Topic> getTopics() {
        String sql = "select * from topics";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Topic topic = new Topic(rs.getInt("id"),
                    rs.getString("title"),
                    rs.getInt("duration"));
            return topic;
        });
    }

    public void removeTopic(String title) {
        String sql = "Delete from topics where title like ?";
        jdbcTemplate.update(sql, title);
    }

    public void incrementSummaryCount(int duration) {
        String sql = "INSERT INTO summary (duration, coun) " +
                "VALUES (?, 1) ON DUPLICATE KEY UPDATE count = count + 1";
        jdbcTemplate.update(sql, duration);
    }

    public void decrementSummaryCount(int duration) {
        String sql = "UPDATE summary set count = count - 1 where duration=?";
        jdbcTemplate.update(sql, duration);
    }
}
