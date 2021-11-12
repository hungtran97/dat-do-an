/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hungt
 */
public class MonAn {
    private String tenMon;
    private String giaMon;
    private String soLuongTonKho;
    private String tblNhaHangid;

    public MonAn(String tenMon, String giaMon, String soLuongTonKho, String tblNhaHangid) {
        this.tenMon = tenMon;
        this.giaMon = giaMon;
        this.soLuongTonKho = soLuongTonKho;
        this.tblNhaHangid = tblNhaHangid;
    }

    public MonAn() {
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(String giaMon) {
        this.giaMon = giaMon;
    }

    public String getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(String soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getTblNhaHangid() {
        return tblNhaHangid;
    }

    public void setTblNhaHangid(String tblNhaHangid) {
        this.tblNhaHangid = tblNhaHangid;
    }
}
