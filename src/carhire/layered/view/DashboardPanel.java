/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carhire.layered.view;

/**
 *
 * @author ASUS
 */
public class DashboardPanel extends javax.swing.JFrame {

    /**
     * Creates new form DashboadPanel
     */
    public DashboardPanel() {
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

        dashboardPanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        categoryLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        bookLabel = new javax.swing.JLabel();
        logoutLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        carsPanel = new javax.swing.JPanel();
        carsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customersPanel = new javax.swing.JPanel();
        customersLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookedPanel = new javax.swing.JPanel();
        bookedLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboardPanel.setBackground(new java.awt.Color(0, 0, 102));

        homeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(242, 242, 242));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeLabel.setText("Home Page");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\icons8-home-64.png")); // NOI18N

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(242, 242, 242));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryLabel.setText("Car Category");
        categoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryLabelMouseClicked(evt);
            }
        });

        carLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        carLabel.setForeground(new java.awt.Color(242, 242, 242));
        carLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        carLabel.setText("Car");
        carLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carLabelMouseClicked(evt);
            }
        });

        customerLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(242, 242, 242));
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customerLabel.setText("Customer");
        customerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerLabelMouseClicked(evt);
            }
        });

        bookLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bookLabel.setForeground(new java.awt.Color(242, 242, 242));
        bookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookLabel.setText("Book a Car");
        bookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookLabelMouseClicked(evt);
            }
        });

        logoutLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        logoutLabel1.setForeground(new java.awt.Color(242, 242, 242));
        logoutLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutLabel1.setText("Logout");
        logoutLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(carLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(75, 75, 75))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(153, 204, 255));

        carsPanel.setBackground(new java.awt.Color(102, 102, 255));
        carsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsPanelMouseClicked(evt);
            }
        });

        carsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carsLabel.setText("Cars");

        javax.swing.GroupLayout carsPanelLayout = new javax.swing.GroupLayout(carsPanel);
        carsPanel.setLayout(carsPanelLayout);
        carsPanelLayout.setHorizontalGroup(
            carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carsPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        carsPanelLayout.setVerticalGroup(
            carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carsPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(carsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        customersPanel.setBackground(new java.awt.Color(102, 102, 255));
        customersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersPanelMouseClicked(evt);
            }
        });

        customersLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        customersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customersLabel.setText("Customers");

        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(customersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookedPanel.setBackground(new java.awt.Color(102, 102, 255));
        bookedPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookedPanelMouseClicked(evt);
            }
        });

        bookedLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bookedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookedLabel.setText("Booked");

        javax.swing.GroupLayout bookedPanelLayout = new javax.swing.GroupLayout(bookedPanel);
        bookedPanel.setLayout(bookedPanelLayout);
        bookedPanelLayout.setHorizontalGroup(
            bookedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookedPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(bookedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        bookedPanelLayout.setVerticalGroup(
            bookedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookedPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(bookedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\e80b7df7-916e-4bab-860e-896057a4a029_WEB-LEAD-KIA-4CAR-PIC44444444444444.jpg")); // NOI18N

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(carsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryLabelMouseClicked
        loadCarCategoryPanel();
    }//GEN-LAST:event_categoryLabelMouseClicked

    private void logoutLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabel1MouseClicked
        this.dispose();
        new LoginPanel().setVisible(true);
    }//GEN-LAST:event_logoutLabel1MouseClicked

    private void carLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carLabelMouseClicked
        loadCarPanel();
    }//GEN-LAST:event_carLabelMouseClicked

    private void customerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseClicked
        loadCustomerPanel();
    }//GEN-LAST:event_customerLabelMouseClicked

    private void bookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookLabelMouseClicked
        loadBookingPanel();
    }//GEN-LAST:event_bookLabelMouseClicked

    private void carsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsPanelMouseClicked
        loadCarPanel();
    }//GEN-LAST:event_carsPanelMouseClicked

    private void customersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersPanelMouseClicked
        loadCustomerPanel();
    }//GEN-LAST:event_customersPanelMouseClicked

    private void bookedPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookedPanelMouseClicked
        loadBookingPanel();
    }//GEN-LAST:event_bookedPanelMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel bookLabel;
    private javax.swing.JLabel bookedLabel;
    private javax.swing.JPanel bookedPanel;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel carsLabel;
    private javax.swing.JPanel carsPanel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel customersLabel;
    private javax.swing.JPanel customersPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoutLabel1;
    // End of variables declaration//GEN-END:variables

    private void loadCarCategoryPanel() {
        bodyPanel.removeAll();
        CarCategoryPanel carCategoryPanel = new CarCategoryPanel();
        
        carCategoryPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(carCategoryPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCarPanel() {
        bodyPanel.removeAll();
        CarPanel carPanel = new CarPanel();
        
        carPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(carPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCustomerPanel() {
        bodyPanel.removeAll();
        CustomerPanel customerPanel = new CustomerPanel();
        
        customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadBookingPanel() {
        bodyPanel.removeAll();
        BookingPanel bookingPanel = new BookingPanel();
        
        bookingPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(bookingPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }
}
