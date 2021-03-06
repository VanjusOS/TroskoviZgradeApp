/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import pomocno.HibernateUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import model.Stanar;

/**
 *
 * @author Profesor
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
//getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        Thread thread = new Thread() {
            public void run() {
                izvedi();
            }
        };

        thread.start();

    }
    private void izvedi() {
        List<Stanar> l = HibernateUtil.getSession().createQuery(
                " from Stanar a")
                .setMaxResults(1)
                .list();
        if(l.size()>0){
             for (Stanar   stanar : l) {
            new PocetniIzbornik().setVisible(true);
            dispose();
            break;
        }
        }else{
            new PocetniIzbornik().setVisible(true);
            dispose();
        }
       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        slika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/zgradavatrogasna.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel slika;
    // End of variables declaration//GEN-END:variables
}
