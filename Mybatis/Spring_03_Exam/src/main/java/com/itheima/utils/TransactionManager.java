package com.itheima.utils;

import java.sql.SQLException;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public class TransactionManager {

    private JdbcUtils jdbcUtils = new JdbcUtils() ;

    /**
     * 开启事物
     */
    public void startTranaction() throws SQLException {
        jdbcUtils.getConnection().setAutoCommit(false);
    }

    /**
     * 提交事物
     */
    public void commitTranaction() throws SQLException {
        jdbcUtils.getConnection().commit();

    }

    /**
     * 回滚事物
     */
    public void rollBackTranaction() throws SQLException {
        jdbcUtils.getConnection().rollback();
    }
}
