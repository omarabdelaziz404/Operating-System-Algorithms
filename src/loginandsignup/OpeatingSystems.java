package loginandsignup;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OpeatingSystems extends javax.swing.JFrame {
     DefaultTableModel model;

    public OpeatingSystems() {
        initComponents();
        NumberProcess.setText("1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateofProcess = new javax.swing.JTextField();
        QuantumTimeField = new javax.swing.JTextField();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CPUTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RunAlgorithm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AddProcessInTable = new javax.swing.JButton();
        AlgorithmList = new javax.swing.JComboBox<>();
        NumberProcess = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operating System");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setMinimumSize(new java.awt.Dimension(400, 600));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Table");

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Process", "CPU.T", "Wait.T", "Turn.T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setOpaque(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("State of process");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("quantum Time");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(QuantumTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(QuantumTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Algorithm");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("No.Process");

        CPUTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPUTime.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPU Time");

        RunAlgorithm.setBackground(new java.awt.Color(0, 102, 102));
        RunAlgorithm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RunAlgorithm.setForeground(new java.awt.Color(255, 255, 255));
        RunAlgorithm.setText("Run Algorithm");
        RunAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunAlgorithmActionPerformed(evt);
            }
        });

        jLabel4.setText("You Must Select one");

        AddProcessInTable.setBackground(new java.awt.Color(0, 102, 102));
        AddProcessInTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddProcessInTable.setForeground(new java.awt.Color(255, 255, 255));
        AddProcessInTable.setText("Add Process");
        AddProcessInTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProcessInTableActionPerformed(evt);
            }
        });

        AlgorithmList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AlgorithmList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Priority", "Round Robin" }));
        AlgorithmList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 136)));

        NumberProcess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumberProcess.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(AlgorithmList, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AlgorithmList, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 464, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunAlgorithmActionPerformed
            ChangeState("Running");
        
            int rowcount = model.getRowCount();
            
            int Cputime[] = new int [rowcount];
            int WaitingTime[] = new int [rowcount];
            int TrunAroundTime[] = new int [rowcount];
            
            //FCFS = First-Come First-Served
            if(AlgorithmList.getSelectedItem().equals("FCFS")){
                
               for(int i=0; i< rowcount; i++ ){ //Cpu time values in array
                Cputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString()); 
                }

                WaitingTime[0]=0; //first proccses Waiting Time

                for(int i=1; i<rowcount; i++){ //calc Waiting Time
                    WaitingTime[i]=WaitingTime[i-1]+Cputime[i-1];
                }
                
                for(int i=0; i<rowcount; i++){ //calc TrunAround Time
                    TrunAroundTime[i]= WaitingTime[i]+Cputime[i];
                }
                SetWaitingAndTurnAround(WaitingTime,TrunAroundTime);
                ShowMessageAverageWT("FCFS Algorithm");
            }
            
             //SJF = Short Jop Frist
            else if (AlgorithmList.getSelectedItem().equals("SJF")) {
                 List<Object[]> tableData = new ArrayList<>();
                for (int i = 0; i < rowcount; i++) {
                    Object[] row = new Object[4];
                    row[0] = model.getValueAt(i, 0); // NO.Proccess
                    row[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Cpu Time
                    row[2] = 0; // Waiting Time 
                    row[3] = 0; // Turnaround Time
                    tableData.add(row);
                }
                
                tableData.sort((a, b) -> Integer.compare((int) a[1], (int) b[1])); // sort Based on CPU time
                // operation
                    int currentTime = 0; 
                    for (int i = 0; i < tableData.size(); i++) {       
                        Object[] row = tableData.get(i); 
                        int CpuTime = (int) row[1]; //calc Waiting Time:
                        row[2] = currentTime; //calc Waiting Time:
                        row[3] = (int) row[2] + CpuTime; // calc Turnaround Time = Waiting Time + Burst Time
                        currentTime += CpuTime; //updating currentTime 
                    }
                    SenderTableData(tableData);
                    ShowMessageAverageWT("SJF Algorithm");
            }
            
            //Priority
            else if (AlgorithmList.getSelectedItem().equals("Priority")) {
                ///Get Priority process for each operation
                model.addColumn("Priority process"); //Adding Priority process column
                for (int i = 0; i < rowcount; i++) {
                   String InputPriority =  JOptionPane.showInputDialog(this,
                           "Enter Number of Priority process"+(i+1)+":", //message
                           "Input Priority process", //message title
                           JOptionPane.QUESTION_MESSAGE); //messagetype    
                   model.setValueAt(InputPriority, i, 4);
                }
                
                // Extract data from table:
                List<Object[]> tableData = new ArrayList<>();
                for (int i = 0; i < rowcount; i++) {
                    Object[] Process = new Object[5];
                    Process[0] = model.getValueAt(i, 0); // NO.Proccess
                    Process[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // CPU Time
                    Process[2] = 0; // Waiting Time
                    Process[3] = 0; // Turnaround Time
                    Process[4] = Integer.parseInt(model.getValueAt(i, 4).toString()); // Priority process
                    tableData.add(Process);
                }
                
                tableData.sort((a, b) -> Integer.compare((int) a[4], (int) b[4])); // sort Based on Priority process
                
                // operation
                int currentTime = 0;
                for (int i = 0; i < tableData.size(); i++) {
                    Object[] Process = tableData.get(i);
                    int CPUTime = (int) Process[1]; // calc Waiting Time
                    Process[2] = currentTime; // Waiting Time = Current time before the process starts
                    Process[3] = (int) Process[2] + CPUTime; // calc Turnaround Time = Waiting Time + cpu Time
                    currentTime += CPUTime;//updating currentTime
                }
                SenderTableData(tableData);
                ShowMessageAverageWT("Priority Algorithm");
            }  
            
            //Round Robin
            else if (AlgorithmList.getSelectedItem().equals("Round Robin")) {
                //Getting Quantum Time:
                String InputQuantum = JOptionPane.showInputDialog(this,
                        "Input Quantum Time for all processes:",  //message
                        "Quantum Time Input",  //message title
                        JOptionPane.QUESTION_MESSAGE); //messagetype
                QuantumTimeField.setText(InputQuantum);
                int QuantumTime = Integer.parseInt(InputQuantum);
                
                //Extract data from table:
                List<Object[]> tableData = new ArrayList<>();
                int [] backupCpuTime = new int[rowcount];
                    for (int i = 0; i < rowcount; i++) { //getting table values
                        Object[] process = new Object[4];
                        process[0] = model.getValueAt(i, 0); // NO.Proccess
                        process[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // CPU Time
                        backupCpuTime[i] = Integer.parseInt(model.getValueAt(i, 1).toString()); // backup CPU Time
                        process[2] = 0; // Waiting Time
                        process[3] = 0; // Turnaround Time
                        tableData.add(process);
                    }
                //Implementation of Round Robin algorithm:
                boolean allProcessesComplete;
                int currentTime = 0;
                do {
                    allProcessesComplete = true;

                    for (Object[] process : tableData) { //for each
                        int CPUTime = (int) process[1]; // based on Cpu time
                        if (CPUTime > 0) {
                            allProcessesComplete = false;
                        //process is not finshed:
                        if (CPUTime > QuantumTime) { 
                            currentTime += QuantumTime;
                            process[1] = (int) process[1] - QuantumTime; // Update Remaining Time      
                        //process is finshed:    
                        } else { 
                            currentTime += CPUTime;
                            process[1] = 0; // Cpu time Finshed
                            process[3] = currentTime; // Turnaround Time
                            process[2] = (int) process[3] -  CPUTime; // Waiting Time
                                }
                            }
                        }
                    } while (!allProcessesComplete);

                    //Update the table with the calculated values:
                    for (int i = 0; i < tableData.size(); i++) {
                        Object[] process = tableData.get(i);
                        model.setValueAt(process[0], i, 0); // NO.process
                        model.setValueAt( backupCpuTime[i], i, 1); // Cpu Time
                        model.setValueAt(process[2], i, 2); // Waiting Time
                        model.setValueAt(process[3], i, 3); // Turnaround Time
                    }
                    ShowMessageAverageWT("Round Robin Algorithm");
            }    
    }//GEN-LAST:event_RunAlgorithmActionPerformed

    private void AddProcessInTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProcessInTableActionPerformed
        model = (DefaultTableModel) Table.getModel();
        if(CPUTime.getText().isEmpty() || CPUTime.getText() == "0"){
            JOptionPane.showMessageDialog(this, "CPU time Is not valid","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            //calling function
            Add_To_Table();
            clearCpuTime();
            IncrementNumberProcess();
            ChangeState("waiting");
        }
    }//GEN-LAST:event_AddProcessInTableActionPerformed

    //FUNCTIONS:
    private void Add_To_Table(){
        model.addRow(new Object[]{"p" + NumberProcess.getText(),CPUTime.getText(),0,0});
    }
    private void clearCpuTime(){
        CPUTime.setText("");
    }
    private void IncrementNumberProcess(){
       int Number = Integer.parseInt(NumberProcess.getText());
       Number++;
       NumberProcess.setText(Number+"");
    }
    private void ChangeState(String state){
        stateofProcess.setText(state);
    } 
    private void SetWaitingAndTurnAround(int waitingTime[],int turnAround[]){
        for(int i=0; i< model.getRowCount();i++){
            model.setValueAt(waitingTime[i], i, 2);//setValueAt(value, row,column)
            model.setValueAt(turnAround[i], i, 3);
        }
    }
    private void ShowMessageAverageWT(String Algorihm){
        double totalWaiting=0;
        double totalTurnaround=0;
        for(int i=0; i<model.getRowCount();i++){
            totalWaiting += Integer.parseInt(model.getValueAt(i,2).toString()); //getValueAt(row,column)
            totalTurnaround += Integer.parseInt(model.getValueAt(i,3).toString());
        }
        totalWaiting /= model.getRowCount();
        totalTurnaround /= model.getRowCount();
        JOptionPane.showMessageDialog(this, 
                "in " + Algorihm + "\n Average Waiting Time: " + totalWaiting + "\n Average trunAround Time: " + totalTurnaround,"Result", //message
                JOptionPane.INFORMATION_MESSAGE); //messagetype
    }
    private void SenderTableData(List<Object[]> tableData){
        
        for (int i = 0; i < tableData.size(); i++) {
                Object[] row = tableData.get(i);
                model.setValueAt(row[0], i, 0); // update NO.Proccess
                model.setValueAt(row[1], i, 1); // update cpu Time
                model.setValueAt(row[2], i, 2); // update Waiting Time
                model.setValueAt(row[3], i, 3); // update Turnaround Time
                if(model.getColumnCount() == 5){
                    model.setValueAt(row[4],i, 4);
                }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProcessInTable;
    private javax.swing.JComboBox<String> AlgorithmList;
    private javax.swing.JTextField CPUTime;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField NumberProcess;
    private javax.swing.JTextField QuantumTimeField;
    private javax.swing.JPanel Right;
    private javax.swing.JButton RunAlgorithm;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stateofProcess;
    // End of variables declaration//GEN-END:variables
}
