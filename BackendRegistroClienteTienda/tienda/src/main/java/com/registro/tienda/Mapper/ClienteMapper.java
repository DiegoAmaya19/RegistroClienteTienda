package com.registro.tienda.Mapper;

import com.registro.tienda.Model.DTO.ClienteResponse;
import com.registro.tienda.Model.Document.Cliente;

public class ClienteMapper {
    
    public ClienteResponse toResponse(Cliente cliente){
        
        var clienteResponse = new ClienteResponse();

        clienteResponse.setFulName(cliente.getName()+" "+cliente.getLastName());
        clienteResponse.setEmail(cliente.getEmail());
        clienteResponse.setPhone(cliente.getPhone());

        return clienteResponse;

    }
}
