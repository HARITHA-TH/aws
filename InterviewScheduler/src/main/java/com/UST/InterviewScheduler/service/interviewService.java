package com.UST.InterviewScheduler.service;

import com.UST.InterviewScheduler.entity.interview;
import com.UST.InterviewScheduler.repository.interviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class interviewService {
    @Autowired
    private interviewRepo repo;
    public interview create(interview in) {
        // TODO Auto-generated method stub
        return repo.save(in);
    }

    public interview getByName(String name) {
        // TODO Auto-generated method stub
        return repo.findByName(name);
    }

}
