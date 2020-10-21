#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@VisualizarNFRemessa @Validado
Funcionalidade: X.X - Visualizar Nota Fiscal Remessa

  @ISDSTBOF00001 @webSNF
  Cenario: 00001 - Validar comportamento do botão 'LIMPAR' com dados preechidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 00001 | ISDSTBOF-00001 | Validar comportamento do botão 'LIMPAR' com dados preechidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    E preencho todos os campos da Tela com informacoes validas
    Quando aciono o botao limpar
    Entao todos os campos devem estar vazios (Visualizar NF Remessa)

  @ISDSTBOF00002 @webSNF
  Cenario: 00002 - Validar campo 'SÉRIE' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 00002 | ISDSTBOF-00002 | Validar campo 'SÉRIE' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Serie" com Numeros (Visualizar NF Remessa)
    Entao o campo "Serie" nao deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00003 @webSNF
  Cenario: 00003 - Validar campo 'SÉRIE' com Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 00003 | ISDSTBOF-00003 | Validar campo 'SÉRIE' com Caracteres Especiais | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Serie" com Caracteres Especiais (Visualizar NF Remessa)
    Entao o campo "Serie" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00004 @webSNF
  Cenario: 00004 - Validar campo 'SÉRIE' com Letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                       | Nome do executor | Sprint |
      | 00004 | ISDSTBOF-00004 | Validar campo 'SÉRIE' com Letras | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Serie" com Letras (Visualizar NF Remessa)
    Entao o campo "Serie" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00008 @webSNF
  Cenario: 00008 - Validar campo 'NOTA FISCAL' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                      | Nome do executor | Sprint |
      | 00008 | ISDSTBOF-00008 | Validar campo 'NOTA FISCAL' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Nota Fiscal" com Numeros (Visualizar NF Remessa)
    Entao o campo "Nota Fiscal" nao deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00009 @webSNF
  Cenario: 00009 - Validar campo 'NOTA FISCAL' com Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 00009 | ISDSTBOF-00009 | Validar campo 'NOTA FISCAL' com Caracteres Especiais | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Nota Fiscal" com Caracteres Especiais (Visualizar NF Remessa)
    Entao o campo "Nota Fiscal" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00010 @webSNF
  Cenario: 00010 - Validar campo 'NOTA FISCAL' com Letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                             | Nome do executor | Sprint |
      | 00010 | ISDSTBOF-00010 | Validar campo 'NOTA FISCAL' com Letras | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Nota Fiscal" com Letras (Visualizar NF Remessa)
    Entao o campo "Nota Fiscal" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00014 @webSNF
  Cenario: 00014 - Validar campo 'CNPJ' com valores válidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                               | Nome do executor | Sprint |
      | 00014 | ISDSTBOF-00014 | Validar campo 'CNPJ' com valores válidos | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "CNPJ" com Numeros (Visualizar NF Remessa)
    Entao o campo "CNPJ" nao deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00015 @webSNF
  Cenario: 00015 - Validar campo 'CNPJ' com Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 00015 | ISDSTBOF-00015 | Validar campo 'CNPJ' com Caracteres Especiais | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "CNPJ" com Caracteres Especiais (Visualizar NF Remessa)
    Entao o campo "CNPJ" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00016 @webSNF
  Cenario: 00016 - Validar campo 'CNPJ' com Letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                      | Nome do executor | Sprint |
      | 00016 | ISDSTBOF-00016 | Validar campo 'CNPJ' com Letras | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "CNPJ" com Letras (Visualizar NF Remessa)
    Entao o campo "CNPJ" deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00023Loja @webSNF
  Cenario: 00023Loja - Validar campo 'Data Inicio' com Valor Invalido
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Número do CT       | Nome do CT                           | Nome do executor | Sprint |
      | 00023Loja | ISDSTBOF-00023Loja | Validar campo 'Data Inicio' Invalido | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Data Inicio" Valor "36/19/2019" (Visualizar NF Remessa)
    Entao o campo "Data Inicio" devera apresentar o valor "Invalid date" (Visualizar NF Remessa)

  @ISDSTBOF00024Loja @webSNF
  Cenario: 00024Loja - Validar campo 'Data Fim' com Invalido
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Número do CT       | Nome do CT                        | Nome do executor | Sprint |
      | 00024Loja | ISDSTBOF-00024Loja | Validar campo 'Data Fim' Invalido | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Data Fim" Valor "36/19/2019" (Visualizar NF Remessa)
    Entao o campo "Data Fim" devera apresentar o valor "Invalid date" (Visualizar NF Remessa)

  @ISDSTBOF00027Loja @webSNF
  Cenario: 00027Loja - Validar campo 'Data Inicio' com uma Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Número do CT       | Nome do CT                                      | Nome do executor | Sprint |
      | 00027Loja | ISDSTBOF-00027Loja | Validar campo 'Data Inicio' com uma Data Valida | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Data Inicio" com uma Data Valida (Visualizar NF Remessa)
    Entao o campo "Data Inicio" nao deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00028Loja @webSNF
  Cenario: 00028Loja - Validar campo 'Data Fim' com uma Data Valida
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id        | Número do CT       | Nome do CT                                   | Nome do executor | Sprint |
      | 00028Loja | ISDSTBOF-00028Loja | Validar campo 'Data Fim' com uma Data Valida | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando preencho o campo "Data Fim" com uma Data Valida (Visualizar NF Remessa)
    Entao o campo "Data Fim" nao deve estar vazio (Visualizar NF Remessa)

  @ISDSTBOF00031 @webSNF
  Cenario: 00031 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 00031 | ISDSTBOF-00031 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Lojas" com a unidade "310 - BIG BOMPRECO CASA FORTE"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Nota Fiscal" com o valor "96" (Visualizar NF Remessa)
    Entao o campo "Nota Fiscal" deve conter o valor "96" no Grid de Resultado

  @ISDSTBOF00032 @webSNF
  Cenario: 00032 - Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Número do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 00032 | ISDSTBOF-00032 | Validar Pesquisa atraves dos campos 'Unidade de Negocio' e 'Nota Fiscal' | HIlário Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7472 - CENTRO DIST CONTAGEM"
    E Acesso a tela "Recebimento" > "Visualizar NF Remessa"
    Quando efetuo uma pesquisa atraves do campo Unidade de Negocio e "Nota Fiscal" com o valor "5904" (Visualizar NF Remessa)
    Entao o campo "Nota Fiscal" deve conter o valor "5904" no Grid de Resultado
