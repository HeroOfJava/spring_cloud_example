package com.example.demo.dao;

//
//import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User selectById(@Param("id")int id);
}
