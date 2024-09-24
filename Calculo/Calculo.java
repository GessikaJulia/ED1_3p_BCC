package Calculo;

import javax.swing.JOptionPane;

public class Calculo {
    public static void main(String[] args) {
        String s;
        Num number = New Num();
        
        s= JOptionPane.showInputDialog("Entre com o valor:");
        number.fNum = Float.parseFloat(s);

            if(number.fNum>20){
                number.fMet = number.fNum /2;
                System.out.println("A metade do numero eh"+number);
                JOptionPane.showMessageDialog(null, "A metade do numero eh"+number.fMet);
            }
    }
}
