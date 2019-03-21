package org.design.pattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @ClassName ConnectionPool
 * @Description
 * @Author shipc
 * @Date 2019/3/21 11:32
 * @Version 1.0
 */

/**
 * 享元设计
 * 通过连接池的管理，实现了数据库连接的共享，不需要每次都重新创建连接，节省了数据库重新创建的开销，提升里系统的性能。
 */
public class ConnectionPool {
     private Vector<Connection> pool;
     /*公有属性*/
     private String url = "jdbc:mysqll://localhost:3306/test";
     private String username = "root";
     private String password = "root";
     private String driverClassName = "com.mysql.jdbc.Driver";

     private int poolSize = 100;
     private static ConnectionPool instance = null;
     Connection conn = null;

     /*构造方法，做一些初始化工作*/
    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for(int i =0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*返回连接到连接池*/
    public synchronized void release() {
        pool.add(conn);
    }

    /*返回连接池中的一个数据库连接*/
    public synchronized Connection getConnection() {
        if(pool.size() > 0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }else {
            return null;
        }
    }
}
