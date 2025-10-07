package com.registro.tienda.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.registro.tienda.Mapper.ClienteMapper;
import com.registro.tienda.Model.DTO.ClienteResponse;
import com.registro.tienda.Model.Document.Cliente;
import com.registro.tienda.Repository.ClienteRepository;
import com.registro.tienda.Service.ClienteService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public List<ClienteResponse> getAllCliente() {
        return clienteRepository.findAll().stream()
                .map(clienteMapper::toResponse)
                .toList();
    }

    @Override
    public ClienteResponse createCliente(Cliente cliente) {
        return clienteMapper.toResponse(clienteRepository.save(cliente));
    }
    
}
