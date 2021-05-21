package programs_java;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
public class GUI{
    public static void main(String args[]) {
        File4Frm file4Frm = new File4Frm();
    }
}
 
class File4Frm extends Frame implements ActionListener {
    FileDialog sv, op;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	  TextField f1,f2,f3,f4,f10,f11;
	  JRadioButton rb1, rb2, rb3,rb4, rb5, rb6,rb7;
	  JButton button1,button2,button3;
	  TextArea area2;
	  JComboBox date,month,year,sem;
	  String dates[]= { "1", "2", "3", "4", "5","6", "7", "8", "9", "10",
			  			"11", "12", "13", "14", "15","16", "17", "18", "19", "20",
			  			"21", "22", "23", "24", "25","26", "27", "28", "29", "30",
		            	"31" };
	  String months[]= { "Jan", "feb", "Mar", "Apr","May", "Jun",
			  			"July", "Aug","Sup", "Oct", "Nov", "Dec" };
	  String years[]= { "1995", "1996", "1997", "1998",
		            "1999", "2000", "2001", "2002",
		            "2003", "2004", "2005"};
	  String Sem[]={ "1", "2", "3", "4", "5","6", "7", "8", "9", "10"};

    File4Frm() {
        super("MSC INTEGRATED STUDENT DETAILS");
        setLayout(null);
        setBackground(Color.lightGray);
        setSize(600, 300);
        setVisible(true);
        l1=new Label("Name:");
		l1.setBounds(50, 50, 60, 20);
		f1 = new TextField(15);
	    f1.setBounds(180, 50, 200, 20);
	  
		  l2=new Label("Roll Number:");
		  l2.setBounds(50, 90, 80, 20);
		  f2 = new TextField(15);
	      f2.setBounds(180, 90, 200, 20);
	      
	      l3=new Label(" Email ID:");
		  l3.setBounds(50, 130, 100, 20);
		  f3 = new TextField(40);
	      f3.setBounds(180, 130, 200, 20);
	      
	      l4=new Label(" Contact Number:");
		  l4.setBounds(50, 170, 100, 20);
		  f4 = new TextField(40);
	      f4.setBounds(180, 170, 200, 20);
	      
	      l5=new Label("DOB:");
		  l5.setBounds(50, 210, 100, 20);
		  date = new JComboBox(dates);
		  date.setBounds(180, 200, 60, 20);
		  month = new JComboBox(months);
		  month.setBounds(240, 200, 70, 20);
		  year = new JComboBox(years);
		  year.setBounds(310, 200, 100, 20);
		  
		  l6=new Label("Gender:");
		  l6.setBounds(50, 250, 100, 20);
		  rb1= new JRadioButton(" Male");
		  rb1.setBounds(180, 250, 100, 20);
		  rb2 = new JRadioButton(" Female");
		  rb2.setBounds(280, 250, 100, 20);
		  ButtonGroup bg = new ButtonGroup();
	        bg.add(rb1);
	        bg.add(rb2);
	  
	      l7=new Label("Accomodation:");
		  l7.setBounds(50, 290, 100, 20);
		  rb3= new JRadioButton(" Hosteller");
		  rb3.setBounds(180, 290, 100, 20);
		  rb4 = new JRadioButton(" Days Scholar");
		  rb4.setBounds(280, 290, 130, 20);
		  ButtonGroup bg1 = new ButtonGroup();
		     bg1.add(rb3);
		     bg1.add(rb4);
	      
		  l8=new Label("Branch:");
		  l8.setBounds(50, 330, 100, 20);
		  rb5= new JRadioButton(" CS");
		  rb5.setBounds(180, 330, 100, 20);
		  rb6 = new JRadioButton(" IT");
		  rb6.setBounds(280, 330, 100, 20);
		  rb7 = new JRadioButton("E-Media");
		  rb7.setBounds(380, 330, 100, 20);
		  ButtonGroup bg2= new ButtonGroup();
		     bg2.add(rb5);
		     bg2.add(rb6);
		     bg2.add(rb7);

		   l9=new Label("Semester:");
		   l9.setBounds(50, 370, 100, 20);
		   sem = new JComboBox(Sem);
		   sem.setBounds(180, 370, 80, 20);
		   
		   l10=new Label("Create Password:");
		   l10.setBounds(50, 410, 100, 20);
		   f10 = new TextField(15);
		   f10.setBounds(180, 410, 200, 20);
		   
		   l11=new Label("Confirm Password:");
		   l11.setBounds(50, 440, 110, 20);
		   f11 = new TextField(15);
		   f11.setBounds(180, 440, 200, 20);
		   
		   button1 = new JButton("Save");
		   button1.setBounds(50, 480, 110, 20);
		   button2 = new JButton("Don't Save");
		   button2.setBounds(150, 480, 110, 20);
		   button3 = new JButton("Close");
		   button3.setBounds(250, 480, 120, 20);
		   
		   area2=new TextArea();
		   area2.setBounds(600, 200, 600, 350);
		   
		   
	      add(l1);
	      add(f1);
	      add(l2);
	      add(f2);
	      add(l3);
	      add(f3);
	      add(l4);
	      add(f4);
	      add(l5);
	      add(date);
	      add(month);
	      add(year);
	      add(l6);
	      add(rb1);
	      add(rb2);
	      add(l7);
	      add(rb3);
	      add(rb4);
	      add(l8);
	      add(rb5);
	      add(rb6);
	      add(rb7);
	      add(l9);
	      add(sem);
	      add(l10);
	      add(f10);
	      add(l11);
	      add(f11);
		  add(button1);
		  add(button2);
		  add(button3);
		  add(area2);
        sv = new FileDialog(this, "Save", FileDialog.SAVE); 
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
 addWindowListener(new WindowAdapter() 
    {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
    } 
    
         public void actionPerformed(ActionEvent e) 
         {
         if (e.getSource() == button1) 
                 {
            sv.setVisible(true);
           try 
             {
        	   String data2
        	    = "Student Name:   "+ f1.getText()+ "\n"+
        	      "Roll Number:    "+ f2.getText()+ "\n"+
        	      "Email ID:       " + f3.getText() + "\n"+
        	      "Contact Number: " + f4.getText() + "\n"
        	     +"Date Of Birth:  "
        	      + (String)date.getSelectedItem()
        	      + "/" + (String)month.getSelectedItem()
        	      + "/" + (String)year.getSelectedItem() + "\n"
        	      +"Semester:       " + (String)sem.getSelectedItem()+"\n";
        	   area2.setText(data2);
        
        if (rb1.isSelected()) {
             area2.setText(area2.getText()+ "Gender:         "+ "Male "+ "\n");
         }
         if (rb2.isSelected()) {
             area2.setText(area2.getText()+ "Gender:         "+ "Female "+ "\n");
         }
         
         if (rb3.isSelected()) {
             area2.setText(area2.getText()+ "Accomodation:   "+ "Hosteller "+ "\n");
         }
         if (rb4.isSelected()) {
             area2.setText(area2.getText()+ "Accomodation:   "+ "Days Scholar "+ "\n");
         }
         if (rb5.isSelected()) {
             area2.setText(area2.getText()+ "Branch:         "+ "CS "+ "\n");
         }
         if (rb6.isSelected()) {
             area2.setText(area2.getText()+ "Branch:         "+ "IT "+ "\n");
         }
         if (rb7.isSelected()) {
             area2.setText(area2.getText()+ "Branch:         "+ "E-media "+ "\n");
         }
         area2.setText(area2.getText() + "Password:       "+ f11.getText()+ "\n");
         
        FileWriter fw= new FileWriter("java.txt", true);
        fw.write(area2.getText());
        fw.close();
        
        File fl = new File(sv.getDirectory(), sv.getFile());
        FileWriter fw1 = new FileWriter(fl);
        BufferedWriter bw = new BufferedWriter(fw1);
        String gt = area2.getText();
        bw.write(gt, 0, gt.length());
        bw.flush();
        fw1.close();
            } catch (Exception e1) {
            }
        }
         
      if (e.getSource() == button2) 
      {
      try 
     {
        JOptionPane.showMessageDialog(null,"The Changes Made will be lost!!",
                "MSC STUDENT DETAILS", JOptionPane.WARNING_MESSAGE);
         System.exit(0);
        }

    catch (Exception e1) {
    }
}
       if (e.getSource() == button3) 
       {
    	   int b=JOptionPane.showConfirmDialog(null,"Do You Want To Quit?"); 
    	   if(b==JOptionPane.YES_OPTION)
                System.exit(0);
 
        }
    }
}
