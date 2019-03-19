package io.practice.bootstart.service;

import org.springframework.stereotype.Service;

import io.practice.bootstart.topic.Topic;

@Service
public class TopicService {

  public TopicService() {

  }

  public Topic addTopic(Topic topic) {
    return topic;
  }
}