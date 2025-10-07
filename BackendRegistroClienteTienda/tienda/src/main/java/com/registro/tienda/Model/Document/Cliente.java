package com.registro.tienda.Model.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document
public class Cliente {

    @Id
    private Long cc;

    private String name;

    private String lastName;

    private String email;

    private String phone;
    
}