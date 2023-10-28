public class FabricaFerrari implements FabricaDeCarros {
    @Override
    public Carro crearCarro(String tipoLlantas, String tipoRadio) {
        return new Ferrari(tipoLlantas, tipoRadio);
    }
}
