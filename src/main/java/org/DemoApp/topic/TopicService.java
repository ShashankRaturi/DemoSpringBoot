package org.DemoApp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  Arrays.asList(
            new Topic("Spring" , "Spring Framework" , "Spring Framework desc"),
            new Topic("Python" , "Python Framework" , "Python Framework desc"),
            new Topic("JS" , "JS Framework" , "JS Framework desc")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
