import javax.swing.JOptionPane;

public class Invertircadena {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una cadena de texto:");

        ProcesadorCadena procesador = new ProcesadorCadena();
        String textoInvertido = procesador.invertirTexto(texto);

        JOptionPane.showMessageDialog(null, "Texto invertido: " + textoInvertido);
    }
}