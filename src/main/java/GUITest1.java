

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

public class GUITest1 extends javax.swing.JFrame {

    public GUITest1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCanh1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCanh2 = new javax.swing.JTextField();
        txtCanh3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKetQua = new javax.swing.JTextField();
        btnKiemTra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtChuVi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDienTich = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cạnh 1");

        jLabel2.setText("Cạnh 2");

        txtCanh1.setNextFocusableComponent(txtCanh2);

        jLabel3.setText("Cạnh 3");

        txtCanh2.setNextFocusableComponent(txtCanh3);

        txtCanh3.setNextFocusableComponent(btnKiemTra);

        jLabel4.setText("Kết quả");

        txtKetQua.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKetQua.setEnabled(false);
        txtKetQua.setOpaque(true);
        txtKetQua.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        txtKetQua.setSelectionColor(new java.awt.Color(204, 204, 255));

        btnKiemTra.setText("Kiểm Tra Và Tính");
        btnKiemTra.setNextFocusableComponent(btnClear);
        btnKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraActionPerformed(evt);
            }
        });

        jLabel5.setText("Chu Vi");

        txtChuVi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChuVi.setEnabled(false);
        txtChuVi.setOpaque(true);
        txtChuVi.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        txtChuVi.setSelectionColor(new java.awt.Color(204, 204, 255));

        jLabel6.setText("Diện Tích");

        txtDienTich.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDienTich.setEnabled(false);
        txtDienTich.setOpaque(true);
        txtDienTich.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        txtDienTich.setSelectionColor(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("APP KIỂM TRA VÀ TÍNH CHU VI, DIỆN TÍCH TAM GIÁC");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCanh2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCanh3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKetQua)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChuVi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtDienTich))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCanh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCanh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCanh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKiemTra)
                    .addComponent(btnClear)
                    .addComponent(btnThoat))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean isRectangle(float canh1, float canh2, float canh3) {
        if(canh1 <= 0 || canh2 <=0 || canh3 <= 0)
            return false;
        return (canh1+canh2>canh3 && canh1+canh3>canh2 && canh2+canh3>canh1);
    }
    
    int kindRectangle(float canh1, float canh2, float canh3) {
        if(canh1 == canh2 && canh2 == canh3)
            return 1; //TAM GIAC DEU
        if(canh1==canh2 || canh1==canh3 || canh2==canh3)
            return 2; //TAM GIAC CAN
        if(canh1*canh1==canh2*canh2+canh3*canh3 || canh2*canh2==canh1*canh1+canh3*canh3 || canh3*canh3== canh1*canh1+canh2*canh2)
            return 3; //TAM GIAC VUONG
        return 0; //TAM GIAC THUONG
    }
    
    void moveToErrorSection() {
        float canh1, canh2, canh3;
        try {
            canh1 = Float.parseFloat(txtCanh1.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 1 phải là số thực dương");
            txtCanh1.requestFocus();
            return;
        }
        try {
            canh2 = Float.parseFloat(txtCanh2.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 2 phải là số thực dương");
            txtCanh2.requestFocus();
            return;
        }
        try {
            canh3 = Float.parseFloat(txtCanh3.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 3 phải là số thực dương");
            txtCanh3.requestFocus();
            return;
        }
        if(canh1 <= 0) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 1 phải lớn hơn 0");
            txtCanh1.requestFocus();
            return;
        }
        if(canh2 <= 0) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 2 phải lớn hơn 0");
            txtCanh2.requestFocus();
            return;
        }
        if(canh3 <= 0) {
            JOptionPane.showMessageDialog(this, "Giá trị cạnh 3 phải lớn hơn 0");
            txtCanh3.requestFocus();
            return;
        }
        txtCanh1.requestFocus();
    }
    
    private void btnKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraActionPerformed
        try {
            float canh1 = Float.parseFloat(txtCanh1.getText());
            float canh2 = Float.parseFloat(txtCanh2.getText());
            float canh3 = Float.parseFloat(txtCanh3.getText());
            if(isRectangle(canh1, canh2, canh3)) {
                int kind = kindRectangle(canh1, canh2, canh3);
                float ChuVi = canh1+canh2+canh3;
                float nuachuvi = (float) ((ChuVi*1.0)/2);
                float DienTich = (float) sqrt(nuachuvi*(nuachuvi-canh1)*(nuachuvi-canh2)*(nuachuvi-canh3));
                switch (kind) {
                    case 1 -> txtKetQua.setText("Tam giac deu");
                    case 2 -> txtKetQua.setText("Tam giac can");
                    case 3 -> txtKetQua.setText("Tam giac vuong");
                    case 0 -> txtKetQua.setText("Tam giac thuong");
                    //default -> throw new AssertionError();
                }
                txtChuVi.setText(String.valueOf(ChuVi));
                txtDienTich.setText(String.valueOf(DienTich));
            }
            else {
                txtKetQua.setText("Khong phai la tam giac");
                txtChuVi.setText("Khong co chu vi");
                txtDienTich.setText("Khong co dien tich");
                moveToErrorSection();
            }
        } catch(NumberFormatException e) {
            txtKetQua.setText("Du lieu nhap khong hop le");
            txtChuVi.setText("Khong co chu vi");
            txtDienTich.setText("Khong co dien tich");
            moveToErrorSection();
        }
    }//GEN-LAST:event_btnKiemTraActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCanh1.setText("");
        txtCanh2.setText("");
        txtCanh3.setText("");
        txtKetQua.setText("");
        txtChuVi.setText("");
        txtDienTich.setText("");
        txtCanh1.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUITest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUITest1 GUIT = new GUITest1();
                GUIT.setVisible(true);
                GUIT.setLocationRelativeTo(null);
                GUIT.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKiemTra;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCanh1;
    private javax.swing.JTextField txtCanh2;
    private javax.swing.JTextField txtCanh3;
    private javax.swing.JTextField txtChuVi;
    private javax.swing.JTextField txtDienTich;
    private javax.swing.JTextField txtKetQua;
    // End of variables declaration//GEN-END:variables
}
