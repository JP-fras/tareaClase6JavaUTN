public class DescuentoPorcentaje extends Descuento{
    @Override
    public float obtenerDescuento(float valorBase) {
        return this.getValor() * valorBase;
    }

    @Override
    public float obtenerValorFinal(float valorBase) {
        return valorBase - obtenerDescuento(valorBase);
    }
}
