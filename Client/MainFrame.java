import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {
    private String pc;

    public MainFrame() {
        this.pc = "";
        initComponents();
    }

    public MainFrame(String pc) {
        this.pc = pc;
        initComponents();
    }
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        cpuButton = new javax.swing.JButton();
        gpuButton = new javax.swing.JButton();
        ramButton = new javax.swing.JButton();
        storageButton = new javax.swing.JButton();
        motherboardButton = new javax.swing.JButton();
        psuButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        quickLabel = new javax.swing.JLabel();
        lookupLabel = new javax.swing.JLabel();
        pcTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pcOutputTextArea = new javax.swing.JTextArea();
        newPCButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentPCTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Purdue Part Picker");

        if (this.pc.compareTo("") != 0) {
            this.pcTextField.setText(this.pc);
        }

        cpuButton.setText("CPU Parts");
        cpuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuButtonActionPerformed(evt);
            }
        });

        gpuButton.setText("GPU Parts");
        gpuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpuButtonActionPerformed(evt);
            }
        });

        ramButton.setText("RAM Parts");
        ramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramButtonActionPerformed(evt);
            }
        });

        storageButton.setText("Storage Parts");
        storageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageButtonActionPerformed(evt);
            }
        });

        motherboardButton.setText("Motherboard Parts");
        motherboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherboardButtonActionPerformed(evt);
            }
        });

        psuButton.setText("PSU Parts");
        psuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psuButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        quickLabel.setText("Quick Search Buttons:");

        lookupLabel.setText("Personal Computer Search:");

        searchButton.setText("Personal Computer Search:");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        pcOutputTextArea.setColumns(20);
        pcOutputTextArea.setRows(5);

        String[] lines = null;

        try {
            URL url = new URL("http://localhost:8080/queryPC");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(", ");
                    System.out.println(line);
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String s : lines) {
            pcOutputTextArea.append(s + "\n");
        }

        jScrollPane1.setViewportView(pcOutputTextArea);

        newPCButton.setText("Add New Personal Computer");
        newPCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPCButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Current PC Build:");

        currentPCTextArea.setColumns(20);
        currentPCTextArea.setRows(5);

        if (this.pc.compareTo("") != 0) {
            String[] data = null;
            try {
                URL url = new URL("http://localhost:8080/queryWholePC");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setUseCaches(false);

                try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                    dos.writeBytes(this.pc);
                }

                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        data = line.split(", ");
                    }
                }
                conn.disconnect();
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            for (String s : data) {
                System.out.println(s);
                this.currentPCTextArea.append(s + "\n");
            }
        }

        jScrollPane2.setViewportView(currentPCTextArea);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(quickLabel))
                                                        .addComponent(newPCButton))
                                                .addGap(30, 30, 30))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(psuButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(storageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ramButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(gpuButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(motherboardButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(cpuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(78, 78, 78)))
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lookupLabel)
                                        .addComponent(searchButton)
                                        .addComponent(pcTextField)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane2)
                                        .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lookupLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cpuButton)
                                        .addComponent(pcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(gpuButton)
                                        .addComponent(searchButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(ramButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(motherboardButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(storageButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(psuButton))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(exitButton)
                                        .addComponent(newPCButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>  //GEN-END:initComponents

    private void cpuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;

        try {
            URL url = new URL("http://localhost:8080/queryCPU");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String s : lines) {
            System.out.println(s);
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }

        close();
        cpu_lookup newPart = new cpu_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_cpuButtonActionPerformed

    private void gpuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpuButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;
        try {
            URL url = new URL("http://localhost:8080/queryGPU");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String s : lines) {
            System.out.println(s);
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }

        close();
        gpu_lookup newPart = new gpu_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_gpuButtonActionPerformed

    private void ramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;
        try {
            URL url = new URL("http://localhost:8080/queryRAM");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }

        close();
        ram_lookup newPart = new ram_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_ramButtonActionPerformed

    private void motherboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherboardButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;
        try {
            URL url = new URL("http://localhost:8080/queryMotherboard");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String s : lines) {
            System.out.println(s);
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }
        close();
        motherboard_lookup newPart = new motherboard_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_motherboardButtonActionPerformed

    private void storageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;
        try {
            URL url = new URL("http://localhost:8080/queryStorage");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }
        close();
        storage_lookup newPart = new storage_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_storageButtonActionPerformed

    private void psuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psuButtonActionPerformed
        // TODO add your handling code here:
        String[] lines = null;
        try {
            URL url = new URL("http://localhost:8080/queryPSU");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes("All");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines = line.split(";");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int size = lines.length;

        String[][] result = new String[size][];
        int count = 0;
        for (String st : lines) {
            result[count] = st.split(",");
            ++count;
        }

        close();
        psu_lookup newPart = new psu_lookup(result, this.pc);
        newPart.setVisible(true);
    }//GEN-LAST:event_psuButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String text = pcTextField.getText();
        this.pc = pcTextField.getText();

        if (text.length() == 0) {
            text = "All";
        }
        else {
            String[] data = null;
            try {
                URL url = new URL("http://localhost:8080/queryWholePC");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setUseCaches(false);

                try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                    dos.writeBytes(text);
                }

                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        data = line.split(", ");
                    }
                }
                conn.disconnect();
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            for (String s : data) {
                System.out.println(s);
                this.currentPCTextArea.append(s + "\n");
            }
        }

        String[] lines = null;

        try {
            URL url = new URL("http://localhost:8080/queryPC");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes(text);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    lines = line.split(", ");
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        this.pcOutputTextArea.setText("");

        for (String s : lines) {
            this.pcOutputTextArea.append(s + "\n");
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newPCButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String text = this.pcTextField.getText();

        if (text.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a PC name.", "PC Error", JOptionPane.ERROR_MESSAGE);
            close();
            MainFrame newMain = new MainFrame();
            newMain.setVisible(true);
            return;
        }

        String ret = null;
        try {
            URL url = new URL("http://localhost:8080/addPC");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes(text);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("Line: " + line);
                    ret = line;
                }
            }
            conn.disconnect();
            System.out.println("Disconnected");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (ret.contains("Error")) {
            JOptionPane.showMessageDialog(this, ret, "PC Error", JOptionPane.ERROR_MESSAGE);
            close();
            MainFrame newMain = new MainFrame();
            newMain.setVisible(true);
            return;
        }
        close();
        MainFrame newMain = new MainFrame(text);
        newMain.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cpuButton;
    private javax.swing.JTextArea currentPCTextArea;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gpuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lookupLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton motherboardButton;
    private javax.swing.JButton newPCButton;
    private javax.swing.JTextArea pcOutputTextArea;
    private javax.swing.JTextField pcTextField;
    private javax.swing.JButton psuButton;
    private javax.swing.JLabel quickLabel;
    private javax.swing.JButton ramButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton storageButton;
    // End of variables declaration//GEN-END:variables
}
