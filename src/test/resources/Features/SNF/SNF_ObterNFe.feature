#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
@ObterNFe1.2
@Validado
Funcionalidade: 1.2 - Obter NF-e

  @ISDSTBOF8448 @webSNF @TelaSNF
  Cenario: 8448 - Validar preenchimento do campo CNPJ com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                              | Nome do executor | Sprint |
      | 8448 | ISDSTBOF-8448 | Validar preenchimento do campo CNPJ com valores válidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "CNPJ" com 15 numeros (Visualizar NF)
    Entao o campo "CNPJ" deve apresentar 14 digitos (Visualizar NF)

  @ISDSTBOF8455 @webSNF @TelaSNF
  Cenario: 8455 - Validar preenchimento do campo CNPJ com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                | Nome do executor | Sprint |
      | 8455 | ISDSTBOF-8455 | Validar preenchimento do campo CNPJ com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "CNPJ" com letras (Visualizar NF)
    Entao o campo "CNPJ" deve estar vazio (Visualizar NF)

  @ISDSTBOF8456 @webSNF @TelaSNF
  Cenario: 8456 - Validar preenchimento do campo CPF com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                             | Nome do executor | Sprint |
      | 8456 | ISDSTBOF-8456 | Validar preenchimento do campo CPF com valores válidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    E seleciono o valor cpf no campo tipo documento
    Quando preencher o campo "CPF" com 12 numeros (Visualizar NF)
    Entao o campo "CPF" deve apresentar 11 digitos (Visualizar NF)

  @ISDSTBOF8457 @webSNF @TelaSNF
  Cenario: 8457 - Validar preenchimento do campo CPF com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                               | Nome do executor | Sprint |
      | 8457 | ISDSTBOF-8457 | Validar preenchimento do campo CPF com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    E seleciono o valor cpf no campo tipo documento
    Quando preencho o campo "CPF" com letras (Visualizar NF)
    Entao o campo "CPF" deve estar vazio (Visualizar NF)

  @ISDSTBOF8458 @webSNF @TelaSNF
  Cenario: 8458 - Validar preenchimento do campo Nome Fornecedor com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                           | Nome do executor | Sprint |
      | 8458 | ISDSTBOF-8458 | Validar preenchimento do campo Nome Fornecedor com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Nome Fornecedor" com letras (Visualizar NF)
    Entao o campo "Nome Fornecedor" deve estar com letras (Visualizar NF)

  @ISDSTBOF8460 @webSNF @TelaSNF
  Cenario: 8460 - Validar preenchimento do campo Nota Fiscal com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                       | Nome do executor | Sprint |
      | 8460 | ISDSTBOF-8460 | Validar preenchimento do campo Nota Fiscal com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "Nota Fiscal" com 8 numeros (Visualizar NF)
    Entao o campo "Nota Fiscal" deve apresentar 8 digitos (Visualizar NF)

  @ISDSTBOF8461 @webSNF @TelaSNF
  Cenario: 8461 - Validar preenchimento do campo Nota Fiscal com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                       | Nome do executor | Sprint |
      | 8461 | ISDSTBOF-8461 | Validar preenchimento do campo Nota Fiscal com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Nota Fiscal" com letras (Visualizar NF)
    Entao o campo "Nota Fiscal" deve estar vazio (Visualizar NF)

  @ISDSTBOF8462 @webSNF @TelaSNF
  Cenario: 8462 - Validar preenchimento do campo Serie com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                 | Nome do executor | Sprint |
      | 8462 | ISDSTBOF-8462 | Validar preenchimento do campo Serie com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "Serie" com 8 numeros (Visualizar NF)
    Entao o campo "Serie" deve apresentar 8 digitos (Visualizar NF)

  @ISDSTBOF8463 @webSNF @TelaSNF
  Cenario: 8463 - Validar preenchimento do campo Série com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                 | Nome do executor | Sprint |
      | 8463 | ISDSTBOF-8463 | Validar preenchimento do campo Série com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Serie" com letras e especiais(Visualizar NF)
    Entao o campo "Serie" deve estar vazio (Visualizar NF)

  @ISDSTBOF8464 @webSNF @TelaSNF
  Cenario: 8464 - Validar preenchimento do campo Numero Pedido com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                         | Nome do executor | Sprint |
      | 8464 | ISDSTBOF-8464 | Validar preenchimento do campo Numero Pedido com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "Numero Pedido" com 8 numeros (Visualizar NF)
    Entao o campo "Numero Pedido" deve apresentar 8 digitos (Visualizar NF)

  @ISDSTBOF8465 @webSNF @TelaSNF
  Cenario: 8465 - Validar preenchimento do campo Numero Pedido com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                         | Nome do executor | Sprint |
      | 8465 | ISDSTBOF-8465 | Validar preenchimento do campo Numero Pedido com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Numero Pedido" com letras e especiais(Visualizar NF)
    Entao o campo "Numero Pedido" deve estar vazio (Visualizar NF)

  @ISDSTBOF8466 @webSNF @TelaSNF
  Cenario: 8466 - Validar preenchimento do campo ID Nota Fiscal com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                          | Nome do executor | Sprint |
      | 8466 | ISDSTBOF-8466 | Validar preenchimento do campo ID Nota Fiscal com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "ID Nota Fiscal" com 8 numeros (Visualizar NF)
    Entao o campo "ID Nota Fiscal" deve apresentar 8 digitos (Visualizar NF)

  @ISDSTBOF8467 @webSNF @TelaSNF
  Cenario: 8467 - Validar preenchimento do campo ID Nota Fiscal com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                          | Nome do executor | Sprint |
      | 8467 | ISDSTBOF-8467 | Validar preenchimento do campo ID Nota Fiscal com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "ID Nota Fiscal" com letras e especiais(Visualizar NF)
    Entao o campo "ID Nota Fiscal" deve estar vazio (Visualizar NF)

  @ISDSTBOF8468 @webSNF @TelaSNF
  Cenario: 8468 - Validar preenchimento do campo Numero Loja com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                       | Nome do executor | Sprint |
      | 8468 | ISDSTBOF-8468 | Validar preenchimento do campo Numero Loja com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencher o campo "Numero Loja" com 8 numeros (Visualizar NF)
    Entao o campo "Numero Loja" deve apresentar 8 digitos (Visualizar NF)

  @ISDSTBOF8469 @webSNF @TelaSNF
  Cenario: 8469 - Validar preenchimento do campo Numero Loja com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id   | Numero do CT  | Nome do CT                                                       | Nome do executor | Sprint |
      | 8469 | ISDSTBOF-8469 | Validar preenchimento do campo Numero Loja com valores inválidos | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
   E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Numero Loja" com letras e especiais(Visualizar NF)
    Entao o campo "Numero Loja" deve estar vazio (Visualizar NF)

  @ISDSTBOF11110 @webSNF  @TelaSNF
  Cenario: 11110 - Validar ação do botão Limpar
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                   | Nome do executor | Sprint |
      | 11110 | ISDSTBOF-11110 | Validar ação do botão Limpar | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    E preencho todos os campos da tela (Visualizar NF)
    Quando aciono o botao limpar
    Entao os campos devem estar vazios (Visualizar NF)

  @ISDSTBOF00001loja @webSNF @TelaSNF
  Cenario: 00001loja - Validar preenchimento do campo 'PORTIFÓLIO' com valores invalidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                         | Nome do executor | Sprint |
      | 00001 | ISDSTBOF-00001loja | Validar preenchimento do "PORTIFÓLIO" Loja com valores invalidos | Hil�rio Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Portifolio" Letras (Visualizar NF)
    Entao o campo "Portifolio" deve estar vazio (Visualizar NF)

  @ISDSTBOF00002loja @webSNF  @TelaSNF
  Cenario: 00002loja - Validar preenchimento do campo 'PORTIFÓLIO' com Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                         | Nome do executor | Sprint |
      | 00002 | ISDSTBOF-00002loja | Validar preenchimento do "PORTIFÓLIO" Loja com valores invalidos | Hil�rio Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Portifolio" com Caracteres Especiais (Visualizar NF)
    Entao o campo "Portifolio" deve estar vazio (Visualizar NF)

  @ISDSTBOF00003loja @webSNF  @TelaSNF
  Cenario: 00003loja - Validar preenchimento do campo 'DATA EMISSAO NF INICIO' com Data InValida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                             | Nome do executor | Sprint |
      | 00003 | ISDSTBOF-00003loja | Validar preenchimento do "DATA EMISSAO NF INICIO" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Emissao NF Inicio" com a Data Invalida (Visualizar NF)
    Entao deve ser apresentado o valor "Invalid date" no campo Data Emissao NF Inicio(Visualizar NF)

  @ISDSTBOF00004loja @webSNF @TelaSNF
  Cenario: 00004loja - Validar preenchimento do campo 'DATA EMISSAO NF FIM' com Data InValida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                          | Nome do executor | Sprint |
      | 00004 | ISDSTBOF-00004loja | Validar preenchimento do "DATA EMISSAO NF FIM" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Emissao NF Fim" com a Data Invalida (Visualizar NF)
    Entao deve ser apresentado o valor "Invalid date" no campo Data Emissao Fim(Visualizar NF)

  @ISDSTBOF00005loja @webSNF @TelaSNF
  Cenario: 00005loja - Validar preenchimento do campo 'DATA REJEICAO INICIO' com Data Invalida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                                 | Nome do executor | Sprint |
      | 00005 | ISDSTBOF-00005loja | Validar preenchimento do "DATA REJEICAO INICIO" Loja com valores invalidos | Hil�rio Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Rejeicao Inicio" com a Data Invalida (Visualizar NF)
    Entao deve ser apresentado o valor "Invalid date" no campo Data Rejeicao Inicio(Visualizar NF)

  @ISDSTBOF00006loja @webSNF @TelaSNF
  Cenario: 00006loja - Validar preenchimento do campo 'DATA REJEIÇÃO FIM' com Data Invalida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                              | Nome do executor | Sprint |
      | 00006 | ISDSTBOF-00006loja | Validar preenchimento do "DATA REJEICAO FIM" Loja com valores invalidos | Hil�rio Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Rejeicao Fim" com a Data Invalida (Visualizar NF)
    Entao deve ser apresentado o valor "Invalid date" no campo Data Rejeicao fim(Visualizar NF)

  @ISDSTBOF00007loja @webSNF @TelaSNF
  Cenario: 00007loja - Validar preenchimento do campo 'PORTIFÓLIO' com valores Validos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                       | Nome do executor | Sprint |
      | 00007 | ISDSTBOF-00007loja | Validar preenchimento do "PORTIFÓLIO" Loja com valores Validos | Hil�rio Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Portifolio" com Numeros (Visualizar NF)
    Entao o campo "Portifolio" nao deve estar vazio (Visualizar NF)

  @ISDSTBOF00008loja @webSNF @TelaSNF
  Cenario: 00008loja - Validar preenchimento do campo 'DATA EMISSAO NF INICIO' com Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                             | Nome do executor | Sprint |
      | 00008 | ISDSTBOF-00008loja | Validar preenchimento do "DATA EMISSAO NF INICIO" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Emissao NF Inicio" com a Data Valida (Visualizar NF)
    Entao o campo "Data Emissao NF Inicio" nao deve estar vazio (Visualizar NF)

  @ISDSTBOF00009loja @webSNF @TelaSNF
  Cenario: 00009loja - Validar preenchimento do campo 'DATA EMISSAO NF FIM' com Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                          | Nome do executor | Sprint |
      | 00009 | ISDSTBOF-00009loja | Validar preenchimento do "DATA EMISSAO NF FIM" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Emissao NF Fim" com a Data Valida (Visualizar NF)
    Entao o campo "Data Emissao NF Fim" nao deve estar vazio (Visualizar NF)

  @ISDSTBOF00010loja @webSNF @TelaSNF
  Cenario: 00010loja - Validar preenchimento do campo 'DATA REFEICAO INICIO' com Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT       | Nome do CT                                                           | Nome do executor | Sprint |
      | 00010 | ISDSTBOF-00010loja | Validar preenchimento do "DATA REJEICAO INICIO" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Rejeicao Inicio" com a Data Valida (Visualizar NF)
    Entao o campo "Data Rejeicao Inicio" nao deve estar vazio (Visualizar NF)

  @ISDSTBOF00011loja @webSNF @TelaSNF
  Cenario: 00011loja - Validar preenchimento do campo 'DATA REFEICAO FIM' com Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Numero do CT       | Nome do CT                                                        | Nome do executor | Sprint |
      | 00011loja | ISDSTBOF-00011loja | Validar preenchimento do "DATA REJEICAO FIM" Loja com Data Valida | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando preencho o campo "Data Rejeicao Fim" com a Data Valida (Visualizar NF)
    Entao o campo "Data Rejeicao Fim" nao deve estar vazio (Visualizar NF)

  @ISDSTBOF00012cd @webSNF @TelaSNF 
  Cenario: 00012cd - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero do Pedido'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id      | Numero do CT     | Nome do CT                                                                   | Nome do executor | Sprint |
      | 0001Scd | ISDSTBOF-00012cd | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero doPedido' | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Numero Pedido" com o valor "4279760" (Visualizar NF)
    Entao o campo "Pedido" deve conter o valor "4279760" no Grid de Resultado

  @ISDSTBOF00013cd @webSNF @TelaSNF
  Cenario: 00013cd - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id      | Numero do CT     | Nome do CT                                                                   | Nome do executor | Sprint |
      | 00013cd | ISDSTBOF-00013cd | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero doPedido' | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Nota Fiscal" com o valor "321" (Visualizar NF)
    Entao o campo "Nota Fiscal" deve conter o valor "321" no Grid de Resultado

  @ISDSTBOF00014Loja @webSNF @TelaSNF
  Cenario: 00014Loja - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero do Pedido'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Numero do CT       | Nome do CT                                                                   | Nome do executor | Sprint |
      | 00014Loja | ISDSTBOF-00014Loja | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero doPedido' | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Numero Pedido" com o valor "4280601" (Visualizar NF)
    Entao o campo "Pedido" deve conter o valor "4280601" no Grid de Resultado

  @ISDSTBOF00015Loja @webSNF @TelaSNF
  Cenario: 00015Loja - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Numero do CT       | Nome do CT                                                                   | Nome do executor | Sprint |
      | 00015Loja | ISDSTBOF-00015Loja | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero doPedido' | Hilario Bina     | T2     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Nota Fiscal"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Nota Fiscal" com o valor "73" (Visualizar NF)
    Entao o campo "Nota Fiscal" deve conter o valor "73" no Grid de Resultado
