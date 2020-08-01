package org.compose;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "获取mysql数据库连接";
    }
}
