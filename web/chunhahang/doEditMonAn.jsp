<%-- 
    Document   : doSuaNhaHang
    Created on : Nov 15, 2021, 11:08:06 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*, dao.*, model.*"
         %>
<%
    String tenMonAn = (String) request.getParameter("tenMonAn");
    String giaMon = (String) request.getParameter("giaMon");
    String soLuongTonKho = (String) request.getParameter("soLuongTonKho");
    String nhaHangId = (String) request.getParameter("nhaHangId");
    String action = (String) session.getAttribute("actionMonAn");

    MonAn monAn = new MonAn();
    monAn.setTenMon(tenMonAn);
    monAn.setSoLuongTonKho(soLuongTonKho);
    monAn.setGiaMon(giaMon);
    monAn.setTblNhaHangid(nhaHangId);
    boolean kq = false;
    MonAnDAO dao = new MonAnDAO();
    if (action.equals("add")) {
        kq = dao.themMonAn(monAn, nhaHangId);
    } else {
        kq = dao.suaMonAn(monAn, nhaHangId);
    }
    System.out.println(kq);
    if (kq) {
        response.sendRedirect("gdQuanLyMonAn.jsp");
    } else {
        response.sendRedirect("gdThongTinMonAn.jsp?err=fail");
    }
%>
