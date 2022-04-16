package com.itboyst.facedemo.service;

import com.itboyst.facedemo.domain.StudentBacktime;


/**
 * 归寝时间记录Service接口
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public interface IStudentBacktimeService {
    /**
     * 新增归寝时间记录
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    void insertStudentBacktime(StudentBacktime studentBacktime);

    /**
     * 修改在寝状态
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    void updateIsIn(StudentBacktime studentBacktime);
}
