package com.example.spring_webflux.services;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PeopleService {
    public Flux<@NonNull String> publishNames(){
        return Flux.just("Ana","Pedro","Juan","Carlos","Mia","Lana","Penny");

    }
    public Mono<@NonNull String>  publishName(){

        return Mono.just("Juan");
    }

}
