package com.aeert.design.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author l'amour solitaire
 * @Description 经理 可以处理3天内的审批
 * @Date 2020/11/20 下午3:00
 **/
@Slf4j
public class ManagerHandler extends LeaveHandler {

    @Override
    public void execute(Integer days) {
        if (days > 3) {
            leaveHandler.execute(days);
        } else {
            log.info(String.format("请假天数为: %s , 经理审批～", days));
        }
    }
}
