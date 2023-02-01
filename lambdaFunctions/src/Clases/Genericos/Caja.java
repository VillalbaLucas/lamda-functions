package Clases.Genericos;

public class Caja<T, V> {

    private T t;
    private V v;

    private Caja(T t, V v) {
        this.t = t;
        this.v = v;
    }

    private Caja(){}

    
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public V getV() {
        return v;
    }
    public void setV(V v) {
        this.v = v;
    }

    
    
}
