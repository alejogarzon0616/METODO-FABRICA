public class FabricaHyundai implements FabricaDeCarros {
    @Override
    public Carro crearCarro(String tipoLlantas, String tipoRadio) {
        return new Hyundai(tipoLlantas, tipoRadio);
    }
}
