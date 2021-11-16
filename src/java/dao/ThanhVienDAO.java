/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import model.ThanhVien;

/**
 *
 * @author hungt
 */
public class ThanhVienDAO extends DAO {

    public ThanhVienDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String dangNhap(ThanhVien tv) throws MessagingException {
        String kq = "";
        if (tv.getEmail().equals("")) {
            kq = "";
        }
        try {
            String query = "SELECT * FROM tblThanhVien as tv WHERE tv.email = " + tv.getEmail();
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);

            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            tv.setId(rs.getString(1));
            tv.setHoTen(rs.getString(2));
            tv.setEmail(rs.getString(3));
            tv.setSdt(rs.getString(4));
            tv.setDaKichHoat(rs.getBoolean(5));
            tv.setVaiTro(rs.getString(6));
            tv.setDiaChi(rs.getString(7));

            if (!tv.getEmail().equals("")) {
                String ma = java.util.UUID.randomUUID().toString();
                sendEmail(tv.getEmail(), "login", ma);
                kq = ma;
            }
            // close connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("failure!");
        }
        return kq;
    }

    public String dangKy(ThanhVien tv) throws MessagingException {
        String kq = "";
        if (tv.getEmail().equals("")) {
            kq = "";
        }
        try {
            String query = "INSERT INTO tblThanhVien (hoTen, email, sdt, vaiTro, diaChi)"
                    + "VALUE ("
                    + tv.getHoTen()
                    + ", " + tv.getEmail()
                    + ", " + tv.getSdt()
                    + ", " + tv.getVaiTro()
                    + ", " + tv.getDiaChi() + ")";

            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);

            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            tv.setHoTen(rs.getString(1));
            tv.setEmail(rs.getString(2));
            tv.setSdt(rs.getString(3));
            tv.setDaKichHoat(rs.getBoolean(4));
            tv.setVaiTro(rs.getString(5));
            tv.setDiaChi(rs.getString(6));

            if (!tv.getEmail().equals("")) {
                String ma = java.util.UUID.randomUUID().toString();
                sendEmail(tv.getEmail(), "register", ma);
                kq = ma;
            }
            // close connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("failure!");
        }
        return kq;
    }

    public static boolean kichHoatTV(String ma, String email) {
        boolean kq = false;
        if (ma.equals("")) {
            kq = false;
        }
        try {
            String query = "UPDATE tblThanhVien"
                    + "SET daKichHoat=" + true
                    + "WHERE email=" + email;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);

            st.executeUpdate(query);
            kq = true;
            // close connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("failure!");
        }
        return kq;
    }

    private static void sendEmail(String toEmail, String type, String ma) throws AddressException, MessagingException {
        final String fromEmail = "admin@gmail.com";
        final String password = "admin123@";
        final String subject = "Java Example Test";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
        message.setSubject(subject);
        message.setSubject("HTML Message");
        String htmlContent = "";
        if (type.equals("register")) {
            htmlContent = "<h2>Chúc mừng bạn đã đăng ký tài khoản thành công!</h2>"
                    + "<p>Vui lòng nhập mã xác nhận để kích hoạt tài khoản</p>"
                    + "<p>Mã xác nhận: " + ma + "<p>";
        } else {
            htmlContent = "<h2>Vui lòng nhập mã xác nhận để đăng nhập tài khoản</h2>"
                    + "<p>Mã xác nhận: " + ma + "<p>";
        }

        message.setContent(htmlContent, "text/html");
        Transport.send(message);
        System.out.println("Gui mail thanh cong");
    }
}
