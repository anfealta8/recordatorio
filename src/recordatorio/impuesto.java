/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordatorio;

import BaseDatos.ConexionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES TALERO
 */
public class impuesto extends javax.swing.JFrame {

    /**
     * Creates new form impuesto
     */
    public impuesto() {
        initComponents();
        cargardatos();
        cargarnumero();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrabar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtimpuesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbperiocidad = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Jtid = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMPUESTO");

        btnGrabar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel1.setText("IMPUESTO");

        jtimpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtimpuestoActionPerformed(evt);
            }
        });

        jLabel2.setText("PERIOCIDAD");

        cmbperiocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbperiocidadActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        Jtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtidActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbperiocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Jtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbperiocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void cargarnumero(){
        
        ConexionMySQL c = new ConexionMySQL();
        Connection cn = c.getConnection();
         Statement st2;
        int aux =0; 
    try {
         
     String   sql1="select nullif(max(idimpuesto),0) as cantidad from impuesto;";
         
              st2 = cn.createStatement();
              ResultSet rs2 = st2.executeQuery(sql1);
              rs2.next();
              String aux1 =rs2.getString("cantidad");
              
              if(aux1==null){
              
              aux=0;
              }
              else{
              aux=Integer.parseInt(aux1);
              }
             
     } catch (SQLException ex) {
         
         JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO CARGAR LA LISTA DE PERIOCIDAD ");
         
     }
    aux++;
       Jtid.setText(aux+"");  
        
        
    }
    
    
    
    String accion="Insertar";
      
    
    String codigo_actualizar="";
    
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed

        
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn=mysql.getConnection();
        
         Statement st2;
        
        
        String nombre="";
        String sSQL="";
        String mensaje="";
          
        int id=0,periocidad=0;
       
        
        id = Integer.parseInt(Jtid.getText());           
        nombre = jtimpuesto.getText();
        periocidad = cmbperiocidad.getSelectedIndex()+1;
        
        
        
        
        if(accion.equals("Insertar")){
            sSQL="INSERT INTO impuesto(idimpuesto,nombre,periocidad) VALUES(?,?,?)";
            mensaje="Los Datos se han Insertado de Manera Satisfactoria";
            
            Jtid.setText("");
            jtimpuesto.setText("");
            cmbperiocidad.setSelectedIndex(0);
            

        }else if (accion.equals("Modificar")){
            sSQL="UPDATE tercero SET cedula=?,primerapellido=?,segundoapellido=?,primernombre=?,segundonombre=?,genero=?,direccion=?,telefonofijo=?,celular=?,tarjeta=?, foto=? WHERE cedula= "+codigo_actualizar;

            mensaje="Los Datos se han actualizado de Manera Satisfactoria";
        }
        try {
            PreparedStatement pst =cn.prepareStatement(sSQL);

            pst.setInt(1,id);
            pst.setString(2,nombre);
            pst.setInt(3,periocidad);
            
            
            

            int n=pst.executeUpdate();

            if(n > 0){

                JOptionPane.showMessageDialog(null,mensaje);

            }
            else {
                JOptionPane.showMessageDialog(null, "no se ha insertado nada ");

            }

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        cargarnumero();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void JtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtidActionPerformed
Jtid.transferFocus();
     Cargarimpuesto(Jtid.getText());       
    }//GEN-LAST:event_JtidActionPerformed

    
    void Cargarimpuesto(String valor)
    {
    
    String[] registro =new String[2];    
    String sSQL="";
     
    ConexionMySQL mysql = new ConexionMySQL();
    Connection cn=mysql.getConnection();
     

    if(valor.equals(""))
    JOptionPane.showMessageDialog(null,"EL CAMPO ESTA VACIO");
       
    else  
    sSQL ="select nombre,periocidad from impuesto where idimpuesto = "+valor+"; ";
           try 
        {
         Statement st =cn.createStatement();
         ResultSet rs =st.executeQuery(sSQL);
         
         
         while(rs.next())
         {
         
         registro[0]= rs.getString("nombre");
             jtimpuesto.setText(registro[0]);
             registro[1]=rs.getString("periocidad");
             cmbperiocidad.setSelectedIndex(Integer.parseInt(registro[1])-1);
         
         }
         
         
        } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null, ex);
            
        }
           
          
           
         
    }
    
    
    
    
    
    private void jtimpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtimpuestoActionPerformed
        jtimpuesto.transferFocus();
    }//GEN-LAST:event_jtimpuestoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn=mysql.getConnection();
        String razonsocial="";
        String sSQL="";
        String mensaje="";

        int idimp=0,n=0;

        idimp = Integer.parseInt(Jtid.getText());

        try
        {
            JOptionPane optionPane = new JOptionPane();
            Object[] opciones={"Sí","No"};
            //Dialogo modal SI_NO
            int ret = JOptionPane.showOptionDialog(null,"Desea Borrar? ","Confirmar",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
            //Si la opcion escogida es Si
            if(ret==JOptionPane.YES_OPTION)
            {

                Statement stmt = cn.createStatement();
                n = stmt.executeUpdate("delete from impuesto WHERE idimpuesto= "+idimp);
                JOptionPane.showMessageDialog( null, "Registro Borrado "  ,
                    "Sistema", JOptionPane.ERROR_MESSAGE );
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error" , "Atencion",
                JOptionPane.INFORMATION_MESSAGE);
        }

        Jtid.setText("");
        jtimpuesto.setText("");
        cmbperiocidad.setSelectedIndex(0);
        cargarnumero();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
consultaimpuesto conti =new consultaimpuesto();
        conti.setVisible(true);        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn=mysql.getConnection();
        String nombre="";
        String sSQL="";
        String mensaje="";

        int idimp=0,impuesto=0;

        idimp= Integer.parseInt(Jtid.getText());
        nombre = jtimpuesto.getText();
        impuesto = cmbperiocidad.getSelectedIndex()+1;

        sSQL="UPDATE impuesto SET idimpuesto=?,nombre=?, periocidad=? WHERE idimpuesto = "+idimp;

        mensaje="Los Datos se han actualizado de Manera Satisfactoria";

        Jtid.setText("");
        jtimpuesto.setText("");
        cmbperiocidad.setSelectedIndex(0);

        try {
            PreparedStatement pst =cn.prepareStatement(sSQL);

            pst.setInt(1,idimp);
            pst.setString(2,nombre);
            pst.setInt(3,impuesto);

            int n=pst.executeUpdate();

            if(n > 0){

                JOptionPane.showMessageDialog(null,mensaje);

            }
            else {
                JOptionPane.showMessageDialog(null, "no se ha actualziado nada ");

            }

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        cargarnumero();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       Jtid.setText("");
       jtimpuesto.setText("");
       cmbperiocidad.setSelectedIndex(0);
       cargarnumero();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbperiocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbperiocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbperiocidadActionPerformed

   
    
public void cargardatos() {
    String sSQL="";
    
    
    
    sSQL ="select tipoperiocidad from periocidad where idperiocidad = idperiocidad;";
    try 
        {
            ConexionMySQL mysql = new ConexionMySQL();
    Connection cn=mysql.getConnection();
         Statement st =cn.createStatement();
         ResultSet rs =st.executeQuery(sSQL);
         cmbperiocidad.removeAllItems();
         
         
         while(rs.next())
         {
         cmbperiocidad.addItem(rs.getString(1));
         
          }} 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO CARGAR LA LISTA DE PERIOCIDAD ");
        }
    



}     
    
    
    
    
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
            java.util.logging.Logger.getLogger(impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new impuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtid;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbperiocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtimpuesto;
    // End of variables declaration//GEN-END:variables
}
