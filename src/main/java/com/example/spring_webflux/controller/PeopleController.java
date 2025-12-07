package com.example.spring_webflux.controller;

import com.example.spring_webflux.services.PeopleService;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/v1/people")
@RequiredArgsConstructor
public class PeopleController {
    private final PeopleService peopleService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<String>> publishNames(){
        return ResponseEntity.ok(peopleService.publishNames().delayElements(Duration.ofMillis(1000)));

    }
}
