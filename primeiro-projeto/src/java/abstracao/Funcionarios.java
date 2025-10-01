
// Pacote onde a classe está
package abstracao;

// A classe Funcionarios agora:
// - herda (extends) de Endereco → ganha todos os atributos e métodos de Endereco.
// - implementa (implements) Pessoa → é obrigada a implementar os métodos da interface.
public class Funcionarios extends Endereco implements Pessoa {

    // =========================
    // ATRIBUTOS ESPECÍFICOS
    // =========================
    private String nome;       // Nome do funcionário
    private String documento;  // Documento do funcionário (CPF, RG etc.)
    private String cargo;      // Cargo do funcionário (ex.: Gerente, Vendedor...)

    // =========================
    // CONSTRUTOR
    // =========================
    // Recebe todos os dados do endereço (usando super)
    // + os dados próprios do funcionário.
    public Funcionarios(String rua, String cidade, String numero, String estado, String cep,
                        String nome, String documento, String cargo) {
        // Chama o construtor da classe Endereco (classe pai)
        super(rua, cidade, numero, estado, cep);

        // Inicializa os atributos específicos de Funcionarios
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    // =========================
    // MÉTODOS OBRIGATÓRIOS (da interface Pessoa)
    // =========================

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // =========================
    // MÉTODOS EXTRAS (próprios da classe Funcionarios)
    // =========================

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
