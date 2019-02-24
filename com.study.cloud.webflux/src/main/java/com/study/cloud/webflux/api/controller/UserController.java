package com.study.cloud.webflux.api.controller;

import com.study.cloud.webflux.api.model.UserApiModel;
import com.study.cloud.webflux.service.UserSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserSerivceImpl userSerivce;
    @PostMapping("/query")
    public Flux<UserApiModel>query(UserApiModel model) {
        //Flux.create(p->p.s)
        return Flux.fromIterable(userSerivce.query(model));
    }
    @PostMapping("/queryone")
    public Mono<UserApiModel>queryOne(UserApiModel model) {

        return Mono.create(p->p.success(userSerivce.queryOne(model)));
       // return Mono.justOrEmpty(userSerivce.queryOne(model));
    }
    @GetMapping("/queryid")
    public Mono<UserApiModel>queryId(Integer id) {

        return Mono.justOrEmpty(userSerivce.queryId(id));
    }
    @PostMapping("/add")
    public Mono<Integer> add(UserApiModel model) {

        return Mono.just(userSerivce.add(model));
    }
    @PostMapping("/edit")
    public Mono<Integer> edit(UserApiModel model) {

        return Mono.just(userSerivce.edit(model));
    }
}
