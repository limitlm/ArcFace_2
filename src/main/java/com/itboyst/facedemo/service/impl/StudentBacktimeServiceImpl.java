package com.itboyst.facedemo.service.impl;

import com.itboyst.facedemo.domain.StudentBacktime;
import com.itboyst.facedemo.mapper.StudentBacktimeMapper;
import com.itboyst.facedemo.service.IStudentBacktimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 归寝时间记录Service业务层处理
 *
 * @author 付林铭
 * @date 2022-04-15
 */
@Service
public class StudentBacktimeServiceImpl implements IStudentBacktimeService {
    @Autowired
    private StudentBacktimeMapper studentBacktimeMapper;

    /**
     * 新增归寝时间记录
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    @Override
    public void insertStudentBacktime(StudentBacktime studentBacktime) {
        studentBacktimeMapper.insertStudentBacktime(studentBacktime);
    }

    /**
     * 修改在寝状态
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    @Override
    public void updateIsIn(StudentBacktime studentBacktime) {
        studentBacktimeMapper.updateIsIn(studentBacktime);
    }

}
