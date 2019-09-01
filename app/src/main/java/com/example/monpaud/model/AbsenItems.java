package com.example.monpaud.model;


import com.google.gson.annotations.SerializedName;


public class AbsenItems {

	@SerializedName("status_absen")
	private String statusAbsen;

	@SerializedName("nm_siswa")
	private String nmSiswa;

	@SerializedName("tgl_presensi")
	private String tglPresensi;

	@SerializedName("id_siswa")
	private String idSiswa;

	public void setStatusAbsen(String statusAbsen){
		this.statusAbsen = statusAbsen;
	}

	public String getStatusAbsen(){
		return statusAbsen;
	}

	public void setNmSiswa(String nmSiswa){
		this.nmSiswa = nmSiswa;
	}

	public String getNmSiswa(){
		return nmSiswa;
	}

	public void setTglPresensi(String tglPresensi){
		this.tglPresensi = tglPresensi;
	}

	public String getTglPresensi(){
		return tglPresensi;
	}

	public void setIdSiswa(String idSiswa){
		this.idSiswa = idSiswa;
	}

	public String getIdSiswa(){
		return idSiswa;
	}

	@Override
 	public String toString(){
		return 
			"AbsenItems{" +
			"status_absen = '" + statusAbsen + '\'' + 
			",nm_siswa = '" + nmSiswa + '\'' + 
			",tgl_presensi = '" + tglPresensi + '\'' + 
			",id_siswa = '" + idSiswa + '\'' + 
			"}";
		}
}