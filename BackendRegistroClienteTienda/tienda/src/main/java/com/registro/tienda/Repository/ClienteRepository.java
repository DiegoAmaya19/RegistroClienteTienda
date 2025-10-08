package com.registro.tienda.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.registro.tienda.Model.Document.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente,Long>{
    
}
