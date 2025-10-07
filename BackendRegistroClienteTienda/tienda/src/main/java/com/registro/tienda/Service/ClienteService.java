package com.registro.tienda.Service;

import java.util.List;
import com.registro.tienda.Model.DTO.ClienteResponse;
import com.registro.tienda.Model.Document.Cliente;

public interface ClienteService {
    
    List<ClienteResponse> getAllCliente();
    ClienteResponse createCliente(Cliente cliente);

}
