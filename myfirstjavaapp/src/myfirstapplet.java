import javax.swing.JApplet ;
import java.awt.* ;
import java.awt.event.* ;
import java.awt.Graphics ;
import java.util.Random ;
import java.awt.Graphics2D ;

public class myfirstapplet extends JApplet implements ActionListener {

    Button bt1, bt2, bt3 ;
    int type = -1 ;
    
    public void init() {
       
    setLayout (null) ;
    
    bt1 = new Button ("Line") ;
    bt2 = new Button ("Rectangle") ;
    bt3 = new Button ("Oval") ;
    
    bt1.addActionListener(this) ;
    bt2.addActionListener (this) ;
    bt3.addActionListener (this) ;
       
    bt1.setBounds(10,20, 100, 50) ;
    bt2.setBounds(120,20, 100, 50) ;
    bt3.setBounds(230,20, 100, 50) ;
    
    bt1.setForeground(new Color(255,10,25));
    bt2.setForeground(new Color(0,255,25));
    bt3.setForeground(new Color(10,25,255));
    
    bt1.setFont(new Font("Times New Roman", Font.BOLD, 16)) ;
    bt2.setFont(new Font("Times New Roman", Font.BOLD, 16)) ;
    bt3.setFont(new Font("Times New Roman", Font.BOLD, 16)) ;
    
    add(bt1) ; add(bt2) ; add(bt3);
    }
    
public void actionPerformed(ActionEvent er)
    {
    Button ref ;
    ref = (Button)er.getSource() ;
    if (ref == bt1)
        type=1 ;
    else 
        if(ref == bt2)
        type=2 ;
    else 
        type=3 ;
    }

    public void paint(Graphics gr)
    {
        int[] array = new int[6];
        array[0] = 398;
        array[0] = 453;
        array[1] = 192;
        array[1] = 252;
        array[2] = 100;
        array[2] = 137;
        int x1;
        int x2;
        int y1;
        int y2;
       
    if (type == 1)
        gr.drawLine(50, 65, 90, 150) ;
    else 
    if (type == 2)
        gr.drawRect(100, 65, 90, 190) ;
    else 
    if (type == 3)
        //gr.drawOval(150, 65, 90, 175)  ;
     
    /*for (int i = 0; i <= 100000; i++) {
      Dimension size = getSize();
      int w = size.width ;
      int h = size.height;
      Random r = new Random();
      int x = Math.abs(r.nextInt()) % w;
      int y = Math.abs(r.nextInt()) % h;
    */
     
    for(int i = 0; i < 2; ++i) 
    {
        x1= array[i];
        y1= array[i+1];
        x2= array[i];
        y2=array[i+1];
        gr.drawLine (x1,y1,x2,y2 ); 

    }
}
}
      

