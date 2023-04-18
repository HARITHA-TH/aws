package com.UST.InterviewScheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class interview {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String emailId;
    private String phonenum;
    private String skill;
    private int exp;
    private Date date;
    private  String time;
    private String link;
    private String poc;
}
