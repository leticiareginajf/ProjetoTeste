package com.zup.com.br.Projeto.Empresarial.controller;


import com.zup.com.br.Projeto.Empresarial.PessoaDTO.ClienteDTO;
import com.zup.com.br.Projeto.Empresarial.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping
    public void cadastrarClientes(@RequestBody @Valid ClienteDTO clienteDTO ){
            clienteService.adicionarClienteNaLista(clienteDTO);
    }


    @GetMapping
    public List<ClienteDTO> visualizarCliente(){
        return clienteService.retornarCliente();
    }






}
