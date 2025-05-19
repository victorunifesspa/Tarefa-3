package Q2;

import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    //Molde criação de curso
    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    // Molde método
    public void adicionarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void Detalhamento() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores:");
        if (instrutores.isEmpty()) //.isEmpty => verifica se a string está vazia
        {
            System.out.println("Nenhum instrutor ministra esse curso.");
        } else {
            for (Instrutor instrutor : instrutores) {
                System.out.println("  " + instrutor.getNome() + " (" + instrutor.getFormacao() + ", " + instrutor.getExperiencia() + " anos de experiência)");
            }
        }
    }
}

// Classe que representa um instrutor
class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int Experiencia;

    public Instrutor(String nome, String formacao, String email, int Experiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.Experiencia = Experiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEmail() {
        return email;
    }

    public int getExperiencia() {
        return Experiencia;
    }
}

// Classe principal para execução do sistema
public class Q2 {
    public static void main(String[] args) {
        // instrutores
        Instrutor instrutor1 = new Instrutor("Adriano Bezerra", "Mestre em Engenharia Biomédica", "adriano.bezerra@gmail.com", 12);
        Instrutor instrutor2 = new Instrutor("Carla Dutra", "Graduada em Bioengenharia", "carla.dutra@gmail.com", 8);
        Instrutor instrutor3 = new Instrutor("Eduarda Ferreira", "Doutora em Engenharia Biomédica", "eduarda.ferreira@gmail.com", 3);

        // cursos
        Curso curso1 = new Curso("Introdução à Engenharia Biomédica", 40, "Básico", "Visão geral dos princípios e aplicações da engenharia biomédica.");
        Curso curso2 = new Curso("Processamento de Sinais Biomédicos", 60, "Superior", "Análise e processamento de sinais fisiológicos para aplicações médicas.");

        // Associando
        curso1.adicionarInstrutor(instrutor1);
        curso1.adicionarInstrutor(instrutor2);
        curso2.adicionarInstrutor(instrutor2);
        curso2.adicionarInstrutor(instrutor3);

        System.out.println("\nCurso 1:");
        curso1.Detalhamento();

        System.out.println("\nCurso 2:");
        curso2.Detalhamento();
    }
}
