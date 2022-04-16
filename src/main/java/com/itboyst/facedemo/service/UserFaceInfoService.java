package com.itboyst.facedemo.service;

import com.itboyst.facedemo.domain.UserFaceInfo;
import com.itboyst.facedemo.dto.FaceSearchResDto;


public interface UserFaceInfoService {

    void insertSelective(UserFaceInfo userFaceInfo);

    int countUserById(UserFaceInfo userFaceInfo);

    Integer getgetIdByFace(FaceSearchResDto faceSearchResDto);
}
