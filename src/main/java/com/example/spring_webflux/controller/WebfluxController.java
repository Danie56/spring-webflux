package com.example.spring_webflux.controller;

import com.example.spring_webflux.services.PeopleService;
import com.example.spring_webflux.services.WebfluxService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/v1/webflux")
@RequiredArgsConstructor
public class WebfluxController {
    private final WebfluxService webfluxService;

//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<Integer>> mapStringToIntegerAndMultiplyThem(){
//        return ResponseEntity.ok(webfluxService.mapStringToIntegerAndMultiplyThem().delayElements(Duration.ofMillis(1000)));
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<Integer>> filterNumbers(){
//        return ResponseEntity.ok(webfluxService.filterNumbers().delayElements(Duration.ofMillis(1000)));
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<String>> processAndUpperCase(){
//        return ResponseEntity.ok(webfluxService.processAndUpperCase().delayElements(Duration.ofMillis(1000)));
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<Integer>> handleAndMultiplyThem(){
//        return ResponseEntity.ok(webfluxService.handleAndMultiplyThem().delayElements(Duration.ofMillis(1000)));
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Mono<Object>> monoSwitchIfEmpty(){
//        return ResponseEntity.ok(webfluxService.monoSwitchIfEmpty());
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<Integer>> combineExercise(){
//        return ResponseEntity.ok(webfluxService.combineExercise());
//
//    }
//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Mono<String>> thenExercise(){
//        return ResponseEntity.ok(webfluxService.thenExercise());
//
//    }
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Mono<Void>> whenExercise(){
        return ResponseEntity.ok(webfluxService.whenExercise());

    }
}
