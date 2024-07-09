public class App {
    public static void main(String[] args) throws Exception {

        CadastroAluno a1 = new CadastroAluno("Solteiro", "Engenharia da computação");
        a1.setCurso("MEDICINA");
        a1.setEmail("gustavoherculano132@gmail.com");
        a1.setEndereco("Rua Euclides 30");
        a1.setIdade(22);
        a1.setNome("Gustavo");
        a1.ativar();

        CadastroAluno a2 = new CadastroAluno(null, null);
        a2.setCurso("ENGENHARIA DA COMPUTAÇÃO");
        a2.setEmail("ordepherculano@hotmail.com.br");
        a2.setEndereco("Rua Floriano Peixoto 253");
        a2.setEstadoCivil("Casado");
        a2.setIdade(52);
        a2.setNome("Ordep Herculano");
        a2.ativar();

        CadastroAluno a3 = new CadastroAluno(null, null);
        a3.setNome("Isadora");
        a3.setEmail("isadora@gmail.com");
        a3.setCurso("ADMINISTRAÇÃO");
        a3.setEndereco("Travessa fortaleza 1523");
        a3.setIdade(36);
        a3.setEstadoCivil("Casado");
        a3.ativar();

        a1.status();
        a2.status();
        a3.status();

    }
}
