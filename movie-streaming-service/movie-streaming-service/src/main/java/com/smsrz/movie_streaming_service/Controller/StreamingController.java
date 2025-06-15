package com.smsrz.movie_streaming_service.Controller;


import com.smsrz.movie_streaming_service.StreamService.Streamservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamingController {

    @Autowired
    private Streamservice service;
    @GetMapping("stream/{path}")
    public ResponseEntity<InputStreamResource> streamVideo(@PathVariable String path){
        return service.streamVideo(path);
    }
    @GetMapping("stream-id/{id}")
    public ResponseEntity<InputStreamResource> streamVideoById(@PathVariable Long id){
        return service.streamVideoById(id);
    }
}
