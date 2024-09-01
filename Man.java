package com.FetchingType1stLevelCache;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
//@Table(name = "Man_new")
public class Man {

    @Id
    private int MId;
    private String MName;
    private CityMan MCity;
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public CityMan getMCity() {
		return MCity;
	}
	public void setMCity(CityMan mCity) {
		MCity = mCity;
	}
	public void setMId(int i) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	    public String toString() {
	        return "Man{" +
	                "MId=" + MId +
	                ", MName='" + MName + '\'' +
	                ", MCity=" + MCity +
	                '}';
}
}