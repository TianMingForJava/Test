package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    User queryUserById(@Param("id") int id);

    @Select("select * from mytest_user_t where username = #{username} and password = #{password}")
    User queryUserByUsernameAndPassword(@Param("username") String username,
                                        @Param("password") String password);
}