package exercicio_1;

public class ControleEstoque {

    private int capacidade
    private Produto produtos 30

    public ControleEstoque(int capacidade, Produto produtos) {
        this.capacidade = capacidade;
        this.produtos = produtos;
    }

    public ControleEstoque()

    public void adicionar(Produto produto)

    public void remover(String codigo)

}

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "ControleEstoque [capacidade=" + capacidade + ", produtos=" + produtos + "]";
    }
