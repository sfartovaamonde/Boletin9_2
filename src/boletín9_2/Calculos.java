
package boletín9_2;

import javax.swing.JOptionPane;


public class Calculos {
   // int numero1;
    //int numero2;
   
    public void amosarCalculos(){
        int numero1;
       
        int numero2;
       
        numero1=lerNum1();
        numero2=lerNum2();
        do{
          //System.out.println("la suma es: " + numero1+numero2);
          //System.out.println(" el producto es: "+ numero1*numero2);
          JOptionPane.showInputDialog(null, "la suma es: "+( numero1 + numero2));
          JOptionPane.showInputDialog(null," el producto es: "+ numero1*numero2);
          JOptionPane.showInputDialog("FIN");
          break;
        }while(numero1<90&numero1>10&numero2<90&numero2>10);
        
   }
  
    public int lerNum1(){
        int numero1=Integer.parseInt(JOptionPane.showInputDialog(" introduce un número "));
        return numero1;
    }
    public int lerNum2(){
        int numero2=Integer.parseInt(JOptionPane.showInputDialog(" introduce un número "));
        return numero2;
    }
}
