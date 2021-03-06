/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import entidades.Terreno;
import entidades.Personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author usuario1
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private String[][] mapa;
    private List<Terreno> listaTerrenos;
    private static Personaje[] personajes = {
            new Personaje(),
            new Personaje(),
            new Personaje(),
            new Personaje()
    };

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    public VentanaPrincipal(String[][] mapa) {
        this();
        this.mapa = mapa;
        this.listaTerrenos = new ArrayList<>();

        String[] listaIds = Arrays.stream(this.mapa)
                .flatMap(Stream::of)
                .distinct()
                .toArray(String[]::new);

        Arrays.stream(listaIds).forEach((String id) -> {
            Terreno terreno = new Terreno();
            terreno.setId(Integer.parseInt(id));

            this.listaTerrenos.add(terreno);
        });
    }

    public VentanaPrincipal(String[][] mapa, List<Terreno> listaTerrenos) {
        this();
        this.mapa = mapa;
        this.listaTerrenos = listaTerrenos;
    }

    /*
    public void pintarMapa(String[][] mapa){

        pintarFilasColumnas(mapa);

        for(int i=0; i < mapa.length; i++){

            for(int j=0; j < mapa[0].length ; j++){
                JLabel celda = new JLabel();
                celda.setText(mapa[i][j]);
                celda.setBounds(40*j+1,i*30,150,30);
                panelMapa.add(celda);
                System.out.print(celda.getText() + ",");
            }
            System.out.println();
        }
        panelMapa.repaint();
        panelMapa.setVisible(true);
    }

    public static void pintarFilasColumnas(String[][] mapa) {
        char letra = 'A';
        int numero = 1;
        Font formatoLetra = new Font("Arial", Font.BOLD, 20);
        JLabel cuadro;

        for (int i = 1; i <= mapa[0].length; i++) {
            cuadro = new JLabel();
            cuadro.setFont(formatoLetra);
            cuadro.setText("  " + letra);
            panelMapa.add(cuadro);
            letra++;
        }

        for (int j = 1; j <= mapa.length; j++) {
            cuadro = new JLabel();
            cuadro.setFont(formatoLetra);
            cuadro.setText(" " + numero);
            panelMapa.add(cuadro);
            numero++;
        }

    }

    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonTerrenos = new javax.swing.JButton();
        botonPersonajes = new javax.swing.JButton();
        botonInicialFinal = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Mapa");

        botonTerrenos.setText("Terrenos");
        botonTerrenos.setPreferredSize(new java.awt.Dimension(100, 23));
        botonTerrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerrenosActionPerformed(evt);
            }
        });

        botonPersonajes.setText("Personajes");
        botonPersonajes.setPreferredSize(new java.awt.Dimension(100, 23));
        botonPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonajesActionPerformed(evt);
            }
        });

        botonInicialFinal.setText("Inicial/Final");
        botonInicialFinal.setPreferredSize(new java.awt.Dimension(100, 23));
        botonInicialFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicialFinalActionPerformed(evt);
            }
        });

        botonIniciar.setText("Iniciar");
        botonIniciar.setPreferredSize(new java.awt.Dimension(100, 23));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.setPreferredSize(new java.awt.Dimension(100, 23));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInicialFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTerrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(785, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(363, 363, 363))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(botonTerrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonInicialFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTerrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerrenosActionPerformed

        VentanaTerrenos ventanaT = new VentanaTerrenos(this.mapa, this.listaTerrenos);
        this.setVisible(false);
        ventanaT.setVisible(true);

        // this.listaTerrenos = ventanaT.getListaTerrenos();

        this.setVisible(true);
        ventanaT.toFront();

        
    }//GEN-LAST:event_botonTerrenosActionPerformed

    private void botonPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonajesActionPerformed
        VentanaPersonajes ventanaP = new VentanaPersonajes(this.personajes, this.listaTerrenos);
        ventanaP.setVisible(true);
        ventanaP.toFront();
    }//GEN-LAST:event_botonPersonajesActionPerformed

    private void botonInicialFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicialFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInicialFinalActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicialFinal;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPersonajes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTerrenos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
