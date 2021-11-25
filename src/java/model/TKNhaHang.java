/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Hung
 */
public class TKNhaHang extends NhaHang implements Serializable{
    
    private float doanhthutheongay;

    public TKNhaHang() {
        super();
    }

    public TKNhaHang(float doanhthutheongay, int id, String tennhahang, String diachinhahang, String giohoatdong, List<MonAn> menu, List<LoiNhanXet> review, ChuNhaHang chunhahang) {
        super(id, tennhahang, diachinhahang, giohoatdong, menu, review, chunhahang);
        this.doanhthutheongay = doanhthutheongay;
    }

    public float getDoanhthutheongay() {
        return doanhthutheongay;
    }

    public void setDoanhthutheongay(float doanhthutheongay) {
        this.doanhthutheongay = doanhthutheongay;
    }

    
    
    
    
}
