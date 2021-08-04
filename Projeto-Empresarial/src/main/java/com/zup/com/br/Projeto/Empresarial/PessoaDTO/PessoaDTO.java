package com.zup.com.br.Projeto.Empresarial.PessoaDTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


public class PessoaDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @Email
    private String email;

    public PessoaDTO(){

    }

    public PessoaDTO(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
