package com.nwp.consumer.entity;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class Student {

    @ExcelProperty("学生编号")
    private String id;
    @ExcelProperty("学生名称")
    private String name;
}