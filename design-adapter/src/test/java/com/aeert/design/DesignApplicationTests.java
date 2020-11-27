package com.aeert.design;

import com.aeert.design.adapter.ForeignPlayer;
import com.aeert.design.adapter.Player;
import com.aeert.design.adapter.Translator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() {
        Player player = new ForeignPlayer("jams");
        player.attack();
        player.defense();
        Player player1 = new Translator("姚明");
        player1.attack();
        player1.defense();
    }

}
