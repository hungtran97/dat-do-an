<%-- 
    Document   : gdChinhChuNhaHang
    Created on : Nov 11, 2021, 10:08:56 PM
    Author     : hungt
--%>

<%@page import="model.ThanhVien"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"
    import="java.util.*, dao.*, model.*"
%>
<%
    // initialize the current year that's used in the 
    // copyright notice
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentMont = currentDate.get(Calendar.MONTH) + 1;
%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<div class="container p-4 my-2" style="height: 100%">
    <div class="row row-cols-1 row-cols-md-2 gx-1">
<!--        <div class="col">
            <div class="card bg-success text-light">
                <h5 class="card-header">Thành Viên</h5>
                <div class="card-body">
                    <h5 class="card-title">345k</h5>
                    <p class="card-text"><%= currentYear%>/<%= currentMont%>, Viet Nam</p>
                    <p class="card-text text-light">18.2% increase since last month</p>
                </div>
            </div>
        </div>-->
<%
ThanhVien tv = (ThanhVien)session.getAttribute("chunhahang");
      if(tv==null){
          response.sendRedirect("dangnhap.jsp?err=timeout");
      }
      %>
      <button onclick="openPage('gdQuanLyMonAn.jsp')">Xem đơn hàng</button>
      <button onclick="openPage('gdDonHang.jsp')">Xem đơn hàng</button>
      <button onclick="openPage('gdChonThongKe.jsp')">Xem thống kê</button>
        
    </div>
</div>
<jsp:include page="footer.jsp"/>