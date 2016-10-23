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

    private final String title = "ProMan v0.2";
    private boolean proyectoAbierto = false;
    private Project proyecto;
    private ArrayList<Task> listaTareas;
    private int ventana = 1; // 1= Tareas 2=Recursos 3=Riesgos

    public Project getProyecto() {
        return proyecto;
    }

    public void setProyectoAbierto(boolean proyectoAbierto) {
        this.proyectoAbierto = proyectoAbierto;
    }

    public ProjectFrame() {
        initComponents();
        this.setTitle(title);
        this.setAvailability(PestañaGestion);
        this.setLocationRelativeTo(null);
        pack();
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PestañaGestion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeDatos = new javax.swing.JTable();
        PanelFuncionalidades = new javax.swing.JPanel();
        BotonGestionarTareas = new javax.swing.JButton();
        BotonGestionarRecursos = new javax.swing.JButton();
        BotonGestionarRiesgos = new javax.swing.JButton();
        PanelAcciones = new javax.swing.JPanel();
        BotonAñadir = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        PanelInfoAvanzada = new javax.swing.JPanel();
        PanelEstimacion = new javax.swing.JScrollPane();
        TablaEstimacion = new javax.swing.JTable();
        PestañaPresupuesto = new javax.swing.JPanel();
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

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotonGestionarTareas.setText("Gestionar Tareas");
        BotonGestionarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionarTareasActionPerformed(evt);
            }
        });

        BotonGestionarRecursos.setText("Gestionar Recursos");
        BotonGestionarRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionarRecursosActionPerformed(evt);
            }
        });

        BotonGestionarRiesgos.setText("Gestionar Riesgos");
        BotonGestionarRiesgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionarRiesgosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonGestionarTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGestionarRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGestionarRiesgos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonGestionarTareas)
                .addGap(18, 18, 18)
                .addComponent(BotonGestionarRecursos)
                .addGap(18, 18, 18)
                .addComponent(BotonGestionarRiesgos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelAcciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotonAñadir.setText("Añadir Tarea");
        BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar Tarea");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonEditar.setText("Modificar Tarea");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAccionesLayout = new javax.swing.GroupLayout(PanelAcciones);
        PanelAcciones.setLayout(PanelAccionesLayout);
        PanelAccionesLayout.setHorizontalGroup(
            PanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAñadir)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminar)
                .addGap(18, 18, 18)
                .addComponent(BotonEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAccionesLayout.setVerticalGroup(
            PanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonEditar))
                .addContainerGap())
        );

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        PanelInfoAvanzada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información sobre la tarea"));

        javax.swing.GroupLayout PanelInfoAvanzadaLayout = new javax.swing.GroupLayout(PanelInfoAvanzada);
        PanelInfoAvanzada.setLayout(PanelInfoAvanzadaLayout);
        PanelInfoAvanzadaLayout.setHorizontalGroup(
            PanelInfoAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        PanelInfoAvanzadaLayout.setVerticalGroup(
            PanelInfoAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TablaEstimacion.setBackground(new java.awt.Color(240, 240, 240));
        TablaEstimacion.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEstimacion.setFocusable(false);
        TablaEstimacion.setOpaque(false);
        TablaEstimacion.setRowSelectionAllowed(false);
        TablaEstimacion.setSelectionBackground(new java.awt.Color(240, 240, 240));
        TablaEstimacion.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TablaEstimacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        PanelEstimacion.setViewportView(TablaEstimacion);
        if (TablaEstimacion.getColumnModel().getColumnCount() > 0) {
            TablaEstimacion.getColumnModel().getColumn(0).setResizable(false);
            TablaEstimacion.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout PestañaGestionLayout = new javax.swing.GroupLayout(PestañaGestion);
        PestañaGestion.setLayout(PestañaGestionLayout);
        PestañaGestionLayout.setHorizontalGroup(
            PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestañaGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(PanelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInfoAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelEstimacion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PestañaGestionLayout.setVerticalGroup(
            PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestañaGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PestañaGestionLayout.createSequentialGroup()
                        .addComponent(PanelInfoAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelEstimacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PestañaGestionLayout.createSequentialGroup()
                        .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PestañaGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestión", PestañaGestion);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EN CONSTRUCCIÓN");

        javax.swing.GroupLayout PestañaPresupuestoLayout = new javax.swing.GroupLayout(PestañaPresupuesto);
        PestañaPresupuesto.setLayout(PestañaPresupuestoLayout);
        PestañaPresupuestoLayout.setHorizontalGroup(
            PestañaPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestañaPresupuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addContainerGap())
        );
        PestañaPresupuestoLayout.setVerticalGroup(
            PestañaPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PestañaPresupuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Presupuesto", PestañaPresupuesto);

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
        DialogoGestorProyectos dialogoProyectos = new DialogoGestorProyectos(this, true);
        dialogoProyectos.setVisible(true);
        proyecto = dialogoProyectos.getProyecto();
        proyectoAbierto = true;

        reloadTitle();
        refreshVentanaTareas();
        setAvailability(PestañaGestion);
        //System.out.println(proyecto);
    }//GEN-LAST:event_abrirProyectoMouseClicked

    private void BotonGestionarRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionarRecursosActionPerformed
        refreshVentanaRecursos();
        ventana = 2;
        cambiarMenuControles();
    }//GEN-LAST:event_BotonGestionarRecursosActionPerformed

    private void BotonGestionarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionarTareasActionPerformed
        refreshVentanaTareas();
        ventana = 1;
        cambiarMenuControles();
    }//GEN-LAST:event_BotonGestionarTareasActionPerformed

    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
        switch (ventana) {
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
    }//GEN-LAST:event_BotonAñadirActionPerformed

    private void BotonGestionarRiesgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionarRiesgosActionPerformed
        cargarTablaDeRiesgos();
        ventana = 3;
        cambiarMenuControles();
    }//GEN-LAST:event_BotonGestionarRiesgosActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        switch (ventana) {
            case 1:
                if (tablaDeDatos.getSelectedRow() == -1) {
                    return;
                }

                Task selectedTask = listaTareas.get(tablaDeDatos.getSelectedRow());
                SQLiteRemoveTask.removeTask(selectedTask.getId(), selectedTask.getIdProyecto());

                refreshVentanaTareas();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        switch (ventana) {
            case 1:
                if (tablaDeDatos.getSelectedRow() == -1) {
                    return;
                }

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
    }//GEN-LAST:event_BotonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadir;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGestionarRecursos;
    private javax.swing.JButton BotonGestionarRiesgos;
    private javax.swing.JButton BotonGestionarTareas;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel PanelAcciones;
    private javax.swing.JScrollPane PanelEstimacion;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JPanel PanelInfoAvanzada;
    private javax.swing.JPanel PestañaGestion;
    private javax.swing.JPanel PestañaPresupuesto;
    private javax.swing.JTable TablaEstimacion;
    private javax.swing.JMenu abrirProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
        Object listaTabla[][];
        ArrayList<Resource> recursos = SQLiteResourcesLoader.getResources(proyecto.getId());
        listaTabla = new Object[recursos.size()][2];
        for (int i = 0; i < recursos.size(); i++) {
            listaTabla[i][0] = recursos.get(i);
            listaTabla[i][1] = recursos.get(i).getValor();
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
        Object listaTabla[][];
        listaTareas = SQLiteTasksLoader.getTasks(proyecto.getId());
        listaTabla = new Object[listaTareas.size()][6];
        for (int i = 0; i < listaTareas.size(); i++) {
            listaTabla[i][0] = listaTareas.get(i);
            listaTabla[i][1] = listaTareas.get(i).getIdPadre();
            listaTabla[i][2] = listaTareas.get(i).getFechaInicioFormat();
            listaTabla[i][3] = listaTareas.get(i).getFechaFinFormat();
            listaTabla[i][4] = Utils.getPrioridad(listaTareas.get(i).getPrioridad());
            listaTabla[i][5] = Utils.getEstado(listaTareas.get(i).getEstado());
        }

        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
                listaTabla,
                new String[]{
                    "Tarea", "Padre", "Fecha Inicio", "Fecha Fin", "Prioridad", "Estado"}
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
        switch (ventana) {
            case 1:
            default:
                BotonAñadir.setText("Añadir Tarea");
                BotonEliminar.setText("Eliminar Tarea");
                BotonEditar.setText("Modificar Tarea");
                break;
            case 2:
                BotonAñadir.setText("Añadir Recurso");
                BotonEliminar.setText("Eliminar Recurso");
                BotonEditar.setText("Modificar Recurso");
                break;
            case 3:
                BotonAñadir.setText("Añadir Riesgo");
                BotonEliminar.setText("Eliminar Riesgo");
                BotonEditar.setText("Modificar Riesgo");
                break;
        }

    }

    private void cargarTablaDeRiesgos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void reloadTitle() {
        setTitle(title + "  -  " + proyecto);
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

        TablaEstimacion.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Fecha fin", fechaFin},
                    {"Carga de trabajo(h)", cargaDeTrabajo},
                    {"Nº de tareas finalizadas", tareasFinalizadas},
                    {"Nº De tareas sin finalizar", listaTareas.size() - tareasFinalizadas},
                    {"Tiempo trabajado(h)", tiempoTrabajado},
                    {null, null},
                    {null, null}
                },
                new String[]{
                    "", ""
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    private String getFechaMayor() {
        long fechaFin = 0;
        for (Task tarea : listaTareas) {
            if (fechaFin < tarea.getFechaFin()) {
                fechaFin = tarea.getFechaFin();
            }
        }
        return Utils.longDateToString(fechaFin);
    }

    private int getDuracionCompleta() {
        int total = 0;
        for (Task tarea : listaTareas) {
            total += tarea.getDuracionEstimada();
        }
        return total * 24;
    }

    private int getTiempoTrabajado() {
        int total = 0;
        for (Task tarea : listaTareas) {
            if (tarea.getEstado() == 2) {
                total += tarea.getDuracionEstimada();
            }
        }
        return total * 24;
    }

    private int getTareasFinalizadas() {
        int total = 0;
        for (Task tarea : listaTareas) {
            if (tarea.getEstado() == 2) {
                total++;
            }
        }
        return total;
    }

    private void refreshVentanaRecursos() {
        cargarTablaDeRecursos();
        cargarTablaEstimacion();
    }

}
