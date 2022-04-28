package com.fc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements com.fc.dao.AccountDao {
    @Override
    public void addAccount(String name) {
        getJdbcTemplate().update("insert into account(name) values (?)", name);

    }
}
