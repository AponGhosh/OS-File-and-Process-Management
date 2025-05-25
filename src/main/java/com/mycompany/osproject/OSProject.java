package com.mycompany.osproject;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class OSProject extends javax.swing.JFrame {
    
    Process process1=null,process2=null;
    ProcessHandle parentHandle1 = null,parentHandle2 = null;
    long PID1=0,PID2=0;
    boolean alive1=false,alive2=false;
    ProcessHandle.Info info1=null,info2=null;
    int child1=0,child2=0,opt=0;
    String str;

    public OSProject() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Operating System\n");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create File or Folder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Change File Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete File or Folder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Build Process");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Display Process");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Kill Process");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 153, 153));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Shut Down");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton8)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String s1=JOptionPane.showInputDialog(this, "Enter File or Folder to create: ", "File or Folder Creatation",JOptionPane.QUESTION_MESSAGE);
        
        if(s1.equals("Folder")){
            String direct =JOptionPane.showInputDialog(this, "Enter a directory: ", "Folder Creatation",JOptionPane.QUESTION_MESSAGE);
            String fol=JOptionPane.showInputDialog(this, "Enter folder name: ", "Folder Creatation",JOptionPane.QUESTION_MESSAGE);
            
            String directory=direct+fol;
            File folder= new File(directory);
            boolean folderYes=folder.mkdir();
            if(folderYes){
                JOptionPane.showMessageDialog(this,"Folder is created succesfully","Folder Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Folder creation incomplete","Folder Info",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(s1.equals("File")){
            try {
                String direct =JOptionPane.showInputDialog(this, "Enter a directory: ", "File Creatation",JOptionPane.QUESTION_MESSAGE);
                String fil=JOptionPane.showInputDialog(this, "Enter file name: ", "File Creatation",JOptionPane.QUESTION_MESSAGE);
                
                File file =new File(direct+"\\"+fil);
                boolean fileYes=file.createNewFile();
                if(fileYes){
                    JOptionPane.showMessageDialog(this,"File is created succesfully","File Info",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this,"File creation incomplete","File Info",JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,"An error occured","File Info",JOptionPane.ERROR_MESSAGE);
            }
        }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String direct =JOptionPane.showInputDialog(this, "Enter a directory: ", "File Rename",JOptionPane.QUESTION_MESSAGE);
        String fil=JOptionPane.showInputDialog(this, "Enter File name: ", "File Rename",JOptionPane.QUESTION_MESSAGE);

        File file =new File(direct+fil);
        
        String filre=JOptionPane.showInputDialog(this, "Enter new file name: ", "File Rename",JOptionPane.QUESTION_MESSAGE);
        File rename= new File(direct+filre);
        
        boolean renameYes=file.renameTo(rename);
        if(renameYes){
            JOptionPane.showMessageDialog(this,"File renamed succesfully","Rename Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"File rename incomplete","Rename Info",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String directory =JOptionPane.showInputDialog(this, "Enter a directory: ", "File Search",JOptionPane.QUESTION_MESSAGE);
        String fil=JOptionPane.showInputDialog(this, "Enter File name: ", "File Search",JOptionPane.QUESTION_MESSAGE);

        File direct = new File(directory);
        String[] list=direct.list();

        boolean fileFound=false;
        for (String list1 : list) {
            if (fil.equals(list1)) {
                fileFound=true;
                break;
            }
        }
        if(fileFound){
            JOptionPane.showMessageDialog(this,"File found in the directory","Search Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"File not found in the directory","Search Info",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String s1=JOptionPane.showInputDialog(this, "Enter File or Folder to delete: ", "File or Folder Deletion",JOptionPane.QUESTION_MESSAGE);
        
        if(s1.equals("Folder")){
            String direct =JOptionPane.showInputDialog(this, "Enter a directory: ", "Folder Deletion",JOptionPane.QUESTION_MESSAGE);
            String fol=JOptionPane.showInputDialog(this, "Enter folder name: ", "Folder Deletion",JOptionPane.QUESTION_MESSAGE);

            String directory=direct+fol;
            File folder= new File(directory);
            boolean folderYes=folder.delete();
            
            if(folderYes){
                JOptionPane.showMessageDialog(this,"Folder is deleted succesfully","Delete Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Folder deletion incomplete","Delete Info",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(s1.equals("File")){
            
            String direct =JOptionPane.showInputDialog(this, "Enter a directory: ", "File Deletion",JOptionPane.QUESTION_MESSAGE);
            String fil=JOptionPane.showInputDialog(this, "Enter file name: ", "File Deletion",JOptionPane.QUESTION_MESSAGE);

            File file =new File(direct+"\\"+fil);
            boolean fileYes=file.delete();
            
            if(fileYes){
                JOptionPane.showMessageDialog(this,"File is deleted succesfully","Delete Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"File deletion incomplete","Delete Info",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        str=JOptionPane.showInputDialog(this, """
                                                       Precess List:-
                                                    
                                                    1. Open Notepad
                                                    2. Open File Explorer
                                                    3. Open All Processes
                                                    
                                                    Enter no. of process to open: """, "Processes",JOptionPane.QUESTION_MESSAGE);
        
        if("1".equals(str)){
            try{
                JOptionPane.showMessageDialog(this,"Press \'OK\' to confirm","Process Creation",JOptionPane.INFORMATION_MESSAGE);
                
                ProcessBuilder builder1 = new ProcessBuilder("notepad.exe");
                process1 = builder1.start();
                parentHandle1 = process1.toHandle();
                JOptionPane.showMessageDialog(this,"Process 1: Notepad opened successfully","Process Info",JOptionPane.INFORMATION_MESSAGE);
                                        

                PID1=parentHandle1.pid();
                alive1=parentHandle1.isAlive();
                info1= parentHandle1.info();   
                child1= (int) parentHandle1.children().count();

            }
            catch (IOException ex) {
            }
        }
        else if("2".equals(str)){
            try{
                JOptionPane.showMessageDialog(this,"Press \'OK\' to confirm","Process Creation",JOptionPane.INFORMATION_MESSAGE);
                ProcessBuilder builder2 = new ProcessBuilder("explorer.exe");
                process2 = builder2.start();
                parentHandle2 = process2.toHandle();
                JOptionPane.showMessageDialog(this,"Process 2: File explorer opened successfully","Process Info",JOptionPane.INFORMATION_MESSAGE);
                
                PID2=parentHandle2.pid();
                alive2=parentHandle2.isAlive();
                info2= parentHandle2.info();
                child2= (int) parentHandle2.children().count();  
                
            }
            catch (IOException ex) {
            }
        }
        else if("3".equals(str)){
            try{
                JOptionPane.showMessageDialog(this,"Press \'OK\' to confirm","Process Creation",JOptionPane.INFORMATION_MESSAGE);
                ProcessBuilder builder1 = new ProcessBuilder("notepad.exe");
                process1 = builder1.start();
                parentHandle1 = process1.toHandle();


                PID1=parentHandle1.pid();
                alive1=parentHandle1.isAlive();
                info1= parentHandle1.info();
                child1= (int) parentHandle1.children().count();
                
                ProcessBuilder builder2 = new ProcessBuilder("explorer.exe");
                process2 = builder2.start();
                parentHandle2 = process2.toHandle();
                

                PID2=parentHandle2.pid();
                alive2=parentHandle2.isAlive();
                info2= parentHandle2.info();
                child2= (int) parentHandle2.children().count();
                JOptionPane.showMessageDialog(this,"Process 3: All processes opened successfully","Process Info",JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        DisplayProcess dis= new DisplayProcess();
        dis.setVisible(true);
        
        if(str.equals("1")){
            dis.Process1(PID1, alive1, info1, child1);
        }
        else if(str.equals("2")){
            dis.Process2(PID2, alive2, info2, child2);
        }
        else if(str.equals("3")){
            dis.Process3(PID1, alive1, info1, child1, PID2, alive2, info2, child2);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if (str.equals("1")) {
            parentHandle1.destroyForcibly();
            alive1=parentHandle1.isAlive();
            info1=parentHandle1.info();
            JOptionPane.showMessageDialog(this,"Process 1: Notepad killed successfully","Kill Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("2")){
            parentHandle2.destroyForcibly();
            alive2=parentHandle2.isAlive();
            info2=parentHandle2.info();
            JOptionPane.showMessageDialog(this,"Process 2: File explorer killed successfully","Kill Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(str.equals("3")){
            
            String str2=JOptionPane.showInputDialog(this, """
                                                       Precess List:-
                                                    
                                                    1. Kill Notepad
                                                    2. Kill File Explorer
                                                    3. Kill All Processes
                                                    
                                                    Enter no. of process to kill: """, "Processes",JOptionPane.QUESTION_MESSAGE);
            
            if(str2.equals("1")){
                parentHandle1.destroyForcibly();
                alive1=parentHandle1.isAlive();
                info1=parentHandle1.info();
                JOptionPane.showMessageDialog(this,"Process 1: Notepad killed successfully","Kill Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(str2.equals("2")){
                parentHandle2.destroyForcibly();
                alive2=parentHandle2.isAlive();
                JOptionPane.showMessageDialog(this,"Process 2: File explorer killed successfully","Kill Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(str2.equals("3")){
                parentHandle1.destroyForcibly();
                alive1=parentHandle1.isAlive();
                info1=parentHandle1.info();
                
                parentHandle2.destroyForcibly();
                alive2=parentHandle2.isAlive();
                JOptionPane.showMessageDialog(this,"Process 3: All processes killed successfully","Kill Info",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OSProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OSProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OSProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OSProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OSProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
