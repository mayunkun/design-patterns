package com.aeert.design.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author l'amour solitaire
 * @Description CEO 可以处理7天内的审批
 * @Date 2020/11/20 下午3:07
 **/
@Slf4j
public class CeoHandler extends LeaveHandler {

    @Override
    public void execute(Integer days) {
        if (days > 10) {
            leaveHandler.execute(days);
        } else {
            log.info(String.format("请假天数为: %s , CEO审批～", days));
        }
    }
}
