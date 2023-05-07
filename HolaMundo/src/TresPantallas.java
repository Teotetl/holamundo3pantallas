import javax.swing.*;

public class TresPantallas {

    public static void main(String[] args) {
        // Pantalla 1 con botón
        JFrame pantalla1 = new JFrame("Pantalla 1");
        pantalla1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla1.setSize(300, 200);

        JPanel panel1 = new JPanel();
        pantalla1.add(panel1);

        JButton boton = new JButton("Haz clic aquí");
        boton.addActionListener(e -> JOptionPane.showMessageDialog(null, "¡Hola mundo!"));
        panel1.add(boton);

        pantalla1.setVisible(true);

        // Pantalla 2 con nombre
        JFrame pantalla2 = new JFrame("Pantalla 2");
        pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla2.setSize(300, 200);

        JPanel panel2 = new JPanel();
        pantalla2.add(panel2);

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        JLabel etiqueta = new JLabel("¡Hola " + nombre + "!");
        panel2.add(etiqueta);

        pantalla2.setVisible(true);

        // Pantalla 3 con mensaje "Hola mundo"
        JFrame pantalla3 = new JFrame("Pantalla 3");
        pantalla3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla3.setSize(300, 200);

        JPanel panel3 = new JPanel();
        pantalla3.add(panel3);

        JLabel etiqueta2 = new JLabel("¡Hola mundo!");
        panel3.add(etiqueta2);

        pantalla3.setVisible(true);
    }
}
