package com.ProjectEstimationApp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productChannelId;
    private String product;
    private String channel;

}
