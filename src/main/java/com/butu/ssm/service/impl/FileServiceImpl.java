package com.butu.ssm.service.impl;

import com.butu.ssm.entity.File;
import com.butu.ssm.mapper.FileMapper;
import com.butu.ssm.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FileServiceImpl implements FileService {
    @Resource
    private FileMapper fileMapper;

    @Override
    public File selectByPrimaryKey(Integer id) {
        return fileMapper.selectByPrimaryKey(id);
    }
}
