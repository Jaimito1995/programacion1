import javax.swing.*;

public class profesor {
    public static void main(String args[]){
        int horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas laboradas"));
        int multi = (horas*30000);
        double desc = (multi-0.05);
        JOptionPane.showMessageDialog(null,"el valor a ganar por hora es" + multi);
        JOptionPane.showMessageDialog(null,"el valor a ganar ya con descuento" + desc);

    }
}
