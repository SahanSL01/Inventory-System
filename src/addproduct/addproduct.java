
package addproduct;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;


import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.search;




/**
 *
 * @author Laptop & Pc World
 */
public final class addproduct extends javax.swing.JFrame {

    public addproduct() {
        initComponents();
        connect();
        table_update();
        
    }
Connection con1;
PreparedStatement pst;


public void connect(){
      
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(addproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     
                try {
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs", "root", "");
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(addproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                
}
                /**
                 * This method is called from within the constructor to initialize the form.
                 * WARNING: Do NOT modify this code. The content of this method is always
                 * regenerated by the Form Editor.
                 */
                @SuppressWarnings("unchecked")
                // <editor-fold defaultstate="collapsed" desc="Generated Code">
               private void table_update(){
                   int c;
                    try{
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs","root","");
             
       
         pst = con1.prepareCall("select * from superposs");
         ResultSet rs =pst.executeQuery();
         ResultSetMetaData Rss=rs.getMetaData();
         c =Rss.getColumnCount();
         DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         Df.setRowCount(0);
         while(rs.next())
         {
             Vector v1=new Vector();
             for(int a=1;a<=c;a++)
             {
                 v1.add(rs.getString("ID"));
                 v1.add(rs.getString("ProductName"));
                 v1.add(rs.getString("Category"));
                 v1.add(rs.getString("Quantity"));
                 v1.add(rs.getString("Price"));
                 v1.add(rs.getString("AvailableStok"));
             }
             Df.addRow(v1);
         }
         
         
           
            } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
          }
                   
               }
                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sell = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        availablestoke = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Product");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product Name", "Category", "Quantity", "Price", "Available Stoke"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Sell");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 6, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("sell");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 53, -1, -1));
        jPanel2.add(sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 50, 254, -1));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Sell");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 90, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setText("Available Stoke");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        availablestoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availablestokeActionPerformed(evt);
            }
        });

        jLabel5.setText("Product Name");

        jLabel6.setText("quantity");

        jLabel7.setText("Price");

        jLabel8.setText("Category");

        jButton8.setText("Logout");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(availablestoke, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(39, 39, 39)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel6))
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(availablestoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton6))
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 44, 228, -1));

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(153, 153, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addproduct/download (2).jpg"))); // NOI18N
        jLabel11.setText("TechBeats ");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 410, 120));

        jLabel12.setText("jLabel12");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addproduct/images01.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 310, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(386, 386, 386))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel4)))
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
        int selectedIndex= jTable1.getSelectedRow();
        
        productname.setText(Df.getValueAt(selectedIndex, 1).toString());
        category.setText(Df.getValueAt(selectedIndex, 2).toString());
        quantity.setText(Df.getValueAt(selectedIndex, 3).toString());
        price.setText(Df.getValueAt(selectedIndex, 4).toString());
        availablestoke.setText(Df.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
        int selectedIndex= jTable1.getSelectedRow();

        try{
            int ID=Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            String ProductName=productname.getText();
            String Category=category.getText();
            String Quantity=quantity.getText();
            String Price=price.getText();
            String AvailableStoke=availablestoke.getText();
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs","root","");

            pst = con1.prepareCall("update superposs set ProductName=?,Category=?,Quantity=?,Price=?,AvailableStok=? where ID=?");
            pst.setString(1,ProductName);
            pst.setString(2,Category);
            pst.setString(3, Quantity);
            pst.setString(4,Price);
            pst.setString(5, AvailableStoke);
            pst.setInt(6, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"superposs update");
            table_update();
            productname.setText("");
            category.setText("");
            price.setText("");
            quantity.setText("");
            availablestoke.setText("");
            quantity.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
        int selectedIndex= jTable1.getSelectedRow();

        try{
            int ID=Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete","warning",JOptionPane.YES_NO_OPTION);

            if(dialogResult==JOptionPane.YES_OPTION);

            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs","root","");

            pst = con1.prepareCall("Delete from superposs where ID=?");
            pst.setInt(1, ID);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"superposs Delete");

            table_update();

            productname.setText("");
            category.setText("");
            price.setText("");
            quantity.setText("");
            availablestoke.setText("");
            quantity.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       String ProductName = productname.getText().trim();
String Category = category.getText().trim();
String Quantity = quantity.getText().trim();
String Price = price.getText().trim();
String AvailableStoke = availablestoke.getText().trim();

// Using a HashMap to store the field values
HashMap<String, String> productDetails = new HashMap<>();
productDetails.put("ProductName", ProductName);
productDetails.put("Category", Category);
productDetails.put("Quantity", Quantity);
productDetails.put("Price", Price);
productDetails.put("AvailableStok", AvailableStoke);

try {
    Class.forName("com.mysql.jdbc.Driver");
    con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs", "root", "");

    // Use the HashMap values in the PreparedStatement
    pst = con1.prepareCall("insert into superposs(ProductName,Category,Quantity,Price,AvailableStok)values(?,?,?,?,?)");
    pst.setString(1, productDetails.get("ProductName"));
    pst.setString(2, productDetails.get("Category"));
    pst.setString(3, productDetails.get("Quantity"));
    pst.setString(4, productDetails.get("Price"));
    pst.setString(5, productDetails.get("AvailableStok"));
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Product added successfully");
    table_update(); // Make sure this method refreshes the table to show the new data
    productname.setText("");
    category.setText("");
    price.setText("");
    quantity.setText("");
    availablestoke.setText("");
    quantity.requestFocus();

} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void availablestokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availablestokeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availablestokeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       String ProductName = productname.getText().trim();
String Category = category.getText().trim();
String Price = price.getText().trim();
String Quantity = quantity.getText().trim();
String AvailableStoke = availablestoke.getText().trim();
String sellQuantity = sell.getText().trim();

// Using a HashMap to encapsulate product details and sale information
HashMap<String, String> productSaleDetails = new HashMap<>();
productSaleDetails.put("ProductName", ProductName);
productSaleDetails.put("Category", Category);
productSaleDetails.put("Price", Price);
productSaleDetails.put("Quantity", Quantity);
productSaleDetails.put("AvailableStoke", AvailableStoke);
productSaleDetails.put("sellQuantity", sellQuantity);

try {
    int sellQty = Integer.parseInt(productSaleDetails.get("sellQuantity"));
    int currentStoke = Integer.parseInt(productSaleDetails.get("AvailableStoke"));

    if (sellQty > currentStoke) {
        JOptionPane.showMessageDialog(null, "Not enough stock available for this sale.");
        return;
    }

    int newStoke = currentStoke - sellQty;

    Class.forName("com.mysql.cj.jdbc.Driver");
    con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs", "root", "");

    pst = con1.prepareStatement("UPDATE superposs SET AvailableStok = ? WHERE ProductName = ? AND Category = ?");
    pst.setInt(1, newStoke);
    pst.setString(2, productSaleDetails.get("ProductName"));
    pst.setString(3, productSaleDetails.get("Category"));
    pst.executeUpdate();

    JOptionPane.showMessageDialog(null, "Sale successful. Available stock updated.");
    availablestoke.setText(Integer.toString(newStoke));
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter a valid sell quantity.");
} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
      String searchText = search.getText().trim();    
try {         Class.forName("com.mysql.cj.jdbc.Driver");        
con1 = DriverManager.getConnection("jdbc:mysql://localhost/superposs", "root", "");       
pst = con1.prepareStatement("SELECT * FROM superposs WHERE ProductName LIKE ? OR Category LIKE ?");       
pst.setString(1, "%" + searchText + "%");    
pst.setString(2, "%" + searchText + "%");    
ResultSet rs = pst.executeQuery();       
DefaultTableModel d = (DefaultTableModel)jTable1.getModel();   
d.setRowCount(0);   
while (rs.next()) {           
    Vector v2 = new Vector();       
    v2.add(rs.getString("Id"));           
    v2.add(rs.getString("productName"));           
    v2.add(rs.getString("category"));         
    v2.add(rs.getString("quantity"));            
    v2.add(rs.getString("price")); 
    v2.add(rs.getString("AvailableStok")); 
    d.addRow(v2);       
}     } catch (ClassNotFoundException | SQLException ex) {      
    Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);     }
    


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         Login ab = new Login(this, rootPaneCheckingEnabled);
        ab.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        addproduct q3 = new addproduct();
        this.hide();
        q3.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addproduct().setVisible(true);
}        
            });           
                }               
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availablestoke;
    private javax.swing.JTextField category;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sell;
    // End of variables declaration//GEN-END:variables
}