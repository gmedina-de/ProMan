package view;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import libs.Utils;
import model.Project;
import model.Resource;
import model.Task;
import persistence.SQLiteRemoveTask;
import persistence.SQLiteResourcesLoader;
import persistence.SQLiteTasksLoader;

public class ProjectFrame extends javax.swing.JFrame {
    private final String title = "ProMan 0.2";
    private boolean proyectoAbierto = false;
    private Project proyecto;
    private ArrayList<Task> listaTareas;
    private int ventana= 1; // 1= Tareas 2=Recursos 3=Riesgos

    public Project getProyecto() {
        return proyecto;
    }

    public void setProyectoAbierto(boolean proyectoAbierto) {
        this.proyectoAbierto = proyectoAbierto;
    }

    public ProjectFrame() {
        initComponents();
        setTitle(title);
        setAvailability(jPanel1);
        this.setLocationRelativeTo(null);
        pack();
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        estimacionTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        abrirProyecto = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProMan");

        tablaDeDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDeDatos.setOpaque(false);
        tablaDeDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaDeDatos);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Gestionar Tareas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gestionar Recursos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Gestionar Riesgos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setText("Añadir Tarea");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar Tarea");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar Tarea");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGASO.png"))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información sobre la tarea"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        estimacionTabla.setBackground(new java.awt.Color(240, 240, 240));
        estimacionTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Fecha fin", null},
                {"Duración completa", null},
                {"Nº de tareas finalizadas", null},
                {"Nº De Tareas sin Finalizar", null},
                {"", null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estimacionTabla.setFocusable(false);
        estimacionTabla.setOpaque(false);
        estimacionTabla.setRowSelectionAllowed(false);
        estimacionTabla.setSelectionBackground(new java.awt.Color(240, 240, 240));
        estimacionTabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        estimacionTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(estimacionTabla);
        if (estimacionTabla.getColumnModel().getColumnCount() > 0) {
            estimacionTabla.getColumnModel().getColumn(0).setResizable(false);
            estimacionTabla.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestión", jPanel1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EN CONSTRUCCION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Presupuesto", jPanel2);

        abrirProyecto.setText("Proyectos");
        abrirProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirProyectoMouseClicked(evt);
            }
        });
        MenuBar.add(abrirProyecto);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirProyectoMouseClicked
