package com.szxs.service.impl;

import com.szxs.dao.SmbmsUserDao;
import com.szxs.entity.SmbmsUser;
import com.szxs.service.SmbmsUserService;
import com.szxs.util.MybatiUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SmbmsUserServiceImpl implements SmbmsUserService {

    public SmbmsUser login(String userCode, String passWord) {

        SqlSession sqlSession = MybatiUtil.openSession();
        SmbmsUserDao mapper = sqlSession.getMapper(SmbmsUserDao.class);
        SmbmsUser login = mapper.login(userCode, passWord);

        return login;
    }

    public List<SmbmsUser> queryUser() {
        SqlSession sqlSession = MybatiUtil.openSession();
        SmbmsUserDao mapper = sqlSession.getMapper(SmbmsUserDao.class);
        return mapper.queryUser();

    }
}
