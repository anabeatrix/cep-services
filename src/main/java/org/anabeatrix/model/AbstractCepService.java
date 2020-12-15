package org.anabeatrix.model;

import org.anabeatrix.cepservice.CepService;
import org.anabeatrix.cepservice.Endereco;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public abstract class AbstractCepService implements CepService {
    private final WebTarget target;
    private final String dominio;

    public AbstractCepService(String dominio) {
        this.dominio = insertTrailingSlash(dominio);
        Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }

    protected final String insertTrailingSlash(String path) {
        return path.endsWith("/") ? path : path + "/";
    }
    protected abstract String buildPath(String cep);

    protected String getFullPath(String cep) {
        return this.dominio + buildPath(cep);
    }

    @Override
    public Endereco buscaEndereco(String cep) {
        return target.path(buildPath(cep)).request().get(Endereco.class);
    }
}
