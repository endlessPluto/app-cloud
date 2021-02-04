package com.nwp.consumer.controller;

import com.nwp.consumer.common.BaseController;
import com.nwp.consumer.entity.CompanyInfo;
import com.nwp.consumer.service.ICompanyService;
import com.nwp.entity.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公司接口
 */
@RestController
@RequestMapping("/company")
public class CompanyController extends BaseController {

    @Autowired
    private ICompanyService companyService;

    /**
     * 列表获取
     * @param companyInfo
     * @return
     */
    @RequestMapping("/getAllList")
    @ResponseBody
    public ResultInfo getAllList(CompanyInfo companyInfo){
        return companyService.getAllList(companyInfo);
    }

}