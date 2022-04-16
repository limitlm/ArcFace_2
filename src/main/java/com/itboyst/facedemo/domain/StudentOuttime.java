package com.itboyst.facedemo.domain;

/**
 * 出寝时间记录对象 student_outtime
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public class StudentOuttime {
    /**
     * 学号
     */
    private Integer idcard;

    /**
     * 姓名
     */
    private String name;

    public Integer getIdcard() {
        return idcard;
    }

    public String getName() {
        return name;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public void setName(String name) {
        this.name = name;
    }
}
