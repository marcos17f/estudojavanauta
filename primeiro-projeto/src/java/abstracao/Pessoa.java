// Pacote onde a interface está
package abstracao;

// Uma interface define um "contrato".
// Quem implementar essa interface é obrigado a fornecer a implementação
// dos métodos declarados aqui.
public interface Pessoa {

    // Método para obter o nome da pessoa
    String getNome();

    // Método para definir/alterar o nome da pessoa
    void setNome (String nome);

    // Método para obter o documento da pessoa (CPF, RG, etc.)
    String getDocumento();

    // Método para definir/alterar o documento
    void setDocumento(String documento);
}



