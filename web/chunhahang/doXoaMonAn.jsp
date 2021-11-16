<%-- 
    Document   : doXoaNhaHang
    Created on : Nov 15, 2021, 11:07:54 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*, dao.*, model.*"
         %>
<%
    String monAnId = (String) request.getParameter("id");

    MonAnDAO dao = new MonAnDAO();
    boolean kq = dao.xoaMonAn(monAnId);
    System.out.println(kq);
    if (kq) {
        response.sendRedirect("gdQuanLyMonAn.jsp");
    } else {
        response.sendRedirect("gdQuanLyMonAn.jsp?err=fail");
    }
%>
