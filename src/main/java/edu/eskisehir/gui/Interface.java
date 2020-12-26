/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eskisehir.gui;

import edu.eskisehir.inventory.Inventory;
import edu.eskisehir.inventory.InventoryManager;
import edu.eskisehir.inventory.Item;
import edu.eskisehir.utils.FileManager;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tzesh
 */
public class Interface extends javax.swing.JFrame {
    Map<String, Integer> items = new HashMap<>();
    FileManager fileManager = new FileManager();
    InventoryManager inventoryManager = new InventoryManager(true);


    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        setConsole(console); // setting JTextArea console as default output type of the program
        calculateButton.setEnabled(false);
        itemTable.setEnabled(false);
        itemChooser.removeAllItems();
        itemChooser.setEnabled(false);
    }

    private void setConsole(JTextArea console) { // all of the outputs will appear into JTextArea
        TextAreaOutputStream taos = new TextAreaOutputStream(console, 60);
        PrintStream ps = new PrintStream(taos);
        System.setOut(ps);
        System.setErr(ps);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        calculateButton = new javax.swing.JButton();
        itemChooser = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        setButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        demandTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MRP Generator");
        setResizable(false);

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "Gross Requirements", null, null, null, null, null, null, null, null, null, null},
                {null, "Scheduled Receipts", null, null, null, null, null, null, null, null, null, null},
                {"", "On hand from prior period", null, null, null, null, null, null, null, null, null, null},
                {null, "Net requirements", null, null, null, null, null, null, null, null, null, null},
                {null, "Time phased net requirements", null, null, null, null, null, null, null, null, null, null},
                {null, "Planned order releases", null, null, null, null, null, null, null, null, null, null},
                {null, "Planned order delivery", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Period", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemTable);
        if (itemTable.getColumnModel().getColumnCount() > 0) {
            itemTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            itemTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(5).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(6).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(7).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(8).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(9).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(10).setPreferredWidth(20);
            itemTable.getColumnModel().getColumn(11).setPreferredWidth(20);
        }

        console.setEditable(false);
        console.setColumns(20);
        console.setRows(5);
        console.setText("Default items are ready if you want to take a look at or edit them you can press edit button.\nOnce you've filled your demands, you can press set and then press calculate to see MRP tables of all items.");
        jScrollPane3.setViewportView(console);

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        itemChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChooserActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        demandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Demand", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Period", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(demandTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("MRP Designer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculateButton))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(setButton)
                    .addComponent(calculateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        Item root = (Item)Inventory.items.getRoot();
        root.produce();
        itemChooser.setEnabled(true);
        calculateButton.setEnabled(false);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void itemChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemChooserActionPerformed
        if (!itemChooser.isEnabled()) return;
        if (itemChooser.getSelectedItem() != null) {
            int itemID = items.get(itemChooser.getSelectedItem());
            Item item = (Item) Inventory.items.find(itemID);
            setMRP(item.getID());
        }
    }//GEN-LAST:event_itemChooserActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
            Desktop.getDesktop().open(new File("items.txt"));
        } catch (IOException ex) {
            System.out.println("An unknown error has occurred during the browse operation.");
        }
        System.out.println("Editing is not mandatory, you can always set and calculate the default values.");
        editButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        int[] demands = getRowAt(0);
        if (demands == null) {
            System.out.println("Please set demands firstly.");
            return;
        }
        Map<Integer, Integer> demandsPerWeek = new HashMap<Integer, Integer>();
        for (int week = 0; week <= 10; week++) {
            if (demands[week] != 0) demandsPerWeek.put(week, demands[week]);
        }
        inventoryManager.setDemands(demandsPerWeek);
        System.out.println("Required information has been loaded, you can process now.");
        calculateButton.setEnabled(true);
        setButton.setEnabled(false);
        editButton.setEnabled(false);
        demandTable.setEnabled(false);
        setItems();
    }//GEN-LAST:event_setButtonActionPerformed

    private void setItems() {
        for (Integer ID : Inventory.amounts.keySet()) {
            Item item = (Item)Inventory.items.find(ID);
            items.put(item.toString(), ID);
            itemChooser.addItem(item.toString());
        }
    }

    private void clear(DefaultTableModel dm) {
        for (int i = 0; i < dm.getRowCount(); i++) {
            for (int j = 0; j < dm.getColumnCount(); j++) {
                if (j == 1) continue;
                dm.setValueAt("", i, j);
            }
        }
    }

    private void setMRP(int ID) {
        System.out.println(Inventory.onHandFromPriorPeriod.get(13122).get(4));
        clear((DefaultTableModel) itemTable.getModel());
        int[] grossRequirements = getMRPValue(Inventory.grossRequirements.get(ID));
        setValues(grossRequirements, 0);
        if (Inventory.scheduledReceipts.get(ID) != null) {
            int[] scheduledReceipts = getMRPValue(Inventory.scheduledReceipts.get(ID));
            setValues(scheduledReceipts, 1);
        }
        if (Inventory.onHandFromPriorPeriod.get(ID) != null) {
            int[] onHandFromPriorPeriod = getMRPValue(Inventory.onHandFromPriorPeriod.get(ID));
            setValues(onHandFromPriorPeriod, 2);
        }
        int[] netRequirements = getMRPValue(Inventory.netRequirements.get(ID));
        setValues(netRequirements, 3);

        //int[] plannedOrderDeliveries = getMRPValue(Inventory.);
        //setValues(plannedOrderDeliveries, 5);
    }

    private void setValues(int[] values, int row) {
        for (int week = 1; week <= 10; week++) {
            if (values[week] != 0) itemTable.setValueAt(values[week], row, week + 1);
            else itemTable.setValueAt(null, row, week + 1);
        }
    }

    private int[] getMRPValue(Map<Integer, Integer> map) {
        int[] MRPArray = new int[11];
        for (int week = 1; week <= 10; week++) MRPArray[week] = map.getOrDefault(week, 0);
        return MRPArray;
    }

    public int[] getRowAt(int row) {
        int count = 0;
        int colNumber = demandTable.getColumnCount();
        int[] result = new int[colNumber];

        for (int i = 1; i < colNumber; i++) {
            result[i] = (int) (demandTable.getModel().getValueAt(row, i) == null ? 0 : demandTable.getModel().getValueAt(row, i));
            if (demandTable.getModel().getValueAt(row, i) != null) count++;
        }
        return count != 0 ? result : null;
    }

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextArea console;
    private javax.swing.JTable demandTable;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> itemChooser;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton setButton;
    // End of variables declaration//GEN-END:variables
}
