package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(new Topic("2","Java","Java Programming"),
				new Topic("3","C ","C Programming"),
				new Topic("1","C++","C++ Programming")));
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		System.out.println("Inside getTopic method\n"+"id="+id);
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();	
	}
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	public void updateTopic(String id,Topic topic)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i,topic);
			}
		}
	}
	 public void deleteTopic(String id) {
		 topics.removeIf(t->t.getId().equals(id));
		}
		}
