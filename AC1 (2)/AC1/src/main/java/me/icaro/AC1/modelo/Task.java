package me.icaro.AC1.modelo;

public class Task {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    public Task(Long id, String nome, String cpf, String email, String endereco, String telefone){
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}