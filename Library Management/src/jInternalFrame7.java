
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravibansal
 */
public class jInternalFrame7 extends javax.swing.JInternalFrame {

    /**
     * Creates new form jInternalFrame7
     */
    public jInternalFrame7(save ob) {
        initComponents();
        String fn = JOptionPane.showInputDialog("Enter keyword of the Friend");
        Iterator<friend> f3 = ob.FriendList.iterator();
    	jTextArea1.setText("");
        while (f3.hasNext()) {
    	 friend user = f3.next();
    	  if (user.getName().contains(fn)) {
                        jTextArea1.append("Name: "+user.getName()+"\n");
    		  	jTextArea1.append("Address: "+user.getAddress()+"\n");
    		  	jTextArea1.append("Landline Number: "+user.getlandlineNumber()+"\n");
    		  	jTextArea1.append("Mobile Number: "+user.getMobileNumber()+"\n");
                    jTextArea1.append("Outstanding Books: "+"\n");
    	    	Iterator<OutstandingBooks> b1 = user.Books.iterator();
    	    	int countoutbooks=0;
    	    	while (b1.hasNext()) {
    	    		OutstandingBooks ob1 = b1.next();
    	    		jTextArea1.append(countoutbooks+1+". Title: "+ob1.getTitleOfBook()+"\n");
                        jTextArea1.append("  Date Of Issue: "+ob1.getDateOfIssue()+"\n");
    	    		countoutbooks++;
    	    	}
    	    	if(countoutbooks==0)
    	    		jTextArea1.append("No Outstanding Books are there\n");
                jTextArea1.append("#############################\n");
          }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
