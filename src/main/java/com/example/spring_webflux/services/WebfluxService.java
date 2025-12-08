package com.example.spring_webflux.services;

import io.r2dbc.spi.Parameter;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
public class WebfluxService {
    public Flux<@NonNull Integer> mapStringToIntegerAndMultiplyThem(){
        return Flux
                .just("1","2","3","4")
                .map(Integer::parseInt)
                .map(n -> n * 5 );

    }
    public Flux<@NonNull Integer>  filterNumbers(){

        return Flux
                .just(3, 10, 18, 21, 44, 7)
                .filter(n -> n > 15 && n %2 == 0);
    }
    public Flux<@NonNull String>  processAndUpperCase(){

        return Flux
                .just("Ana", "Luis", "Pedro")
                .doOnNext(n -> System.out.println("Procesando: "+n))
                .map(String::toUpperCase);
    }

    public Flux<@NonNull Integer>  handleAndMultiplyThem(){

        return Flux
                .just(5,2,7,8, -3, 12, -8, 7)
                .handle((n,exec) -> {
                    if (n < 0){
                        exec.error(new RuntimeException("Número negativo"));
                    }else {
                        exec.next(n * 2);
                    }
                } );
    }
    public Mono<@NonNull Object>  monoSwitchIfEmpty(){

        return Mono.empty().switchIfEmpty(Mono.just("anonymous"));
    }
    public Flux<@NonNull Integer> combineExercise(){
        return Flux
                .just("10", "abc", "25", "xyz", "40")
                .map(n -> {
                    try {
                        return Integer.parseInt(n);
                    }catch (Exception e){
                        return null;
                    }


                })
                .filter(obj -> true)
                .map(n -> n * 2)
                .switchIfEmpty(Flux.just(-1));

    }

}
