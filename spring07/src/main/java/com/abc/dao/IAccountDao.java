package com.abc.dao;

public interface IAccountDao {

    void insertAccout(String aname,double money);
    void updateAccount(String aname,double money,boolean isBuy);


}
