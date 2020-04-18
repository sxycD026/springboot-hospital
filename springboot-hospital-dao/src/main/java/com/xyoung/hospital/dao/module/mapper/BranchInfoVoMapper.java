package com.xyoung.hospital.dao.module.mapper;

import com.xyoung.hospital.dao.module.vo.BranchInfoVo;

public interface BranchInfoVoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchInfoVo record);

    int insertSelective(BranchInfoVo record);

    BranchInfoVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BranchInfoVo record);

    int updateByPrimaryKey(BranchInfoVo record);
}
