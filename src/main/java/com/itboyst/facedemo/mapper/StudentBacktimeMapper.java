package com.itboyst.facedemo.mapper;


import com.itboyst.facedemo.domain.StudentBacktime;
import org.apache.ibatis.annotations.Mapper;

/**
 * 归寝时间记录Mapper接口
 *
 * @author 付林铭
 * @date 2022-04-15
 */
@Mapper
public interface StudentBacktimeMapper {


    /**
     * 新增归寝时间记录
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    void insertStudentBacktime(StudentBacktime studentBacktime);

    /**
     * 修改归寝时间记录
     *
     * @param studentBacktime 归寝时间记录
     * @return 结果
     */
    void updateIsIn(StudentBacktime studentBacktime);

}
