/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PenjualanView.java
 *
 * 
 */
package view;

import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import main.Main;
import model.Barang;
import model.JenisPenjualan;
import model.Penjualan;
import model.PenjualanDetail;
import org.apache.log4j.Logger;
import util.TextComponentUtils;

/**
 *
 * @author Fuady
 */
public class PenjualanView extends javax.swing.JInternalFrame {

    private Penjualan penjualan;
    private List<PenjualanDetail> penjualanDetail = new ArrayList<>();
    private static final Logger log = Logger.getLogger(PenjualanView.class);

    /**
     * Creates new form SalesPanel
     */
    public PenjualanView() {
        initComponents();
        tblSalesDetail.setAutoCreateColumnsFromModel(false);
        jdcTransaction.setDate(new Date());
        enableForm(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);
        btnKalkulator.setEnabled(false);
        cmbJenis.setModel(new DefaultComboBoxModel(JenisPenjualan.values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesDetail = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtKdBrg = new javax.swing.JTextField();
        btnLookupProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jdcTransaction = new com.toedter.calendar.JDateChooser();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbJenis = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rTunai = new javax.swing.JRadioButton();
        rKredit = new javax.swing.JRadioButton();
        lblTotal1 = new javax.swing.JLabel();
        txtKet = new javax.swing.JTextArea();
        btnKalkulator = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Penjualan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/batal.png"))); // NOI18N
        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hapus.png"))); // NOI18N
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/add.png"))); // NOI18N
        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cari.png"))); // NOI18N
        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSalesDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Kuantitas", "Sub Total"
            }
        ));
        tblSalesDetail.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblSalesDetail);
        tblSalesDetail.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setText("Kode Barang");

        txtKdBrg.setEnabled(false);
        txtKdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKdBrgActionPerformed(evt);
            }
        });

        btnLookupProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/search.png"))); // NOI18N
        btnLookupProduct.setEnabled(false);
        btnLookupProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookupProductActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Transaksi");

        jLabel3.setText("Tanggal");

        txtId.setEditable(false);

        jdcTransaction.setEnabled(false);

        lblTotal.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTotal.setText("Rp. 0");

        jLabel4.setText("Jenis Penjualan");

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbJenis.setSelectedIndex(-1);
        cmbJenis.setEnabled(false);

        jLabel5.setText("Keterangan");

        jLabel6.setText("Pembayaran");

        bg.add(rTunai);
        rTunai.setText("Tunai");
        rTunai.setEnabled(false);

        bg.add(rKredit);
        rKredit.setText("Kredit");
        rKredit.setEnabled(false);

        lblTotal1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTotal1.setText("TOTAL :");

        txtKet.setColumns(20);
        txtKet.setLineWrap(true);
        txtKet.setRows(5);
        txtKet.setWrapStyleWord(true);
        txtKet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        txtKet.setEnabled(false);

        btnKalkulator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKalkulator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hitung.png"))); // NOI18N
        btnKalkulator.setText("Kalkulator");
        btnKalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalkulatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(73, 232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnKalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLookupProduct))
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rTunai)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rKredit)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit, btnSave, btnSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnEdit)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rTunai)
                        .addComponent(rKredit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLookupProduct)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtKet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit, btnSave, btnSearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearForm() {
        txtKdBrg.setText("");
        lblTotal.setText("Rp. 0");
        jdcTransaction.setDate(null);
        penjualanDetail = new ArrayList<>();
        penjualan = null;
        tblSalesDetail.setModel(new SalesDetailTableModel(penjualanDetail));
        bg.clearSelection();
        cmbJenis.setSelectedIndex(-1);
        txtKet.setText("");
        txtId.setText("");
    }

    private void enableForm(boolean status) {
        txtKdBrg.setEnabled(status);
        jdcTransaction.setEnabled(status);
        btnLookupProduct.setEnabled(status);
        txtKdBrg.setEnabled(status);
        cmbJenis.setEnabled(status);
        rTunai.setEnabled(status);
        rKredit.setEnabled(status);
        txtKet.setEnabled(status);
        tblSalesDetail.setEnabled(status);

    }

    private boolean validateForm() {
        if (penjualanDetail == null || penjualanDetail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Transaksi tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (rTunai.isSelected() == false && rKredit.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Pilih Pembayaran!", "Error", JOptionPane.ERROR_MESSAGE);
            rTunai.requestFocusInWindow();
            return false;
        }
        return true;
    }

    private void loadFormToModel() {
        penjualan.setId(Long.parseLong(txtId.getText()));
        penjualan.setPenjualanDetail(penjualanDetail);
        penjualan.setTanggal(jdcTransaction.getDate());
        if (cmbJenis.getSelectedIndex() == 0) {
            penjualan.setJenisPenjualan(JenisPenjualan.GROSIR);
        } else if (cmbJenis.getSelectedIndex() == 1) {
            penjualan.setJenisPenjualan(JenisPenjualan.ECERAN);
        }
        if (rTunai.isSelected()) {
            penjualan.setStatus(0);
        } else if (rKredit.isSelected()) {
            penjualan.setStatus(1);
        }
        BigDecimal total = BigDecimal.ZERO;
        for (PenjualanDetail penjualanDetails : penjualanDetail) {
            total = total.add(penjualanDetails.getSubtotal());
            penjualanDetails.setPenjualan(penjualan);
        }
        penjualan.setKeterangan(txtKet.getText());
        penjualan.setTotal(total);
    }

    private void loadModelToForm() {
        txtId.setText(penjualan.getId().toString());
        cmbJenis.setSelectedItem(penjualan.getJenisPenjualan());
        jdcTransaction.setDate(penjualan.getTanggal());
        switch (penjualan.getJenisPenjualan()) {
            case GROSIR:
                cmbJenis.setSelectedIndex(0);
                break;
            case ECERAN:
                cmbJenis.setSelectedIndex(1);
                break;
        }
        if (penjualan.getStatus() == 0) {
            rTunai.setSelected(true);
        } else if (penjualan.getStatus() == 1) {
            rKredit.setSelected(true);
        }
        txtKet.setText(penjualan.getKeterangan());
        penjualanDetail = penjualan.getPenjualanDetail();
        tblSalesDetail.setModel(new SalesDetailTableModel(penjualanDetail));
        lblTotal.setText(TextComponentUtils.formatNumber(penjualan.getTotal()));
    }

    private void refreshTable() {
        tblSalesDetail.setModel(new SalesDetailTableModel(penjualanDetail));
    }

    private void refreshTotalLabel() {
        if (penjualanDetail != null && !penjualanDetail.isEmpty()) {
            BigDecimal total = BigDecimal.ZERO;
            for (PenjualanDetail penjualanDetails : penjualanDetail) {
                total = total.add(penjualanDetails.getSubtotal());
            }
            lblTotal.setText("Rp. " + TextComponentUtils.formatNumber(total));
        }
    }

    private void addSalesDetail(Barang b) {
        if (b != null) {
            PenjualanDetail penjualanDetails = new PenjualanDetail();
            penjualanDetails.setBarang(b);
            BigDecimal harga = null;
            if (cmbJenis.getSelectedIndex() == 0) {
                harga = b.getHargaJualGrosir();
            } else if (cmbJenis.getSelectedIndex() == 1) {
                harga = b.getHargaJualEceran();
            }
            penjualanDetails.setJumlah(1);
            penjualanDetails.setHarga(harga);
            if (penjualanDetails.getSubtotal() != null) {
                penjualanDetails.setSubtotal(penjualanDetails.getSubtotal().add(harga));
            } else {
                penjualanDetails.setSubtotal(harga);
            }
            penjualanDetail.add(penjualanDetails);
            refreshTable();
            refreshTotalLabel();
        } else {
            JOptionPane.showMessageDialog(this, "Barang tidak ada!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearForm();
        enableForm(false);
        //pengaturan tombol
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);
        btnKalkulator.setEnabled(false);
}//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (validateForm()) {
            if (penjualan == null) {
                penjualan = new Penjualan();
            }
            loadFormToModel();
            try {
                if (tblSalesDetail.isEnabled() == true) {
                    for (PenjualanDetail penjualanDetails : penjualanDetail) {
                        Barang brg = Main.getMasterServices().getBarang(penjualanDetails.getBarang().getKode());
                        brg.setStock(brg.getStock() - penjualanDetails.getJumlah());
                        Main.getMasterServices().simpan(brg);
                    }
                }
                Main.getTransaksiServices().simpan(penjualan);
                clearForm();
                refreshTable();
                enableForm(false);
                //pengaturan tombol
                btnDelete.setEnabled(false);
                btnAdd.setEnabled(true);
                btnCancel.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                btnKalkulator.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            } catch (HeadlessException ex) {
                log.error(ex);
                JOptionPane.showMessageDialog(this, "Data gagal disimpan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (penjualan != null) {
            try {
                Main.getTransaksiServices().hapus(penjualan);
                clearForm();
                penjualan = null;
                refreshTable();
                enableForm(false);
                //pengaturan tombol
                btnDelete.setEnabled(false);
                btnAdd.setEnabled(true);
                btnCancel.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            } catch (HeadlessException ex) {
                log.error(ex);
                JOptionPane.showMessageDialog(this, "Data masih digunakan tidak bisa dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (penjualan != null) {
            rTunai.setEnabled(true);
            rKredit.setEnabled(true);
            txtKet.setEnabled(true);
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(false);
            btnCancel.setEnabled(true);
            btnEdit.setEnabled(false);
            btnSave.setEnabled(true);
        }
}//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        clearForm();
        jdcTransaction.setDate(new Date());
        txtId.setText(new Date().getTime() + "");
        enableForm(true);
        //pengaturan tombol
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(false);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
        cmbJenis.requestFocusInWindow();
}//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Penjualan p = new PenjualanLookupDialog().getPenjualan();
        if (p != null) {
            penjualan = Main.getTransaksiServices().getPenjualan(p.getId());
            loadModelToForm();
            //edit mode
            btnDelete.setEnabled(true);
            btnAdd.setEnabled(false);
            btnCancel.setEnabled(true);
            btnEdit.setEnabled(true);
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtKdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKdBrgActionPerformed
        String productId = txtKdBrg.getText();
        try {
            //cari apakah barang sudah ada di dalam tblSalesDetail
            Long pId = Long.valueOf(productId);
            boolean isProductInSalesDetails = false;
            for (PenjualanDetail penjualanDetails : penjualanDetail) {
                if (penjualanDetails.getBarang().getKode().equals(pId)) {
                    penjualanDetails.setJumlah(penjualanDetails.getJumlah() + 1);
                    penjualanDetails.setSubtotal(
                            penjualanDetails.getHarga().multiply(
                                    new BigDecimal(penjualanDetails.getJumlah())));
                    isProductInSalesDetails = true;
                    break;
                }
            }
            if (isProductInSalesDetails) {
                refreshTable();
                refreshTotalLabel();
            } else {
                Barang b = Main.getMasterServices().getBarang(pId);
                if (b != null) {
                    addSalesDetail(b);
                }
            }
            txtKdBrg.setText("");
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Id barang harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            log.error(numberFormatException);
        }
    }//GEN-LAST:event_txtKdBrgActionPerformed


    private void btnLookupProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookupProductActionPerformed
        if (cmbJenis.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Jenis Penjualan Terlebih Dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            cmbJenis.requestFocusInWindow();
        } else {
            Barang b = new BarangLookupDialog().getBarang();
            if (b != null) {
                boolean isProductInSalesDetails = false;
                for (PenjualanDetail penjualanDetails : penjualanDetail) {
                    if (penjualanDetails.getBarang().getKode().equals(b.getKode())) {
                        penjualanDetails.setJumlah(penjualanDetails.getJumlah() + 1);
                        penjualanDetails.setSubtotal(
                                penjualanDetails.getHarga().multiply(
                                        new BigDecimal(penjualanDetails.getJumlah())));
                        isProductInSalesDetails = true;
                        break;
                    }
                }
                if (isProductInSalesDetails) {
                    refreshTable();
                    refreshTotalLabel();
                } else {
                    addSalesDetail(b);
                }
                btnKalkulator.setEnabled(true);
            }
        }

    }//GEN-LAST:event_btnLookupProductActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Main.getMenuView().penjualanView = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnKalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalkulatorActionPerformed
        // TODO add your handling code here:        
        System.out.println(TextComponentUtils.getValueFromTextNumber(lblTotal));
        new KalkulatorView(new BigDecimal(TextComponentUtils.getValueFromTextNumber(lblTotal))).setVisible(true);
    }//GEN-LAST:event_btnKalkulatorActionPerformed

    private class SalesDetailTableModel extends AbstractTableModel {

        private final List<PenjualanDetail> penjualanDetails;

        public SalesDetailTableModel(List<PenjualanDetail> penjualanDetails) {
            this.penjualanDetails = penjualanDetails;
        }

        @Override
        public int getRowCount() {
            return penjualanDetails.size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            PenjualanDetail p = penjualanDetails.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getBarang().getKode();
                case 1:
                    return p.getBarang().getNama();
                case 2:
                    return p.getHarga();
                case 3:
                    return p.getJumlah();
                case 4:
                    return p.getSubtotal();
                default:
                    return "";
            }
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 2 || columnIndex == 4) {
                return BigDecimal.class;
            } else if (columnIndex == 3) {
                return Integer.class;
            }
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 3;
        }

        private boolean stockAvailable(Long idProduk, Integer kuantitas) {
            Barang b = Main.getMasterServices().getBarang(idProduk);
            Integer stockGudang = b.getStock();
            return stockGudang >= kuantitas;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            PenjualanDetail p = penjualanDetails.get(rowIndex);
            if (columnIndex == 3) {
                if (stockAvailable(p.getBarang().getKode(), (Integer) aValue)) {
                    p.setJumlah((Integer) aValue);
                    p.setSubtotal(p.getHarga().multiply(
                            new BigDecimal(p.getJumlah())));
                    refreshTotalLabel();
                } else {
                    JOptionPane.showMessageDialog(new JDialog(), "Maaf, Kuantitas melebihi Stock Barang!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnKalkulator;
    private javax.swing.JButton btnLookupProduct;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcTransaction;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JRadioButton rKredit;
    private javax.swing.JRadioButton rTunai;
    private javax.swing.JTable tblSalesDetail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKdBrg;
    private javax.swing.JTextArea txtKet;
    // End of variables declaration//GEN-END:variables

}
