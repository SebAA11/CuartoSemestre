class ProcesadorTexto {
    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (esVocal(c)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarConsonantes(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (esConsonante(c)) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private boolean esConsonante(char c) {
        return c >= 'a' && c <= 'z' && !esVocal(c);
    }
}