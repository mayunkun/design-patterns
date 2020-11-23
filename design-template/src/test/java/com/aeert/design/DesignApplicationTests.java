package com.aeert.design;

import com.aeert.design.template.TestPaper;
import com.aeert.design.template.TestPaperA;
import com.aeert.design.template.TestPaperB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() {
        TestPaper testPaper = new TestPaperA();
        testPaper.question1();
        testPaper.question2();
        testPaper = new TestPaperB();
        testPaper.question1();
        testPaper.question2();
    }

}
