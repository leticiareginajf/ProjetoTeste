package com.zup.com.br.Projeto.Empresarial.PessoaDTO;


import javax.validation.constraints.NotBlank;

public class ClienteDTO extends PessoaDTO{


    @NotBlank
    private String atividade;
    @NotBlank
    private String descricao;
    private Funcionario funcionario;


    public ClienteDTO(){

    }

    public ClienteDTO(String atividade, String descricao, Funcionario funcionario){
        this.atividade = atividade;
        this.descricao = descricao;
        this.funcionario = funcionario;
    }

    public ClienteDTO(String nome, String endereco, String email, String atividade, String descricao, Funcionario funcionario) {
        super(nome, endereco, email);
        this.atividade = atividade;
        this.descricao = descricao;
        this.funcionario = funcionario;
    }


    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
