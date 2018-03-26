import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
public class StoreImage extends javax.swing.JFrame {
Connection connection=null;
PreparedStatement ps=null;
ResultSet rs=null;
String filePath=null;

public StoreImage() {

initComponents();
initConnection();
setSize(600,500);
}

public void retriveImage()
{
try
{
String val=jTextField1.getText();
if(val.length()>0)
{
ps=connection.prepareStatement("select * from image where id=?");
ps.setObject(1, val);
rs=ps.executeQuery();
byte b[] = null;
while(rs.next())
{
b= rs.getBytes(2);
}

jLabel6.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));


}else
{
JOptionPane.showMessageDialog(this,"Please enter EmployeeNo..." );
}


}catch(Exception e)
{

}
}

//1048576 Size limit allowed for Image storage in MySQL.
public void storeImage()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/finance", "root", "");
JFileChooser chooser=new JFileChooser(new File("F:\\"));
  
chooser.setMultiSelectionEnabled(false);
chooser.setVisible(true);

chooser.showOpenDialog(this);

File file=chooser.getSelectedFile();
if(file!=null){filePath=file.getPath();}
if(filePath!=null){

jLabel6.setIcon(new ImageIcon(filePath));
} 


if(filePath!=null && check())
{
ps=connection.prepareStatement("insert into image values(?,?)");
FileInputStream fileInputStream=new FileInputStream(filePath);
byte b[]=new byte[fileInputStream.available()];
fileInputStream.read(b);
fileInputStream.close();
ps.setObject(1, jTextField1.getText());
ps.setBytes(2, b);
int val=ps.executeUpdate();
if(val>=1)JOptionPane.showMessageDialog(this, "Succesfully Stored...");
else
JOptionPane.showMessageDialog(this, "Error in storage...");

}
else
{
JOptionPane.showMessageDialog(this,"Please select an Image of type .jpeg/gif/jpg...");
}

}catch(Exception e)
{

JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
}
}

public void initConnection()
{
try
{

Class.forName("com.mysql.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/finance", "root", "");
System.out.println("Connection Established Succcesfully...");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this, e.getMessage());
}
}

  
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jTextField1 = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
jLabel6 = new javax.swing.JLabel();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
getContentPane().setLayout(null);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
jLabel1.setText("Store/Retive Image From MySQL");
getContentPane().add(jLabel1);
jLabel1.setBounds(90, 30, 220, 14);

jLabel2.setText("ID :");
getContentPane().add(jLabel2);
jLabel2.setBounds(60, 90, 18, 14);

jLabel3.setText("Select an Image :");
getContentPane().add(jLabel3);
jLabel3.setBounds(40, 130, 100, 14);

jButton1.setText("Browse");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
getContentPane().add(jButton1);
jButton1.setBounds(150, 123, 100, 30);

jButton3.setText("Show");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});
getContentPane().add(jButton3);
jButton3.setBounds(130, 213, 80, 30);
getContentPane().add(jTextField1);
jTextField1.setBounds(150, 80, 90, 20);

jLabel5.setForeground(new java.awt.Color(255, 0, 0));
getContentPane().add(jLabel5);
jLabel5.setBounds(40, 170, 240, 30);

jScrollPane1.setViewportView(jLabel6);

getContentPane().add(jScrollPane1);
jScrollPane1.setBounds(330, 70, 210, 160);

pack();
  }  

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
  storeImage();  
} 

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
retriveImage(); 
} 

public static void main(String args[]) {
   new StoreImage().setVisible(true);
}


// Variables declaration - do not modify
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton3;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextField jTextField1;
// End of variables declaration 

private boolean check() {
if(filePath!=null) 
{
if(filePath.endsWith(".jpeg")||filePath.endsWith(".gif")||filePath.endsWith(".jpg")||filePath.endsWith(".JPEG")||filePath.endsWith(".GIF")||filePath.endsWith(".JPG"))
{
return true;
}
return false;
}
return false;
}
}

