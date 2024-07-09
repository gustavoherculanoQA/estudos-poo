public class CadastroAluno {
    public String nome;
    public String endereco;
    public int idade;
    public String estadoCivil;
    public String email;
    public String curso;

    //MÉTODO COSTRUTOR
    public CadastroAluno(String estadoCivil, String curso) {
        this.estadoCivil = estadoCivil;
        this.curso = curso;
    }

    //MÉTODOS 
    public void mudarNome(String n){
        this.setNome(n);
    }

    public void status(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Estado civil: "+this.getEstadoCivil());
        System.out.println("Email: "+ getEmail());
        System.out.println("Curso: " + getCurso());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println();
        System.out.println("================================");
    }



    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
