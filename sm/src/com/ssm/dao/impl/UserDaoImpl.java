package com.ssm.dao.impl;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("com.ssm.po.UserMapper.findUserById",id);
    }
}
