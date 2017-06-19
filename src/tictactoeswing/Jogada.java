package tictactoeswing;

public class Jogada {
    private boolean jogador1;
    private boolean jogador2;
    private String botao;
    private boolean novoJogo;

    public boolean isJogador1() {
        return jogador1;
    }

    public void setJogador1(boolean jogador1) {
        this.jogador1 = jogador1;
    }

    public boolean isJogador2() {
        return jogador2;
    }

    public void setJogador2(boolean jogador2) {
        this.jogador2 = jogador2;
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