//        GestorProyectos gestorProyectos = new GestorProyectos();
//        gestorProyectos.setVisible(true);
//        gestorProyectos.setLocationRelativeTo(this);
        DialogoGestorProyectos dialogoProyectos = new DialogoGestorProyectos(this, true);
        dialogoProyectos.setVisible(true);
        proyecto = dialogoProyectos.getP();
        proyectoAbierto = true;
        
        reloadTitle();
        
        
        refreshVentanaTareas();       
        setAvailability(jPanel1);
        System.out.println(proyecto);
    }//GEN-LAST:event_abrirProyectoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        refreshVentanaRecursos();
        ventana = 2;
        cambiarMenuControles();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshVentanaTareas();
        ventana = 1;
        cambiarMenuControles();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        switch(ventana){
            case 1:
                DialogoAñadirTarea dialogoAñadir = new DialogoAñadirTarea(this, true, proyecto.getId());
                dialogoAñadir.setVisible(true);
                
                cargarTablaDeTareas();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargarTablaDeRiesgos();
        ventana = 3;
        cambiarMenuControles();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        switch(ventana){
            case 1:
                if(tablaDeDatos.getSelectedRow() == -1) return;
                
                Task selectedTask = listaTareas.get(tablaDeDatos.getSelectedRow());
                SQLiteRemoveTask.removeTask(selectedTask.getId(), selectedTask.getIdProyecto());
                
                refreshVentanaTareas();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        switch(ventana){
            case 1:
                if(tablaDeDatos.getSelectedRow() == -1) return;
                
                Task task = listaTareas.get(tablaDeDatos.getSelectedRow());
                DialogoEditarTarea dialogoEditar = new DialogoEditarTarea(this, true, task);
                dialogoEditar.setVisible(true);
                
                refreshVentanaTareas();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu abrirProyecto;
    private javax.swing.JTable estimacionTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaDeDatos;
    // End of variables declaration//GEN-END:variables

    private void setAvailability(JPanel panel) {
        for (Component a : panel.getComponents()) {
            if (a instanceof JPanel) {
                setAvailability((JPanel) a);
            } else {
                a.setEnabled(proyectoAbierto);
            }
        }
    }
    
    
    private void cargarTablaDeRecursos() {
        Object listaTabla [][];
        ArrayList<Resource> recursos = SQLiteResourcesLoader.getResources(proyecto.getId());
        listaTabla = new Object[recursos.size()][2];
        for (int i = 0; i < recursos.size(); i++) {
            listaTabla[i][0]= recursos.get(i);
            listaTabla[i][1]= recursos.get(i).getValor();
        }
        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
                listaTabla,
                new String[]{
                    "Recurso", "Valor",}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };

            
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });

    }

    private void cargarTablaDeTareas() {
        Object listaTabla [][];
        listaTareas = SQLiteTasksLoader.getTasks(proyecto.getId());
        int numColumnas = 6;
        listaTabla = new Object[listaTareas.size()][numColumnas];
        for (int i = 0; i < listaTareas.size(); i++) {
            listaTabla[i][0]= listaTareas.get(i);
            listaTabla[i][1]= listaTareas.get(i).getIdPadre();
            listaTabla[i][2]= listaTareas.get(i).getFechaInicioFormat();
            listaTabla[i][3]= listaTareas.get(i).getFechaFinFormat();
            listaTabla[i][4]= Utils.getPrioridad(listaTareas.get(i).getPrioridad());
            listaTabla[i][5]= Utils.getEstado(listaTareas.get(i).getEstado());
        }
        
        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
                listaTabla,
                new String[]{
                    "Tarea","Padre","Fecha Inicio","Fecha Fin","Prioridad","Estado"}
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
    }
    
    private void cambiarMenuControles() {
        switch (ventana){
            case 1:
            default:
                jButton4.setText("Añadir Tarea");
                jButton5.setText("Eliminar Tarea");
                jButton6.setText("Modificar Tarea");
                break;
            case 2:
                jButton4.setText("Añadir Recurso");
                jButton5.setText("Eliminar Recurso");
                jButton6.setText("Modificar Recurso");
                break;
            case 3:
                jButton4.setText("Añadir Riesgo");
                jButton5.setText("Eliminar Riesgo");
                jButton6.setText("Modificar Riesgo");
                break;
        }
        
    }

    private void cargarTablaDeRiesgos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reloadTitle() {
        setTitle(title+ "  -  "+ proyecto);
    }

    private void refreshVentanaTareas() {
        cargarTablaDeTareas();
        cargarTablaEstimacion();
    }

    private void cargarTablaEstimacion() {
        String fechaFin = getFechaMayor();
        int cargaDeTrabajo = getDuracionCompleta();
        int tiempoTrabajado = getTiempoTrabajado();
        int tareasFinalizadas = getTareasFinalizadas();
        
        estimacionTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Fecha fin", fechaFin},
                {"Carga de trabajo(h)", cargaDeTrabajo},
                {"Nº de tareas finalizadas", tareasFinalizadas},
                {"Nº De tareas sin finalizar", listaTareas.size()-tareasFinalizadas},
                {"Tiempo trabajado(h)", tiempoTrabajado},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    private String getFechaMayor() {
        long fechaFin = 0;
        for (Task tarea : listaTareas) {
            if (fechaFin < tarea.getFechaFin() )
                fechaFin= tarea.getFechaFin();
        }
        return Utils.longDateToString(fechaFin);
    }

    private int getDuracionCompleta() {
        int total = 0;
        for (Task tarea : listaTareas) {
            total += tarea.getDuracionEstimada();
        }
        return total*24;
    }

    private int getTiempoTrabajado() {
        int total = 0;
        for (Task tarea:  listaTareas) {
            if (tarea.getEstado() == 2)
                total += tarea.getDuracionEstimada();
        }
        return total*24;
    }

    private int getTareasFinalizadas() {
        int total = 0;
        for (Task tarea:  listaTareas) {
            if (tarea.getEstado() == 2)
                total ++;
        }
        return total;
    }

    private void refreshVentanaRecursos() {
        cargarTablaDeRecursos();
        cargarTablaEstimacion();
    }

    
}
