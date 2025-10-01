// Pacote onde a classe está organizada
package abstracao;

// Palavra-chave 'abstract' indica que esta é uma classe abstrata.
// Uma classe abstrata não pode ser instanciada diretamente (não dá pra fazer "new Endereco()").
// Ela serve como modelo/base para outras classes que vão herdar dela.
public abstract class Endereco {

    // =========================
    // ATRIBUTOS PRIVADOS
    // =========================
    // São privados (private) para aplicar o princípio do encapsulamento.
    // Isso significa que apenas a própria classe pode acessar diretamente esses atributos.
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    // =========================
    // CONSTRUTORES
    // =========================

    // Construtor vazio (padrão)
    // Permite criar um objeto Endereco (ou uma subclasse) sem passar valores de imediato.
    public Endereco() {
    }

    // Construtor com parâmetros
    // Permite criar um objeto já inicializando os atributos.
    public Endereco(String rua, String cidade, String numero, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
    }

    // =========================
    // MÉTODOS SETTERS
    // =========================
    // Usados para alterar/definir os valores dos atributos.

    public void setRua(String rua) {
        this.rua = rua; // atribui valor ao atributo 'rua'
    }

    public void setCidade(String cidade) {
        this.cidade = cidade; // atribui valor ao atributo 'cidade'
    }

    public void setNumero(String numero) {
        this.numero = numero; // atribui valor ao atributo 'numero'
    }

    public void setEstado(String estado) {
        this.estado = estado; // atribui valor ao atributo 'estado'
    }

    public void setCep(String cep) {
        this.cep = cep; // atribui valor ao atributo 'cep'
    }

    // =========================
    // MÉTODOS GETTERS
    // =========================
    // Usados para acessar os valores dos atributos.

    public String getRua() {
        return rua; // retorna o valor de 'rua'
    }

    public String getCidade() {
        return cidade; // retorna o valor de 'cidade'
    }

    public String getNumero() {
        return numero; // retorna o valor de 'numero'
    }

    public String getEstado() {
        return estado; // retorna o valor de 'estado'
    }

    public String getCep() {
        return cep; // retorna o valor de 'cep'
    }
}
