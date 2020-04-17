package com.szxs.service;

import com.szxs.entity.SmbmsUser;

import java.util.List;

public interface SmbmsUserService {
    SmbmsUser login(String userCode, String passWord);

    List<SmbmsUser> queryUser();
}
