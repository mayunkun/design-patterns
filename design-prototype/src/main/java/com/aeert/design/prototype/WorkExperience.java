package com.aeert.design.prototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author l'amour solitaire
 * @Description 简历
 * @Date 2020/11/23 下午4:32
 **/
@Data
@Accessors(chain = true)
public class WorkExperience implements Cloneable{

    /**
     * 时间范围
     **/
    private String date;

    /**
     * 工作经历
     **/
    private String job;

    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}
