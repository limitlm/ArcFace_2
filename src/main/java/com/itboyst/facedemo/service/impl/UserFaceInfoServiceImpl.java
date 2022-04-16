package com.itboyst.facedemo.service.impl;

import com.itboyst.facedemo.domain.UserFaceInfo;
import com.itboyst.facedemo.dto.FaceSearchResDto;
import com.itboyst.facedemo.mapper.MybatisUserFaceInfoMapper;
import com.itboyst.facedemo.service.UserFaceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserFaceInfoServiceImpl implements UserFaceInfoService {


    @Autowired
    private MybatisUserFaceInfoMapper userFaceInfoMapper;

    @Override
    public void insertSelective(UserFaceInfo userFaceInfo) {
        userFaceInfoMapper.insertUserFaceInfo(userFaceInfo);
    }

    @Override
    public int countUserById(UserFaceInfo userFaceInfo) {
        return userFaceInfoMapper.countUserById(userFaceInfo);
    }

    @Override
    public Integer getgetIdByFace(FaceSearchResDto faceSearchResDto) {
        return userFaceInfoMapper.getIdByFace(faceSearchResDto);
    }


}
