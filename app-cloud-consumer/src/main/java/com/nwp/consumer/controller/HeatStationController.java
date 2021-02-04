package com.nwp.consumer.controller;

import com.nwp.consumer.common.BaseController;
import com.nwp.consumer.entity.HeatStationInfo;
import com.nwp.consumer.service.IHeatStationService;
import com.nwp.entity.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 供热站
 */
@RestController
@RequestMapping("/heatStationCon")
public class HeatStationController extends BaseController {

    @Autowired
    private IHeatStationService heatStationService;

    /**
     * 获取供热站列表
     * @param heatStationInfo
     * @return
     */
    @RequestMapping("/queryListAll")
    @ResponseBody
    public ResultInfo queryListAll(HeatStationInfo heatStationInfo){
        return heatStationService.queryListAll(heatStationInfo);
    }
}