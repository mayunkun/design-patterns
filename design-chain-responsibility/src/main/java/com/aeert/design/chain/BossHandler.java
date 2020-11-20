package com.aeert.design.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author l'amour solitaire
 * @Description Boss 只处理30天内的审批,超过拒绝
 * @Date 2020/11/20 下午3:10
 **/
@Slf4j
public class BossHandler extends LeaveHandler {

    @Override
    public void execute(Integer days) {
        if (days > 30) {
            log.info(String.format("请假天数为: %s , BOSS拒绝～", days));
        } else {
            log.info(String.format("请假天数为: %s , BOSS审批～", days));
        }
    }
}
