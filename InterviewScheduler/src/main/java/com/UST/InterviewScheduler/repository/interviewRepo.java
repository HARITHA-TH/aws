package com.UST.InterviewScheduler.repository;

import com.UST.InterviewScheduler.entity.interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface interviewRepo extends JpaRepository<interview,Integer> {
    interview findByName(String name);
}
