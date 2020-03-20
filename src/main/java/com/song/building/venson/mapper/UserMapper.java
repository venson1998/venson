package com.song.building.venson.mapper;

<<<<<<< HEAD
import com.song.building.venson.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    public void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
=======
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
>>>>>>> c630a74aeafe8bb84c50af6ca65c50b3ec1bb0b7
}
