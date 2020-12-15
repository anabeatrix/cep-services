package com.anabeatrix.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public class WidenetCepService extends AbstractCepService {
    public WidenetCepService() {
        super("https://cep.widenet.host");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("busca-cep/api/cep/$s", cep);
    }
}
