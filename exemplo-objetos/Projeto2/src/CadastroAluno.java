public class CadastroAluno {
    private String nome;
    private String endereco;
    private int idade;
    public String estadoCivil;
    public String email;
    public String curso;
    public boolean cadastro;

    //MÉTODO COSTRUTOR
    public CadastroAluno(String estadoCivil, String curso) {
        this.estadoCivil = estadoCivil;
        this.curso = curso;
    }

    //MÉTODOS 
    public void status(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Estado civil: "+this.getEstadoCivil());
        System.out.println("Email: "+ getEmail());
        System.out.println("Curso: " + getCurso());
        System.out.println("Endereço: "+ getEndereco());
        pagarMesalidade();
        System.out.println();
        System.out.println("================================");
    }
    public void ativar(){   
        this.cadastro = true;
        
    }
    public void cancelar(){
        this.cadastro = false;
    }
    public void pagarMesalidade(){
        if(this.getCadastro()){
            if(curso == "ENGENHARIA DA COMPUTAÇÃO"){
                System.out.println("Mensalidade = R$1000,00");
            }else if(curso == "MEDICINA"){
                System.out.println("Mensalidade = R$ 12.000,00");
            }else if(curso == "MEDICINA VETERINÁRIA"){
                System.out.println("Mensalidade = R$1.800,00");
            }else if(curso == "ADMINISTRAÇÃO"){
                System.out.println("Mensalidade = R$ 850,00");
            }
            }else{
                System.out.println("Não há mensalidade pois o cadastro não está ativo.");
            }
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
    public void setCadastro(boolean cadastro){
        this.cadastro = cadastro;
    }
    public boolean getCadastro(){
        return cadastro;
    }

    
}
