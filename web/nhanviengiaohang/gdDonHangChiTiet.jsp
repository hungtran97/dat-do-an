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

        <html>
            <head>
                <%
                    ThanhVien tv = (ThanhVien) session.getAttribute("nhanviengiaohang");
                    if (tv == null) {
                        response.sendRedirect("dangnhap.jsp?err=timeout");
                    }
                    String tennv = (String) session.getAttribute("tennhanvien");
                    DonHang donhang = (DonHang) session.getAttribute("chitiet");
                    if (donhang == null) {
                        response.sendRedirect("gdChonDon.jsp?err=timeout");

                    }
                %>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



            </head>

            <body>
                <h1>Đơn hàng chi tiết</h1>
                <table border="0">             

                    <tr> <td> 
                            <p/>Nhân viên giao hàng: <%= tennv%>

                        </td>
                    </tr>
                    <tr> <td> <table style="border: 1px solid black;border-collapse: collapse;" >

                                <td style="border: 1px solid black; padding:0 15px 0 15px;">Địa chỉ giao hàng </td>
                                <td style="border: 1px solid black; padding:0 15px 0 15px;">Tên nhà hàng </td>
                                <td style="border: 1px solid black; padding:0 15px 0 15px;">Địa chỉ nhà hàng </td>
                                <td style="border: 1px solid black; padding:0 15px 0 15px;">Tổng tiền</td>
                                <td style="border: 1px solid black; padding:0 15px 0 15px;">Tên khách hàng</td>
                                <td style="border: 1px solid black; padding:0 15px 0 15px;">SDT</td>
                                
                                </thead>

                                <%
                                    if (donhang != null) {

                                        List<MonAnTrongDH> giohang = (List<MonAnTrongDH>) donhang.getMondat();

                                %>
                                <tr>  
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getDiachigiaohang()%></td>
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getNhahang().getTennhahang()%></td>
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getNhahang().getDiachinhahang()%></td>
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getTongtien()%></td>
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getKhachhang().getHoten()%></td>
                                    <td style="text-align:center; padding:0 15px 0 15px;"><%=donhang.getKhachhang().getSdt()%></td>

                                </tr>
                                <tr> <td> <table style="border: 1px solid black;border-collapse: collapse;" >

                                            <td style="border: 1px solid black; padding:0 15px 0 15px;">Món ăn </td>
                                            <td style="border: 1px solid black; padding:0 15px 0 15px;">Số lượng</td>


                                            </thead>

                                            <%
                                                if (donhang.getMondat() != null) {
                                                    for (int i = 0; i < giohang.size(); i++) {

                                            %>
                                            <tr>  

                                                <td style="text-align:center; padding:0 15px 0 15px;"><%=giohang.get(i).getMonan().getTenmonan()%></td>
                                                <td style="text-align:center; padding:0 15px 0 15px;"><%=giohang.get(i).getSoluong()%></td>


                                            </tr>
                                            <%}%>
                                            <%}%>
                                            <%}%>
                                        </table>
                                        <button type="button" name="Nhận đơn" onclick="setTrangThaiNhanDonHang()">Nhận đơn</button>
                                        <button type="button" name="back" onclick="history.back()">Quay lại</button>



                                    </td></tr>

                                <script type="text/javascript">

                                    function setTrangThaiDonHang() {
                                        if ((new DonHangDAO().setTrangThaiNhanDonHang(donhang.getId(),2))) {
                                            alert("Thành công!");
                                            response.sendRedirect("gdDonHangNhan.jsp");
                                        } else {
                                            alert("Lỗi");
                                            history.back()
                                        }
                                    }
                                </script>

                                </body>
                                </html>

                                </div>
                                </div>
                                <jsp:include page="footer.jsp"/>