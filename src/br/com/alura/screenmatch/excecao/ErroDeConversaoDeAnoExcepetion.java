package br.com.alura.screenmatch.excecao;

//Throwable é obrigatorio o uso do try catch, devemos trocar para RuntimeException
public class ErroDeConversaoDeAnoExcepetion extends RuntimeException {

    private String mensagem;

    public ErroDeConversaoDeAnoExcepetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
