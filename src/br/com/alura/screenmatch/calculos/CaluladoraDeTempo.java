//Pacote responsável por cuidar dos calculos existentes no nosso projeto
package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CaluladoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //ctrl + / comenta tudo
//    //Incluindo filme que quero somar
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    //Incluindo serie que quero somar
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Ctrl + Alt + o resolve os imports
    //Para não ficar criando metodos repetidos para cada Classe, usamos a super classe.
    //Isso se chama polimorfismo pois Filme e Serie tambem podem ser chamados de Titulo (Classe mae)
    public void inclui(Titulo titulo) {
        //Polimorfismo reconhece o que adicionar de acordo com o parametro
        //System.out.println("Adicionando duração de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
