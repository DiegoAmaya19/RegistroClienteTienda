package com.registro.tienda.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.registro.tienda.Mapper.ClienteMapper;

@Configuration
public class ClienteConfig {
    
    @Bean
    public ClienteMapper clienteMapper(){
        return new ClienteMapper();
    }

}
