package com.abc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void insertAccout(String aname, double money) {
        String sql = "insert into account(aname,balance) values(?,?)";
        this.getJdbcTemplate().update(sql,aname,money);
    }

    public void updateAccount(String aname, double money, boolean isBuy) {
        String sql = "update account set balance=balance+? where aname=?";
        if(isBuy){
            sql = "update account set balance=balance-? where aname=?";
        }
        this.getJdbcTemplate().update(sql,money,aname);
    }
}
