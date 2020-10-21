#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@NaturezaOperacaoDadosComplementares 
Funcionalidade: 17.3 - Natureza de Operação e Dados Complementares

  @ISDSTBOF14050 @webSNF @TelaSNF
  Cenario: 14050 - Verificar campo 'Tipo de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 14050 | ISDSTBOF-14050 | Verificar campo 'Tipo de Operaço' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no box "Tipo de Operacao"
    Entao deve ser apresentado somente as opcoes "Entrada" e "Saída" no campo "Tipo de Operacao"

  @ISDSTBOF14052 @webSNF  @TelaSNF
  Cenario: 14052 - Verificar campo 'Codigo da Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 14052 | ISDSTBOF-14052 | Verificar campo 'Codigo da Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando digito os valores "aa" no campo Codigo da Natureza
    Entao deve ser exido a mensagem "Não há resultados..." no grid de Resultados

  @ISDSTBOF14053 @webSNF @TelaSNF
  Cenario: 14053 - Verificar campo 'Situação da Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                             | Nome do executor | Sprint |
      | 14053 | ISDSTBOF-14053 | Verificar campo 'Situação da Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no box "Situacao da Natureza"
    Entao deve ser apresentado somente as opcoes "Ativo" e "Inativo" no campo "Situacao da Natureza"

  @ISDSTBOF14054 @webSNF @TelaSNF
  Cenario: 14054 - Verificar Pesquisa por 'Agrupamento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                           | Nome do executor | Sprint |
      | 14054 | ISDSTBOF-14054 | Verificar Pesquisa por 'Agrupamento' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Retorno de Remessa" na tela d Pesquisa
    Entao no campo "Agrupamento" do Grid de Resultado deve conter o valor "Retorno de Remessa"

  @ISDSTBOF14055 @webSNF @TelaSNF
  Cenario: 14055 - Verificar Pesquisa por 'Tipo de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 14055 | ISDSTBOF-14055 | Verificar Pesquisa por 'Tipo de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Tipo de operacao" com o valor "Entrada" na tela d Pesquisa
    Entao no campo "Tipo de Operação" do Grid de Resultado deve conter o valor "Entrada"

  @ISDSTBOF14056 @webSNF @TelaSNF
  Cenario: 14056 - Verificar Pesquisa por 'Natureza da Operacao'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14056 | ISDSTBOF-14056 | Verificar Pesquisa por 'Natureza da Operacao' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando seleciono o valor "RETRMS - Entrada Retorno de Remessa de Mercadoria" no campo "Natureza de Operacao" na tela de Pesquisa
    Entao no campo "Descrição de Natureza" do Grid de Resultado deve conter o valor "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14057 @webSNF @TelaSNF
  Cenario: 14057 - Verificar Pesquisa por 'Codigo da Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 14057 | ISDSTBOF-14057 | Verificar Pesquisa por 'Codigo da Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando digito os valores "RETREMESSA" no campo Codigo da Natureza
    Entao no campo "Código de Natureza" do Grid de Resultado deve conter o valor "RETREMESSA"

  @ISDSTBOF14058 @webSNF @TelaSNF
  Cenario: 14058 - Verificar Pesquisa por 'Situação da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14058 | ISDSTBOF-14058 | Verificar Pesquisa por 'Situação da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Situacao da Natureza" com o valor "Ativo" na tela d Pesquisa
    Entao no campo "Situação da Natureza" do Grid de Resultado deve conter o valor "Ativo"

  @ISDSTBOF14059 @webSNF @TelaSNF
  Cenario: 14059 - Verificar funcionalidade do botao 'Limpar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                 | Nome do executor | Sprint |
      | 14059 | ISDSTBOF-14059 | Verificar funcionalidade do botao 'Limpar' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho todos os campos
    E clico no botão Limpar
    Entao todos os campos devem voltar para o estado inicial

  @ISDSTBOF14060 @webSNF @TelaSNF
  Cenario: 14060 - Verificar funcionalidade do botao 'Pesquisar' sem campos preenchidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                           | Nome do executor | Sprint |
      | 14060 | ISDSTBOF-14060 | Verificar funcionalidade do botao 'Pesquisar' sem campos preenchidos | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    Entao deve retornar as Natureza de operacao cadastradas

  @ISDSTBOF14062 @webSNF @TelaSNF
  Cenario: 14062 - Verificar funcionalidade da coluna 'Editar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 14062 | ISDSTBOF-14062 | Verificar funcionalidade da coluna 'Editar' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao deve ser apresentado a tela de Natureza de Operacao com o titulo "Dados da Natureza de Operação"

  @ISDSTBOF14063 @webSNF @TelaSNF
  Cenario: 14063 - Consulta por campos 'Agrupamentos' + 'Tipo de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 14063 | ISDSTBOF-14063 | Consulta por campos 'Agrupamentos' + 'Tipo de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Remessa de Mercadoria" e "Tipo de Operacao" como Valor "Entrada"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" deve conter o valor "Remessa de Mercadoria" e o campo "Tipo de Operação" o valor "Entrada"

  @ISDSTBOF14064 @webSNF @TelaSNF
  Cenario: 14064 - Consulta por campos 'Agrupamentos' + 'Código da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 14064 | ISDSTBOF-14064 | Consulta por campos 'Agrupamentos' + 'Código da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Remessa de Mercadoria" e Código da natureza como Valor "REMEMERC"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" deve conter o valor "Remessa de Mercadoria" e o campo "Código de Natureza" o valor "REMEMERC"

  @ISDSTBOF14065 @webSNF @TelaSNF
  Cenario: 14065 - Consulta por campos 'Agrupamentos' + 'Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 14065 | ISDSTBOF-14065 | Consulta por campos 'Agrupamentos' + 'Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Remessa de Mercadoria" e "Natureza de Operacao" como Valor "REMEMERC - Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" deve conter o valor "Remessa de Mercadoria" e o campo "Descrição de Natureza" o valor "Remessa de Mercadoria"

  @ISDSTBOF14066 @webSNF @TelaSNF
  Cenario: 14066 - Consulta por campos 'Agrupamentos' + 'Situação da Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 14066 | ISDSTBOF-14066 | Consulta por campos 'Agrupamentos' + 'Situação da Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Remessa de Mercadoria" e "Situacao da Natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" deve conter o valor "Remessa de Mercadoria" e o campo "Situação da Natureza" o valor "Ativo"

  @ISDSTBOF14067 @webSNF @TelaSNF
  Cenario: 14067 - Consulta por campos 'Tipo de Operação' + 'Código da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                    | Nome do executor | Sprint |
      | 14067 | ISDSTBOF-14067 | Consulta por campos 'Tipo de Operação' + 'Código da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Tipo de Operacao" com o valor "Entrada" e "Situacao da Natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" deve conter o valor "Entrada" e o campo "Situação da Natureza" o valor "Ativo"

  @ISDSTBOF14068 @webSNF @TelaSNF
  Cenario: 14068 - Consulta por campos 'Tipo de Operação' + 'Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 14068 | ISDSTBOF-14068 | Consulta por campos 'Tipo de Operação' + 'Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Tipo de Operacao" com o valor "Entrada" e "Natureza de Operacao" como Valor "RETRMS - Entrada Retorno de Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" deve conter o valor "Entrada" e o campo "Descrição de Natureza" o valor "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14069 @webSNF @TelaSNF
  Cenario: 14069 - Consulta por campos 'Tipo de Operação' + 'Situação da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 14069 | ISDSTBOF-14069 | Consulta por campos 'Tipo de Operação' + 'Situação da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Tipo de Operacao" com o valor "Entrada" e "Situacao da natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" deve conter o valor "Entrada" e o campo "Situação da Natureza" o valor "Ativo"

  @ISDSTBOF14070 @webSNF @TelaSNF
  Cenario: 14070 - Consulta por campos 'Código da natureza' + 'Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                        | Nome do executor | Sprint |
      | 14070 | ISDSTBOF-14070 | Consulta por campos 'Código da natureza' + 'Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo Codigo de Natureza com o valor "RETRMS" e "Natureza de Operacao" como Valor "RETRMS - Entrada Retorno de Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Código de Natureza" deve conter o valor "RETRMS" e o campo "Descrição de Natureza" o valor "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14071 @webSNF @TelaSNF
  Cenario: 14071 - Consulta por campos 'Código da natureza' + 'Situação da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                        | Nome do executor | Sprint |
      | 14071 | ISDSTBOF-14071 | Consulta por campos 'Código da natureza' + 'Situação da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo Codigo de Natureza com o valor "RETRMS" e "Situacao da natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Código de Natureza" deve conter o valor "RETRMS" e o campo "Situação da Natureza" o valor "Ativo"

  @ISDSTBOF14072 @webSNF @TelaSNF
  Cenario: 14072 - Consulta por campos 'Natureza de Operação' + 'Situaçãoda Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 14072 | ISDSTBOF-14072 | Consulta por campos 'Natureza de Operação' + 'Situaçãoda Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Natureza de Operacao" com o valor "RETRMS - Entrada Retorno de Remessa de Mercadoria" e "Situacao da natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Situação da Natureza" deve conter o valor "Ativo" e o campo "Descrição de Natureza" o valor "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14073 @webSNF @TelaSNF
  Cenario: 14073 - Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                    | Nome do executor | Sprint |
      | 14073 | ISDSTBOF-14073 | Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Agrupamento" com "Retorno de Remessa" e "Tipo de Operacao" como "Entrada" e preencho o campo Codigo de natureza com "RETRMS"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" com "Retorno de Remessa" e "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS"

  @ISDSTBOF14074 @webSNF @TelaSNF
  Cenario: 14074 - Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                      | Nome do executor | Sprint |
      | 14074 | ISDSTBOF-14074 | Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Agrupamento" com "Retorno de Remessa" e "Tipo de Operacao" como "Entrada" e "Natureza de Operacao" com "RETRMS - Entrada Retorno de Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" com "Retorno de Remessa" e "Tipo de Operação" com "Entrada" e "Descrição de Natureza" com "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14075 @webSNF @TelaSNF
  Cenario: 14075 - Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Situação da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                      | Nome do executor | Sprint |
      | 14075 | ISDSTBOF-14075 | Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Situação da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Agrupamento" com "Retorno de Remessa" e "Tipo de Operacao" como "Entrada" e "Situacao da natureza" com "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" com "Retorno de Remessa" e "Tipo de Operação" com "Entrada" e "Situação da Natureza" com "Ativo"

  @ISDSTBOF14076 @webSNF @TelaSNF
  Cenario: 14076 - Consulta por campos 'Tipo de Operação' + 'Código da natureza' + 'Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                             | Nome do executor | Sprint |
      | 14076 | ISDSTBOF-14076 | Consulta por campos 'Tipo de Operação' + 'Código da natureza' + 'Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Tipo de Operacao" com "Entrada" e "Natureza de Operacao" como "RETRMS - Entrada Retorno de Remessa de Mercadoria" e preencho o campo Codigo de natureza com "RETRMS"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS" e "Descrição de Natureza" com "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14077 @webSNF @TelaSNF
  Cenario: 14077 - Consulta por campos 'Tipo de Operação' + 'Código da natureza' + 'Situação da Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                             | Nome do executor | Sprint |
      | 14077 | ISDSTBOF-14077 | Consulta por campos 'Tipo de Operação' + 'Código da natureza' + 'Situação da Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Tipo de Operacao" com "Entrada" e "Situacao da Natureza" como "Ativo" e preencho o campo Codigo de natureza com "RETRMS"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS" e "Situação da Natureza" com "Ativo"

  @ISDSTBOF14078 @webSNF @TelaSNF
  Cenario: 14078 - Consulta por campos 'Código da natureza' + 'Natureza de Operação' + 'Situaçãoda Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                | Nome do executor | Sprint |
      | 14078 | ISDSTBOF-14078 | Consulta por campos 'Código da natureza' + 'Natureza de Operação' + 'Situaçãoda Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho "Situacao da Natureza" com "Ativo" e "Natureza de Operacao" como "RETRMS - Entrada Retorno de Remessa de Mercadoria" e preencho o campo Codigo de natureza com "RETRMS"
    E clico no botão Pesquisar
    Entao o campo "Código de Natureza" com "RETRMS" e "Situação da Natureza" com "Ativo" e "Descrição de Natureza" com "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14079 @webSNF @TelaSNF
  Cenario: 14079 - Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza' + ' Natureza de Operação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                              | Nome do executor | Sprint |
      | 14079 | ISDSTBOF-14079 | Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza' + ' Natureza de Operação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Retorno de Remessa" e "Tipo de Operacao" como Valor "Entrada"
    E preencho o campo Codigo de Natureza com o valor "RETRMS" e "Natureza de Operacao" como Valor "RETRMS - Entrada Retorno de Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" com "Retorno de Remessa" e "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS" e "Descrição de Natureza" com "Entrada Retorno de Remessa de Mercadoria"

  @ISDSTBOF14080 @webSNF @TelaSNF
  Cenario: 14080 - Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza' + 'Situação da natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                             | Nome do executor | Sprint |
      | 14080 | ISDSTBOF-14080 | Consulta por campos 'Agrupamento' + 'Tipo de Operação' + 'Código da natureza' + 'Situação da natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Agrupamento" com o valor "Retorno de Remessa" e "Tipo de Operacao" como Valor "Entrada"
    E preencho o campo Codigo de Natureza com o valor "RETRMS" e "Situacao da natureza" como Valor "Ativo"
    E clico no botão Pesquisar
    Entao o campo "Agrupamento" com "Retorno de Remessa" e "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS" e "Situação da Natureza" com "Ativo"

  @ISDSTBOF14081 @webSNF @TelaSNF
  Cenario: 14081 - Consulta por campos 'Tipo de Operação' + 'Código da natureza' + ' Natureza de Operação' + 'Situação da Natureza'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                                       | Nome do executor | Sprint |
      | 14081 | ISDSTBOF-14081 | Consulta por campos 'Tipo de Operação' + 'Código da natureza' + ' Natureza de Operação' + 'Situação da Natureza' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando preencho o campo "Tipo de Operacao" com o valor "Entrada" e "Situacao da natureza" como Valor "Ativo"
    E preencho o campo Codigo de Natureza com o valor "RETRMS" e "Natureza de Operacao" como Valor "RETRMS - Entrada Retorno de Remessa de Mercadoria"
    E clico no botão Pesquisar
    Entao o campo "Tipo de Operação" com "Entrada" e "Código de Natureza" com "RETRMS" e "Descrição de Natureza" com "Entrada Retorno de Remessa de Mercadoria" e "Situação da Natureza" com "Ativo"

  @ISDSTBOF14083 @webSNF @TelaSNF
  Cenario: 14083 - Verificar funcionalidade do botao '+'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                            | Nome do executor | Sprint |
      | 14083 | ISDSTBOF-14083 | Verificar funcionalidade do botao '+' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    Entao será apreentado a tela de Criação de Natureza de Operação

  @ISDSTBOF14084 @webSNF @TelaSNF
  Cenario: 14084 - Validar campo 'Código da Natureza de Operação' no cadastro já existente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                              | Nome do executor | Sprint |
      | 14084 | ISDSTBOF-14084 | Validar campo 'Código da Natureza de Operação' no cadastro já existente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho o campo Codigo da Natureza de Operacao com o valor "RETRMS"
    E preencho o restantes dos campos obrigatorios e clico em Salvar
    Entao deve ser apresentado a mensagem "Código de Natureza de Operação já existe"

  @ISDSTBOF14085 @webSNF @TelaSNF
  Cenario: 14085 - Validar campo 'Tipo de Operação' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 14085 | ISDSTBOF-14085 | Validar campo 'Tipo de Operação' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no campo de Selecao "Tipo de Operacao Formulario"
    Entao deve ser apresentado somente as opcoes "Selecione..." e "Entrada" e "Saída"

  @ISDSTBOF14086 @webSNF @TelaSNF
  Cenario: 14086 - Validar campo 'Situação da natureza' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 14086 | ISDSTBOF-14086 | Validar campo 'Situação da natureza' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no campo de Selecao "Situacao da natureza Formulario"
    Entao deve ser apresentado somente as opcoes "Ativo" e "Inativo" no campo Situacao da Natureza

  @ISDSTBOF14087 @webSNF @TelaSNF
  Cenario: 14087 - Validar campo 'Descrição de Natureza de Operação' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 14087 | ISDSTBOF-14087 | Validar campo 'Descrição Natureza de Operação' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho o campo "Descricao de Natureza de Operacao" com o valor "ASS77777@#%&*!" na natureza de op
    Entao deve ser apresentado o valor "ASS77777@#%&*!" digitado

  @ISDSTBOF14100 @webSNF @TelaSNF
  Cenario: 14100 - Validar campo 'Obtém de CFOP' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 14100 | ISDSTBOF-14100 | Validar campo 'Obtém de CFOP' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no campo de Selecao "Obtem do CFOP"
    Entao deve ser apresentado somente os valores "Sim" e "Não"

  @ISDSTBOF14101 @webSNF @TelaSNF
  Cenario: 14101 - Validar campo 'Descrição Natureza de Operação na NF' com campo 'Obtém do CFOP' = 'Sim'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                             | Nome do executor | Sprint |
      | 14101 | ISDSTBOF-14101 | Validar campo 'Descrição Natureza de Operação na NF' com campo 'Obtém do CFOP' = 'Sim' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Sim" no campo "Obtem do CFOP"
    Entao o campo Descricao Natureza de operacao na NF deve estar desabilitado para edicao

  @ISDSTBOF14102 @webSNF @TelaSNF
  Cenario: 14102 - Validar campo 'Descrição Natureza de Operação na NF' com campo 'Obtém do CFOP' = 'Não'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                             | Nome do executor | Sprint |
      | 14102 | ISDSTBOF-14102 | Validar campo 'Descrição Natureza de Operação na NF' com campo 'Obtém do CFOP' = 'Não' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Não" no campo "Obtem do CFOP"
    Entao o campo "Descricao da Natureza de operacao NF" na NF deve estar habilitado para edicao

  @ISDSTBOF14105 @webSNF @TelaSNF
  Cenario: 14105 - Validar campo 'CFOP' bloqueado no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                 | Nome do executor | Sprint |
      | 14105 | ISDSTBOF-14105 | Validar campo 'CFOP' bloqueado no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Converter CFOP" no campo "Tipo de Selecao"
    Entao o campo "CFOP" na NF deve estar desabilitado para edicao

  @ISDSTBOF14106 @webSNF @TelaSNF
  Cenario: 14106 - Validar campo 'CFOP' liberado no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 14106 | ISDSTBOF-14106 | Validar campo 'CFOP' liberado no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Selecionar CFOP" no campo "Tipo de Selecao"
    Entao o campo "CFOP" no formulario de Natureza de operacao deve estar habilitado para edicao

  @ISDSTBOF14109 @webSNF @TelaSNF
  Cenario: 14109 - Validar campo 'CFOP NF' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 14109 | ISDSTBOF-14109 | Validar campo 'CFOP NF' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no campo de Selecao "CFOP NF"
    Entao deve ser apresentado somente os valores "Selecione..." e "Converter CFOP" e "Selecionar CFOP" no campo "CFOP NF"

  @ISDSTBOF14110 @webSNF @TelaSNF
  Cenario: 14110 - Validar campo 'Dentro da UF' com campo 'CFOP NF' != 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                            | Nome do executor | Sprint |
      | 14110 | ISDSTBOF-14110 | Validar campo 'Dentro da UF' com campo 'CFOP NF' != 'Selecionar CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Converter CFOP" no campo "CFOP NF"
    Entao o campo "Dentro da UF" na NF deve estar desabilitado para edicao

  @ISDSTBOF14111 @webSNF @TelaSNF
  Cenario: 14111 - Validar campo 'Dentro da UF' com campo 'CFOP NF' = 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                           | Nome do executor | Sprint |
      | 14111 | ISDSTBOF-14111 | Validar campo 'Dentro da UF' com campo 'CFOP NF' = 'Selecionar CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Selecionar CFOP" no campo "CFOP NF"
    Entao o campo "Dentro da UF" no formulario de Natureza de operacao deve estar habilitado para edicao

  @ISDSTBOF14112 @webSNF @TelaSNF
  Cenario: 14112 - Validar campo 'Fora da UF' com campo 'CFOP NF' != 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                          | Nome do executor | Sprint |
      | 14112 | ISDSTBOF-14112 | Validar campo 'Fora da UF' com campo 'CFOP NF' != 'Selecionar CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Converter CFOP" no campo "CFOP NF"
    Entao o campo "Fora da UF" na NF deve estar desabilitado para edicao

  @ISDSTBOF14113 @webSNF @TelaSNF
  Cenario: 14113 - Validar campo 'Fora da UF' com campo 'CFOP NF' != 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                           | Nome do executor | Sprint |
      | 14113 | ISDSTBOF-14113 | Validar campo 'Fora da UF' com campo 'CFOP NF' != 'Selecionar CFOP'v | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Seleciinar CFOP" no campo "CFOP NF"
    Entao o campo "Fora da UF" no formulario de Natureza de operacao deve estar habilitado para edicao

  @ISDSTBOF14114 @webSNF @TelaSNF
  Cenario: 14114 - Validar campo 'Exportação' com campo 'CFOP NF' != 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                          | Nome do executor | Sprint |
      | 14114 | ISDSTBOF-14114 | Validar campo 'Exportação' com campo 'CFOP NF' != 'Selecionar CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Converter CFOP" no campo "CFOP NF"
    Entao o campo "Exportacao" na NF deve estar desabilitado para edicao

  @ISDSTBOF14115 @webSNF @TelaSNF
  Cenario: 14115 - Validar campo 'Exportação' com campo 'CFOP NF' = 'Selecionar CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 14115 | ISDSTBOF-14115 | Validar campo 'Exportação' com campo 'CFOP NF' = 'Selecionar CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E seleciono a opcao "Selecionar CFOP" no campo "CFOP NF"
    Entao o campo "Exportacao" no formulario de Natureza de operacao deve estar habilitado para edicao

  @ISDSTBOF14117 @webSNF @TelaSNF
  Cenario: 14117 - Validar campo 'Origem' e 'Destino' repetidos no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 14117 | ISDSTBOF-14117 | Validar campo 'Origem' e 'Destino' repetidos no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando preencho o formulario com dados já cadastrados
    Entao deve ser exibida a mensagem "Ja existe essa configuraçao de dados para essa natureza!"

  @ISDSTBOF14119 @webSNF @TelaSNF
  Cenario: 14119 - Validar campo 'Tipo de Nota' repetidos no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 14119 | ISDSTBOF-14119 | Validar campo 'Tipo de Nota' repetidos no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando preencho o formulario somente com o Tipo de Nota ja cadastrado
    Entao deve ser exibido o registro na secao Formato de origem e destino X tipo de nota fiscal

  @ISDSTBOF14120 @webSNF @TelaSNF
  Cenario: 14120 - Verificar exclusão de registro de 'Origem e Destino X tipo de Nota'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                          | Nome do executor | Sprint |
      | 14120 | ISDSTBOF-14120 | Verificar exclusão de registro de 'Origem e Destino X tipo de Nota' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botão Remover
    Entao o registro deve ser excluido com sucesso

  @ISDSTBOF14129 @webSNF @TelaSNF
  Cenario: 14129 - Verificar campo 'Atualizar Estoque' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                      | Nome do executor | Sprint |
      | 14129 | ISDSTBOF-14129 | Verificar campo 'Atualizar Estoque' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no campo "Atualizar Estoque"
    Entao o campo "Atualizar Estoque" deve exibir "Selecione...", "SIM" e "NÃO"

  @ISDSTBOF14130 @webSNF @TelaSNF
  Cenario: 14130 - Verificar campo 'Controle de Assitência Tecnica' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 14130 | ISDSTBOF-14130 | Verificar campo 'Controle de Assitência Tecnica' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no campo "Controle de Assistencia Tecnica"
    Entao o campo "Controle de Assistencia Tecnica" deve exibir "Selecione...", "SIM" e "NÃO"

  @ISDSTBOF14131 @webSNF @TelaSNF
  Cenario: 14131 - Verificar campo 'Recupera ICMS ST' no cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 14131 | ISDSTBOF-14131 | Verificar campo 'Recupera ICMS ST' no cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no campo "Recupera ICMS ST"
    Entao o campo "Recupera ICMS ST" deve exibir "Selecione...", "SIM" e "NÃO"

  @ISDSTBOF14132 @webSNF @TelaSNF
  Cenario: 14132 - Verificar campo 'Código da Natureza de Operação' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 14132 | ISDSTBOF-14132 | Verificar campo 'Código da Natureza de Operação' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    E salvo o valor da coluna "Código de Natureza"
    E clico no botao Editar
    Entao o campo "Codigo de Natureza de Operacao" na NF deve estar habilitado para edicao

  @ISDSTBOF14133 @webSNF @TelaSNF
  Cenario: 14133 - Verificar campo 'Tipo de Operação' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 14133 | ISDSTBOF-14133 | Verificar campo 'Tipo de Operação' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
   Quando clico no botão Pesquisar sem preencher nenhum campo
    E salvo o valor da coluna "Tipo de Operação"
    E clico no botao Editar
    Entao o campo "Tipo de Operacao Formulario" na NF deve estar habilitado para edicao e como valor utilizado no cadastro

  @ISDSTBOF14134 @webSNF @TelaSNF
  Cenario: 14134 - Verificar campo 'Situação da natureza' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 14134 | ISDSTBOF-14134 | Verificar campo 'Situação da natureza' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    E salvo o valor da coluna "Situação da Natureza"
    E clico no botao Editar
    Entao o campo "Situacao da natureza Formulario" na NF deve estar habilitado para edicao e como valor utilizado no cadastro

  @ISDSTBOF141345 @webSNF @TelaSNF
  Cenario: 14135 - Verificar campo 'Descrição Natureza Operação' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 14135 | ISDSTBOF-14135 | Verificar campo 'Descrição Natureza Operação' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    E salvo o valor da coluna "Descrição de Natureza"
    E clico no botao Editar
    Entao o campo "Descricao de Natureza de Operacao" deve estar habilitado para edicao e como valor utilizado no cadastro

  @ISDSTBOF14136 @webSNF @TelaSNF
  Cenario: 141346 - Verificar campo 'Agrupamento' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 14136 | ISDSTBOF-14136 | Verificar campo 'Agrupamento' na tela de ediçãoo | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    E salvo o valor da coluna "Agrupamento"
    E clico no botao Editar
    Entao o campo "Agrupamento Formulario" na NF deve estar habilitado para edicao e como valor utilizado no cadastro

  @ISDSTBOF141347 @webSNF @TelaSNF
  Cenario: 141347 - Verificar se seção 'Agrupamento da natureza de operação' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                 | Nome do executor | Sprint |
      | 14137 | ISDSTBOF-14137 | Verificar se seção 'Agrupamento da natureza de operação' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao Todos os campos da secão Agrupamento da Natura de Operação deverem está preenchidos e desabilitados

  @ISDSTBOF141348 @webSNF @TelaSNF
  Cenario: 141348 - Verificar campo 'Obtém de CFOP' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 14138 | ISDSTBOF-14138 | Verificar campo 'Obtém de CFOP' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Obtem do CFOP" deve estar habilitado para edição

  @ISDSTBOF141349 @webSNF @TelaSNF
  Cenario: 141349 - Verificar campo 'Tipo de Nat. Operação Referente' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 14139 | ISDSTBOF-14139 | Verificar campo 'Obtém de CFOP' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Tipo de Nat Operacao Referente" deve estar habilitado para edição

  @ISDSTBOF14140 @webSNF @TelaSNF
  Cenario: 14140 - Verificar campo 'Tipo de Seleção' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 14140 | ISDSTBOF-14140 | Verificar campo 'Tipo de Seleção' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Tipo de Selecao" deve estar habilitado para edição

  @ISDSTBOF14142 @webSNF @TelaSNF
  Cenario: 14142 - Verificar campo 'CFOP NF' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 14142 | ISDSTBOF-14142 | Verificar campo 'CFOP NF' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "CFOP NF" deve estar habilitado para edição

  @ISDSTBOF14143 @webSNF @TelaSNF
  Cenario: 14143 - Verificar campo 'Dentro da UF' na tela de edição desabilitado
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                    | Nome do executor | Sprint |
      | 14143 | ISDSTBOF-14143 | Verificar campo 'Dentro da UF' na tela de edição desabilitado | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Dentro da UF" deve estar habilitado para edição

  @ISDSTBOF14152 @webSNF @TelaSNF
  Cenario: 14152 - Verificar campos da seção 'CFOP da Nota Fiscal por CST' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                | Nome do executor | Sprint |
      | 14152 | ISDSTBOF-14152 | Verificar campos da seção 'CFOP da Nota Fiscal por CST' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao os campos da secao CFOP da Nota Fiscal por CST deve está habilitados para edicao

  @ISDSTBOF14153 @webSNF @TelaSNF
  Cenario: 14153 - Verificar campo 'Atualizar Estoque' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14153 | ISDSTBOF-14153 | Verificar campo 'Atualizar Estoque' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Atualizar Estoque" deve estar habilitado para edição

  @ISDSTBOF14154 @webSNF @TelaSNF
  Cenario: 14154 - Verificar campo 'Controle Assistência Técnica' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14154 | ISDSTBOF-14154 | Verificar campo 'Atualizar Estoque' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Controle de Assistencia Tecnica" deve estar habilitado para edição

  @ISDSTBOF14155 @webSNF @TelaSNF
  Cenario: 14155 - Verificar campo 'Recupera ICMS ST' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14155 | ISDSTBOF-14155 | Verificar campo 'Atualizar Estoque' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Recupera ICMS ST" deve estar habilitado para edição

  @ISDSTBOF14156 @webSNF @TelaSNF
  Cenario: 14156 - Verificar campo 'Obriga Nota Fiscal Referente' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                       | Nome do executor | Sprint |
      | 14156 | ISDSTBOF-14156 | Verificar campo 'Obriga Nota Fiscal Referente' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Obriga nota fiscal referente" deve estar habilitado para edição

  @ISDSTBOF14157 @webSNF @TelaSNF
  Cenario: 14157 - Verificar campo 'Permite Recebimento Parcial' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 14157 | ISDSTBOF-14157 | Verificar campo 'Permite Recebimento Parcial' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico em pesquisar depois Editar
    Entao o campo "Permite recebimento parcial" deve estar habilitado para edição

  @ISDSTBOF14159 @webSNF @TelaSNF
  Cenario: 14159 - Verificar campo 'Usuário' na edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 14159 | ISDSTBOF-14159 | Verificar campo 'Usuário' na edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos obrigatorios e clico em Salvar
    Entao deve ser exibido o nome do usuario "SVCautqea" criador do cadastro

  @ISDSTBOF14160 @webSNF @TelaSNF
  Cenario: 14160 - Verificar campo 'Data da Ultima Atualização' na edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 14160 | ISDSTBOF-14160 | Verificar campo 'Usuário' na edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos obrigatorios e clico em Salvar
    Entao deve ser exibido a Data da Ultima Atualização

  @ISDSTBOF14161 @webSNF @TelaSNF
  Cenario: 14161 - Verificar a funcionalidade do botao 'Salvar' quando os campos obrigatórios não estão preenchidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                      | Nome do executor | Sprint |
      | 14161 | ISDSTBOF-14161 | erificar a funcionalidade do botao 'Salvar' quando os campos obrigatórios não estão preenchidos | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    Entao o botao Salvar deve esta desabilitado

  @ISDSTBOF14162 @webSNF @TelaSNF
  Cenario: 14162 - Verificar a funcionalidade do botao 'Salvar' quando os campos obrigatórios estão preenchidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                   | Nome do executor | Sprint |
      | 14162 | ISDSTBOF-14162 | Verificar a funcionalidade do botao 'Salvar' quando os campos obrigatórios estão preenchidos | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos obrigatorios e clico em Salvar
    Entao deve ser apresentado os dados em nova pesquisa

  @ISDSTBOF14163 @webSNF @TelaSNF
  Cenario: 14163 - Verificar funcionalidade do botao 'Histórico'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14163 | ISDSTBOF-14163 | Verificar funcionalidade do botao 'Histórico' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no botao Historico
    Entao deve ser apresentado a tela "Histórico"

  @ISDSTBOF14164 @webSNF @TelaSNF
  Cenario: 14164 - Verificar funcionalidade do botao 'Retornar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14164 | ISDSTBOF-14164 | Verificar funcionalidade do botao 'Histórico' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E clico no botao Retornar
    Entao deve ser apresentado a tela de Pesquisa de Natureza de Operacao

  @ISDSTBOF14165 @webSNF @TelaSNF
  Cenario: 14165 - Verificar funcionalidade do botao 'Mensagem Legal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 14165 | ISDSTBOF-14165 | Verificar funcionalidade do botao 'Mensagem Legal' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botão Pesquisar sem preencher nenhum campo
    E clico no botao Editar
    E clico no botao Mensagem Legal
    Entao deve ser apresentado a tela de "Natureza de Operação x Mensagens Legais"

  @ISDSTBOF14166 @webSNF @TelaSNF
  Cenario: 14166 - Verificar funcionalidade do botao 'Histórico' para novo registros
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT  | Nome do CT                                                        | Nome do executor | Sprint |
      | 14166 | ISDSTBOF-1416 | Verificar funcionalidade do botao 'Histórico' para novo registros | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos obrigatorios e clico em Salvar
    E clico no botao Historico
    Entao deve ser apresentado o registro cadastrado

  @ISDSTBOF14167 @webSNF @TelaSNF
  Cenario: 14167 - Verificar funcionalidade do botao 'Histórico' para alteração de registros
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT  | Nome do CT                                                                | Nome do executor | Sprint |
      | 14167 | ISDSTBOF-1417 | Verificar funcionalidade do botao 'Histórico' para alteração de registros | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos obrigatorios e clico em Salvar
    E edito o cadastro e salvo
    Entao deve ser apresentado o registro  com o cadastrado alterado na tela de historico
