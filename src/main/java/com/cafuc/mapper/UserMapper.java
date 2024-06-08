package com.cafuc.mapper;

import com.cafuc.domain.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper

public interface UserMapper {
    @Select("select  * from user")
    @Results(id = "useMap",value = {
            @Result(property = "U_id",column = "uid"),
            @Result(property = "U_name",column = "uname"),
            @Result(property = "U_email",column = "uemail"),
            @Result(property = "U_password",column = "upassword"),
            @Result(property = "U_Permissions", column = "aid" ,one = @One(select = "com.cafuc.mapper.PermissionsMapper.selectByPrimaryKey")),
    })
    Page<User> findAll();
    @Select("SELECT * FROM user WHERE uemail = #{U_email} AND upassword = #{U_password}")
    @Results(id = "userMap",value = {
            @Result(property = "U_id",column = "uid"),
            @Result(property = "U_name",column = "uname"),
            @Result(property = "U_email",column = "uemail"),
            @Result(property = "U_password",column = "upassword"),
            @Result(property = "U_Permissions", column = "aid" ,one = @One(select = "com.cafuc.mapper.PermissionsMapper.selectByPrimaryKey")),
    })
    User Login(User user);

/*    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "U_Permissions", column = "U_Permissions_id", one = @One(select = "getPermissionsById"))
    })
    List<User> getAllUsers();*/

    /*@Insert("INSERT INTO users (U_name, U_email, U_password, U_Permissions_id) " +
            "VALUES (#{U_name}, #{U_email}, #{U_password}, #{U_Permissions.P_id})")
    @Options(useGeneratedKeys = true, keyProperty = "U_id")
    int insertUser(User user);*/

/*    @Update("UPDATE users SET U_name = #{U_name}, U_email = #{U_email}, " +
            "U_password = #{U_password}, U_Permissions_id = #{U_Permissions.P_id} " +
            "WHERE U_id = #{U_id}")
    int updateUser(User user);*/

/*    @Delete("DELETE FROM users WHERE U_id = #{userId}")
    int deleteUser(int userId);*/

/*
    @Select("SELECT * FROM permissions WHERE P_id = #{permissionsId}")
    Permissions getPermissionsById(int permissionsId);
*/
}