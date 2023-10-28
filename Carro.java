public class Carro {
    String marca;
    String tipoLlantas;
    String tipoRadio;

    public Carro(String marca, String tipoLlantas, String tipoRadio) {
        this.marca = marca;
        this.tipoLlantas = tipoLlantas;
        this.tipoRadio = tipoRadio;
    }

    public void encender() {
        System.out.println("Encendiendo el carro " + marca);
    }

    public void acelerar() {
        System.out.println("Acelerando el carro " + marca + " con llantas " + tipoLlantas + " y reproduciendo tu canción favorita en el radio " + tipoRadio);
    }

    public void apagar() {
        System.out.println("Apagando el carro " + marca);
    }
}
