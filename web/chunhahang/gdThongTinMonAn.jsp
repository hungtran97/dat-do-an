<%-- 
    Document   : gdThongTinMonAn
    Created on : Nov 11, 2021, 10:09:30 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<%@ page import="java.util.*, dao.*, model.* " %>
<%
    String monAnId = (String) request.getParameter("id");
    if (monAnId.equals("")) {
        session.setAttribute("actionMonAn", "add");
    } else {
        MonAnDAO monAnDAO = new MonAnDAO();
        MonAn monAn = monAnDAO.getMonAn(monAnId);
        session.setAttribute("monAn", monAn);
        session.setAttribute("actionMonAn", "update");
    }
%>
<div class="container my-3 d-flex justify-content-center h-100">
    <form class="border p-4 bg-light h-50" action="/chunhahang/doEditMonAn.jsp">
        <h2 class="text-center">Thông tin món ăn</h2>

        <p><span class="text-danger">* </span>Vui lòng điền đầy đủ thông tin dưới đây.</p>

        <div class="mb-3 mt-3">
            <label for="tenMon" class="form-label">Tên món ăn </label>
            <input type="text" class="form-control" id="tenMon" placeholder="tên món ăn..." name="tenMon" value="${monAn.tenMon}">
        </div>

        <div class="mb-3 mt-3">
            <label for="giaMon" class="form-label">Giá món:</label>
            <input type="text" class="form-control" id="giaMon" placeholder="giá món..." name="giaMon" value="${monAn.giaMon}">
        </div>

        <div class="mb-3" id="soLuongTonKho">
            <label for="soLuongTonKho" class="form-label">Số lượng tồn kho: </label>
            <input type="number" class="form-control" value="0" id="soLuongTonKho" placeholder="số lượng tồn kho..." name="soLuongTonKho" value="${monAn.soLuongTonKho}">
        </div>

        <div class="d-flex justify-content-center">
            <button type="submit" class="btn btn-success">Lưu</button>
        </div>
    </form>
</div>
<jsp:include page="footer.jsp"/>
