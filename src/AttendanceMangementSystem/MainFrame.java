
package AttendanceMangementSystem;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private String InstructorID;

    public MainFrame(String InstructorID) {
        this.InstructorID = InstructorID;
        initComponents();
        examEgiPanel.setVisible(false);
        attenWorkPanel.setVisible(false);
    }

    public String getIID() {
        return InstructorID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablePane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ExamEligi = new javax.swing.JLabel();
        AttendWorking = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        attenWorkPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        modifyButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sidModifyTxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lesidModifyTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        syModifyTxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        termModifyTxt = new javax.swing.JTextField();
        examEgiPanel = new javax.swing.JPanel();
        topPanel1 = new javax.swing.JPanel();
        viewButton = new javax.swing.JButton();
        bottomPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        syViewTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        termViewTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        sidViewTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Management Application");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 664));
        setMinimumSize(new java.awt.Dimension(1200, 664));
        setPreferredSize(new java.awt.Dimension(1200, 664));
        setSize(new java.awt.Dimension(1200, 664));
        getContentPane().setLayout(new java.awt.FlowLayout());

        tablePane.setAlignmentX(1.0F);
        tablePane.setAlignmentY(1.0F);
        tablePane.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tablePane.setMinimumSize(new java.awt.Dimension(1064, 408));
        tablePane.setPreferredSize(new java.awt.Dimension(1064, 408));

        dataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dataTable.setGridColor(new java.awt.Color(255, 0, 0));
        dataTable.setRowHeight(30);
        tablePane.setViewportView(dataTable);

        getContentPane().add(tablePane);

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 20));

        ExamEligi.setBackground(new java.awt.Color(164, 232, 211));
        ExamEligi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ExamEligi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExamEligi.setText("Examination Eligibility");
        ExamEligi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ExamEligi.setPreferredSize(new java.awt.Dimension(180, 53));
        ExamEligi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamEligiMouseClicked(evt);
            }
        });
        jPanel1.add(ExamEligi, java.awt.BorderLayout.CENTER);

        AttendWorking.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AttendWorking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttendWorking.setText("Attendance Working");
        AttendWorking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AttendWorking.setPreferredSize(new java.awt.Dimension(180, 53));
        AttendWorking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendWorkingMouseClicked(evt);
            }
        });
        jPanel1.add(AttendWorking, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel1);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        attenWorkPanel.setPreferredSize(new java.awt.Dimension(774, 150));
        attenWorkPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        topPanel.setLayout(new java.awt.BorderLayout());

        modifyButton.setText("Modify");
        modifyButton.setMaximumSize(new java.awt.Dimension(100, 100));
        modifyButton.setMinimumSize(new java.awt.Dimension(80, 35));
        modifyButton.setPreferredSize(new java.awt.Dimension(80, 35));
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        topPanel.add(modifyButton, java.awt.BorderLayout.CENTER);

        attenWorkPanel.add(topPanel);

        bottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        jPanel3.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input subject ID");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, java.awt.BorderLayout.NORTH);

        sidModifyTxt.setToolTipText("");
        sidModifyTxt.setPreferredSize(new java.awt.Dimension(68, 30));
        sidModifyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidModifyTxtActionPerformed(evt);
            }
        });
        sidModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidModifyTxtKeyPressed(evt);
            }
        });
        jPanel3.add(sidModifyTxt, java.awt.BorderLayout.SOUTH);

        bottomPanel.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel4.setLayout(new java.awt.BorderLayout(0, 10));

        lesidModifyTxt.setPreferredSize(new java.awt.Dimension(68, 30));
        lesidModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lesidModifyTxtKeyPressed(evt);
            }
        });
        jPanel4.add(lesidModifyTxt, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Input lesson number");
        jPanel4.add(jLabel2, java.awt.BorderLayout.NORTH);

        bottomPanel.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Input school year");
        jPanel5.add(jLabel3, java.awt.BorderLayout.NORTH);

        syModifyTxt.setPreferredSize(new java.awt.Dimension(68, 30));
        syModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                syModifyTxtKeyPressed(evt);
            }
        });
        jPanel5.add(syModifyTxt, java.awt.BorderLayout.SOUTH);

        bottomPanel.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Input term");
        jPanel6.add(jLabel4, java.awt.BorderLayout.NORTH);

        termModifyTxt.setPreferredSize(new java.awt.Dimension(68, 30));
        termModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                termModifyTxtKeyPressed(evt);
            }
        });
        jPanel6.add(termModifyTxt, java.awt.BorderLayout.SOUTH);

        bottomPanel.add(jPanel6);

        attenWorkPanel.add(bottomPanel);

        jLayeredPane1.add(attenWorkPanel, "card2");

        examEgiPanel.setToolTipText("");
        examEgiPanel.setPreferredSize(new java.awt.Dimension(674, 150));
        examEgiPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        topPanel1.setLayout(new javax.swing.BoxLayout(topPanel1, javax.swing.BoxLayout.LINE_AXIS));

        viewButton.setText("View");
        viewButton.setMaximumSize(new java.awt.Dimension(100, 100));
        viewButton.setMinimumSize(new java.awt.Dimension(80, 25));
        viewButton.setPreferredSize(new java.awt.Dimension(80, 35));
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        viewButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewButtonKeyPressed(evt);
            }
        });
        topPanel1.add(viewButton);

        examEgiPanel.add(topPanel1);

        bottomPanel1.setPreferredSize(new java.awt.Dimension(725, 76));
        bottomPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        jPanel7.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 10));

        syViewTxt.setPreferredSize(new java.awt.Dimension(68, 30));
        syViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                syViewTxtKeyPressed(evt);
            }
        });
        jPanel7.add(syViewTxt, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Input subject ID");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        bottomPanel1.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel8.setLayout(new java.awt.BorderLayout(0, 10));

        termViewTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termViewTxtActionPerformed(evt);
            }
        });
        termViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                termViewTxtKeyPressed(evt);
            }
        });
        jPanel8.add(termViewTxt, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Input school year");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        bottomPanel1.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel9.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Input term");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        sidViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidViewTxtKeyPressed(evt);
            }
        });
        jPanel9.add(sidViewTxt, java.awt.BorderLayout.CENTER);

        bottomPanel1.add(jPanel9);

        examEgiPanel.add(bottomPanel1);

        jLayeredPane1.add(examEgiPanel, "card3");

        jPanel2.add(jLayeredPane1);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void attendPanel(){
        examEgiPanel.setVisible(false);
        attenWorkPanel.setVisible(true);
    }
    
    private void examPanel(){
        examEgiPanel.setVisible(true);
        attenWorkPanel.setVisible(false);
    }
    
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        try (Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
            String subjectID = sidViewTxt.getText();
            String schoolYear = syViewTxt.getText();
            String term = termViewTxt.getText();

            String sql = "SELECT s.StudentID, s.LastName, s.FirstName "
                    + "FROM Student s "
                    + "JOIN Enroll e ON s.StudentID = e.StudentID "
                    + "JOIN Course c ON e.CourseID = c.CourseID "
                    + "WHERE c.SubjectID = ? AND c.SchoolYear = ? AND c.Term = ? "
                    + "ORDER BY s.FirstName";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, subjectID);
                statement.setString(2, schoolYear);
                statement.setString(3, term);
                try (ResultSet resultSet = statement.executeQuery()) {
                    DefaultTableModel newModel = new DefaultTableModel(
                            new Object[][]{},
                            new String[]{"Student ID", "Last Name", "First Name", "Number of absences"});
                    while (resultSet.next()) {
                        String studentID = resultSet.getString("StudentID");
                        String lastName = resultSet.getString("LastName");
                        String firstName = resultSet.getString("FirstName");

                        // Add a new row to the model
                        newModel.addRow(new Object[]{studentID, lastName, firstName});
                    }
                    for (int row = 0; row < newModel.getRowCount(); row++) {
                        String studentID = (String) newModel.getValueAt(row, 0);
                        int absenceCount = calculateAbsenceCount(connection, studentID, subjectID);
                        newModel.setValueAt(absenceCount, row, 3);
                    }
                    dataTable.setModel(newModel);

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_viewButtonActionPerformed

    private int calculateAbsenceCount(Connection connection, String studentID, String subjectID) throws SQLException {
        String absenceCountQuery = "SELECT SUM(CASE WHEN AttendanceStatus = 0 THEN 1 ELSE 0 END) AS TotalAbsenceCount "
                + "FROM Attendance a "
                + "JOIN Lesson l ON a.CourseID = l.CourseID AND a.LessonID = l.LessonID "
                + "JOIN Course c ON a.CourseID = c.CourseID "
                + "WHERE a.StudentID = ? AND c.SubjectID = ?";
        try (PreparedStatement countStatement = connection.prepareStatement(absenceCountQuery)) {
            countStatement.setString(1, studentID);
            countStatement.setString(2, subjectID);
            try (ResultSet countResultSet = countStatement.executeQuery()) {
                if (countResultSet.next()) {
                    return countResultSet.getInt("TotalAbsenceCount");
                }
            }
        }

        return 0;
    }

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed

        try (Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
            String subjectID = sidModifyTxt.getText();
            String lessonIDString = lesidModifyTxt.getText();
            String schoolYear = syModifyTxt.getText();
            String term = termModifyTxt.getText();
            int lessonID;
            try {
                lessonID = Integer.parseInt(lessonIDString);
            } catch (NumberFormatException e) {
                // Handle the case where lessonID is not a valid integer
                System.err.println("Invalid lessonID: " + lessonIDString);
                return;
            }
            String sql = "SELECT s.StudentID, s.LastName, s.FirstName, a.AttendanceStatus "
                    + "FROM Student s "
                    + "JOIN Enroll e ON s.StudentID = e.StudentID "
                    + "JOIN Course c ON e.CourseID = c.CourseID "
                    + "JOIN Lesson l ON c.CourseID = l.CourseID "
                    + "LEFT JOIN Attendance a ON s.StudentID = a.StudentID "
                    + "                    AND l.Date = a.Date "
                    + "                    AND l.LessonID = a.LessonID "
                    + "                    AND l.CourseID = a.CourseID "
                    + "                    AND l.InstructorID = a.InstructorID "
                    + "WHERE c.SubjectID = ? AND l.LessonID = ? AND c.SchoolYear = ? AND c.Term = ? "
                    + "ORDER BY s.FirstName";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, subjectID);
                statement.setInt(2, lessonID);
                statement.setString(3, schoolYear);
                statement.setString(4, term);
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Create a new table model
                    DefaultTableModel newModel = new DefaultTableModel(
                            new Object[][]{},
                            new String[]{"Student ID", "Last Name", "First Name", "Attendance Status"}
                    ) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            // Allow editing only for the "Attendance Status" column
                            return column == 3;
                        }
                    };

                    while (resultSet.next()) {
                        String sid = resultSet.getString("StudentID");
                        String lastName = resultSet.getString("LastName");
                        String firstName = resultSet.getString("FirstName");
                        float attendanceStatus = resultSet.getFloat("AttendanceStatus");

                        newModel.addRow(new Object[]{sid, lastName, firstName, attendanceStatus});
                    }

                    // Set the new model to the existing JTable
                    dataTable.setModel(newModel);
                    dataTable.getModel().addTableModelListener(new TableModelListener() {
                        @Override
                        public void tableChanged(TableModelEvent e) {
                            if (e.getType() == TableModelEvent.UPDATE) {
                                int row = e.getFirstRow();
                                int column = e.getColumn();

                                if (column == 3) { // Check if the changed column is "Attendance Status"
                                    String studentID = dataTable.getValueAt(row, 0).toString();
                                    String stringValue = dataTable.getValueAt(row, column).toString();
                                    float newAttendanceStatus = 0.0f;
                                    try {
                                        newAttendanceStatus = Float.parseFloat(stringValue);
                                    } catch (NumberFormatException ex) {
                                        System.err.println("Invalid float value: " + stringValue);
                                    }
                                    updateAttendanceInDatabase(studentID, lessonID, newAttendanceStatus);
                                }
                            }
                        }
                    });
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void updateAttendanceInDatabase(String studentID, int lessonID, float newAttendanceStatus) {
        
        try (Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
            String updateSql = "UPDATE Attendance SET AttendanceStatus = ? "
                    + "WHERE StudentID = ? AND LessonID = ?";

            try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                updateStatement.setFloat(1, newAttendanceStatus);
                updateStatement.setString(2, studentID);
                updateStatement.setInt(3, lessonID);

                int rowsUpdated = updateStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Attendance updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update attendance!");
                }
            }
        } catch (SQLException ex) {
            // Handle SQLException
            ex.printStackTrace();
        }
    }

    private void sidModifyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidModifyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidModifyTxtActionPerformed

    private void viewButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewButtonKeyPressed
        
    }//GEN-LAST:event_viewButtonKeyPressed

    private void termViewTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_termViewTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            viewButtonActionPerformed(null);
        }
    }//GEN-LAST:event_termViewTxtKeyPressed

    private void syViewTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_syViewTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            viewButtonActionPerformed(null);
        }
    }//GEN-LAST:event_syViewTxtKeyPressed

    private void sidViewTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidViewTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            viewButtonActionPerformed(null);
        }
    }//GEN-LAST:event_sidViewTxtKeyPressed

    private void termModifyTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_termModifyTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            modifyButtonActionPerformed(null);
        }
    }//GEN-LAST:event_termModifyTxtKeyPressed

    private void syModifyTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_syModifyTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            modifyButtonActionPerformed(null);
        }
    }//GEN-LAST:event_syModifyTxtKeyPressed

    private void lesidModifyTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lesidModifyTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            modifyButtonActionPerformed(null);
        }
    }//GEN-LAST:event_lesidModifyTxtKeyPressed

    private void sidModifyTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidModifyTxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            modifyButtonActionPerformed(null);
        }
    }//GEN-LAST:event_sidModifyTxtKeyPressed

    private void AttendWorkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendWorkingMouseClicked
        attendPanel();
    }//GEN-LAST:event_AttendWorkingMouseClicked

    private void ExamEligiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamEligiMouseClicked
        examPanel();
    }//GEN-LAST:event_ExamEligiMouseClicked

    private void termViewTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termViewTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termViewTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttendWorking;
    private javax.swing.JLabel ExamEligi;
    private javax.swing.JPanel attenWorkPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel bottomPanel1;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel examEgiPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lesidModifyTxt;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField sidModifyTxt;
    private javax.swing.JTextField sidViewTxt;
    private javax.swing.JTextField syModifyTxt;
    private javax.swing.JTextField syViewTxt;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTextField termModifyTxt;
    private javax.swing.JTextField termViewTxt;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
