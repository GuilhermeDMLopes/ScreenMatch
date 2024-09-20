package br.com.alura.screenmatch.calculos;

//Classificar o filme com estrelas (5 estrelas por exemplo)
//Como não é possivel extender mais de uma Classe ao mesmo tempo. Filme não pode herdar titulo e classificavel ao mesmo tempo
//Usaremos Classificavel como uma Interface
public interface Classificavel {
    //Definir um metodo que eu quero que seja comum para todos que forem utilizar
    int getClaffificacao();
}
