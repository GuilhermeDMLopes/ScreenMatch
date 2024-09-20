package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

//Usando Herança (extends)
//Usando iterface (implements). Toda interface deve ser obrigatorio o uso de seus metodos
public class Filme extends Titulo implements Classificavel {
    /* Tudo isso será Herdade da classe titulo a partir de agora
    //Atributos de filme (Caracteristica comum para todos)
    //Encapsulamento (private). Tambem conhecido como modificador de acesso. Não permite que o usuario altere informações indevidas.
    //Quando criamos instancias da classe em pacotes diferentes, preciso explicitar o que é publico, privado, etc.
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Metodo acessor para pegar valores de atributos privados
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Métodos. Ações que todos os filmes fazem
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }*/

    //Criando construtores
/*
    public Filme() {

    }
*/

   /* public Filme(String nome) {
        this.setNome(nome);
    }*/

    //Novo construtor seguindo Titulo
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    //Atributos específicos de Filme
    private String diretor;

    //(Alt+fn+Insert) para getters e setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClaffificacao() {
        return (int) pegaMedia() / 2;
    }

    //Reescrevendo o toString para personalizar nossa saida do ArrayList.toString()
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
