package org.DemoApp.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("Spring" , "Spring Framework" , "Spring Framework desc"),
            new Topic("Python" , "Python Framework" , "Python Framework desc"),
            new Topic("JS" , "JS Framework" , "JS Framework desc")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {

        for(int i = 0; i < topics.size(); ++i){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i , topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
