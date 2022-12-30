package breakapartpdf;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Iterator;
import java.util.UUID;
import javax.swing.JOptionPane;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.joda.time.DateTime;

import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
    }

    public String PathPdf;
    public String PathDirectorySave;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SELECIONARPDF = new javax.swing.JButton();
        INPUT = new javax.swing.JTextField();
        BTNDIRETORIOSALVAR = new javax.swing.JButton();
        INPUTDIRETORIOSALVAR = new javax.swing.JTextField();
        GERARPDF = new javax.swing.JButton();
        MENSAGEM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DESENVOLVEDOR HEUDER R SENA");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        SELECIONARPDF.setBackground(new java.awt.Color(102, 204, 0));
        SELECIONARPDF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SELECIONARPDF.setText("SELECIONAR PDF");
        SELECIONARPDF.setActionCommand("SELECIONARPDF");
        SELECIONARPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SELECIONARPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECIONARPDFActionPerformed(evt);
            }
        });

        INPUT.setEditable(false);
        INPUT.setForeground(new java.awt.Color(102, 102, 102));
        INPUT.setToolTipText("");
        INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUTActionPerformed(evt);
            }
        });

        BTNDIRETORIOSALVAR.setBackground(new java.awt.Color(0, 102, 204));
        BTNDIRETORIOSALVAR.setText("ONDE QUER SALVAR");
        BTNDIRETORIOSALVAR.setActionCommand("BTNDIRETORIOSALVAR");
        BTNDIRETORIOSALVAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNDIRETORIOSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDIRETORIOSALVARActionPerformed(evt);
            }
        });

        INPUTDIRETORIOSALVAR.setEditable(false);

        GERARPDF.setBackground(new java.awt.Color(153, 153, 153));
        GERARPDF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GERARPDF.setForeground(new java.awt.Color(255, 255, 255));
        GERARPDF.setText("GERAR PDF");
        GERARPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GERARPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GERARPDFActionPerformed(evt);
            }
        });

        MENSAGEM.setEditable(false);
        MENSAGEM.setBackground(new java.awt.Color(204, 204, 204));
        MENSAGEM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MENSAGEM.setToolTipText("");
        MENSAGEM.setBorder(null);

        jLabel1.setText("Mensagem:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BTNDIRETORIOSALVAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SELECIONARPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(INPUT, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                                .addComponent(INPUTDIRETORIOSALVAR)))
                        .addComponent(GERARPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MENSAGEM))
                    .addComponent(jLabel1))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SELECIONARPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(INPUT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(INPUTDIRETORIOSALVAR)
                    .addComponent(BTNDIRETORIOSALVAR, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(GERARPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MENSAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELECIONARPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECIONARPDFActionPerformed
        // TODO add your handling code here:
        System.err.println();
        if (evt.getSource() == SELECIONARPDF) {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\" + System.getProperty("user.name")));
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
            fileChooser.setFileFilter(filter);
            int response = fileChooser.showOpenDialog(this);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                this.PathPdf = file.getPath();
                INPUT.setText(file.getPath());
            }
        }
    }//GEN-LAST:event_SELECIONARPDFActionPerformed

    private void INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INPUTActionPerformed

    private void BTNDIRETORIOSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDIRETORIOSALVARActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\Users\\" + System.getProperty("user.name")));
        chooser.setDialogTitle("Selecione um diretorio");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.PathDirectorySave = chooser.getSelectedFile().getPath();
            INPUTDIRETORIOSALVAR.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_BTNDIRETORIOSALVARActionPerformed

    private void GERARPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GERARPDFActionPerformed
        MENSAGEM.setText("");
        if (this.PathPdf == null || this.PathDirectorySave == null) {
            JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS CORRETAMENTE!");
        } else {
            try {
                File pdffile = new File(this.PathPdf);
                PDDocument document = PDDocument.load(pdffile);
                Splitter splitting = new Splitter();
                List<PDDocument> Page = splitting.split(document);
                Iterator<PDDocument> iteration = Page.listIterator();
                int j = 1;
                int count = 0;

                while (iteration.hasNext()) {
                    PDDocument pd = iteration.next();
                    pd.save(this.PathDirectorySave + "\\" + "Page_" + j++ + "__" + UUID.randomUUID().toString() + ".pdf");
                    count = j;
                }
                document.close();
                JOptionPane.showMessageDialog(null, "FOI GERADO " + count + " PDF'S");
                // FeedBack user
                Date juDate = new Date();
                DateTime dt = new DateTime(juDate);
                MENSAGEM.setText("FOI GERADO " + count + " PDF'S" + " " + dt);

            } catch (IOException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_GERARPDFActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNDIRETORIOSALVAR;
    private javax.swing.JButton GERARPDF;
    private javax.swing.JTextField INPUT;
    private javax.swing.JTextField INPUTDIRETORIOSALVAR;
    private javax.swing.JTextField MENSAGEM;
    private javax.swing.JButton SELECIONARPDF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
