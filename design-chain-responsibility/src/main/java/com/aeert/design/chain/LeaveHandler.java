package com.aeert.design.chain;

import lombok.Setter;

/**
 * @Author l'amour solitaire
 * @Description 请假
 * @Date 2020/11/20 下午2:57
 **/
@Setter
public abstract class LeaveHandler {

    public LeaveHandler leaveHandler;

    /**
     * 处理请求
     **/
    public abstract void execute(Integer days);
}
