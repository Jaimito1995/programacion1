import javax.swing.*;

public class sueldo {
    public static void main(String args[]){
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese el sueldo"));
        double descuento1 = (sueldo*0.04/100);
        double descuento2 = (sueldo*0.05/100);
        double descuento3 = (sueldo*0.07/100);
        double totaldescuento = (sueldo/0.16/100);
        JOptionPane.showMessageDialog(null,"el valor a pagar descontando el 4% es" + descuento1);
        JOptionPane.showMessageDialog(null,"el valor a pagar descontando el 5% es" + descuento2);
        JOptionPane.showMessageDialog(null,"el valor a pagar descontando el 7% es" + descuento3);
        JOptionPane.showMessageDialog(null,"el valor a pagar descontando el total es" + totaldescuento);
    }
}
