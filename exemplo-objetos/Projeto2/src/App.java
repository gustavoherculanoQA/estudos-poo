public class App {
    public static void main(String[] args) throws Exception {

        CadastroAluno a1 = new CadastroAluno("Solteiro", "Engenharia da computação");
        a1.setCurso("MEDICINA");
        a1.setEmail("gustavoherculano132@gmail.com");
        a1.setEndereco("Rua Euclides Onofre de sousa 30");
        a1.setIdade(22);
        a1.setNome("Gustavo");

        CadastroAluno a2 = new CadastroAluno(null, null);
        a2.setCurso("ENGENHARIA DA COMPUTAÇÃO");
        a2.setEmail("ordepherculano@yahoo.com.br");
        a2.setEndereco("Rua Floriano Peixoto 253");
        a2.setEstadoCivil("Casado");
        a2.setIdade(52);
        a2.setNome("Ordep Herculano");

        a1.status();
        a2.status();

    }
}
