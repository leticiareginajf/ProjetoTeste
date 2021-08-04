package com.zup.com.br.Projeto.Empresarial.service;

import com.zup.com.br.Projeto.Empresarial.PessoaDTO.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {

   private List<ClienteDTO> listaCliente = new ArrayList<>();

   public void adicionarClienteNaLista(ClienteDTO clienteDTO){
       listaCliente.add(clienteDTO);
   }

   public List<ClienteDTO> retornarCliente(){
       return this.listaCliente;
   }





}
