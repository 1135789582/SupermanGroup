package com.szxs.dao;

import com.szxs.entity.Membersinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MembersinfoDao {

    List<Membersinfo> queryStudent();
}
