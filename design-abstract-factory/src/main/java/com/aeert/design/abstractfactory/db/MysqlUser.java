package com.aeert.design.abstractfactory.db;

/**
 * @Author l'amour solitaire
 * @Description TODO
 * @Date 2020/11/19 下午3:24
 **/
public class MysqlUser implements IUser {

    @Override
    public void addUser(User user) {
        System.out.println("Mysql 执行了新增用户操作");
    }
}
