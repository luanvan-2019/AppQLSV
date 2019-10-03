/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic_layer;

import business_layer.ScoreBusiness;
import business_layer.StudentBusiness;
import business_layer.SubjectBusiness;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ScoreModel;
import model.SubjectModel;
import org.apache.commons.lang3.StringUtils;

/**
 * ScoreInfoForm
 */
public class ScoreInfoForm extends javax.swing.JInternalFrame {

    private final StudentBusiness studentBS = new StudentBusiness();

    private final SubjectBusiness subjectBS = new SubjectBusiness();

    private final ScoreBusiness scoreBS = new ScoreBusiness();

    private DefaultTableModel dtm;

    private List<ScoreModel> scores;

    /**
     * Creates new form ScoreInfoForm
     */
    public ScoreInfoForm() {
        initComponents();
        this.setFrameIcon(new ImageIcon(""));

        // Load student ID
        loadStudentID();
        // Load subject ID
        loadSubjectID();
        // Load score table
        loadScoreTable(StringUtils.EMPTY, StringUtils.EMPTY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbStudentID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbbSubjectID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProcessScore = new javax.swing.JTextField();
        txtFinalScore = new javax.swing.JTextField();
        btnCalScore = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotalScore = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setTitle("Thông tin điểm");
        setVisible(true);

        jLabel1.setText("Mã SV:");

        cbbStudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbbStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbStudentIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã MH:");

        cbbSubjectID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbbSubjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSubjectIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Điểm quá trình:");

        jLabel4.setText("Điểm kết thúc HP:");

        btnCalScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/down_arrow.png"))); // NOI18N
        btnCalScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalScoreActionPerformed(evt);
            }
        });

        jLabel5.setText("Điểm tổng kết:");

        txtTotalScore.setEditable(false);

        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbScoreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbScore);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/add.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/edit.png"))); // NOI18N
        btnEdit.setText("Cập nhật");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/cancel.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbSubjectID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalScore)
                            .addComponent(txtProcessScore)
                            .addComponent(txtFinalScore)
                            .addComponent(txtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbbStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProcessScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFinalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalScore)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalScoreActionPerformed
        String processScore = txtProcessScore.getText();
        String finalScore = txtFinalScore.getText();
        String subjectID = cbbSubjectID.getSelectedItem().toString();
        if (StringUtils.isBlank(subjectID)) {
            JOptionPane.showMessageDialog(this, "Chọn Mã MH để tính điểm tổng kết!");
            return;
        }

        if (StringUtils.isAnyBlank(processScore, finalScore)) {
            JOptionPane.showMessageDialog(this, "Hãy điền đầy đủ thông tin điểm!");
            return;
        }

        float processFloat;
        try {
            processFloat = Float.valueOf(processScore);
            if (10 < processFloat || processFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float finalFloat;
        try {
            finalFloat = Float.valueOf(finalScore);
            if (10 < finalFloat || finalFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SubjectModel subject = subjectBS.getByID(subjectID);
        float total;
        // Subject has practice
        if (subject.getPractice() > 0) {
            total = (processFloat * 0.4f) + (finalFloat * 0.6f);
            // Subject is theory only
        } else {
            total = (processFloat * 0.3f) + (finalFloat * 0.7f);
        }
        total = (float) Math.round(total * 100) / 100;
        txtTotalScore.setText(String.valueOf(total));
    }//GEN-LAST:event_btnCalScoreActionPerformed

    private void tbScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbScoreMouseClicked
        int row = tbScore.getSelectedRow();
        ScoreModel selectedScore = scores.get(row);
        cbbStudentID.setSelectedItem(selectedScore.getStudentID());
        cbbSubjectID.setSelectedItem(selectedScore.getSubjectID());
        txtProcessScore.setText(String.valueOf(selectedScore.getProcessScore()));
        txtFinalScore.setText(String.valueOf(selectedScore.getFinalScore()));
        txtTotalScore.setText(String.valueOf(selectedScore.getTotalScore()));
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tbScoreMouseClicked

    private void cbbStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbStudentIDActionPerformed
        String studentID = cbbStudentID.getSelectedItem().toString();
        String subjectID = cbbSubjectID.getSelectedItem().toString();
        loadScoreTable(studentID, subjectID);
        txtProcessScore.setText(StringUtils.EMPTY);
        txtFinalScore.setText(StringUtils.EMPTY);
        txtTotalScore.setText(StringUtils.EMPTY);
        if (tbScore.getRowCount() != 0) {
            btnAdd.setEnabled(false);
        } else {
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_cbbStudentIDActionPerformed

    private void cbbSubjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSubjectIDActionPerformed
        String studentID = cbbStudentID.getSelectedItem().toString();
        String subjectID = cbbSubjectID.getSelectedItem().toString();
        loadScoreTable(studentID, subjectID);
        txtProcessScore.setText(StringUtils.EMPTY);
        txtFinalScore.setText(StringUtils.EMPTY);
        txtTotalScore.setText(StringUtils.EMPTY);
        if (tbScore.getRowCount() != 0) {
            btnAdd.setEnabled(false);
        } else {
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_cbbSubjectIDActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cbbStudentID.setSelectedIndex(0);
        cbbSubjectID.setSelectedIndex(0);
        txtProcessScore.setText(StringUtils.EMPTY);
        txtFinalScore.setText(StringUtils.EMPTY);
        txtTotalScore.setText(StringUtils.EMPTY);
        btnEdit.setEnabled(false);
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        loadScoreTable(StringUtils.EMPTY, StringUtils.EMPTY);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String studentID = cbbStudentID.getSelectedItem().toString();
        String subjectID = cbbSubjectID.getSelectedItem().toString();
        String processScore = txtProcessScore.getText();
        String finalScore = txtFinalScore.getText();

        if (StringUtils.isAnyBlank(studentID, subjectID)) {
            JOptionPane.showMessageDialog(this, "Chọn mã sinh viên và mã môn học!");
            return;
        }
        if (StringUtils.isAnyBlank(processScore, finalScore)) {
            JOptionPane.showMessageDialog(this, "Nhập thông tin điểm!");
            return;
        }

        float processFloat;
        try {
            processFloat = Float.valueOf(processScore);
            if (10 < processFloat || processFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float finalFloat;
        try {
            finalFloat = Float.valueOf(finalScore);
            if (10 < finalFloat || finalFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SubjectModel subject = subjectBS.getByID(subjectID);
        float total;
        // Subject has practice
        if (subject.getPractice() > 0) {
            total = (processFloat * 0.4f) + (finalFloat * 0.6f);
            // Subject is theory only
        } else {
            total = (processFloat * 0.3f) + (finalFloat * 0.7f);
        }
        total = (float) Math.round(total * 100) / 100;

        ScoreModel score = new ScoreModel();
        score.setStudentID(studentID);
        score.setSubjectID(subjectID);
        score.setProcessScore(processFloat);
        score.setFinalScore(finalFloat);
        score.setTotalScore(total);

        int row = scoreBS.insert(score);
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Insert thành công!", "Info", JOptionPane.INFORMATION_MESSAGE);
            loadScoreTable(studentID, subjectID);
            txtTotalScore.setText(String.valueOf(total));
        } else {
            JOptionPane.showMessageDialog(this, "Insert thất bại!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String studentID = cbbStudentID.getSelectedItem().toString();
        String subjectID = cbbSubjectID.getSelectedItem().toString();
        String processScore = txtProcessScore.getText();
        String finalScore = txtFinalScore.getText();

        if (StringUtils.isAnyBlank(studentID, subjectID)) {
            JOptionPane.showMessageDialog(this, "Chọn mã sinh viên và mã môn học!");
            return;
        }
        if (StringUtils.isAnyBlank(processScore, finalScore)) {
            JOptionPane.showMessageDialog(this, "Nhập thông tin điểm!");
            return;
        }

        float processFloat;
        try {
            processFloat = Float.valueOf(processScore);
            if (10 < processFloat || processFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float finalFloat;
        try {
            finalFloat = Float.valueOf(finalScore);
            if (10 < finalFloat || finalFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nhập điểm sai format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SubjectModel subject = subjectBS.getByID(subjectID);
        float total;
        // Subject has practice
        if (subject.getPractice() > 0) {
            total = (processFloat * 0.4f) + (finalFloat * 0.6f);
            // Subject is theory only
        } else {
            total = (processFloat * 0.3f) + (finalFloat * 0.7f);
        }
        total = (float) Math.round(total * 100) / 100;

        ScoreModel score = new ScoreModel();
        score.setStudentID(studentID);
        score.setSubjectID(subjectID);
        score.setProcessScore(processFloat);
        score.setFinalScore(finalFloat);
        score.setTotalScore(total);

        int row = scoreBS.update(score);
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Update thành công!", "Info", JOptionPane.INFORMATION_MESSAGE);
            loadScoreTable(studentID, subjectID);
            txtTotalScore.setText(String.valueOf(total));
        } else {
            JOptionPane.showMessageDialog(this, "Update thất bại!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String studentID = cbbStudentID.getSelectedItem().toString();
        String subjectID = cbbSubjectID.getSelectedItem().toString();

        if (StringUtils.isAnyBlank(studentID, subjectID)) {
            JOptionPane.showMessageDialog(this, "Chọn mã sinh viên và mã môn học!");
            return;
        }

        ScoreModel score = new ScoreModel();
        score.setStudentID(studentID);
        score.setSubjectID(subjectID);

        int row = scoreBS.delete(score);
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Delete thành công!", "Info", JOptionPane.INFORMATION_MESSAGE);
            loadScoreTable(studentID, subjectID);
            txtProcessScore.setText("");
            txtFinalScore.setText("");
            txtTotalScore.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Delete thất bại!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void loadStudentID() {
        List<String> ids = studentBS.getIDs();
        ids.forEach(item -> cbbStudentID.addItem(item));
    }

    private void loadSubjectID() {
        List<String> ids = subjectBS.getIDs();
        ids.forEach((item) -> cbbSubjectID.addItem(item));
    }

    private void loadScoreTable(String studentID, String subjectID) {
        scores = scoreBS.searchScore(studentID, subjectID);
        Vector<String> columns = new Vector<>();
        columns.add("Mã SV");
        columns.add("Mã môn học");
        columns.add("Điểm quá trình");
        columns.add("Điểm kết thúc HP");
        columns.add("Điểm tổng kết");

        Vector<Vector> datas = new Vector<>();
        for (ScoreModel model : scores) {
            Vector rows = new Vector();
            rows.add(model.getStudentID());
            rows.add(model.getSubjectID());
            rows.add(model.getProcessScore());
            rows.add(model.getFinalScore());
            rows.add(model.getTotalScore());
            datas.add(rows);
        }

        dtm = new DefaultTableModel(datas, columns);
        tbScore.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalScore;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbbStudentID;
    private javax.swing.JComboBox<String> cbbSubjectID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbScore;
    private javax.swing.JTextField txtFinalScore;
    private javax.swing.JTextField txtProcessScore;
    private javax.swing.JTextField txtTotalScore;
    // End of variables declaration//GEN-END:variables
}
