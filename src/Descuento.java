public abstract class Descuento {
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    private float valor;

    public abstract float obtenerDescuento(float valorBase);

    public abstract float obtenerValorFinal(float valorBase);
}
