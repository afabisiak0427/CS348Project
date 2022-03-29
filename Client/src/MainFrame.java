import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFrame extends javax.swing.JFrame {

    public static Connection conn = null;

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new JPanel();
        cpuButton = new JButton();
        gpuButton = new JButton();
        ramButton = new JButton();
        storageButton = new JButton();
        motherboardButton = new JButton();
        psuButton = new JButton();
        exitButton = new JButton();
        adminButton = new JButton();
        quickLabel = new JLabel();
        lookupLabel = new JLabel();
        pcTextField = new JTextField();
        searchButton = new JButton();
        jScrollPane1 = new JScrollPane();
        pcOutputTextArea = new JTextArea();
        addPersonalButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cpuButton.setText("CPU Parts");
        cpuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cpuButtonActionPerformed(evt);
            }
        });

        gpuButton.setText("GPU Parts");
        gpuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gpuButtonActionPerformed(evt);
            }
        });

        ramButton.setText("RAM Parts");
        ramButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ramButtonActionPerformed(evt);
            }
        });

        storageButton.setText("Storage Parts");
        storageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                storageButtonActionPerformed(evt);
            }
        });

        motherboardButton.setText("Motherboard Parts");
        motherboardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                motherboardButtonActionPerformed(evt);
            }
        });

        psuButton.setText("PSU Parts");
        psuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                psuButtonActionPerformed(evt);
            }
        });

        addPersonalButton.setText("Add New PC");
        addPersonalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { addPCButtonActionPerformed(evt); }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        adminButton.setText("Admin");
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        quickLabel.setText("Quick Search Buttons:");

        lookupLabel.setText("Personal Computer Lookup:");

        searchButton.setText("Personal Computer Search");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        pcOutputTextArea.setColumns(20);
        pcOutputTextArea.setRows(6);
        jScrollPane1.setViewportView(pcOutputTextArea);

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(gpuButton)
                    .addComponent(psuButton)
                    .addComponent(storageButton)
                    .addComponent(ramButton)
                    .addComponent(motherboardButton)
                    .addComponent(addPersonalButton)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cpuButton)
                            .addComponent(quickLabel))))
                .addGap(47, 47, 47)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lookupLabel)
                    .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(adminButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pcTextField)
                    .addComponent(searchButton, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(quickLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lookupLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cpuButton)
                    .addComponent(pcTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(gpuButton)
                    .addComponent(searchButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(ramButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(motherboardButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(storageButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(psuButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPersonalButton))
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton)
                    .addComponent(exitButton))
                .addGap(27, 27, 27))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public void addPCButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        String query1 = "INSERT INTO personal_pcs (name) VALUES (\"" + name + "\");";

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);

            int affectedRows = pt1.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    private void cpuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM cpu;";
        }
        else {
            query1 = "SELECT * FROM cpu WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5) + ", " + rs.getString(6);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tGeneration\tCores\tThreads\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    private void gpuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM gpu;";
        }
        else {
            query1 = "SELECT * FROM gpu WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5) + ", " + rs.getString(6);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tGeneration\tCores\tMemory\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                         

    private void ramButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM ram;";
        }
        else {
            query1 = "SELECT * FROM ram WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5) + ", " + rs.getString(6);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tMemory amt\t# of sticks\tSpeed\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                         

    private void motherboardButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM motherboard;";
        }
        else {
            query1 = "SELECT * FROM motherboard WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5) + ", " + rs.getString(6) + ", " + rs.getString(7);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tSize\t# of PCI Slots\t# of RAM slots\tCPU Generation\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                                 

    private void storageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM storage;";
        }
        else {
            query1 = "SELECT * FROM storage WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tType\tSize (gb)\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                             

    private void psuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM psu;";
        }
        else {
            query1 = "SELECT * FROM psu WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " +
                        rs.getString(5);
                ar.add(line);
            }

            System.out.println("Name\tBrand\tWatts\tColor\tPrice");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                         

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter * to display all, or search a name with a string: ");
        String search = sc.nextLine();

        String query1;
        String line;

        if (search.compareTo("*") == 0) {
            query1 = "SELECT * FROM personal_pcs;";
        }
        else {
            query1 = "SELECT * FROM personal_pcs WHERE name LIKE \"%" + search + "%\";";
        }

        try {
            PreparedStatement pt1 = conn.prepareStatement(query1);
            ArrayList<String> ar = new ArrayList<>();

            ResultSet rs = pt1.executeQuery();
            while (rs.next()) {
                line = rs.getString(1);
                ar.add(line);
            }

            System.out.println("Name");
            for (String s : ar) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }                                            

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
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

        try {
            String url = "jdbc:sqlite:PurduePartPicker.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Got it!");
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton adminButton;
    private javax.swing.JButton cpuButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gpuButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lookupLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton motherboardButton;
    private javax.swing.JTextArea pcOutputTextArea;
    private javax.swing.JTextField pcTextField;
    private javax.swing.JButton psuButton;
    private javax.swing.JLabel quickLabel;
    private javax.swing.JButton ramButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton storageButton;
    private javax.swing.JButton addPersonalButton;
    // End of variables declaration                   
}
