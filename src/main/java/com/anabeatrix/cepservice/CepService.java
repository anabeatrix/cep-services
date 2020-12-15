package com.anabeatrix.cepservice;

import com.anabeatrix.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
