package com.bitc.xml.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class ChartListDto {
	private List<ChartDto> chartList;
	
	@XmlElement(name="music")
	public List<ChartDto> getChartList() {
		return chartList;
	}

	public void setChartList(List<ChartDto> chartList) {
		this.chartList = chartList;
	}
}
