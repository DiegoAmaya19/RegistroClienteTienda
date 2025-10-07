package com.registro.tienda.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.registro.tienda.Model.DTO.ClienteResponse;
import com.registro.tienda.Model.Document.Cliente;
import com.registro.tienda.Service.ClienteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    private final ClienteService clienteService;

    @GetMapping
    public List<ClienteResponse> getAllCliente(){
        return clienteService.getAllCliente();
    }

    @PostMapping("/save")
    public ClienteResponse createCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

}
