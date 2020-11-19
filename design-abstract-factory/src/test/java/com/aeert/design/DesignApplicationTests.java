package com.aeert.design;

import com.aeert.design.abstractfactory.db.User;
import com.aeert.design.abstractfactory.factory.DataAccess;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        new DataAccess(DataAccess.MYSQL).createUser().addUser(new User());
        new DataAccess(DataAccess.SQL_SERVER).createUser().addUser(new User());
    }

}
