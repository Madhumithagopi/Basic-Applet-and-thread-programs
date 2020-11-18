import java.applet.*;

import java.awt.*;

import java.awt.event.*;


public class oddeven extends java.applet.Applet implements ActionListener

{


	TextField t1,t2;

	int m;
	
Button b1;

	String msg;
	
Label l1,l2;
	
oddeven e;

	public void init()
	
{	
e=this;
		
t1=new TextField(3);

		t2=new TextField(10);
	
	b1=new Button("FIND odd or even");

		l1=new Label("ENTER THE NUMBER");

		l2=new Label("RESULT");
		
add(l1);	
	
	add(t1);
	
	add(l2);
	
	add(t2);
		
add(b1);
		
b1.addActionListener(this);
 

	}
 
	
public void actionPerformed(ActionEvent ae)

	{
		
String str=t1.getText();

		if(str!="")

		{
		
int num=Integer.parseInt(str);

		if(num%2==0)
	
	msg=num+ " is even";
	
	else
		
msg=num+ " is odd";
	
	t2.setText(msg);
	
	
		}
 
	
}
}
/*<applet code=oddeven width=400 height=400></applet>*/
