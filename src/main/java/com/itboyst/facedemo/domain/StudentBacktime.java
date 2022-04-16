package com.itboyst.facedemo.domain;

/**
 * 归寝时间记录对象 student_backtime
 *
 * @author 付林铭
 * @date 2022-04-15
 */
public class StudentBacktime {

    /**
     * 学号
     */
    private Integer idcard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 归寝状态
     */

    private String backstatus;

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

    public String getBackstatus() {
        return backstatus;
    }

    public void setBackstatus(String backstatus) {
        this.backstatus = backstatus;
    }

}
