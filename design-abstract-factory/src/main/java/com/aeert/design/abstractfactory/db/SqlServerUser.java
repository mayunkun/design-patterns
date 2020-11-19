package com.aeert.design.abstractfactory.db;

/**
 * @Author l'amour solitaire
 * @Description TODO
 * @Date 2020/11/19 下午3:29
 **/
public class SqlServerUser implements IUser {

    @Override
    public void addUser(User user) {
        System.out.println("SqlServer 执行了新增用户操作");
    }
}
