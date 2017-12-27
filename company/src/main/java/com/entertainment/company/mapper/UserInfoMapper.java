package com.entertainment.company.mapper;

import com.entertainment.company.domain.po.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhi.zhang Date: 2017/12/27 Time: 15:24 Description:
 */
public interface UserInfoMapper extends JpaRepository<UserInfo,Integer> {
}
