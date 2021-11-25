<%-- 
    Document   : gdTKTheoKhachHang
    Created on : Nov 17, 2021, 1:40:30 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Thống kê theo khách hàng</title>
            <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
            <script src="https://code.jquery.com/ui/1.13.0/jquery-ui.js"></script>
            <script>
            $( function() {
                $( "#datepicker" ).datepicker();
            } );
            </script>
        </head>
            <%
                Thanhvien cnh = (Thanhvien)session.getAttribute("chunhahang");
                    if(sv==null){
                        response.sendRedirect("dangnhap.jsp?err=timeout");
                    }
                //Lay danh sach khach hang
                ArrayList<KhachHang> listKH = (new TKKhachHangDAO()).getTKKhachHang(sd, ed);
                session.setAttribute("listKH", listKH);
            %>
        <body>
            <h2>Thống kê theo khách hàng</h2>
            <p>Chủ nhà hàng: <%=cnh.getChuNhaHang().getHoten()%></p>
            <form name="chonngay" action="gdTKTheoKhachHang.jsp" method="post">
                <p>Ngày bắt đầu thống kê: <input type="text" id="datepicker"></p>
                <p>Ngày kế thúc thống kê: <input type="text" id="datepicker"></p>
                <button type="submit">Xem thống kê</button>
            </form>
            
            <table>
                <thead>
                    <tr>
                        <th>TT</th>
                        <th>Mã khách hàng</th>
                        <th>Tên khách hàng</th>
                        <th>Tổng doanh thu</th>
                        <th>Chọn</th>
                    </tr>
                </thead>

                <tbody>
                    <% 
                        if(listKH != null)
                        for(int i=0; i<listMHKH.size(); i++){
                    %>
                    <tr>
                        <td><%=(i+1) %></td>
                        <td><%=listKH.get(i).getTKKhachHang.getId()%></td>
                        <td><%=listKH.get(i).getTKKhachHang.getHoten()%></td>
                        <td><%=listKH.get(i).getTKKhachHang.getDoanhthu()%></td>
                        <td><a href="gdTKChiTietKhachHang.jsp?idkh=<%=listKH.get(i).getId()%>">Chọn</a></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            <br>
            <button onclick="openPage('gdChonTK.jsp')">Quay lại</button>
        </body>
    </html>
</f:view>
