/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carhire.layered.view;

import carhire.layered.controller.CarCategoryController;
import carhire.layered.dto.CarCategoryDto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class CarCategoryPanel extends javax.swing.JPanel {

    private CarCategoryController carCategoryController;
    /**
     * Creates new form CarCategoryPanel
     */
    public CarCategoryPanel() {
        carCategoryController = new CarCategoryController();
        initComponents();
        loadallCategory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carCategoryPanel = new javax.swing.JPanel();
        carCategoryLabel = new javax.swing.JLabel();
        categoryIdLabel = new javax.swing.JLabel();
        categoryIdText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        savecarButton = new javax.swing.JButton();
        deletecarButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        carCategoryPanel.setBackground(new java.awt.Color(102, 102, 255));

        carCategoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carCategoryLabel.setForeground(new java.awt.Color(242, 242, 242));
        carCategoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carCategoryLabel.setText("Manage Car Category");

        javax.swing.GroupLayout carCategoryPanelLayout = new javax.swing.GroupLayout(carCategoryPanel);
        carCategoryPanel.setLayout(carCategoryPanelLayout);
        carCategoryPanelLayout.setHorizontalGroup(
            carCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carCategoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        carCategoryPanelLayout.setVerticalGroup(
            carCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carCategoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        categoryIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryIdLabel.setText("Category Id");

        categoryIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdTextActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Name"
            }
        ));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        savecarButton.setBackground(new java.awt.Color(153, 153, 255));
        savecarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savecarButton.setText("Save Car");
        savecarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savecarButtonActionPerformed(evt);
            }
        });

        deletecarButton.setBackground(new java.awt.Color(153, 153, 255));
        deletecarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletecarButton.setText("Delete Car");
        deletecarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carCategoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categoryIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(savecarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletecarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(carCategoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savecarButton)
                    .addComponent(deletecarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categoryIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdTextActionPerformed

    private void savecarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savecarButtonActionPerformed
        saveCar();
    }//GEN-LAST:event_savecarButtonActionPerformed

    private void deletecarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecarButtonActionPerformed
        deleteCar();
    }//GEN-LAST:event_deletecarButtonActionPerformed

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        searchCar();
    }//GEN-LAST:event_categoryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carCategoryLabel;
    private javax.swing.JPanel carCategoryPanel;
    private javax.swing.JLabel categoryIdLabel;
    private javax.swing.JTextField categoryIdText;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton deletecarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton savecarButton;
    // End of variables declaration//GEN-END:variables

    private void saveCar() {
        try {
        CarCategoryDto carCategoryDto = new CarCategoryDto(Integer.parseInt(categoryIdText.getText()), nameText.getText());
        
        String result = carCategoryController.addCategory(carCategoryDto);
        JOptionPane.showConfirmDialog(this, result);
        Clear();
        loadallCategory();
        } catch (Exception ex) {
            Logger.getLogger(CarCategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteCar() {
        try {
            String result = carCategoryController.deleteCategory(categoryIdText.getText());
            JOptionPane.showMessageDialog(this, result);
            Clear();
            loadallCategory();
        } catch (Exception ex) {
            Logger.getLogger(CarCategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadallCategory() {
        try{
        String[] columns = {"id", "Name"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0){
            @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
        };
        categoryTable.setModel(dtm);
        
        ArrayList<CarCategoryDto> carCategories = carCategoryController.getAllCategory();
        
        for (CarCategoryDto category : carCategories) {
                Object[] rowData = {category.getId(),category.getName()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
        Logger.getLogger(CarCategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void searchCar() {
        try {
            String carCategoryId = categoryTable.getValueAt(categoryTable.getSelectedRow(), 0).toString();
            CarCategoryDto carCategoryDto = carCategoryController.getCategory(carCategoryId);

            if (carCategoryDto != null) {
                categoryIdText.setText(Integer.toString(carCategoryDto.getId()));
                nameText.setText(carCategoryDto.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Category Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(CarCategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    }
    private void Clear() {
        categoryIdText.setText("");
        nameText.setText("");
    }
}
