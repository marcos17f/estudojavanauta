package associaçao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Carro fusca = new Carro(1200);
        fusca.mostrarCilindradas();




        Funcionarios marcos = new Funcionarios(" Marcos ");
        Funcionarios anakarine = new Funcionarios(" Ana karine ");
        Funcionarios lucas = new Funcionarios(" Lucas ");


        List<Funcionarios>listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(marcos);
        listaDeFuncionarios.add(anakarine);
        listaDeFuncionarios.add(lucas);


        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostraFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostraFuncionarios();

    }
}
