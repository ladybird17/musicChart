package com.bitc.xml.service;

import java.util.List;

import com.bitc.xml.dto.ChartDto;

public interface ChartService {
	List<ChartDto> getChartList() throws Exception;
}
