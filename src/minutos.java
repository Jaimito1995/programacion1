import javax.swing.*;

public class minutos {
    public static void main(String args[]){
        double tarjeta = Double.parseDouble(JOptionPane.showInputDialog("ingrese valor de la tarjeta"));
        double suma = (tarjeta*0.20);
        double suma2 = (tarjeta+suma);
        double minutos = (tarjeta*60);
        double total = ((tarjeta/60)/60);
        JOptionPane.showMessageDialog(null,"el valor de la tarjeta con el 20% es" + suma2);
        JOptionPane.showMessageDialog(null,"minutos por el valor de la tarjeta" + minutos);
        JOptionPane.showMessageDialog(null,"valor del minuto" + total);
    }
}
