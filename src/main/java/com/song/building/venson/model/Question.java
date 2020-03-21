package com.song.building.venson.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private String creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private String description;

}
