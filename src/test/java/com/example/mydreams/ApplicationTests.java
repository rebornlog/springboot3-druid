package com.example.mydreams;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
@SpringBootTest
class ApplicationTests {

    @Autowired
    DataSource druidDataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(druidDataSource.getClass());
        //获得连接
        Connection connection = druidDataSource.getConnection();
        System.out.println(connection);
        DruidDataSource druidDataSources = (DruidDataSource) druidDataSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSources.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSources.getInitialSize());
        //关闭连接
        connection.close();
    }

}
