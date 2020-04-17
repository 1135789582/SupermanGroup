package com.szxs.dao;

import com.szxs.entity.SmbmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmbmsUserDao {

    SmbmsUser login(@Param("userCode") String userCode, @Param("passWord") String passWord);

    List<SmbmsUser> queryUser();
}
