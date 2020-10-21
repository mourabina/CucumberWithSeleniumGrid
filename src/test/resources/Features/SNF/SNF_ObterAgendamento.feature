#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@ObterAgendamento1.4 @Validado
Funcionalidade: 1.4 - Recebimento - Obter Agendamento

  @ISDSTBOF11610 @webSNF @TelaSNF
  Cenario: 11610 - Validar comportamento do botão 'LIMPAR' com dados preechidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 11610 | ISDSTBOF-11610 | Validar comportamento do botão 'LIMPAR' com dados preechidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    E preencho todos os campos com informacoes validas
    Quando aciono o botao limpar
    Entao todos os campos devem estar vazios (Visualizar Recebimento)

  @ISDSTBOF11611 @webSNF @TelaSNF
  Cenario: 11611 - Validar campo 'NÚMERO AGENDAMENTO' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                             | Nome do executor | Sprint |
      | 11611 | ISDSTBOF-11611 | Validar campo 'NÚMERO AGENDAMENTO' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Agendamento" com Numeros
    Então campo "Numero Agendamento" deve ter o valor diferente de vazio

  @ISDSTBOF11612 @webSNF @TelaSNF
  Cenario: 11612 - Validar campo 'NÚMERO AGENDAMENTO' com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 11612 | ISDSTBOF-11612 | Validar campo 'NÚMERO AGENDAMENTO' com valores inválidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Agendamento" com Caracteres Especiais
    Entao o campo "Numero Agendamento" deve estar vazio (Agendamento)

  @ISDSTBOF11613 @webSNF @TelaSNF
  Cenario: 11613 - Validar campo 'NÚMERO FORNECEDOR' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 11613 | ISDSTBOF-11613 | Validar campo 'NÚMERO FORNECEDOR' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Fornecedor" com Numeros
    Então campo "Numero Fornecedor" deve ter o valor diferente de vazio

  @ISDSTBOF11614 @webSNF @TelaSNF
  Cenario: 11614 - Validar campo 'NÚMERO FORNECEDOR' com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 11614 | ISDSTBOF-11614 | Validar campo 'NÚMERO FORNECEDOR' com valores inválidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Fornecedor" com Caracteres Especiais
    Entao o campo "Numero Fornecedor" deve estar vazio (Agendamento)

  @ISDSTBOF11615 @webSNF @TelaSNF
  Cenario: 11615 - Validar campo 'NÚMERO RECEBIMENTO' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                             | Nome do executor | Sprint |
      | 11615 | ISDSTBOF-11615 | Validar campo 'NÚMERO RECEBIMENTO' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Recebimento" com Numeros
    Então campo "Numero Recebimento" deve ter o valor diferente de vazio

  @ISDSTBOF11616 @webSNF @TelaSNF
  Cenario: 11616 - Validar campo 'NÚMERO RECEBIMENTO' com valores inválidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 11616 | ISDSTBOF-11616 | Validar campo 'NÚMERO RECEBIMENTO' com valores inválidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Recebimento" com Caracteres Especiais
    Entao o campo "Numero Recebimento" deve estar vazio (Agendamento)

  @ISDSTBOF11618 @webSNF @TelaSNF
  Cenario: 11618 - Validar o campo 'Data Agenda'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                    | Nome do executor | Sprint |
      | 11618 | ISDSTBOF-11618 | Validar o campo 'Data Agenda' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo Data Agenda com o valor valor valido
    Então campo "Data Agenda" deve ter o valor diferente de vazio

  @ISDSTBOF11619 @webSNF @TelaSNF
  Cenario: 11619 - Validar o campo 'Data Agenda' com valor inválido
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 11619 | ISDSTBOF-11619 | Validar o campo 'Data Agenda' com valor inválido | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo Data Agenda com o valor Data Invalida
    Entao deve apresentar o valor "Invalid date" no campo Data Agenda

  @ISDSTBOF11620 @webSNF @TelaSNF
  Cenario: 11620 - Validar campo 'Número Pedido' com valor válido
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 11620 | ISDSTBOF-11620 | Validar campo 'Número Pedido' com valor válido | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Pedido" com Numeros
    Então campo "Numero Pedido" deve ter o valor diferente de vazio

  @ISDSTBOF11621 @webSNF @TelaSNF
  Cenario: 11621 - Validar campo 'Número Pedido' com valor inválido
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 11621 | ISDSTBOF-11621 | Validar campo 'Número Pedido' com valor inválido | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Numero Pedido" com Letras
    Entao o campo "Numero Recebimento" deve estar vazio (Agendamento)

  @ISDSTBOF11622 @webSNF @TelaSNF
  Cenario: 11622 - Validar o botão 'Pesquisar' desabilitado
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT    | Nome do CT                               | Nome do executor | Sprint |
      | 11622 | ISDSTBOF-116212 | Validar o botão "Pesquisar" desabilitado | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Entao o botao Pesquisar devera esta desabilitado

  @ISDSTBOF10004 @webSNF @TelaSNF
  Cenario: 10004 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nº. Pedido'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                              | Nome do executor | Sprint |
      | 10004 | ISDSTBOF-10004 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nº. Pedido' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Pedido" com o valor "4284321" (Visualizar Recebimento)
    Entao o campo "Nº. Pedido" deve conter o valor "4284321" no Grid de Resultado

  @ISDSTBOF10005 @webSNF @TelaSNF
  Cenario: 10005 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Agendamento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                   | Nome do executor | Sprint |
      | 10005 | ISDSTBOF-10005 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nº. Agendamento' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Agendamento" com o valor "11" (Visualizar Recebimento)
    Entao o campo "Nº. Agendamento" deve conter o valor "11" no Grid de Resultado

  @ISDSTBOF10006 @webSNF @TelaSNF
  Cenario: 10006 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Recebimento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                      | Nome do executor | Sprint |
      | 10006 | ISDSTBOF-10006 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Recebimento' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Recebimento" com o valor "12200006" (Visualizar Recebimento)
    Entao o campo "Nº. Recebimento" deve conter o valor "12200006" no Grid de Resultado

  @ISDSTBOF10007 @webSNF @TelaSNF
  Cenario: 10007 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Pedido'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                 | Nome do executor | Sprint |
      | 10007 | ISDSTBOF-10007 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Pedido' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Pedido" com o valor "4280954" (Visualizar Recebimento)
    Entao o campo "Nº. Pedido" deve conter o valor "4280954" no Grid de Resultado

  @ISDSTBOF10008 @webSNF @TelaSNF
  Cenario: 10008 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Recebimento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                      | Nome do executor | Sprint |
      | 10008 | ISDSTBOF-10008 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Recebimento' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Recebimento" com o valor "701585259632658" (Visualizar Recebimento)
    Entao o campo "Nº. Recebimento" deve conter o valor "701585259632658" no Grid de Resultado

  @ISDSTBOF10009 @webSNF @TelaSNF
  Cenario: 10009 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nome Fornecedor'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT    | Nome do CT                                                                   | Nome do executor | Sprint |
      | 10009 | ISDSTBOF-100089 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nome Fornecedor' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Nome Fornecedor" com o valor "ANGELA MARIA MALTA SILVA ME" (Visualizar Recebimento)
    Entao o campo "Nome Fornecedor" deve conter o valor "ANGELA MARIA MALTA SILVA ME" no Grid de Resultado

  @ISDSTBOF10010 @webSNF @TelaSNF
  Cenario: 10010 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 10010 | ISDSTBOF-10010 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Nota Fiscal" com o valor "36176" (Visualizar Recebimento)
    Entao o campo "Nota fiscal" deve conter o valor "36176" no Grid de Resultado

  @ISDSTBOF10011 @webSNF @TelaSNF
  Cenario: 10011 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Fornecedor'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                     | Nome do executor | Sprint |
      | 10011 | ISDSTBOF-10011 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Numero Fornecedor' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e "Numero Fornecedor" com o valor "3505440" (Visualizar Recebimento)
    Entao o campo "Nº. Fornecedor" deve conter o valor "3505440" no Grid de Resultado

  @ISDSTBOF10012 @webSNF @TelaSNF
  Cenario: 10012 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Anulada)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                     | Nome do executor | Sprint |
      | 10012 | ISDSTBOF-10012 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Anulada)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Anulado" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Anulado" no Grid de Resultado

  @ISDSTBOF10013 @webSNF @TelaSNF
  Cenario: 10013 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Ativo)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                   | Nome do executor | Sprint |
      | 10013 | ISDSTBOF-10013 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Ativo)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Ativo" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Ativo" no Grid de Resultado

  @ISDSTBOF10014 @webSNF @TelaSNF
  Cenario: 10014 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Chegada do caminhão)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                                 | Nome do executor | Sprint |
      | 10014 | ISDSTBOF-10014 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Chegada do caminhão)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Chegada do caminhão" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Chegada do caminhão" no Grid de Resultado

  @ISDSTBOF10015 @webSNF @TelaSNF
  Cenario: 10015 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Correção enviada)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                              | Nome do executor | Sprint |
      | 10015 | ISDSTBOF-10015 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Correção enviada)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Correção enviada" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Correção enviada" no Grid de Resultado

  @ISDSTBOF10016 @webSNF @TelaSNF
  Cenario: 10016 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Correção necessária)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                                 | Nome do executor | Sprint |
      | 10016 | ISDSTBOF-10016 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Correção necessária)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Correção necessária" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Correção necessária" no Grid de Resultado

  @ISDSTBOF10017 @webSNF @TelaSNF
  Cenario: 10017 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Finalizado)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                        | Nome do executor | Sprint |
      | 10017 | ISDSTBOF-10017 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Finalizado)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Finalizado" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Finalizado" no Grid de Resultado

  @ISDSTBOF10018 @webSNF @TelaSNF
  Cenario: 10018 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Interface envio ao SAD gerado)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                                           | Nome do executor | Sprint |
      | 10018 | ISDSTBOF-10018 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Interface envio ao SAD gerado)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Interface envio ao SAD gerado" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Interface envio ao SAD gerado" no Grid de Resultado

  @ISDSTBOF10019 @webSNF @TelaSNF
  Cenario: 10019 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Recebimento ainda a ser criado)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                                            | Nome do executor | Sprint |
      | 10019 | ISDSTBOF-10019 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Recebimento ainda a ser criado)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Recebimento ainda a ser criado" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Recebimento ainda a ser criado" no Grid de Resultado

  @ISDSTBOF10020 @webSNF @TelaSNF
  Cenario: 10020 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Rejeitado)'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                                       | Nome do executor | Sprint |
      | 10020 | ISDSTBOF-10020 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Situação(Rejeitado)' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando efetuo uma pesquisa atraves do campo Undiade de Negocio e no campo "Situacao" seleciono o valor "Rejeitado" (Visualizar Recebimento)
    Entao o campo "Situação" deve conter o valor "Rejeitado" no Grid de Resultado

  @ISDSTBOF10001Loja @webSNF @TelaSNF
  Cenario: 0001Loja - Validar campo 'NOTA FISCAL' com Letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id       | Número do CT      | Nome do CT                             | Nome do executor | Sprint |
      | 0001Loja | ISDSTBOF-0001Loja | Validar campo 'NOTA FISCAL' com Letras | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Nota Fiscal" com Letras
    Entao o campo "Nota Fiscal" deve estar vazio (Agendamento)

  @ISDSTBOF10002Loja @webSNF @TelaSNF
  Cenario: 0002Loja - Validar campo 'NOTA FISCAL' com Letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id       | Número do CT      | Nome do CT                             | Nome do executor | Sprint |
      | 0002Loja | ISDSTBOF-0002Loja | Validar campo 'NOTA FISCAL' com Letras | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Nota Fiscal" com Caracteres Especiais
    Entao o campo "Nota Fiscal" deve estar vazio (Agendamento)

  @ISDSTBOF10003Loja @webSNF @TelaSNF
  Cenario: 0003Loja - Validar campo 'NOTA FISCAL' com Numeros
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id       | Número do CT      | Nome do CT                              | Nome do executor | Sprint |
      | 0003Loja | ISDSTBOF-0003Loja | Validar campo 'NOTA FISCAL' com Numeros | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar Recebimento"
    Quando preencho o campo "Nota Fiscal" com Numeros
    Então campo "Nota Fiscal" deve ter o valor diferente de vazio
