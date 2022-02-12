package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class JdbcTransferDao implements TransferDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AccountDao accountDao;

    @Override
    public String sendMoney(int accountFrom, int accountTo, BigDecimal amount) {

//        //check to see if userFrom's account has enough money/ if not, throw an exception
//        if(amount>accountDao.viewBalance(accountFrom) {
//            //add to the transfer table
//            String sql = "INSERT INTO transfers(transfer_type_id, transfer_status_id, account_from, account_to, amount)" +
//                    "VALUES(2,2 (SELECT account_id FROM accounts WHERE user_id =?), (SELECT account_id FROM accounts WHERE user_id =?)";
//            jdbcTemplate.update(sql, accountFrom, accountTo, amount);
//            //subtract amount from userFrom's account
//            accountDao.subtractFromBalance(amount, accountFrom);
//            //add amount to userTo's account
//            accountDao.addToBalance(amount, accountTo);
//            //add to the transfer table
//            return "The transfer was completed";
//        } else{
//            return "The transfer failed due lack of sufficient funds or amount is less than or equal to 0.";
//        }
    return "";
    }

    @Override
    public Transfer getTransferById(int transferId) {
        return null;
    }

    @Override
    public List<Transfer> getAllTransfer(int userId) {
        return null;
    }




}
