import javax.swing.JOptionPane;

public class PrincipalLetras {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra en minúsculas:");

        ProcesadorTexto procesador = new ProcesadorTexto();
        int vocales = procesador.contarVocales(palabra);
        int consonantes = procesador.contarConsonantes(palabra);

        JOptionPane.showMessageDialog(null, "La palabra '" + palabra + "' tiene:\n" +
                vocales + " vocales\n" + consonantes + " consonantes");
    }
}