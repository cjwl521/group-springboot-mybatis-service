package com.chinasoft.mybatis.mapper;

import com.chinasoft.mybatis.model.Country;
import com.chinasoft.mybatis.util.MyMapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Created by Jarries
 * @description:
 * @date: 2018/9/12
 */
public interface CountryMapper extends MyMapper<Country> {

    @Select("select * from country limit 1")
    Country findOne();
}