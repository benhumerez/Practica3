package Generecidad.ejercicio1.java;

public class Caja<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}
