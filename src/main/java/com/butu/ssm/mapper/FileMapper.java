package com.butu.ssm.mapper;

import com.butu.ssm.entity.File;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author BUTU
 */
@Mapper
public interface FileMapper {
    File selectByPrimaryKey(Integer id);
}
