
public class MenuItem {

    private String nome;
    private String descricao;
    private boolean vegetariano;
    private double preco;

    public MenuItem(String nome, String descricao, boolean vegetariano, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.vegetariano = vegetariano;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "MenuItem [nome=" + nome + ", descricao=" + descricao + ", vegetariano=" + vegetariano + ", preco="
                + preco + "]";
    }

}
