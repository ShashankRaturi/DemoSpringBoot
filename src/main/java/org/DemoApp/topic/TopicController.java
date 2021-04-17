package org.DemoApp.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring" , "Spring Framework" , "Spring Framework desc"),
                new Topic("Python" , "Python Framework" , "Python Framework desc"),
                new Topic("JS" , "JS Framework" , "JS Framework desc")
        );
    }
}
