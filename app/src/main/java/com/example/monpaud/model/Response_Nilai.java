package com.example.monpaud.model;

import java.util.List;

public class Response_Nilai {
    private int kode;
    private List<Nilai> result;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public List<Nilai> getResult() {
        return result;
    }

    public void setResult(List<Nilai> result) {
        this.result = result;
    }
}
