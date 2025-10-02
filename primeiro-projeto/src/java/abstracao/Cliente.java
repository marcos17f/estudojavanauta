package abstracao;

public class Cliente extends Endereco implements Pessoa {
    private String nome;
    private String documentos;

    public Cliente(String rua, String cidade, String numero, String estado, String cep, String nome, String documentos) {
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        this.documentos = documentos;
    }

    // Métodos da interface Pessoa
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
        return documentos; // retorna o documento
    }

    @Override
    public void setDocumento(String documento) {
        this.documentos = documento; // define o documento
    }

    // Opcional: manter getDocumentos/setDocumentos se quiser
    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documentos='" + documentos + '\'' +
                '}';
    }


}
