package com.abc.service;

import com.abc.beans.BuyStockException;
import com.abc.dao.IAccountDao;
import com.abc.dao.IStockDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyStockServiceImpl implements IBuyStockService{

    private IAccountDao accountDao;
    private IStockDao stockDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void openAccount(String aname, double money) {
        accountDao.insertAccout(aname,money);
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void openStock(String sname, int count) {
        stockDao.insertStock(sname,count);
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = BuyStockException.class)
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
