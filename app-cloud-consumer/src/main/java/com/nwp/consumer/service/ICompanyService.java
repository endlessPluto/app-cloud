package com.nwp.consumer.service;

import com.nwp.consumer.entity.CompanyInfo;
import com.nwp.entity.ResultInfo;

public interface ICompanyService {
    ResultInfo getAllList(CompanyInfo companyInfo);
}