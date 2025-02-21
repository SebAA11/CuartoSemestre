class ProcesadorCadena {
    public String invertirTexto(String texto) {
        StringBuilder invertido = new StringBuilder(texto);
        return invertido.reverse().toString();
    }
}