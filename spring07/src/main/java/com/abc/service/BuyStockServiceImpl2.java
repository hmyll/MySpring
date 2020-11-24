package com.abc.service;

import com.abc.beans.BuyStockException;
import com.abc.dao.IAccountDao;
import com.abc.dao.IStockDao;

public class BuyStockServiceImpl2 implements IBuyStockService{

    private IAccountDao accountDao;
    private IStockDao stockDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void openAccount(String aname, double money) {
        accountDao.insertAccout(aname,money);
    }

    public void openStock(String sname, int count) {
        stockDao.insertStock(sname,count);
    }

    public void buyStock (String aname, double money, String sname, int amount) throws BuyStockException{
        boolean isBuy = true;
        //银行账户减少钱
        accountDao.updateAccount(aname,money,isBuy);

        if(1==1){
            throw new BuyStockException("购买购票异常");
        }

        //股票账户增加股票数
        stockDao.updateStock(sname,amount,isBuy);
    }
}
