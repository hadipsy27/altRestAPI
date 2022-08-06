package com.rest.api.Controller;

import com.rest.api.Entity.Post;
import com.rest.api.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping
    public Object getAllData(){
        return postRepository.findAll();
    }

    @PostMapping
    public Post addPost(@RequestBody Post postPayload){
        Post post = postRepository.save(postPayload);
        return post;
    }

    @DeleteMapping("/{id}")
    public Optional<Post> deletePost(@PathVariable Long id){
        Optional<Post> postByid = postRepository.findById(id);
        postByid.ifPresent(res -> {
            postRepository.deleteById(id);
        });
        return postByid;
    }

}
