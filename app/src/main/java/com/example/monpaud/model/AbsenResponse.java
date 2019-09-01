package com.example.monpaud.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class AbsenResponse{

	@SerializedName("result")
	private List<AbsenItems> result;

	@SerializedName("kode")
	private int kode;

	public void setResult(List<AbsenItems> result){
		this.result = result;
	}

	public List<AbsenItems> getResult(){
		return result;
	}

	public void setKode(int kode){
		this.kode = kode;
	}

	public int getKode(){
		return kode;
	}

	@Override
 	public String toString(){
		return 
			"AbsenResponse{" + 
			"result = '" + result + '\'' + 
			",kode = '" + kode + '\'' + 
			"}";
		}
}