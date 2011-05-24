/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JChip16BR.java
 *
 * Created on May 23, 2011, 11:57:50 AM
 */
package br.com.leandromoreira.chip16.ui;

import br.com.leandromoreira.chip16.util.ConfigManager;

/**
 * @author leandro-rm
 */
public class JChip16BR extends javax.swing.JFrame {

    /** Creates new form JChip16BR */
    public JChip16BR() {
        initComponents();
        setLocationRelativeTo(null);  
        createBufferStrategy(2);
        setIgnoreRepaint(true);
        setTitle(ConfigManager.getConfig().getTitle());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMnuBarMain = new javax.swing.JMenuBar();
        jMnuFile = new javax.swing.JMenu();
        jMnuLoad = new javax.swing.JMenuItem();
        jMnuEmulation = new javax.swing.JMenu();
        jMnuRun = new javax.swing.JMenuItem();
        jMnuPause = new javax.swing.JMenuItem();
        jMnuSetup = new javax.swing.JMenu();
        jMnuVideo = new javax.swing.JMenuItem();
        jMnuAudio = new javax.swing.JMenuItem();
        jMnuJoystick = new javax.swing.JMenuItem();
        jMnuAbout = new javax.swing.JMenu();
        jMnuJChip16BR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jMnuFile.setText("File");

        jMnuLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leandromoreira/chip16/resource/open-project-btn.png"))); // NOI18N
        jMnuLoad.setText("Load");
        jMnuFile.add(jMnuLoad);

        jMnuBarMain.add(jMnuFile);

        jMnuEmulation.setText("Emulation");

        jMnuRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leandromoreira/chip16/resource/run-project-btn.png"))); // NOI18N
        jMnuRun.setText("Run");
        jMnuEmulation.add(jMnuRun);

        jMnuPause.setText("Pause");
        jMnuEmulation.add(jMnuPause);

        jMnuBarMain.add(jMnuEmulation);

        jMnuSetup.setText("Setup");

        jMnuVideo.setText("Video");
        jMnuSetup.add(jMnuVideo);

        jMnuAudio.setText("Audio");
        jMnuSetup.add(jMnuAudio);

        jMnuJoystick.setText("Joystick");
        jMnuSetup.add(jMnuJoystick);

        jMnuBarMain.add(jMnuSetup);

        jMnuAbout.setText("About");

        jMnuJChip16BR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leandromoreira/chip16/resource/step-over-btn.png"))); // NOI18N
        jMnuJChip16BR.setText("JChip16BR");
        jMnuAbout.add(jMnuJChip16BR);

        jMnuBarMain.add(jMnuAbout);

        setJMenuBar(jMnuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        
        System.out.println("typed: "+evt.getKeyChar());
        
    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        System.out.println("pressed: "+evt.getKeyChar());
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

        System.out.println("released: "+evt.getKeyChar());
        
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JChip16BR().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMnuAbout;
    private javax.swing.JMenuItem jMnuAudio;
    private javax.swing.JMenuBar jMnuBarMain;
    private javax.swing.JMenu jMnuEmulation;
    private javax.swing.JMenu jMnuFile;
    private javax.swing.JMenuItem jMnuJChip16BR;
    private javax.swing.JMenuItem jMnuJoystick;
    private javax.swing.JMenuItem jMnuLoad;
    private javax.swing.JMenuItem jMnuPause;
    private javax.swing.JMenuItem jMnuRun;
    private javax.swing.JMenu jMnuSetup;
    private javax.swing.JMenuItem jMnuVideo;
    // End of variables declaration//GEN-END:variables
}