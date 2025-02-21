import javax.swing.JOptionPane;

public class Operaciones {
    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            String menu = "Seleccione una operación:\n" +
                          "1. Suma\n" +
                          "2. Resta\n" +
                          "3. Multiplicación\n" +
                          "4. División\n" +
                          "5. Salir\n";

            String opcionStr = JOptionPane.showInputDialog(menu);

            if (opcionStr == null) {
                break;
            }

            int opcion;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.");
                continue;
            }

            if (opcion == 5) {
                continuar = false;
                break;
            }

            String num1Str = JOptionPane.showInputDialog("Ingrese el primer número:");
            String num2Str = JOptionPane.showInputDialog("Ingrese el segundo número:");

            double num1, num2;
            try {
                num1 = Double.parseDouble(num1Str);
                num2 = Double.parseDouble(num2Str);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos válidos.");
                continue;
            }

            double resultado = 0;
            String operacion = "";

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    operacion = "Suma";
                    break;
                case 2:
                    resultado = num1 - num2;
                    operacion = "Resta";
                    break;
                case 3:
                    resultado = num1 * num2;
                    operacion = "Multiplicación";
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        continue;
                    }
                    resultado = num1 / num2;
                    operacion = "División";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Resultado de la " + operacion + ": " + resultado);
        }

        JOptionPane.showMessageDialog(null, "Calculadora cerrada. ¡Hasta luego!");
    }
}

