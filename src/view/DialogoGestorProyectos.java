package view;

import java.awt.Frame;
import java.util.ArrayList;
import model.Project;
import persistence.SQLiteAddProject;
import persistence.SQLiteProjectsLoader;

public class DialogoGestorProyectos extends javax.swing.JDialog {

    Project proyecto;
    Object[][] listaTabla;

    public Project getProyecto() {
        return proyecto;
    }

    public DialogoGestorProyectos(Frame parent, boolean modal) {
        super(parent, modal);
        setListaTabla();
        initComponents();
        setLocationRelativeTo(parent);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAbrir = new javax.swing.JButton();
        panelAñadir = new javax.swing.JPanel();
        nombreProyecto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionProyecto = new javax.swing.JTextArea();
        BotonAñadirProyecto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        proyectos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonAbrir.setText("Abrir");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });

        panelAñadir.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Proyecto"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        descripcionProyecto.setColumns(20);
        descripcionProyecto.setRows(5);
        jScrollPane2.setViewportView(descripcionProyecto);

        BotonAñadirProyecto.setText("Añadir");
        BotonAñadirProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirLayout = new javax.swing.GroupLayout(panelAñadir);
        panelAñadir.setLayout(panelAñadirLayout);
        panelAñadirLayout.setHorizontalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProyecto)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(BotonAñadirProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAñadirLayout.setVerticalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAñadirProyecto)
                .addGap(7, 7, 7))
        );

        proyectos.setModel(new javax.swing.table.DefaultTableModel(
            listaTabla,
            new String [] {
                "Proyecto","Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        proyectos.setOpaque(false);
        proyectos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        proyectos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(proyectos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        if (proyectos.getSelectedRow() != -1) {
            proyecto = (Project) listaTabla[proyectos.getSelectedRow()][0];
            dispose();
        }
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void BotonAñadirProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirProyectoActionPerformed
        SQLiteAddProject.addProject(nombreProyecto.getText(), descripcionProyecto.getText());
        nombreProyecto.setText("");
        descripcionProyecto.setText("");
        refreshTable();
    }//GEN-LAST:event_BotonAñadirProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirProyecto;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JTextArea descripcionProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreProyecto;
    private javax.swing.JPanel panelAñadir;
    private javax.swing.JTable proyectos;
    // End of variables declaration//GEN-END:variables

    private void setListaTabla() {
        ArrayList<Project> projects = SQLiteProjectsLoader.getProjects();
        listaTabla = new Object[projects.size()][2];
        for (int i = 0; i < projects.size(); i++) {
            listaTabla[i][0] = projects.get(i);
            listaTabla[i][1] = projects.get(i).getDescripcion();
        }
    }

    private void refreshTable() {
        setListaTabla();

        proyectos.setModel(new javax.swing.table.DefaultTableModel(
                listaTabla,
                new String[]{
                    "Proyecto", "Descripción"
                }
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
}
