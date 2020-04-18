package com.xyoung.hospital.dao.module.mapper;

import com.xyoung.hospital.dao.module.vo.UserInfoVo;

public interface UserInfoVoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoVo record);

    int insertSelective(UserInfoVo record);

    UserInfoVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoVo record);

    int updateByPrimaryKey(UserInfoVo record);
}
