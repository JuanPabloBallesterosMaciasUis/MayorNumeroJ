package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        /*Declaración 
         * de
         * variables
         */
        int x;
        int y;
        int z;
        
        // input
        x = Integer.parseInt(JOptionPane.showInputDialog("Dijite x: "));

        y = Integer.parseInt(JOptionPane.showInputDialog("Dijite y: "));

        z = Integer.parseInt(JOptionPane.showInputDialog("Dijite z: "));

        // processsing
        if (x > y && x > z)  
        {
            JOptionPane.showMessageDialog(null,"El numero mayor es "+ x ,
            "Número mayor",
            JOptionPane.PLAIN_MESSAGE);
        }

        else if (y > x && y > z )
        {
            
            JOptionPane.showMessageDialog(null,"El numero mayor es "+ y ,
            "Número mayor",
            JOptionPane.PLAIN_MESSAGE);
        }

        else 
        {  
            JOptionPane.showMessageDialog(null,"El numero mayor es "+ z ,
            "Número mayor",
            JOptionPane.PLAIN_MESSAGE);
        }
    


        //Fin
        System.exit(0);
    }
}