package tictactoeswing;

public class Jogada {
    private String jogador;
    private String botao;
    private boolean novoJogo;

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getBotao() {
        return botao;
    }

    public void setBotao(String botao) {
        this.botao = botao;
    }

    public boolean getNovoJogo() {
        return novoJogo;
    }

    public void setNovoJogo(boolean novoJogo) {
        this.novoJogo = novoJogo;
    }
}
