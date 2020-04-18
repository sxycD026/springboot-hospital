package com.xyoung.hospital.dao.module.mapper;

import com.xyoung.hospital.dao.module.vo.AccountInfoVo;

/**
 * @author Lee
 */
public interface AccountInfoVoMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(AccountInfoVo record);

	int insertSelective(AccountInfoVo record);

	AccountInfoVo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(AccountInfoVo record);

	int updateByPrimaryKey(AccountInfoVo record);
}
