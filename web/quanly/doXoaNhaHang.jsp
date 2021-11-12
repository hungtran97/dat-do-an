<%-- 
    Document   : doXoaNhaHang
    Created on : Nov 15, 2021, 11:07:54 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*, dao.*, model.*"
         %>
<%
    String nhaHangId = (String) request.getParameter("id");

    NhaHangDAO dao = new NhaHangDAO();
    boolean kq = dao.xoaNhaHang(nhaHangId);
    System.out.println(kq);
    if (kq) {
        response.sendRedirect("gdQuanLyNhaHang.jsp");
    } else {
        response.sendRedirect("gdQuanLyNhaHang.jsp?err=fail");
    }
%>
