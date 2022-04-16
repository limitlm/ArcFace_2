package com.itboyst.facedemo.mapper;

import com.itboyst.facedemo.domain.UserFaceInfo;
import com.itboyst.facedemo.dto.FaceSearchResDto;
import com.itboyst.facedemo.dto.FaceUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MybatisUserFaceInfoMapper {
    void insertUserFaceInfo(UserFaceInfo userFaceInfo);

    List<FaceUserInfo> getUserFaceInfo();

    int countUserById(UserFaceInfo userFaceInfo);

    Integer getIdByFace(FaceSearchResDto faceSearchResDto);
}
