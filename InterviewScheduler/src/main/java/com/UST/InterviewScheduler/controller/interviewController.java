package com.UST.InterviewScheduler.controller;

import com.UST.InterviewScheduler.entity.interview;
import com.UST.InterviewScheduler.service.interviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/in")
public class interviewController {
    @Autowired
    private interviewService service;
    @PostMapping("/a")
    public interview add(@RequestBody interview in) {
        return service.create(in);
    }


    @GetMapping("/emp/{name}")
    public interview show(@PathVariable String name) {
        return service.getByName(name);
    }

}
