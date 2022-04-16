package com.itboyst.facedemo.service.impl;

import com.itboyst.facedemo.domain.StudentOuttime;
import com.itboyst.facedemo.mapper.StudentOuttimeMapper;
import com.itboyst.facedemo.service.IStudentOuttimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 出寝时间记录Service业务层处理
 *
 * @author 付林铭
 * @date 2022-04-15
 */
@Service
public class StudentOuttimeServiceImpl implements IStudentOuttimeService {
    @Autowired
    private StudentOuttimeMapper studentOuttimeMapper;

    /**
     * 新增出寝时间记录
     *
     * @param studentOuttime 出寝时间记录
     * @return 结果
     */
    @Override
    public void insertStudentOuttime(StudentOuttime studentOuttime) {
        studentOuttimeMapper.insertStudentOuttime(studentOuttime);
    }

}
