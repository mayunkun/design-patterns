package com.aeert.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author l'amour solitaire
 * @Description 试卷
 * @Date 2020/11/20 下午5:16
 **/
public abstract class TestPaper {

    /**
     * 第一题打印错了,已经给出了答案,此题可答可不答
     **/
    public void question1() {
        System.out.println("0.26的计数单位是（ " + answer1() + " ）");
        System.out.println("A:0.1    B:0.01    C:0.001");
    }

    /**
     * 第二题
     **/
    public void question2() {
        System.out.println("4千克30克=（ " + answer2() + "）千克");
        System.out.println("A:4.3    B:4.03    C:4.003");
    }

    public final String answer1() {
        return "B";
    }

    public abstract String answer2();
}
