package org.compose;

public class ProductDao {
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("获得数据库连接");
    }


}
