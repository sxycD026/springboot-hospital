package com.xyoung.hospital.dao.module.mapper;

import com.xyoung.hospital.dao.module.vo.RoleInfo;

public interface RoleInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    RoleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}
