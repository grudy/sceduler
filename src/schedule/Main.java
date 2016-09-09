/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author waa
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form core
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        schedulePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("schedulePU").createEntityManager();
        employeesQuery = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery.getResultList();
        employeesQuery1 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery1.getResultList();
        employeesQuery2 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery2.getResultList();
        employeesQuery3 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery3.getResultList();
        employeesQuery4 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery4.getResultList();
        employeesQuery5 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery5.getResultList();
        employeesQuery6 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery6.getResultList();
        employeesQuery7 = java.beans.Beans.isDesignTime() ? null : schedulePUEntityManager.createQuery("SELECT e FROM Employees e");
        employeesList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeesQuery7.getResultList();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        week_tab = new javax.swing.JTabbedPane();
        monday_pane = new javax.swing.JScrollPane();
        monday_table = new javax.swing.JTable();
        tuesday_pane = new javax.swing.JScrollPane();
        tuesday_table = new javax.swing.JTable();
        wednesday_pane = new javax.swing.JScrollPane();
        wednesday_table = new javax.swing.JTable();
        thursday_pane = new javax.swing.JScrollPane();
        thursday_table = new javax.swing.JTable();
        friday_pane = new javax.swing.JScrollPane();
        friday_table = new javax.swing.JTable();
        saturday_pane = new javax.swing.JScrollPane();
        saturday_table = new javax.swing.JTable();
        sunday_pane = new javax.swing.JScrollPane();
        sunday_table = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, monday_table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mondayStart}"));
        columnBinding.setColumnName("Monday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mondayFinish}"));
        columnBinding.setColumnName("Monday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        monday_pane.setViewportView(monday_table);

        week_tab.addTab("Monday", monday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, tuesday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tuesdayStart}"));
        columnBinding.setColumnName("Tuesday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tuesdayFinish}"));
        columnBinding.setColumnName("Tuesday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tuesday_pane.setViewportView(tuesday_table);

        week_tab.addTab("Tuesday", tuesday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList2, wednesday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${wednesdayStart}"));
        columnBinding.setColumnName("Wednesday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${wednesdayFinish}"));
        columnBinding.setColumnName("Wednesday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        wednesday_pane.setViewportView(wednesday_table);

        week_tab.addTab("Wednesday", wednesday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, thursday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${thursdayStart}"));
        columnBinding.setColumnName("Thursday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${thursdayFinish}"));
        columnBinding.setColumnName("Thursday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        thursday_pane.setViewportView(thursday_table);

        week_tab.addTab("Thursday", thursday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, friday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fridayStart}"));
        columnBinding.setColumnName("Friday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fridayFinish}"));
        columnBinding.setColumnName("Friday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        friday_pane.setViewportView(friday_table);

        week_tab.addTab("Friday", friday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, saturday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saturdayStart}"));
        columnBinding.setColumnName("Saturday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saturdayFinish}"));
        columnBinding.setColumnName("Saturday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        saturday_pane.setViewportView(saturday_table);

        week_tab.addTab("Saturday", saturday_pane);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeesList, sunday_table);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${employeeName}"));
        columnBinding.setColumnName("Employee Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sundayStart}"));
        columnBinding.setColumnName("Sunday Start");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sundayFinish}"));
        columnBinding.setColumnName("Sunday Finish");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        sunday_pane.setViewportView(sunday_table);

        week_tab.addTab("Sunday", sunday_pane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(week_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(week_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        add_employee_frame add1 = new add_employee_frame();
        add1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<schedule.Employees> employeesList;
    private java.util.List<schedule.Employees> employeesList1;
    private java.util.List<schedule.Employees> employeesList2;
    private java.util.List<schedule.Employees> employeesList3;
    private java.util.List<schedule.Employees> employeesList4;
    private java.util.List<schedule.Employees> employeesList5;
    private java.util.List<schedule.Employees> employeesList6;
    private java.util.List<schedule.Employees> employeesList7;
    private javax.persistence.Query employeesQuery;
    private javax.persistence.Query employeesQuery1;
    private javax.persistence.Query employeesQuery2;
    private javax.persistence.Query employeesQuery3;
    private javax.persistence.Query employeesQuery4;
    private javax.persistence.Query employeesQuery5;
    private javax.persistence.Query employeesQuery6;
    private javax.persistence.Query employeesQuery7;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane friday_pane;
    private javax.swing.JTable friday_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane monday_pane;
    private javax.swing.JTable monday_table;
    private javax.swing.JScrollPane saturday_pane;
    private javax.swing.JTable saturday_table;
    private javax.persistence.EntityManager schedulePUEntityManager;
    private javax.swing.JScrollPane sunday_pane;
    private javax.swing.JTable sunday_table;
    private javax.swing.JScrollPane thursday_pane;
    private javax.swing.JTable thursday_table;
    private javax.swing.JScrollPane tuesday_pane;
    private javax.swing.JTable tuesday_table;
    private javax.swing.JScrollPane wednesday_pane;
    private javax.swing.JTable wednesday_table;
    private javax.swing.JTabbedPane week_tab;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
