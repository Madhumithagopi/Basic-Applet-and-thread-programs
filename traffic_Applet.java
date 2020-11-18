import java.awt.*;
import java.applet.*;

/*
<applet code="traffic" width=300 height=500>
</applet>
*/
public class traffic extends Applet implements Runnable
  {
     int r=1,gr=0,y=0;
     Thread th;
     public void init()
       {
          setBackground(Color.cyan);
          setForeground(Color.red);
       }
     public void start()
       {
          th=new Thread(this);
          th.start();
       }
     public void run()
       {
         
         while (true)
          {
            try
             {
               if (r==1)
                {
                  r=0;
                  y=1;
                  gr=0;
                }
               else if (y==1)
                {
                  r=0;
                  y=0;
                  gr=1;
                }
               else if (gr==1)
                {
                  r=1;
                  y=0;
                  gr=0;
                }
              th.sleep(1500);
            }
           catch(Exception e) { }
           repaint();
          }
        }
    public void paint(Graphics g)
      {
         g.setColor(Color.black);
         g.fillRoundRect(350,100,90,210,50,50); 
         g.fillRect(385,300,20,10);
         if(r==1 && y==0 && gr==0)
          {
            g.setColor(Color.red);
            g.fillOval(370,120,50,50);
            g.drawString("STOP!",450,150);
            g.setColor(Color.white);
            g.fillOval(370,180,50,50);
            g.fillOval(370,240,50,50);
          }
       else if(r==0 && y==1 && gr==0)
          {
            g.setColor(Color.yellow);
            g.fillOval(370,180,50,50);
            g.drawString("Ready!",450,210);
            g.setColor(Color.white);
            g.fillOval(370,120,50,50);
            g.fillOval(370,240,50,50);
          }
       else if(r==0 && y==0 && gr==1)
          {
            g.setColor(Color.green);
            g.fillOval(370,240,50,50);
            g.drawString("Go!",450,270);
            g.setColor(Color.white);
            g.fillOval(370,120,50,50);
            g.fillOval(370,180,50,50);
          }
      }
   }
