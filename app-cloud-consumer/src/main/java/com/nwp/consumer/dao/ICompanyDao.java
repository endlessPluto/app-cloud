package com.nwp.consumer.dao;

import com.nwp.consumer.entity.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICompanyDao {
    List<CompanyInfo> getAllList(CompanyInfo companyInfo);

    int getAllListCount(CompanyInfo companyInfo);
}