package io.medina.SpringBootStarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	
	private List<GetTopics>getTopics= new ArrayList<>(Arrays.asList(
			
			 new GetTopics(1,"spring boot","good"),
			 new GetTopics(2,"springframework","very good"),
			 new GetTopics(3,"java swing","nice")
			 
			 ));
	// get all topics
	
	 public List<GetTopics> GetAllTopics()
	 {
		 return getTopics;
	 }
	 // get topic by id
	 public GetTopics GetTopicById(int id) 
	 {
		 
		 return getTopics.stream().filter(t->t.getId() == id).findFirst().get();
		 
	 }
	 // this is the usage of post method
	public void addTopic(GetTopics topic) 
	
	{
	getTopics.add(topic) ;
	}
	public void UpdateTopic( int id,GetTopics topic ) 
	{
		
		for(int i =0; i < getTopics.size();i++) 
		{	
	
		GetTopics gtopics = getTopics.get(i);
		
		if (gtopics.getId()==id)
		
		{
			getTopics.set(i, topic);
			return;
		}
		else {
			 System.out.println("id with "+id +"not found to be updated");
		}
		}
			
		}
	public void DeleteTopic(int id) 
	{
	getTopics.removeIf(t-> t.getId() == id);
	}	
	}
		
	

