# BuscaCep
API para buscar Cep's.



    public static void main(String[] args) {
        try {
            Endereco end = CepWebService.getEndereco("88900000");
            Endereco otherEnd = CepWebService.getEndereco("88900-000");
            Endereco anotherEnd = CepWebService.getEndereco("88.900-000");

            System.out.println(end);
            System.out.println(otherEnd);
            System.out.println(anotherEnd);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


/**Console**/<br>
Endereco{codigoRetorno=2, descricaoRetorno='sucesso - cep único', uf='SC', cidade='Araranguá', bairro='', tipoLogradouro='', logradouro=''}<br>
Endereco{codigoRetorno=2, descricaoRetorno='sucesso - cep único', uf='SC', cidade='Araranguá', bairro='', tipoLogradouro='', logradouro=''}<br>
Endereco{codigoRetorno=2, descricaoRetorno='sucesso - cep único', uf='SC', cidade='Araranguá', bairro='', tipoLogradouro='', logradouro=''}<br>
