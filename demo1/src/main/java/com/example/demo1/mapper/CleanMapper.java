package com.example.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.bean.User;
import org.apache.ibatis.annotations.Select;

public interface CleanMapper extends BaseMapper<User>{

    @Select("truncate user")
    public void Clean();
}
