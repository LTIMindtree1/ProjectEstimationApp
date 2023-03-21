package com.ProjectEstimationApp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Efforts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long effortsId;

    private Long modId;
    private Long productChannelId;
    private Long efforts;



}
