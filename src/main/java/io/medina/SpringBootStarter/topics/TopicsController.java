package io.medina.SpringBootStarter.topics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@Autowired
	private TopicsService topicService; 

 @RequestMapping("/topics")
  public List<GetTopics> GetAllTopics()  
 {
	 return topicService.GetAllTopics();
 

}
 @RequestMapping("/topics/{id}")

  public GetTopics GetTobicById (@PathVariable int id) 
  
  {
	  return topicService.GetTopicById(id);
  }
 @RequestMapping(method = RequestMethod.POST , value = "/topics")
 public void addTobic(@RequestBody GetTopics topic) 
 
 {
	 topicService.addTopic(topic);
	
}
 @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
 public void UpdateTobic( @PathVariable int id,@RequestBody GetTopics topic ) 
 
 {
	 topicService.UpdateTopic(id,topic);
	
}
}
