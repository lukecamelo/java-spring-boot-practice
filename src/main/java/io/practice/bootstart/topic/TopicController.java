package io.practice.bootstart.topic;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
public class TopicController {
  ArrayList<Topic> topicList = new ArrayList<Topic>();

  @RequestMapping("/topics")
  public List<Topic> getAllTopics() {
    return topicList;
  }

  @PostMapping("/addtopic")
  public ArrayList<Topic> addTopic(@RequestBody Topic newTopic) {
    topicList.add(newTopic);
    return topicList;
  }
}