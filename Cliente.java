import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué carro deseas fabricar? (Hyundai o Ferrari)");
        String tipoCarro = scanner.nextLine();

        System.out.println("¿Qué tipo de llantas deseas? (Michellin o Corsa)");
        String tipoLlantas = scanner.nextLine();

        System.out.println("¿Qué tipo de radio deseas? (Sony o Kadio)");
        String tipoRadio = scanner.nextLine();

        FabricaDeCarros fabrica;
        Carro carro;

        if (tipoCarro.equalsIgnoreCase("Hyundai")) {
            fabrica = new FabricaHyundai();
        } else if (tipoCarro.equalsIgnoreCase("Ferrari")) {
            fabrica = new FabricaFerrari();
        } else {
            System.out.println("Carro no válido.");
            scanner.close();
            return;
        }

        carro = fabrica.crearCarro(tipoLlantas, tipoRadio);

        System.out.println("¿Qué deseas hacer? (encender, acelerar, apagar)");
        String accion = scanner.nextLine();

        if (accion.equalsIgnoreCase("encender")) {
            System.out.println("Tu carro " + tipoCarro + " está encendido con llantas " + tipoLlantas + " y está reproduciendo tu canción favorita en el radio " + tipoRadio);
        } else if (accion.equalsIgnoreCase("acelerar")) {
            System.out.println("Tu carro " + tipoCarro + " está acelerando con llantas " + tipoLlantas + " y está reproduciendo tu canción favorita en el radio " + tipoRadio);
        } else if (accion.equalsIgnoreCase("apagar")) {
            System.out.println("Tu carro " + tipoCarro + " está apagado");
        } else {
            System.out.println("Acción no válida.");
        }

        scanner.close();
    }
}
