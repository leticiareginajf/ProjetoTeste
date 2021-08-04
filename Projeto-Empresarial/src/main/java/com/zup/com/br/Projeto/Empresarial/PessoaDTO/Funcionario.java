package com.zup.com.br.Projeto.Empresarial.PessoaDTO;

public class Funcionario extends PessoaDTO {
    private String funcao;
    private Double salario;

    public Funcionario(){

    }

    public Funcionario(String funcao, Double salario){
        this.funcao = funcao;
        this.salario= salario;
    }

    public Funcionario(String nome, String endereco, String email, String funcao, Double salario) {
        super(nome, endereco, email);
        this.funcao = funcao;
        this.salario = salario;
    }


    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
