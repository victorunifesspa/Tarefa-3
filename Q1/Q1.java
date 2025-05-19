package Q1;

import java.util.List;
import java.util.ArrayList;

// Carro
class Carro {
    private String modelo;
    private Pessoa motoristaAtual;

    // Estabelecendo molde de carros (modelos)
    public Carro(String modelo) {
        this.modelo = modelo;
        this.motoristaAtual = null;
    }

    public String getModelo() {
        return modelo;
    }

    public Pessoa getMotoristaAtual() {
        return motoristaAtual;
    }

    public void setMotoristaAtual(Pessoa motorista) {
        this.motoristaAtual = motorista;
    }

    public void dirigir() {
        // Comportamento de dirigir o carro
    }
}

class Pessoa {
    private String nome;
    private List<Carro> carrosDirigidos;

    // Estabelecendo molde de pessoas
    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosDirigidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarrosDirigidos() {
        return carrosDirigidos;
    }

    // Abaixo, verificação se o carro está disponível. Caso esteja, setta a pessoa que chamou o método como nova motorista do veículo
    public void usarCarro(Carro carro) {
        if (carro.getMotoristaAtual() == null)
        {
            carro.setMotoristaAtual(this);
            this.carrosDirigidos.add(carro); //Adiciona o carro à lista de dirigidos correspondente
        }
        else {
            System.out.println("Operação inválida para " + this.getNome() + ", " +carro.getModelo() + " atualmente dirigido por "+carro.getMotoristaAtual().getNome());
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Criação de modelos
        Carro carro1 = new Carro("Astra");
        Carro carro2 = new Carro("Brasília");

        // Criação de pessoas
        Pessoa pessoa1 = new Pessoa("Amanda");
        Pessoa pessoa2 = new Pessoa("Beatriz");
        Pessoa pessoa3 = new Pessoa("Carlos");

        // pessoa1 usa carro1
        pessoa1.usarCarro(carro1);
        System.out.println(pessoa1.getNome() + " começou a dirigir o " + carro1.getModelo() + ".");
        System.out.println(carro1.getModelo() + " agora é dirigido por: " + carro1.getMotoristaAtual().getNome());
        System.out.println();

        // pessoa2 tenta usar o carro1, mas já está em uso:
        pessoa2.usarCarro(carro1);

        System.out.println();

        // pessoa3 usa o carro2
        pessoa3.usarCarro(carro2);
        System.out.println(pessoa3.getNome() + " começou a dirigir o " + carro2.getModelo() + ".");
        System.out.println(carro2.getModelo() + " agora é dirigido por: " + carro2.getMotoristaAtual().getNome());

        System.out.println();

        // Exibindo os carros dirigidos por cada pessoa
        System.out.println("Carros dirigidos por " + pessoa1.getNome() + ":");
        for (Carro carro : pessoa1.getCarrosDirigidos()) {
            System.out.println("- " + carro.getModelo());
        }

        System.out.println("\nCarros dirigidos por " + pessoa2.getNome() + ":");
        for (Carro carro : pessoa2.getCarrosDirigidos()) {
            System.out.println("- " + carro.getModelo());
        }

        System.out.println("\nCarros dirigidos por " + pessoa3.getNome() + ":");
        for (Carro carro : pessoa3.getCarrosDirigidos()) {
            System.out.println("- " + carro.getModelo());
        }
    }
}