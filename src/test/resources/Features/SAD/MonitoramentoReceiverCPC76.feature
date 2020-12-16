#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@CPC76
Funcionalidade: Monitoramento Receiver

  @BRITQEACPC7601 @web @TelaSAD
  Cenario: CPC7601 - Consulta Guia preenchendo o campo 'Data Prev.Agenda' com valor incorreto
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                                               | Nome do executor | Sprint |
      | CPC7601 | BRITQEA-CPC7601 | Consulta Guia preenchendo o campo 'Data Prev.Agenda' com valor incorreto | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando realizo a consulta do Receiver com o campo "Data Agenda" contendo o valor "012520"
    Entao deve exibir a mensagem "[1] ATENÇÃO ** DTAGENDA INVALIDA **" no final da pagina

  @BRITQEACPC7602 @web @TelaSAD
  Cenario: CPC7602 - Validar o campo 'Data Prev.Agenda' não aceita Letras
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                           | Nome do executor | Sprint |
      | CPC7602 | BRITQEA-CPC7602 | Validar o campo 'Data Prev.Agenda' nao aceita Letras | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "ABCDEF" no campo "Data Agenda" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7603 @web @TelaSAD
  Cenario: CPC7603 - Validar o campo 'Data Prev.Agenda' não aceita Caracteres Especiais
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                                         | Nome do executor | Sprint |
      | CPC7603 | BRITQEA-CPC7603 | Validar o campo 'Data Prev.Agenda' nao aceita Caracteres Especiais | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "@#$%&!" no campo "Data Agenda" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7604 @web @TelaSAD
  Cenario: CPC7604 - Validar o campo 'AGENDA' não aceita Letras
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                 | Nome do executor | Sprint |
      | CPC7604 | BRITQEA-CPC7604 | Validar o campo 'AGENDA' nao aceita Letras | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "ABCDEF" no campo "Agenda" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7605 @web @TelaSAD
  Cenario: CPC7605 - Validar o campo 'AGENDA' não aceita Caracteres Especiais
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                               | Nome do executor | Sprint |
      | CPC7605 | BRITQEA-CPC7605 | Validar o campo 'AGENDA' nao aceita Caracteres Especiais | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "@#$%&!" no campo "Agenda" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7606 @web @TelaSAD
  Cenario: CPC7606 - Validar o campo 'PEDIDO' não aceita Letras
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                 | Nome do executor | Sprint |
      | CPC7606 | BRITQEA-CPC7606 | Validar o campo 'PEDIDO' nao aceita Letras | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "ABCDEF" no campo "Pedido" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7607 @web @TelaSAD
  Cenario: CPC7607 - Validar o campo 'PEDIDO' não aceita Caracteres Especiais
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                               | Nome do executor | Sprint |
      | CPC7607 | BRITQEA-CPC7607 | Validar o campo 'PEDIDO' nao aceita Caracteres Especiais | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "@#$%&!" no campo "Pedido" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7608 @web @TelaSAD
  Cenario: CPC7608 - Validar o campo 'CESTA' não aceita Letras
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                | Nome do executor | Sprint |
      | CPC7608 | BRITQEA-CPC7608 | Validar o campo 'CESTA' nao aceita Letras | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "ABCDEF" no campo "Cod Cesta" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7609 @web @TelaSAD
  Cenario: CPC7609 - Validar o campo 'CESTA' não aceita Caracteres Especiais
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                              | Nome do executor | Sprint |
      | CPC7609 | BRITQEA-CPC7609 | Validar o campo 'CESTA' nao aceita Caracteres Especiais | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "@#$%&!" no campo "Cod Cesta" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7610 @web @TelaSAD
  Cenario: CPC7610 - Validar o campo 'DEP' não aceita Letras
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                              | Nome do executor | Sprint |
      | CPC7610 | BRITQEA-CPC7610 | Validar o campo 'DEP' nao aceita Letras | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "ABCDEF" no campo "Dep" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7611 @web @TelaSAD
  Cenario: CPC7611 - Validar o campo 'DEP' não aceita Caracteres Especiais
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                            | Nome do executor | Sprint |
      | CPC7611 | BRITQEA-CPC7611 | Validar o campo 'DEP' nao aceita Caracteres Especiais | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando digito o valor "@#$%&!" no campo "Dep" na consulta do receiver
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos." no final da pagina

  @BRITQEACPC7612 @web @TelaSAD
  Cenario: CPC7612 - Validar não é possivel efetuar pesquisa com o Campo 'DEP' em branco
    Dado que estou logado no ambiente "SADVAREJO" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id      | Numero do CT    | Nome do CT                                                          | Nome do executor | Sprint |
      | CPC7612 | BRITQEA-CPC7612 | Validar não é possivel efetuar pesquisa com o Campo 'DEP' em branco | Hilário Bina     | S1     |
    E que estou na tela "CPC76"
    Quando deixo o campo "Dep" em branco e dou enter
    Entao deve exibir a mensagem "[1] ATENÇÃO ** FILIAL INVALIDA **" no final da pagina
