package com.song.building.venson.mapper;

import com.song.building.venson.controller.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    @Insert("insert into user (account_id,name,token,gmt_create,gmt_modified,bio,avatar_url) values (#{countId},#{name},#{token},#{gmtCreate},#{gmtModified},#{bio},#{avatarUrl}) ")
    public void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(String token);
}
