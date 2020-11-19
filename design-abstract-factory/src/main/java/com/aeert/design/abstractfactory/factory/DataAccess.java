package com.aeert.design.abstractfactory.factory;

import com.aeert.design.abstractfactory.db.IUser;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author l'amour solitaire
 * @Description 抽象工厂
 * @Date 2020/11/19 下午3:33
 **/
@Data
@AllArgsConstructor
public class DataAccess {

    public static final String MYSQL = "Mysql";
    public static final String SQL_SERVER = "SqlServer";

    private String DB = "SqlServer";

    public IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = String.format("com.aeert.design.abstractfactory.db.%sUser", DB);
        return (IUser) Class.forName(className).newInstance();
    }

}
