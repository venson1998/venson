package com.song.building.venson.controller.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String accountId;
    private String name;
    private String token;
    private Long gmtCreate;
    private Long Modified;
    private String bio;
    private String avatarUrl;

}
