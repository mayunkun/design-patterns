package com.aeert.design;

import com.aeert.design.prototype.Resume;
import com.aeert.design.prototype.WorkExperience;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() throws CloneNotSupportedException {
        WorkExperience workExperience = new WorkExperience().setDate("1990-1995").setJob("支付宝菜鸟事业部");
        Resume resume = new Resume("小王", "男", workExperience);
        System.out.println(resume.toString());

        workExperience.setDate("2000-2017").setJob("华为荣耀事业部");
        Resume resume1 = resume.clone();
        System.out.println(resume1.toString());
    }

}
