package com.anabeatrix.cepservice;


public class PostmonCepService extends AbstractCepService {
    public PostmonCepService() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("/v1/cep/$s/", cep);
    }
}
