package com.anabeatrix.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public class ViaCepService extends AbstractCepService {
    public ViaCepService(String dominio) {
        super(dominio);
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
}
