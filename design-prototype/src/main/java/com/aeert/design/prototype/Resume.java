package com.aeert.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author l'amour solitaire
 * @Description 简历
 * @Date 2020/11/23 下午4:32
 **/
@Data
@AllArgsConstructor
public class Resume implements Cloneable {

    /**
     * 姓名
     **/
    private String name;

    /**
     * 性别
     **/
    private String sex;

    /**
     * 工作经历
     **/
    private WorkExperience workExperience;

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.workExperience = (WorkExperience) workExperience.clone();
        return resume;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }

}
