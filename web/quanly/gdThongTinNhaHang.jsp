<%-- 
    Document   : gdThongTinNhaHang
    Created on : Nov 11, 2021, 10:07:38 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<%@ page import="java.util.*, dao.*, model.* " %>
<%
    String nhaHangId = (String) request.getParameter("id");
    if (nhaHangId.equals("")) {
        session.setAttribute("actionNhaHang", "add");
    } else {
        NhaHangDAO nhaHangDAO = new NhaHangDAO();
        NhaHang nh = nhaHangDAO.getNhaHang(nhaHangId);
        session.setAttribute("nh", nh);
        session.setAttribute("actionNhaHang", "update");
    }
%>
<div class="container my-3 d-flex justify-content-center h-100">
    <form class="border p-4 bg-light h-50" action="/quanly/doEditNhaHang.jsp">
        <h2 class="text-center">Thông tin nhà hàng</h2>

        <p><span class="text-danger">* </span>Vui lòng điền đầy đủ thông tin dưới đây.</p>

        <div class="mb-3 mt-3">
            <label for="tenNhaHang" class="form-label">Tên nhà hàng: </label>
            <input type="text" class="form-control" id="tenNhaHang" placeholder="tên nhà hàng..." name="tenNhaHang" value="${nh.tenNhaHang}>
                   </div>

                   <div class="mb-3 mt-3">
            <label for="diaChi" class="form-label">Địa chỉ:</label>
            <input type="text" class="form-control" id="diaChi" placeholder="địa chỉ..." name="diaChi" value="${nh.diaChi}">
        </div>

        <div class="mb-3" id="soLuongTonKho">
            <label for="gioHoatDong" class="form-label">Thời gian hoạt động: </label>
            <input type="number" class="form-control" value="0" id="gioHoatDong" placeholder="thời gian hoạt động..." name="gioHoatDong" value="${nh.gioHoatDong}>
                   </div>

                   <div class="d-flex justify-content-center">
            <button type="submit" class="btn btn-success">Lưu</button>
        </div>
    </form>
</div>
<jsp:include page="footer.jsp"/>

