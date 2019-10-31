
import javax.swing.JTable;


public class Gui extends javax.swing.JFrame {

    private int algoritmeOption = 0;
    private Heuristic heuriticOption = Heuristic.H_ONE;
    private int depth = 0;
    
    public Gui() {
        initComponents();
        cbHeuristic.setEnabled(false);
        spinDepth.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblGoalState = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbAlgoritme = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbHeuristic = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spinDepth = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSolve = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblStartState = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblGoalState.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblGoalState);
        if (tblGoalState.getColumnModel().getColumnCount() > 0) {
            tblGoalState.getColumnModel().getColumn(0).setResizable(false);
            tblGoalState.getColumnModel().getColumn(1).setResizable(false);
            tblGoalState.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("GOAL STATE");

        jLabel1.setText("START STATE");

        cbAlgoritme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breadth First Search", "Depth First Search", "Uniform Cost Search", "A*", "Best First Search", "Iterative Deepening Search" }));
        cbAlgoritme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlgoritmeItemStateChanged(evt);
            }
        });
        cbAlgoritme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAlgoritmeMouseClicked(evt);
            }
        });
        cbAlgoritme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlgoritmeActionPerformed(evt);
            }
        });

        jLabel3.setText("Algorithm");

        cbHeuristic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heuristic 1", "Heuristic 2", "Heuristic 3" }));
        cbHeuristic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHeuristicActionPerformed(evt);
            }
        });

        jLabel4.setText("Heuristic Function");

        jLabel5.setText("Depth");

        btnSolve.setText("Solve");
        btnSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("RESULT");

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        tblStartState.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblStartState);
        if (tblStartState.getColumnModel().getColumnCount() > 0) {
            tblStartState.getColumnModel().getColumn(0).setResizable(false);
            tblStartState.getColumnModel().getColumn(1).setResizable(false);
            tblStartState.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(cbAlgoritme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbHeuristic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(spinDepth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolve, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(332, 332, 332))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(cbAlgoritme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(cbHeuristic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(spinDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSolve))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlgoritmeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlgoritmeItemStateChanged

    }//GEN-LAST:event_cbAlgoritmeItemStateChanged

    private void cbAlgoritmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAlgoritmeMouseClicked

    }//GEN-LAST:event_cbAlgoritmeMouseClicked

    private void cbAlgoritmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlgoritmeActionPerformed
        int index = cbAlgoritme.getSelectedIndex();
        algoritmeOption = index;
        switch (index) {
            case 3:
                System.out.println("A*");
                cbHeuristic.setEnabled(true);
                break;
            case 5:
                System.out.println("Iterative Deepening Search");
                spinDepth.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cbAlgoritmeActionPerformed

    private void cbHeuristicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHeuristicActionPerformed
        int index = cbHeuristic.getSelectedIndex();
        switch(index){
            case 0:
                heuriticOption = Heuristic.H_ONE;
                break;
            case 1:
                heuriticOption = Heuristic.H_TWO;
                break;
            case 2:
                heuriticOption = Heuristic.H_THREE;
                break;
        }
        
    }//GEN-LAST:event_cbHeuristicActionPerformed

    private void btnSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveActionPerformed
        txtResult.setText("");
        String startState = "";
        String goalState = "";
        
        fix(tblStartState);
        fix(tblGoalState);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                startState += tblStartState.getValueAt(i, j).toString();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                goalState += tblGoalState.getValueAt(i, j).toString();
            }
        }
        
        System.out.println(startState);
        System.out.println(goalState);
        
        SearchTree search = new SearchTree(new Node(startState), goalState);
        String result = "";
        switch (algoritmeOption) {
            case 0:
                System.out.println("bfs");
                result = search.breadthFirstSearch();
                break;
            case 1:
                System.out.println("dfs");
                result = search.depthFirstSearch();
                break;
            case 2:
                System.out.println("ucs");
                result = search.uniformCostSearch();
                break;
            case 3:
                System.out.println("A*");
                result = search.aStar(heuriticOption);
                break;
            case 4:
                System.out.println("Best First Search");
                result = search.bestFirstSearch();
                break;
            case 5:
                System.out.println("Iterative Deepening Search");
                result = search.iterativeDeepening(depth);
                break;
        }
        txtResult.setText(result);
    }//GEN-LAST:event_btnSolveActionPerformed
    
    private void fix(JTable tbl){
        tbl.editCellAt(tbl.getRowCount(), tbl.getColumnCount());
        tbl.setRowSelectionInterval(0, 0);
        tbl.setEnabled(false);
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolve;
    private javax.swing.JComboBox<String> cbAlgoritme;
    private javax.swing.JComboBox<String> cbHeuristic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner spinDepth;
    private javax.swing.JTable tblGoalState;
    private javax.swing.JTable tblStartState;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
