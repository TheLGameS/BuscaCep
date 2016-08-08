package br.vilarinho.cep;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by CARLOS.VILARINHO on 05/08/2016.
 */
public abstract class CepWebService {

    public static Endereco getEndereco(String cep) throws JAXBException, MalformedURLException {
        JAXBContext jc = JAXBContext.newInstance(Endereco.class);
        Unmarshaller u = jc.createUnmarshaller();
        URL url = new URL( "http://cep.republicavirtual.com.br/web_cep.php?cep="+cep+"&formato=xml" );
        return (Endereco) u.unmarshal( url );
    }
}
