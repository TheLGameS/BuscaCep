package br.vilarinho;

import javax.xml.bind.annotation.*;

/**
 * Created by CARLOS.VILARINHO on 05/08/2016.
 */

@XmlRootElement(name="webservicecep")
@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {

    @XmlElement(name="resultado")
    private String codigoRetorno;

    @XmlElement(name="resultado_txt")
    private String descricaoRetorno;

    @XmlElement(name="tipo_logradouro")
    private String tipoLogradouro;

    private String uf;
    private String cidade;
    private String bairro;
    private String logradouro;


    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getDescricaoRetorno() {
        return descricaoRetorno;
    }

    public void setDescricaoRetorno(String descricaoRetorno) {
        this.descricaoRetorno = descricaoRetorno;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro =bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "codigoRetorno=" + codigoRetorno +
                ", descricaoRetorno='" + descricaoRetorno + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", tipoLogradouro='" + tipoLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
