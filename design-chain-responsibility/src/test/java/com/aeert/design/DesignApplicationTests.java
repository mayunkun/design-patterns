package com.aeert.design;

import com.aeert.design.chain.BossHandler;
import com.aeert.design.chain.CeoHandler;
import com.aeert.design.chain.ManagerHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() {
        ManagerHandler managerHandler = new ManagerHandler();
        CeoHandler ceoHandler = new CeoHandler();
        BossHandler bossHandler = new BossHandler();
        managerHandler.setLeaveHandler(ceoHandler);
        ceoHandler.setLeaveHandler(bossHandler);

        managerHandler.execute(2);
        managerHandler.execute(5);
        managerHandler.execute(23);
        managerHandler.execute(32);

    }

}
