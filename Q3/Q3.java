package Q3;

import java.util.Scanner;

class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoMemoriaSuportada;

    public PlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoriaSuportada) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoMemoriaSuportada = tipoMemoriaSuportada;
    }

    public void exibirInformacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Número de Slots: " + numeroSlots);
        System.out.println("Tipo de Memória Suportada: " + tipoMemoriaSuportada);
    }
}

class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRAM, PlacaMae placaMae) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Placa Mãe:");
        placaMae.exibirInformacoes();
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Computador");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Processador: ");
        String processador = scanner.nextLine();
        System.out.print("Memória RAM (GB): ");
        int memoriaRAM = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n--- Placa Mãe do Computador ---");
        System.out.print("Fabricante: ");
        String fabricantePlacaMae = scanner.nextLine();
        System.out.print("Chipset: ");
        String chipset = scanner.nextLine();
        System.out.print("Número de Slots: ");
        int numeroSlots = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de Memória Suportada: ");
        String tipoMemoriaSuportada = scanner.nextLine();

        PlacaMae placaMae = new PlacaMae(fabricantePlacaMae, chipset, numeroSlots, tipoMemoriaSuportada);
        Computador computador = new Computador(marca, modelo, processador, memoriaRAM, placaMae);

        System.out.println("\n--- Informações do Computador ---");
        computador.exibirInformacoes();

        scanner.close();
    }
}
