
package activity3;
import javax.swing.JOptionPane;
public class Binaryandlinearsearch extends javax.swing.JFrame {

    public Binaryandlinearsearch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        linear = new javax.swing.JButton();
        binary = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertsorting = new javax.swing.JButton();
        bubblesorting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1.setBackground(new java.awt.Color(255, 255, 255));
        jpanel1.setLayout(null);

        header.setBackground(new java.awt.Color(51, 102, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BINARY AND LINEAR SEARCH");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel7)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpanel1.add(header);
        header.setBounds(0, 0, 790, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        linear.setText("LINEAR");
        linear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linearActionPerformed(evt);
            }
        });

        binary.setText("BINARY");
        binary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryActionPerformed(evt);
            }
        });

        jLabel1.setText("Search for any number on this set{10, 56, 89, 42, 63, 1, 9, 7, 5, 23}");

        insertsorting.setText("Insertion Sorting");
        insertsorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertsortingActionPerformed(evt);
            }
        });

        bubblesorting.setText("Bubble Sorting");
        bubblesorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubblesortingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(binary, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bubblesorting)
                                        .addGap(166, 166, 166)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(linear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertsorting))))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binary, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bubblesorting)
                    .addComponent(insertsorting))
                .addGap(40, 40, 40))
        );

        jpanel1.add(jPanel1);
        jPanel1.setBounds(0, 60, 780, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linearActionPerformed
String inputs = search.getText();
        jLabel1.setText("Linear Search Processing...Search for any number on this set{10, 56, 89, 42, 63, 1, 9, 7, 5, 23}");
        int[] num = {10, 56, 89, 42, 63, 1, 9, 7, 5, 23};
        int index = -1;
        boolean found = false;
        
        for (int i = 0; i < num.length; i++){
            if (String.valueOf(num[i]).equals(inputs)){
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            jLabel2.setText("Checking index... INDEX FOUND "+index);
            jLabel3.setText("Index " + index + ", array " + index + " = " + inputs + " ANS. YES");
        } else {
            jLabel2.setText("Checking index... NO INDEX FOUND");
            jLabel3.setText("Number not found in the array");
        }
    }//GEN-LAST:event_linearActionPerformed

    private void binaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryActionPerformed
String inputs = search.getText();
jLabel1.setText("Binary Search Processing...Search for any number on this set{10, 56, 89, 42, 63, 1, 9, 7, 5, 23}");
jLabel4.setText(""); // reset jLabel4
jLabel5.setText(""); // reset jLabel5
jLabel6.setText(""); // reset jLabel6

int[] num = {1, 5, 7, 9, 10, 23, 42, 56, 63, 89}; // sort the array when initializing
int index = -1;
boolean found = false;
int low = 0;
int high = num.length - 1;

while (low <= high){
    int mid = (low + high)/2;
    jLabel4.setText("Checking mid index..."+mid);
    if(String.valueOf(num[mid]).equals(inputs)){
        index = mid;
        found = true;
        break;
    }else if(Integer.parseInt(inputs) < num[mid]){
        jLabel5.setText("Value is less than mid, moving high to..."+mid);
        high = mid - 1; // update high
    }else if(Integer.parseInt(inputs) > num[mid]){
        jLabel5.setText("Value is higher than mid, moving low to..."+mid);
        low = mid + 1; // update low
    }
}
if(found){
    jLabel6.setText("Index "+index+", array "+index+" = "+inputs+" ANS. YES");
}else{
    jLabel6.setText("Number not found in the array");
}
    }//GEN-LAST:event_binaryActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void insertsortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertsortingActionPerformed
    Insertionsorting secpage = new Insertionsorting();
    secpage.show();
    dispose();
    }//GEN-LAST:event_insertsortingActionPerformed

    private void bubblesortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubblesortingActionPerformed
    Insertionsorting thirdpage = new Insertionsorting();
    thirdpage.show();
    dispose();
    }//GEN-LAST:event_bubblesortingActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Binaryandlinearsearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binary;
    private javax.swing.JButton bubblesorting;
    private javax.swing.JPanel header;
    private javax.swing.JButton insertsorting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JButton linear;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
