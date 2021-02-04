package com.nwp.consumer.dao;

import com.nwp.consumer.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ITestDao {
    List<Student> getList();
}