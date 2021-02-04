package com.nwp.consumer.service;

import com.nwp.consumer.entity.HeatStationInfo;
import com.nwp.entity.ResultInfo;

public interface IHeatStationService {

    ResultInfo queryListAll(HeatStationInfo heatStationInfo);

}