<%-- 
    Document   : gdDonHang
    Created on : Nov 16, 2021, 6:57:14 PM
    Author     : Hung
--%>
<%@page import="dao.DonHangDAO"%>
<%@page import="model.DonHang"%>

<%@page import="java.util.List"%>
<%@page import="model.ThanhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ThanhVien tv = (ThanhVien) session.getAttribute("nhanviengiaohang");
            if (tv == null) {
                response.sendRedirect("dangnhap.jsp?err=timeout");
            }
            String nhahang = null;
            List<DonHang> listDonHang = (new DonHangDAO()).getDanhSachDonHangChuaNhan();
            for (DonHang dh : listDonHang) {
                

            }
            String tennv  = tv.getHoten();
            session.setAttribute("tennhanvien", tv.getHoten());
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



    </head>
    <body>
        <h1>Xem đơn hàng</h1>
        <table border="0">             

            <tr> <td> 
                    <p/>Nhân viên giao hàng: <%= tennv%>

                </td>
            </tr>
            <tr> <td> <table style="border: 1px solid black;border-collapse: collapse;" >
                        <thead>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Mã đơn hàng </td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Tên nhà hàng</td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Địa chỉ nhà hàng</td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Tổng tiền</td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Tên khách hàng</td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">SDT</td>
                        <td style="border: 1px solid black; padding:0 15px 0 15px;">Địa chỉ giao hàng</td>
                        </thead>
                        <%
                            if (listDonHang != null)
                                for (int i = 0; i < listDonHang.size(); i++) {
                                    session.setAttribute("chitiet", listDonHang.get(i));
                        %>
                        <tr class="clickable" onclick="openPage('gdDonHangChiTiet.jsp')">  
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getId()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getNhahang().getTennhahang()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getNhahang().getDiachinhahang()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getTongtien()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getKhachhang().getHoten()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getKhachhang().getSdt()%></td>
                            <td style="text-align:center; padding:0 15px 0 15px;"><%=listDonHang.get(i).getDiachigiaohang()%></td>
                        </tr>
                        <%}%>
                    </table>

                    <button type="button" name="back" onclick="history.back()">Quay lại</button>



                </td></tr>
    </body>
</html>

</div>
</div>
<jsp:include page="footer.jsp"/>
