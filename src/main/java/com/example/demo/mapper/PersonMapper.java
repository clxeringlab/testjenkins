package com.example.demo.mapper;

import com.example.demo.dao.Person;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {
    @Select("select * from testonly")
    @Results({
            @Result(property = "id", column = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "name", column = "name")
    })
    List<Person> selectAll();
}
