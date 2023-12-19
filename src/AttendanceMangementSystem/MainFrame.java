
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        attenWorkPanel = new javax.swing.JPanel();
        modifyButton = new javax.swing.JButton();
        sidModifyTxt = new javax.swing.JTextField();
        lesidModifyTxt = new javax.swing.JTextField();
        syModifyTxt = new javax.swing.JTextField();
        termModifyTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        examEgiPanel = new javax.swing.JPanel();
        viewButton = new javax.swing.JButton();
        syViewTxt = new javax.swing.JTextField();
        termViewTxt = new javax.swing.JTextField();
        sidViewTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tablePane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        AttendWorking = new javax.swing.JLabel();
        ExamEligi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Management Application");
        setBackground(new java.awt.Color(153, 51, 255));
        setResizable(false);

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

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

        lesidModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lesidModifyTxtKeyPressed(evt);
            }
        });

        syModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                syModifyTxtKeyPressed(evt);
            }
        });

        termModifyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                termModifyTxtKeyPressed(evt);
            }
        });

        jLabel1.setText("Input subject ID");

        jLabel2.setText("Input lesson number");

        jLabel3.setText("Input school year");

        jLabel4.setText("Input term");

        javax.swing.GroupLayout attenWorkPanelLayout = new javax.swing.GroupLayout(attenWorkPanel);
        attenWorkPanel.setLayout(attenWorkPanelLayout);
        attenWorkPanelLayout.setHorizontalGroup(
            attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attenWorkPanelLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(modifyButton)
                .addContainerGap())
            .addGroup(attenWorkPanelLayout.createSequentialGroup()
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(sidModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lesidModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(attenWorkPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(syModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termModifyTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attenWorkPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)))
                .addGap(19, 19, 19))
        );
        attenWorkPanelLayout.setVerticalGroup(
            attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attenWorkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attenWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lesidModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(syModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        examEgiPanel.setToolTipText("");

        viewButton.setText("View");
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

        syViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                syViewTxtKeyPressed(evt);
            }
        });

        termViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                termViewTxtKeyPressed(evt);
            }
        });

        sidViewTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidViewTxtKeyPressed(evt);
            }
        });

        jLabel5.setText("Input subject ID");

        jLabel6.setText("Input school year");

        jLabel7.setText("Input term");

        javax.swing.GroupLayout examEgiPanelLayout = new javax.swing.GroupLayout(examEgiPanel);
        examEgiPanel.setLayout(examEgiPanelLayout);
        examEgiPanelLayout.setHorizontalGroup(
            examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examEgiPanelLayout.createSequentialGroup()
                .addGroup(examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(examEgiPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5))
                    .addGroup(examEgiPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sidViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(syViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(examEgiPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)))
                .addGap(86, 86, 86)
                .addGroup(examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(examEgiPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7)))
                .addGap(16, 16, 16))
            .addGroup(examEgiPanelLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(viewButton)
                .addContainerGap())
        );
        examEgiPanelLayout.setVerticalGroup(
            examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examEgiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(examEgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(syViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidViewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(attenWorkPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(examEgiPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(examEgiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(attenWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(examEgiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(attenWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        tablePane.setAlignmentX(1.0F);
        tablePane.setAlignmentY(1.0F);
        tablePane.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        dataTable.setBackground(new java.awt.Color(255, 153, 255));
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

        AttendWorking.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AttendWorking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttendWorking.setText("Attendance Working");
        AttendWorking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AttendWorking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendWorkingMouseClicked(evt);
            }
        });

        ExamEligi.setBackground(new java.awt.Color(164, 232, 211));
        ExamEligi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ExamEligi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExamEligi.setText("Examination Eligibility");
        ExamEligi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ExamEligi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamEligiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AttendWorking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExamEligi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExamEligi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(AttendWorking, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

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
                            new String[]{"Student ID", "Last Name", "First Name", "Examination Eligibility"});
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
    private javax.swing.JTextField lesidModifyTxt;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField sidModifyTxt;
    private javax.swing.JTextField sidViewTxt;
    private javax.swing.JTextField syModifyTxt;
    private javax.swing.JTextField syViewTxt;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTextField termModifyTxt;
    private javax.swing.JTextField termViewTxt;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
