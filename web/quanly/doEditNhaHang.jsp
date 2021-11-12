<%-- 
    Document   : doSuaNhaHang
    Created on : Nov 15, 2021, 11:08:06 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*, dao.*, model.*"
         %>
<%
    String tenNhaHang = (String) request.getParameter("tenNhaHang");
    String gioHoatDong = (String) request.getParameter("gioHoatDong");
    String diaChi = (String) request.getParameter("diaChi");
    String chuNhaHangId = (String) request.getParameter("chuNhaHangId");
    String action = (String) session.getAttribute("actionNhaHang");

    NhaHang nh = new NhaHang();
    nh.setTenNhaHang(tenNhaHang);
    nh.setDiaChi(diaChi);
    nh.setGioHoatDong(gioHoatDong);
    nh.setTblChuNhaHangid(chuNhaHangId);
    boolean kq = false;
    NhaHangDAO dao = new NhaHangDAO();
    if (action.equals("add")) {
        kq = dao.themNhaHang(nh, chuNhaHangId);
    } else {
        kq = dao.suaNhaHang(nh, chuNhaHangId);
    }
    System.out.println(kq);
    if (kq) {
        response.sendRedirect("gdQuanLyNhaHang.jsp");
    } else {
        response.sendRedirect("gdThongTinNhaHang.jsp?err=fail");
    }
%>
