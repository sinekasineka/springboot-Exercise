package com.furnitures.tv.controller;

import com.furnitures.tv.entity.Tv;
import com.furnitures.tv.service.TvService;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class TvController {
    @Autowired
    private TvService tvService;

    @PostMapping("/save")
    private String save(@RequestBody Tv tv) {
        tvService.save(tv);
        return "success";

    }

    @GetMapping ("/get")
    private List<Tv> getAll() {
         return tvService.getAll();

    }@GetMapping("/get/{id}")
    private Optional<Tv>getById(@PathVariable("id") Integer id){
         return tvService.getById(id);
    }
    @PostMapping("/saveAll")
    private String save(@RequestBody List<Tv> tv){
        tvService.save(tv);
        return "success";

    }
}