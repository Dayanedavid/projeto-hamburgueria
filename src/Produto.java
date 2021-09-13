public class Produto {
    //Produtos possiveis: sanduiches,refri,salada,batata
    private String nome;
    private String tipo;
    private String tamanho;
    private double valor;

    // Construtor: define o estado inicial da classe => valores iniciais dos atributos
    public Produto(){
        this.setNome("");
        this.setTipo("");
        this.setTamanho("");

    }

    //construtor de atribução
    public Produto(String name,String tipo, String tamanho, double valor){
        this.setNome(nome);
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
