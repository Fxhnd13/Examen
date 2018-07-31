package examenfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    private ArrayList<Persona> empleados = new ArrayList();
    private int turno=0;
    
    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearServicio = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LAVADO = new javax.swing.JCheckBox();
        ASPIRADO = new javax.swing.JCheckBox();
        SILICONEADO = new javax.swing.JCheckBox();
        NOMBRE = new javax.swing.JTextField();
        TIPO = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLASERVICIOS = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        CrearServicio.setSize(new java.awt.Dimension(380, 180));

        jLabel1.setText("Nombre del Cliente: ");

        jLabel2.setText("Tipo de Carro: ");

        jLabel3.setText("Servicios: ");

        LAVADO.setText("Lavado");

        ASPIRADO.setText("Aspirado");

        SILICONEADO.setText("Siliconeado");

        TIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "PickUp", "Camioneta", "Pesado" }));

        jButton3.setText("Agregar Servicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearServicioLayout = new javax.swing.GroupLayout(CrearServicio.getContentPane());
        CrearServicio.getContentPane().setLayout(CrearServicioLayout);
        CrearServicioLayout.setHorizontalGroup(
            CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearServicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOMBRE)
                        .addContainerGap())
                    .addGroup(CrearServicioLayout.createSequentialGroup()
                        .addGroup(CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearServicioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearServicioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LAVADO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ASPIRADO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SILICONEADO)))
                        .addGap(0, 11, Short.MAX_VALUE))))
            .addGroup(CrearServicioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CrearServicioLayout.setVerticalGroup(
            CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LAVADO)
                    .addComponent(ASPIRADO)
                    .addComponent(SILICONEADO))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 350));

        TABLASERVICIOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Cliente", "Tipo de Vehiculo", "Servicios", "¿Completado?"
            }
        ));
        jScrollPane1.setViewportView(TABLASERVICIOS);

        jButton1.setText("Agregar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualilzar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ActualizarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearServicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(verificarDatos()&&disponibles()){
            String tipo = TIPO.getSelectedItem().toString();
            String nombre = NOMBRE.getText();
            Vehiculo vehiculo = new Vehiculo(tipo);
            if(LAVADO.isSelected())vehiculo.getServicios().add("Lavado");
            if(ASPIRADO.isSelected())vehiculo.getServicios().add("Aspirado");
            if(SILICONEADO.isSelected())vehiculo.getServicios().add("Siliconeado");
            vehiculo.calcularTiempo();
            Cliente cliente = new Cliente(nombre, vehiculo);
            empleados.get(turno).getClientes().add(cliente);
            empleados.get(turno).start();
        }
        if(!disponibles())JOptionPane.showMessageDialog(null,"No hay empleados disponibles por el momento, espere a que alguno termine");
        ActualizarTabla();
        CambiarTurno();
        limpiarFormulario();
        CrearServicio.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    public void ActualizarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) TABLASERVICIOS.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < empleados.size(); i++) {
            String empleado = empleados.get(i).getNombre();
            for (int j = 0; j < empleados.get(i).getClientes().size(); j++) {
                String cliente = empleados.get(i).getClientes().get(j).getNombre();
                String tipo = empleados.get(i).getClientes().get(j).getVehiculo().getTipo();
                String servicios = empleados.get(i).getClientes().get(j).getVehiculo().getServiciosTexto();
                String completado="";
                if(empleados.get(i).getClientes().get(j).isCompletado()){
                    completado="No";
                }else{
                    completado="Si";
                }
                modelo.addRow(new Object[]{empleado, cliente, tipo, servicios, completado});
            }
        }
        TABLASERVICIOS.setModel(modelo);
    }
    
    public void CrearEmpleados(){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados: "));
        for (int i = 0; i < a; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del "+(i+1)+"° Empleado: ");
            Persona empleado = new Persona(nombre);
            empleados.add(empleado);
        }
    }

    public void CambiarTurno(){
        if(turno< (empleados.size()-1)){
            turno++;
        }else{
            turno=0;
        }
    }
    
    public void limpiarFormulario(){
        NOMBRE.setText("");
        LAVADO.setSelected(false);
        ASPIRADO.setSelected(false);
        SILICONEADO.setSelected(false);
        TIPO.setSelectedIndex(0);
    }
    
    public boolean disponibles(){
        boolean valor=true;
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(turno).isOcupado()){
                valor=false;
                CambiarTurno();
            }
        }
        return valor;
    }
    
    public boolean verificarDatos(){
        boolean valor = true;
        if(NOMBRE.getText().isEmpty()){
            valor=false;
            JOptionPane.showMessageDialog(null,"Debe ingresar su nombre: ");
        }
        if(!LAVADO.isSelected()&&!ASPIRADO.isSelected()&&!SILICONEADO.isSelected()){
            valor=false;
            JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un servicio");
        }
        return valor;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ASPIRADO;
    private javax.swing.JDialog CrearServicio;
    private javax.swing.JCheckBox LAVADO;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JCheckBox SILICONEADO;
    private javax.swing.JTable TABLASERVICIOS;
    private javax.swing.JComboBox<String> TIPO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
