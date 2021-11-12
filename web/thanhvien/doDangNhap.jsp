<%-- 
    Document   : doDangNhap
    Created on : Nov 13, 2021, 10:28:46 AM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"
         %>
<%
    String email = (String) request.getParameter("email");
    ThanhVien tv = new ThanhVien();
    tv.setEmail(email);

    ThanhVienDAO dao = new ThanhVienDAO();
    String kq = dao.dangNhap(tv);
    System.out.println(kq);
    if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("khachhang"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("chunhahang"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("nhanviengiaohang"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("quanly"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else {
        response.sendRedirect("gdDangNhap.jsp?err=fail");
    }
%>
