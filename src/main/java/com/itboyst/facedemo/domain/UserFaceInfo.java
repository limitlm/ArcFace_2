package com.itboyst.facedemo.domain;


import lombok.Data;

import java.util.Date;

@Data
public class UserFaceInfo {

    private Integer groupId;

    private String faceId;

    private String name;

    private Date createTime;

    private Date updateTime;

    private byte[] faceFeature;


}

