package com.itboyst.facedemo.mapper;

import com.itboyst.facedemo.domain.StudentOuttime;

/**
 * 出寝时间记录Mapper接口
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public interface StudentOuttimeMapper {
    /**
     * 新增出寝时间记录
     *
     * @param studentOuttime 出寝时间记录
     * @return 结果
     */
    void insertStudentOuttime(StudentOuttime studentOuttime);

}
