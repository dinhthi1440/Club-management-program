package View;

import Model.HoatDong;
import Model.Quy;
import Model.ThanhVien;
import Controller.ControllerImp;
import Model.CoSoVC;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame implements View {
    private  ControllerImp controller;
    private int indexThanhVien;
    private int indexQuy;
    private List<ThanhVien> listTV;
    private List<ThanhVien> listTVTimKiem;
    private List<CoSoVC> listCSVC;
    private List<CoSoVC> listTK;
    private List<CoSoVC> listCSVCSort;
    private List<HoatDong> listHD;
    private List<HoatDong> listTKHD;
    private List<HoatDong> listHDTT;
    
    private List<Quy> listQuy;
    private List<Quy> listTKCT;
    
    private final DefaultTableModel modelTV;
    private final DefaultTableModel modelCSVC;
    private final DefaultTableModel modelHDDT;
    private final DefaultTableModel modelHDTT;
    private final DefaultTableModel modelQuy;
    

    DecimalFormat df = new DecimalFormat("#,###.000");

    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Trang chủ");
        listTV = new ArrayList<>();
        listCSVC = new ArrayList<>();
        listCSVCSort = new ArrayList<>();
        listTK = new ArrayList<>();
        listTKHD = new ArrayList<>();
        listHD = new ArrayList<>();
        listHDTT = new ArrayList<>();
        listQuy = new ArrayList<>();
        listTKCT = new ArrayList<>();
        modelTV = (DefaultTableModel) tblThanhVien.getModel();
        modelCSVC = (DefaultTableModel) tblCSVC.getModel();
        modelHDDT = (DefaultTableModel) tblHDDT.getModel();
        modelHDTT = (DefaultTableModel) tblTT.getModel();
        modelQuy = (DefaultTableModel) tableQuanLyChiTieu.getModel();
        controller = new ControllerImp();
        showDataThanhVien();
        showDataQuy();
        showDataCSVC();
        showDataHDTT();
        showDataHDDT();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThanhVien = new javax.swing.JTable();
        btnThemTV = new javax.swing.JButton();
        btnSuaThanhVien = new javax.swing.JButton();
        btnXoaThanhVien = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTongThanhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTimKiemThanhVien = new javax.swing.JTextField();
        btnTimKiemThanhVien = new javax.swing.JButton();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnTruongBan = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        btnLocTheoTieuChi = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCSVC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        themCSVC = new javax.swing.JButton();
        suaCSVC = new javax.swing.JButton();
        xoaCSVC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bttimkiem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        rbtsoluong = new javax.swing.JRadioButton();
        rbtdongia = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHDDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtThanhVienHDDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtChiPhiHDDT = new javax.swing.JTextField();
        themDT = new javax.swing.JButton();
        suaDT = new javax.swing.JButton();
        xoaDT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTongThanhVienTT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTongChiPhiTT = new javax.swing.JTextField();
        themTT = new javax.swing.JButton();
        suaTT = new javax.swing.JButton();
        xoaTT = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyChiTieu = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtchiphicon = new javax.swing.JTextField();
        themchitieu = new javax.swing.JButton();
        suachitieu = new javax.swing.JButton();
        xoachitieu = new javax.swing.JButton();
        bttimkiemchitieu = new javax.swing.JButton();
        txttimkiemchitieu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        tblThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TV", "Tên TV", "Khoá", "Chuyên Nghành", "Ban", "Ngày sinh", "Giới tính", "Email", "SĐT", "Chức vụ"
            }
        ));
        jScrollPane2.setViewportView(tblThanhVien);

        btnThemTV.setText("Thêm thành viên");
        btnThemTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTVActionPerformed(evt);
            }
        });

        btnSuaThanhVien.setText("Sửa thông tin thành viên");
        btnSuaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThanhVienActionPerformed(evt);
            }
        });

        btnXoaThanhVien.setText("Xoá thông tin thành viên ");
        btnXoaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThanhVienActionPerformed(evt);
            }
        });

        jLabel18.setText("Tổng số lượng thành viên :");

        txtTongThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongThanhVienActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("QUẢN LÍ THÀNH VIÊN CLB ISTAR HaUI");

        btnTimKiemThanhVien.setText("Tìm kiếm");
        btnTimKiemThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThanhVienActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        buttonGroup1.add(rbtnTruongBan);
        rbtnTruongBan.setText("Trưởng Ban");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");

        btnLocTheoTieuChi.setText("Lọc");
        btnLocTheoTieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocTheoTieuChiActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel14.setText("Mã thành viên:");

        jLabel15.setText("Tên thành viên:");

        jLabel16.setText("Khóa:");

        jLabel17.setText("Chuyên ngành:");

        jLabel19.setText("Ban: ");

        jLabel20.setText("Ngày sinh:");

        jLabel21.setText("Giới tính:");

        jLabel22.setText("Email:");

        jLabel23.setText("Số điện thoại:");

        jLabel24.setText("Chức vụ:");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel25.setText("Lọc theo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel20))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jTextField10))))
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaThanhVien)
                            .addComponent(btnXoaThanhVien)
                            .addComponent(btnThemTV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnTruongBan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnNam)
                                    .addComponent(rbtnNu))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRefresh)
                                    .addComponent(btnLocTheoTieuChi))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemThanhVien)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThemTV)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addComponent(rbtnNam)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTimKiemThanhVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLocTheoTieuChi)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSuaThanhVien)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel21)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnNu)
                                    .addComponent(btnRefresh))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rbtnTruongBan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaThanhVien))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))))
                        .addGap(195, 195, 195))))
        );

        jTabbedPane1.addTab("Quản Lý Thành Viên", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        tblCSVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thiết bị", "Tên thiết bị", "Trạng thái", "Số lượng", "Chi Phí CSVC"
            }
        ));
        jScrollPane5.setViewportView(tblCSVC);

        jLabel5.setText("Tổng số lượng thiết bị:");

        jLabel6.setText("Tổng chi phí:");

        themCSVC.setText("Thêm");
        themCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themCSVCActionPerformed(evt);
            }
        });

        suaCSVC.setText("Sửa");
        suaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaCSVCActionPerformed(evt);
            }
        });

        xoaCSVC.setText("Xoá");
        xoaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaCSVCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("QUẢN LÝ CƠ SỞ VẬT CHẤT ");

        bttimkiem.setText("Tìm kiếm");
        bttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Sắp xếp");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        rbtsoluong.setText("Số lương");

        rbtdongia.setText("Đơn giá");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 242, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(themCSVC)
                .addGap(105, 105, 105)
                .addComponent(suaCSVC)
                .addGap(115, 115, 115)
                .addComponent(xoaCSVC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttimkiem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtsoluong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtdongia)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addGap(240, 240, 240))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimkiem))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themCSVC)
                            .addComponent(suaCSVC)
                            .addComponent(xoaCSVC)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(rbtdongia)
                            .addComponent(rbtsoluong)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton5)))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Cơ Sở Vật Chất", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        tblHDDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hoạt động", "Thời gian", "Địa điểm", "Mô tả ", "Số lượng thành viên", "Kinh Phí"
            }
        ));
        jScrollPane4.setViewportView(tblHDDT);

        jLabel3.setText("Tổng số lượng thành viên :");

        jLabel4.setText("Tổng chi phí:");

        themDT.setText("Thêm");
        themDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDTActionPerformed(evt);
            }
        });

        suaDT.setText("Sửa");
        suaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDTActionPerformed(evt);
            }
        });

        xoaDT.setText("Xoá");
        xoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDTActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setText("QUẢN LÝ HOẠT ĐỘNG ĐÀO TẠO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Tim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Refesh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(themDT)
                        .addGap(153, 153, 153)
                        .addComponent(suaDT)
                        .addGap(158, 158, 158)
                        .addComponent(xoaDT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themDT)
                    .addComponent(suaDT)
                    .addComponent(xoaDT)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Đào Tạo", jPanel3);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sự kiện", "Đánh giá", "Mô tả", "Số lượng thành viên", "Địa điểm", "Thời gian ", "Chi Phí"
            }
        ));
        jScrollPane3.setViewportView(tblTT);

        jLabel1.setText("Tổng thành viên :");

        jLabel2.setText("Tổng chi phí :");

        themTT.setText("Thêm sự kiện");
        themTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTTActionPerformed(evt);
            }
        });

        suaTT.setText("Sửa sự kiện");
        suaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTTActionPerformed(evt);
            }
        });

        xoaTT.setText("Xoá sự kiện");
        xoaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTTActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("QUẢN LÝ HOẠT ĐỘNG TRUYỀN THÔNG VÀ SỰ KIỆN CLB");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(themTT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(suaTT)
                .addGap(132, 132, 132)
                .addComponent(xoaTT)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {suaTT, themTT, xoaTT});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themTT)
                    .addComponent(xoaTT)
                    .addComponent(suaTT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Truyền Thông", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setText("Quản lý chi tiêu");

        tableQuanLyChiTieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chi tiêu", "Tên chi tiêu", "Thơi gian", "Thu/Chi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableQuanLyChiTieu);

        jLabel13.setText("Chi phí còn lại: ");

        themchitieu.setText("Thêm");
        themchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themchitieuActionPerformed(evt);
            }
        });

        suachitieu.setText("Sửa");
        suachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suachitieuActionPerformed(evt);
            }
        });

        xoachitieu.setText("Xóa");
        xoachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoachitieuActionPerformed(evt);
            }
        });

        bttimkiemchitieu.setText("Tìm kiếm");
        bttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemchitieuActionPerformed(evt);
            }
        });

        txttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemchitieuActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(themchitieu)
                .addGap(250, 250, 250)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(suachitieu)
                        .addGap(273, 273, 273)
                        .addComponent(xoachitieu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttimkiemchitieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtchiphicon, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txttimkiemchitieu))))
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtchiphicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttimkiemchitieu)
                    .addComponent(txttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themchitieu)
                    .addComponent(xoachitieu)
                    .addComponent(suachitieu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý chi tiêu", jPanel6);

        jScrollPane7.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void themchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themchitieuActionPerformed
        // TODO add your handling code here:
        new AddQuy(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themchitieuActionPerformed

    private void xoaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            listHDTT.remove(vitri);
            showData(listHDTT, modelHDTT);
            //luuFileHDTT(listHDTT);
            controller.writeToFile(listHDTT, "HDTT.TXT");
        }
        showDataHDTT();
    }//GEN-LAST:event_xoaTTActionPerformed

    private void suaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm sự kiện");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 hàng rồi chỉnh sửa !");
        } else {
            new EditTruyenThong(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataHDTT();
    }//GEN-LAST:event_suaTTActionPerformed

    private void themTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themTTActionPerformed
        // TODO add your handling code here:
        new AddTruyenThong(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themTTActionPerformed

    private void xoaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        }
        else if(listHD.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        }
        else{
        int isCheckYesNo = JOptionPane.showConfirmDialog(null,
                "Bạn có thật sự muốn xóa?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
        if (isCheckYesNo == 0) {
            listHD.remove(vitri);
            showData(listHD, modelHDDT);
            JOptionPane.showMessageDialog(rootPane, "Xóa thanh cong!");
            controller.writeToFile(listHD, "HOATDONG.TXT");
        }
        }
    }//GEN-LAST:event_xoaDTActionPerformed

    private void suaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if(listHD.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm hoạt động");
        }
        else if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        }
        else{
            new EditDaoTao(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataHDDT();
    }//GEN-LAST:event_suaDTActionPerformed

    private void themDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themDTActionPerformed
        new AddDaoTao(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themDTActionPerformed

    private void xoaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        }
        else if(listCSVC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        }
        else{
            listCSVC.remove(vitri);
            showData(listCSVC, modelCSVC);
            //luuFile(listCSVC);
            controller.writeToFile(listCSVC, "CSVC.TXT");
        }
        showDataCSVC();
    }//GEN-LAST:event_xoaCSVCActionPerformed

    private void suaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if(listCSVC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm thiết bị");
        }
        else if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        }
        else{
            new EditCSVC(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataCSVC();
    }//GEN-LAST:event_suaCSVCActionPerformed

    private void themCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themCSVCActionPerformed
        new AddCSVC(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themCSVCActionPerformed

    private void btnTimKiemThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemThanhVienActionPerformed
        // TODO add your handling code here:
        String tim = txtTimKiemThanhVien.getText().toUpperCase();
        int ktra = 0;
        listTVTimKiem = controller.readDataFromFile("TV.txt");
        for (ThanhVien x : listTVTimKiem) {
            if (x.getTenTV().toUpperCase().contains(tim) || x.getTenTV().toUpperCase().equals(tim) || x.getMaTV().toUpperCase().equals(tim)) {
                ktra = 1;
                break;
            }
        }
        if (tim.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập tên hoặc mã thành viên cần tìm!");
        } else if (ktra == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không tồn tại tên hoặc mã thành viên này trong danh sách!");
        }else {
            TimKiemTv1 editTV = new TimKiemTv1(this, rootPaneCheckingEnabled);
            List<ThanhVien> listTVTimKiem1 = new ArrayList<>();
            for (ThanhVien x : listTVTimKiem) {
                if (x.getTenTV().toUpperCase().contains(tim) || x.getMaTV().toUpperCase().equals(tim)) {
                    listTVTimKiem1.add(x);
                }
            }
            editTV.updateTable(listTVTimKiem1);
            editTV.setVisible(true);
        }
        this.showData(listTV, modelTV);
    }//GEN-LAST:event_btnTimKiemThanhVienActionPerformed

    private void txtTongThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongThanhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongThanhVienActionPerformed

    private void btnXoaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThanhVienActionPerformed
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(this, "Ban có muốn thành viên nay?", "Xac nhan", JOptionPane.OK_CANCEL_OPTION);
        int removeThanhVien = tblThanhVien.getSelectedRow();
        if (removeThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            listTV.remove(removeThanhVien);
            controller.writeToFile(listTV, "TV.TXT");
        }
        showDataThanhVien();
    }//GEN-LAST:event_btnXoaThanhVienActionPerformed

    private void btnSuaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThanhVienActionPerformed
        // TODO add your handling code here:
        indexThanhVien = tblThanhVien.getSelectedRow();
        if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                "Hãy nhập thêm thành viên");
        } else if (indexThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane,
                "Hãy chọn thành viên rồi chỉnh sửa !");
        } else {
            EditThanhVien editTV = new EditThanhVien(this, rootPaneCheckingEnabled);
            editTV.setEditData(listTV.get(indexThanhVien));
            editTV.setVisible(true);
        }
        showDataThanhVien();
    }//GEN-LAST:event_btnSuaThanhVienActionPerformed

    private void btnThemTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTVActionPerformed
        new AddThanhVien(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnThemTVActionPerformed

    private void xoachitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoachitieuActionPerformed
        // TODO add your handling code here:
        int rmQuy = tableQuanLyChiTieu.getSelectedRow();
        if(rmQuy == -1){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưac họn thông tin cần xóa");
        }
        else{
            listQuy.remove(rmQuy);
            controller.writeToFile(listQuy, "QUY.TXT");
        }
        showDataQuy();
    }//GEN-LAST:event_xoachitieuActionPerformed

    private void suachitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suachitieuActionPerformed
        // TODO add your handling code here:
        indexQuy  = tableQuanLyChiTieu.getSelectedRow();
        if (listQuy.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                "Danh sach quy dang rỗng");
        } else if (indexQuy == -1) {
            JOptionPane.showMessageDialog(rootPane,
                "Chọn phần thông tin bạn muốn chỉnh sửa rồi chỉnh sửa !");
        } else {
            EditQuy editQuy = new EditQuy(this, rootPaneCheckingEnabled);
            editQuy.setDefaultData(listQuy.get(indexQuy));
            editQuy.setVisible(true);
        }
        showDataQuy();
    }//GEN-LAST:event_suachitieuActionPerformed

    private void bttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemActionPerformed
        // TODO add your handling code here:
        listCSVC = controller.readDataFromFile("CSVC.TXT");
        listTK.removeAll(listTK);
        for(CoSoVC item : listCSVC){
            if (item.getTenCSVC().toLowerCase().contains(txttim.getText().toLowerCase())
                    ||(item.getMaCSVC().toLowerCase().contains(txttim.getText().toLowerCase()))
                    ||(item.getTrangThai().toLowerCase().contains(txttim.getText().toLowerCase()))
                    ) {
                listTK.add(item);
            }
        }
        controller.writeToFile(listTK, "CSVCSearch.TXT");
        showDataCSVCSearch();
    }//GEN-LAST:event_bttimkiemActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        showDataCSVC();
        txttim.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listCSVCSort.removeAll(listCSVCSort);
        listCSVCSort= controller.readDataFromFile("CSVC.TXT");
        if(rbtsoluong.isSelected() == true){
            Collections.sort(listCSVCSort , new sortByCountInCSVC()) ;
        }
        else if(rbtdongia.isSelected() == true){
            Collections.sort(listCSVCSort , new sortByGiainCSVC());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn tiêu chí sắp xếp");
        }
        controller.writeToFile(listCSVCSort, "CSVCSort.TXT");
        showDataCSVCSort();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemchitieuActionPerformed
        // TODO add your handling code here:
        listQuy = controller.readDataFromFile("QUY.TXT");
        listTKCT.removeAll(listTKCT);
        for(Quy item : listQuy){
            if (item.getTenHD().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase())
                    ||(item.getMaQuy().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase()))
                    ||(item.getThoiGian().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase()))
                    ) {
                listTKCT.add(item);
            }
        }
        controller.writeToFile(listTKCT, "QUYSearch.TXT");
        showDataQuySearch();
    }//GEN-LAST:event_bttimkiemchitieuActionPerformed

    private void txttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemchitieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemchitieuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showDataQuy();
        txttimkiemchitieu.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         listHD = controller.readDataFromFile("HOATDONG.TXT");
        listTKHD.removeAll(listTKHD);
        for(HoatDong item : listHD){
            if (item.getTenHD().toLowerCase().contains(jTextField1.getText().toLowerCase())
                    ||(item.getThoiGian().toLowerCase().contains(jTextField1.getText().toLowerCase()))
                    ||(item.getDiaDiem().toLowerCase().contains(jTextField1.getText().toLowerCase()))
                    ) {
                listTKHD.add(item);
                
            }
        }
        controller.writeToFile(listTKHD, "HDDTSearch.TXT");
        showDataDTSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        showDataHDDT();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLocTheoTieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocTheoTieuChiActionPerformed
        // TODO add your handling code here:
        
        if (!rbtnNam.isSelected() && !rbtnNu.isSelected() && !rbtnTruongBan.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tiêu chí!");
            return;
        }
        
        List<ThanhVien> filteredList = new ArrayList<>();
        for (ThanhVien x : listTV) {
            if (rbtnNam.isSelected() && x.getGioiTinh().equals("Nam")) {
                filteredList.add(x);
            } else if (rbtnNu.isSelected() && x.getGioiTinh().equals("Nữ")) {
                filteredList.add(x);
            } else if (rbtnTruongBan.isSelected() && x.getChucDanh().equals("Trưởng Ban")) {
                filteredList.add(x);
            }
        }
        showData(filteredList, modelTV);
        tongThanhVien(filteredList);
    }//GEN-LAST:event_btnLocTheoTieuChiActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showDataThanhVien();
        txtTimKiemThanhVien.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
    
    public void tongThanhVien(List<ThanhVien> list){
        int tong = 0;
        for(ThanhVien x : list){
            tong += 1;
        }
        txtTongThanhVien.setText(String.valueOf(tong));
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocTheoTieuChi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSuaThanhVien;
    private javax.swing.JButton btnThemTV;
    private javax.swing.JButton btnTimKiemThanhVien;
    private javax.swing.JButton btnXoaThanhVien;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JButton bttimkiemchitieu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rbtdongia;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JRadioButton rbtnTruongBan;
    private javax.swing.JRadioButton rbtsoluong;
    private javax.swing.JButton suaCSVC;
    private javax.swing.JButton suaDT;
    private javax.swing.JButton suaTT;
    private javax.swing.JButton suachitieu;
    private javax.swing.JTable tableQuanLyChiTieu;
    private javax.swing.JTable tblCSVC;
    private javax.swing.JTable tblHDDT;
    private javax.swing.JTable tblTT;
    private javax.swing.JTable tblThanhVien;
    private javax.swing.JButton themCSVC;
    private javax.swing.JButton themDT;
    private javax.swing.JButton themTT;
    private javax.swing.JButton themchitieu;
    private javax.swing.JTextField txtChiPhiHDDT;
    private javax.swing.JTextField txtThanhVienHDDT;
    private javax.swing.JTextField txtTimKiemThanhVien;
    private javax.swing.JTextField txtTongChiPhiTT;
    private javax.swing.JTextField txtTongThanhVien;
    private javax.swing.JTextField txtTongThanhVienTT;
    private javax.swing.JTextField txtchiphicon;
    private javax.swing.JTextField txttim;
    private javax.swing.JTextField txttimkiemchitieu;
    private javax.swing.JButton xoaCSVC;
    private javax.swing.JButton xoaDT;
    private javax.swing.JButton xoaTT;
    private javax.swing.JButton xoachitieu;
    // End of variables declaration//GEN-END:variables


    private void showDataThanhVien() {
            listTV = controller.readDataFromFile("TV.TXT");
            this.showData(listTV, modelTV);
            int tong = 0;
            for (ThanhVien x : listTV) {
                tong += 1;
            }
            txtTongThanhVien.setText(String.valueOf(tong));
    }
    
    public void addThanhVien(ThanhVien t) {
        listTV.add(t);
        controller.writeToFile(listTV, "TV.TXT");
        this.showData(listTV, modelTV);
        showDataThanhVien();
    }
    private void showDataQuy(){
        listQuy = controller.readDataFromFile("QUY.TXT");
        this.showData(listQuy, modelQuy);
        double chiphicl = 0; 
        for(Quy x : listQuy){
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }
    private void showDataQuySearch(){
        listQuy = controller.readDataFromFile("QUYSearch.TXT");
        this.showData(listTKCT, modelQuy);
        double chiphicl = 0; 
        for(Quy x : listTKCT){
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }
    public void addQuy(Quy q){
        listQuy.add(q); 
        this.showData(listQuy, modelQuy);
        controller.writeToFile(listQuy, "QUY.TXT");
        showDataQuy();
    }
    private void showDataCSVC(){
        modelCSVC.setNumRows(0);
        listCSVC = controller.readDataFromFile("CSVC.TXT");
        this.showData(listCSVC, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }
    private void showDataCSVCSearch(){
        modelCSVC.setNumRows(0);
        listTK = controller.readDataFromFile("CSVCSearch.TXT");
        this.showData(listTK, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listTK) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }
    private void showDataCSVCSort(){
        modelCSVC.setNumRows(0);
        listCSVCSort = controller.readDataFromFile("CSVCSort.TXT");
        this.showData(listCSVCSort, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }

    public void addCSVC(CoSoVC cs) {
        listCSVC.add(cs);
        this.showData(listCSVC, modelCSVC);
        controller.writeToFile(listCSVC, "CSVC.TXT");
        showDataCSVC(); 
    }

    
    private void showDataHDTT(){
        listHDTT = LayFile("HDTT.TXT");
        this.showData(listHDTT, modelHDTT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHDTT) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtTongThanhVienTT.setText(String.valueOf(SoThanhVien));
        txtTongChiPhiTT.setText(String.valueOf(TongChiPhi));
    }
    private void showDataHDDT(){
        listHD = LayFile("HOATDONG.TXT");
        this.showData(listHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
    }
    private void showDataDTSearch() {
        listHD = LayFile("HDDTSearch.TXT");
        this.showData(listTKHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listTKHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addHD(HoatDong a) {
        listHD.add(a);
        controller.writeToFile(listHD, "HOATDONG.TXT");
        showData(listHD, modelHDDT);
        showDataHDDT();
    }

    public void addTT(HoatDong tt) {
        listHDTT.add(tt);
        controller.writeToFile(listHDTT, "HDTT.TXT");
        showData(listHDTT, modelHDTT);
        showDataHDTT();
    }

    void updateThanhVien(ThanhVien tv) {
        ThanhVien thanhVienDaChon = listTV.get(indexThanhVien);
        thanhVienDaChon.setMaTV(tv.getMaTV());
        thanhVienDaChon.setTenTV(tv.getTenTV());
        thanhVienDaChon.setKhoa(tv.getKhoa());
        thanhVienDaChon.setChuyenNghanh(tv.getChuyenNghanh());
        thanhVienDaChon.setBan(tv.getBan());
        thanhVienDaChon.setNgaySinh(tv.getNgaySinh());
        thanhVienDaChon.setGioiTinh(tv.getGioiTinh());
        thanhVienDaChon.setEmail(tv.getEmail());
        thanhVienDaChon.setSdt(tv.getSdt());
        thanhVienDaChon.setChucDanh(tv.getChucDanh());
        listTV.set(indexThanhVien, thanhVienDaChon);
        controller.writeToFile(listTV, "TV.TXT");
        showDataThanhVien();
    }
    public void updataQuy(Quy q){
        Quy qSelect = listQuy.get(indexQuy);
        qSelect.setMaQuy(q.getMaQuy());
        qSelect.setTenHD(q.getTenHD());
        qSelect.setThoiGian(q.getThoiGian());
        qSelect.setChiPhi(q.getChiPhi());
        listQuy.set(indexQuy, qSelect);
        controller.writeToFile(listQuy, "QUY.TXT");
        showDataQuy();
        
    }
    public void editCSVC(CoSoVC cs, int vt) {
        listCSVC.set(vt, cs);
        showData(listCSVC, modelCSVC);
        controller.writeToFile(listCSVC, "CSVC.TXT");
        showDataCSVC();
    }

    public void editHD(HoatDong a, int vt) {
        listHD.set(vt, a);
        showData(listHD, modelHDDT);
        controller.writeToFile(listHD, "HOATDONG.TXT");
        showDataHDDT();
    }

    public void editHDTT(HoatDong tt, int vt) {
        listHDTT.set(vt, tt);
        showData(listHDTT, modelHDTT);
        controller.writeToFile(listHDTT, "HDTT.TXT");
        showDataHDTT();
    }
    
    
    public <T> void showData(List<T> list, DefaultTableModel model){
        model.setRowCount(0);
        for(T t: list){
            if(t instanceof ThanhVien){
                ThanhVien tv = (ThanhVien)t;
                model.addRow(new Object[]{
                    tv.getMaTV(), tv.getTenTV(), tv.getKhoa(), tv.getChuyenNghanh(), tv.getBan(),
                    tv.getNgaySinh(), tv.getGioiTinh(), tv.getEmail(), tv.getSdt(), tv.getChucDanh()
                });
            }
            if(t instanceof Quy){
                Quy q = (Quy)t;
                model.addRow(new Object[]{
                    q.getMaQuy() , q.getTenHD() , q.getThoiGian() , q.getChiPhi()
                });
            }
            if (t instanceof HoatDong) {
                HoatDong z = (HoatDong) t;
                if (z.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                    model.addRow(new Object[]{
                        z.getTenHD(), z.getThoiGian(), z.getDiaDiem(), z.getMoTa(), z.getSoThanhVien(), z.getKinhPhi()
                    });
                }
            }
            if (t instanceof HoatDong) {
                HoatDong a = (HoatDong) t;
                if (a.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                    model.addRow(new Object[]{
                        a.getTenHD(), a.getDanhGia(), a.getMoTa(), a.getSoThanhVien(), a.getDiaDiem(), a.getThoiGian(), a.getKinhPhi()
                    });
                }
            }
            if(t instanceof CoSoVC){
                CoSoVC csvc = (CoSoVC)t;
                model.addRow(new Object[]{
                    csvc.getMaCSVC(), csvc.getTenCSVC(), csvc.getTrangThai(), csvc.getSoLuong(), csvc.getChiPhi()
                });
            }
        }
    }
    
    
    private List<HoatDong> LayFile(String fileName) {
        FileInputStream fi;
        ObjectInputStream in;
        List<HoatDong> list = new ArrayList<>();
        try {
            fi = new FileInputStream(fileName);
            in = new ObjectInputStream(fi);
            list = (ArrayList<HoatDong>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    
}
