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
public class NhaHang implements Serializable{
    private int id;
    private String tennhahang;
    private String diachinhahang;
    private String giohoatdong;
    private List<MonAn> menu;
    private List<LoiNhanXet> review;
    private ChuNhaHang chunhahang;
    
    public NhaHang(){
        super();
    }

    public NhaHang(int id, String tennhahang, String diachinhahang, String giohoatdong, List<MonAn> menu, List<LoiNhanXet> review, ChuNhaHang chunhahang) {
        super();
        this.id = id;
        this.tennhahang = tennhahang;
        this.diachinhahang = diachinhahang;
        this.giohoatdong = giohoatdong;
        this.menu = menu;
        this.review = review;
        this.chunhahang = chunhahang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTennhahang() {
        return tennhahang;
    }

    public void setTennhahang(String tennhahang) {
        this.tennhahang = tennhahang;
    }

    public String getDiachinhahang() {
        return diachinhahang;
    }

    public void setDiachinhahang(String diachinhahang) {
        this.diachinhahang = diachinhahang;
    }

    public String getGiohoatdong() {
        return giohoatdong;
    }

    public void setGiohoatdong(String giohoatdong) {
        this.giohoatdong = giohoatdong;
    }

    public List<MonAn> getMenu() {
        return menu;
    }

    public void setMenu(List<MonAn> menu) {
        this.menu = menu;
    }

    public List<LoiNhanXet> getReview() {
        return review;
    }

    public void setReview(List<LoiNhanXet> review) {
        this.review = review;
    }

    public ChuNhaHang getChunhahang() {
        return chunhahang;
    }

    public void setChunhahang(ChuNhaHang chunhahang) {
        this.chunhahang = chunhahang;
    }
    
    
    
}
