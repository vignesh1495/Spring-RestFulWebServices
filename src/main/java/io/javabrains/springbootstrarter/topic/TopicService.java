package io.javabrains.springbootstrarter.topic;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> newArray = new ArrayList<Topic>();
	
	public TopicService() {
		newArray.add(new Topic("1","Java","Fundamental of java"));
		newArray.add(new Topic("2","Spring","Spring boot Application"));
		newArray.add(new Topic("3","Spring","Spring boot Application"));
		
	}
	
	public void addTopic(Topic topic) {
		newArray.add(topic);
	}

	public void updateTopic(Topic topic,String id) {
		for (Topic t : newArray) {
			if (t.getId().equals(id)) {
				t.setId(topic.getId());
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
			}
		}
	}
	
	public Topic getTopic(String id) {
		for (Topic t : newArray) {
			if (t.getId().contains(id)) {
				return t;
			}
		}
		return null;
	}


	public List<Topic> sayallTopics() {
	
		return newArray;
	}
	

	
}
