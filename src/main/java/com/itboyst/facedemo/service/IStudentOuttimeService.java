package com.itboyst.facedemo.service;

import com.itboyst.facedemo.domain.StudentOuttime;

/**
 * 出寝时间记录Service接口
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public interface IStudentOuttimeService {
    /**
     * 新增出寝时间记录
     *
     * @param studentOuttime 出寝时间记录
     * @return 结果
     */
    public void insertStudentOuttime(StudentOuttime studentOuttime);

}
