package com.itboyst.facedemo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 出寝时间记录对象 student_outtime
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public class StudentOuttime {
    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    private Integer idcard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出寝时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outtime;

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

}
