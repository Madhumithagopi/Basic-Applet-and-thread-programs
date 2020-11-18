import java.applet.*;

import java.awt.event.*;

import java.awt.*;

public class Calc extends Applet implements ActionListener

{

int Conclusion=0;

Label l1,l2,l3;

Button b1,b2,b3,b4;

TextField t1,t2,t3;

public void init()

{

l1=new Label("Input 1");

l2=new Label("Input 2");

l3=new Label("Output");

b1=new Button("ADD");

b2=new Button("SUB");

b3=new Button("MULTIPLY");

b4=new Button("DIVIDE");

t1=new TextField(10);

t2=new TextField(10);

t3=new TextField(10);

l1.setBackground(new Color(150,150,150));

l2.setBackground(new Color(150,150,150));

l3.setBackground(new Color(150,150,150));

l1.setBounds(100,100,100,25);

l2.setBounds(100,150,100,25);

l3.setBounds(100,200,100,25);

t1.setBounds(220,100,100,25);

t2.setBounds(220,150,100,25);

t3.setBounds(220,200,100,25);

b1.setBounds(100,300,100,25);

b2.setBounds(200,300,100,25);

b3.setBounds(300,300,100,25);

b4.setBounds(400,300,100,25);

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

b4.addActionListener(this);

add(l1);
add(t1);

add(l2);
add(t2);

add(l3);




add(t3);

add(b1);

add(b2);

add(b3);

add(b4);

}

public void actionPerformed(ActionEvent e)

{

if(e.getSource()==b1)

{

Conclusion=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
t3.setText(String.valueOf(Conclusion));

}



if(e.getSource()==b2)
{

Conclusion=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
t3.setText(String.valueOf(Conclusion));

}



if(e.getSource()==b3)
{

Conclusion=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
t3.setText(String.valueOf(Conclusion));

}


if(e.getSource()==b4)
{

Conclusion=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
t3.setText(String.valueOf(Conclusion));

}
}

}

//<applet code="Calc" width=400 height=400></applet>
