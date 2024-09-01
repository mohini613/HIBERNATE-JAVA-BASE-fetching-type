package com.FetchingType1stLevelCache;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class CityMan {
    private int PinCode;
    private String AreaName;
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}

	  @Override
	    public String toString() {
	        return "CityMan{" +
	                "PinCode=" + PinCode +
	                ", AreaName='" + AreaName + '\'' +
	                '}';
	    }
    }

