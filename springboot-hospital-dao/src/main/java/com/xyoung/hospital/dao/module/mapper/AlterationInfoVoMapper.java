package com.xyoung.hospital.dao.module.mapper;

import com.xyoung.hospital.dao.module.vo.AlterationInfoVo;

public interface AlterationInfoVoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlterationInfoVo record);

    int insertSelective(AlterationInfoVo record);

    AlterationInfoVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlterationInfoVo record);

    int updateByPrimaryKey(AlterationInfoVo record);
}
