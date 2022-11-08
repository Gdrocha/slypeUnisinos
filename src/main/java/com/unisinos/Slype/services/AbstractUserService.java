package com.unisinos.Slype.services;

import org.modelmapper.ModelMapper;

import javax.annotation.Resource;

public abstract class AbstractUserService {
    @Resource
    private ModelMapper modelMapper;

    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
