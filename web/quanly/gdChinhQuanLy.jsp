<%-- 
    Document   : gdChinhQuanLy
    Created on : Nov 11, 2021, 10:06:36 PM
    Author     : hungt
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"
    import="java.util.*, dao.*, model.*"
%>
<!DOCTYPE html>
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
    <div class="row row-cols-1 row-cols-md-3 gx-1">
        <div class="col">
            <div class="card bg-success text-light">
                <h5 class="card-header">Thành Viên</h5>
                <div class="card-body">
                    <h5 class="card-title">345k</h5>
                    <p class="card-text"><%= currentYear%>/<%= currentMont%>, Viet Nam</p>
                    <p class="card-text text-light">18.2% increase since last month</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card bg-warning text-light">
                <h5 class="card-header">Nhà Hàng</h5>
                <div class="card-body">
                    <h5 class="card-title">345k</h5>
                    <p class="card-text"><%= currentYear%>/<%= currentMont%>, Viet Nam</p>
                    <p class="card-text text-light">18.2% increase since last month</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card bg-danger text-light">
                <h5 class="card-header">Món Ăn</h5>
                <div class="card-body">
                    <h5 class="card-title">345k</h5>
                    <p class="card-text"><%= currentYear%>/<%= currentMont%>, Viet Nam</p>
                    <p class="card-text text-light">18.2% increase since last month</p>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
