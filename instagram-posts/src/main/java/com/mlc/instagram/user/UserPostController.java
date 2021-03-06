package com.mlc.instagram.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rometools.rome.io.FeedException;

@RestController
@RequestMapping(value = { "/instagram", "/instagram/" })
public class UserPostController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @Value("${instagram.url}")
    private String instagramUrl;

    @Autowired
    private FeedGenerator feedGenerator;

    @ResponseBody
    @GetMapping(value = { "/user/{userId}/posts/rss", "/user/{userId}/posts/rss/" }, produces = MediaType.APPLICATION_RSS_XML_VALUE)
    public String getUserPostsRSS(@PathVariable String userId) throws FeedException {

        ResponseEntity<String> userContent = restTemplate.getForEntity(instagramUrl, String.class, userId);

        return feedGenerator.generateFeed(userContent.getBody(), userId, "rss_2.0");
    }

    @ResponseBody
    @GetMapping(value = { "/user/{userId}/posts/atom", "/user/{userId}/posts/atom/" }, produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String getUserPostsAtom(@PathVariable String userId) throws FeedException {

        ResponseEntity<String> userContent = restTemplate.getForEntity(instagramUrl, String.class, userId);

        return feedGenerator.generateFeed(userContent.getBody(), userId, "atom_1.0");
    }

    @ResponseBody
    @GetMapping(value = { "/user/{userId}/posts/json", "/user/{userId}/posts/json/" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUserPostsJSON(@PathVariable String userId) throws FeedException {

        ResponseEntity<String> userContent = restTemplate.getForEntity(instagramUrl, String.class, userId);

        return feedGenerator.generateFeedJSON(userContent.getBody(), userId);
    }
}
