package com.example.demo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1.bean.Admin;
import com.example.demo1.mapper.AdminMapper;
import com.example.demo1.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
