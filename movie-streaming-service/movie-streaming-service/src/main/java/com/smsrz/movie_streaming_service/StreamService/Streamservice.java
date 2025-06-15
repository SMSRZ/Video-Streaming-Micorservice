package com.smsrz.movie_streaming_service.StreamService;

import com.smsrz.movie_streaming_service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class Streamservice {
    @Autowired
    Client client;
    public static final String prepath = "F:\\Storage\\";
    public ResponseEntity<InputStreamResource> streamVideo(String path) {
        File file = new File(prepath+path);
        if(file.exists()){
            InputStreamResource resource = null;
            try {
                resource = new InputStreamResource(new FileInputStream(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return ResponseEntity.ok().contentType(MediaType.parseMediaType("video/mp4")).body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<InputStreamResource> streamVideoById(Long id) {
        return streamVideo(client.findPath(id));
    }
}
