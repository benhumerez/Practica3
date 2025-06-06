package Generecidad.ejercicio3.java;
import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrar() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
