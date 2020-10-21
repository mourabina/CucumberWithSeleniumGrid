#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PesquisaParametrosComportamentoSTOperacoesDevolucao
@Validado
Funcionalidade: 17.3 - Pesquisa de Parametros do Comportamento do ST em Operacoes de Devolucao

  @ISDSTBOF14191 @webSNF
  Cenario: 14191 - Validar campo 'Formato' na tela de consulta
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 14191 | ISDSTBOF-14191 | Validar campo 'Formato' na tela de consulta | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no campo de selecao "Formato"
    Entao deve ser apresentado os valores "Selecione...", "Atacado", "Varejo" no campo "Formato"

  @ISDSTBOF14193 @webSNF
  Cenario: 14193 - Validar campo 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                       | Nome do executor | Sprint |
      | 14193 | ISDSTBOF-14193 | Validar campo 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no campo de selecao "Estado de Origem"
    Entao deve ser apresentado no campo "Estado de Origem" uma Lista de Estados Federativos do Brasil

  @ISDSTBOF14194 @webSNF
  Cenario: 14194 - Consulta por Verificar campo 'Formato'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                             | Nome do executor | Sprint |
      | 14194 | ISDSTBOF-14194 | Consulta por Verificar campo 'Formato' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono o valor "Atacado" no campo "Formato"
    E clico no botao pesquisa
    Entao o grid deve apresentar o campo "Tipo de Unidade" com valor "Atacado"

  @ISDSTBOF141945 @webSNF
  Cenario: 14195 - Consulta por Verificar campo 'Empresa'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                             | Nome do executor | Sprint |
      | 14195 | ISDSTBOF-14195 | Consulta por Verificar campo 'Empresa' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono o valor "BOMC - CLUBE DE MULTIFIDELIZACAO" no campo "Empresa"
    E clico no botao pesquisa
    Entao o grid deve apresentar o campo "Empresa" com valor "CLUBE DE MULTIFIDELIZACAO"

  @ISDSTBOF141946 @webSNF
  Cenario: 14196 - Consulta por Verificar campo 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                      | Nome do executor | Sprint |
      | 14196 | ISDSTBOF-14196 | Consulta por Verificar campo 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono o valor "Pernambuco" no campo "Estado de Origem"
    E clico no botao pesquisa
    Entao o grid deve apresentar o campo "Estado de Origem" com valor "PE"

  @ISDSTBOF141947 @webSNF
  Cenario: 14197 - Consulta por Verificar campos 'Formato' + 'Empresa'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 14197 | ISDSTBOF-14197 | Consulta por Verificar campos 'Formato' + 'Empresa' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "BOMC - CLUBE DE MULTIFIDELIZACAO" para os campos "Formato", "Empresa"
    E clico no botao pesquisa
    Entao o grid deve apresentar os campos "Tipo de Unidade", "Empresa" com os valores "Atacado", "CLUBE DE MULTIFIDELIZACAO"

  @ISDSTBOF14198 @webSNF
  Cenario: 14198 - Consulta por Verificar campos 'Formato' + 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 14198 | ISDSTBOF-14198 | Consulta por Verificar campos 'Formato' + 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "São Paulo" para os campos "Formato", "Estado de Origem"
    E clico no botao pesquisa
    Entao o grid deve apresentar os campos "Tipo de Unidade", "Estado de Origem" com os valores "Atacado", "SP"

  @ISDSTBOF14199 @webSNF
  Cenario: 14199 - Consulta por Verificar campos 'Empresa' + 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 14199 | ISDSTBOF-14199 | Consulta por Verificar campos 'Empresa' + 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "BOMC - CLUBE DE MULTIFIDELIZACAO", "Bahia" para os campos "Empresa", "Estado de Origem"
    E clico no botao pesquisa
    Entao o grid deve apresentar os campos "Empresa", "Estado de Origem" com os valores "CLUBE DE MULTIFIDELIZACAO", "BA"

  @ISDSTBOF14200 @webSNF
  Cenario: 14200 - Consulta por Verificar campos 'Formato' + 'Empresa' + 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 14200 | ISDSTBOF-14200 | Consulta por Verificar campos 'Formato' + 'Empresa' + 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "BOMC - CLUBE DE MULTIFIDELIZACAO", "Bahia" para os campos "Formato", "Empresa", "Estado de Origem"
    E clico no botao pesquisa
    Entao o grid deve apresentar os campos "Tipo de Unidade", "Empresa", "Estado de Origem" com os valores "Atacado", "CLUBE DE MULTIFIDELIZACAO", "BA"

  @ISDSTBOF14201 @webSNF
  Cenario: 14201 - Validar Botão 'LIMPAR'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT              | Nome do executor | Sprint |
      | 14201 | ISDSTBOF-14201 | Validar Botão 'LIMPAR'' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "BOMC - CLUBE DE MULTIFIDELIZACAO", "Bahia" para os campos "Formato", "Empresa", "Estado de Origem"
    E clico no botao Limpar
    Entao deve apresentar os campos "Formato", "Empresa", "Estado de Origem" com os valores "Selecione...", "Selecione...", "Selecione..."

  @ISDSTBOF14203 @webSNF
  Cenario: 14203 - Verificar a funcionalidade do botão 'Novo'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                 | Nome do executor | Sprint |
      | 14203 | ISDSTBOF-14203 | Verificar a funcionalidade do botão 'Novo' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    Entao deve ser apresentado todos os campos obrigatorios habilitados para edicao

  @ISDSTBOF14206 @webSNF
  Cenario: 14206 - Verificar campo 'Formato'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                | Nome do executor | Sprint |
      | 14206 | ISDSTBOF-14206 | Verificar campo 'Formato' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E clico no campo de selecao "Cad Formato"
    Entao deve ser apresentado os valores "Selecione...", "Atacado", "Varejo" no campo "Cad Formato"

  @ISDSTBOF14207 @webSNF
  Cenario: 14207 - Verificar campo 'Estado'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT               | Nome do executor | Sprint |
      | 14207 | ISDSTBOF-14207 | Verificar campo 'Estado' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E clico no campo de selecao "Estado"
    Entao deve ser apresentado no campo "Estado" uma Lista de Estados Federativos do Brasil

  @ISDSTBOF14208 @webSNF
  Cenario: 14208 - Verificar campo 'NF Complementar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 14208 | ISDSTBOF-14208 | Verificar campo 'NF Complementar' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E clico no campo de selecao "NF de Ressarcimento"
    Entao deve ser apresentado os valores "Selecione...", "Sim", "Não" no campo "NF de Ressarcimento"

  @ISDSTBOF14209 @webSNF
  Cenario: 14209 - Verificar campo 'Obtém de CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                      | Nome do executor | Sprint |
      | 14209 | ISDSTBOF-14209 | Verificar campo 'Obtém de CFOP' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Obtem do CFOP" deve estar somente para Leitura

  @ISDSTBOF14210 @webSNF
  Cenario: 14210 - Verificar campo 'Natureza de Operação' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 14210 | ISDSTBOF-14210 | Verificar campo 'Natureza de Operação' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "Natureza de Operação" não deve estar presente na tela estilo Select

  @ISDSTBOF14211 @webSNF
  Cenario: 14211 - Verificar campo 'Natureza da Operação' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                | Nome do executor | Sprint |
      | 14211 | ISDSTBOF-14211 | Verificar campo 'Natureza da Operação' se torna visivel não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Natureza de Operação" deve estar presente na tela estilo Select

  @ISDSTBOF14213 @webSNF
  Cenario: 14213 - Verificar campo 'Nat. Oper. Impressa na NF' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                    | Nome do executor | Sprint |
      | 14213 | ISDSTBOF-14213 | Verificar campo 'Nat. Oper. Impressa na NF' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "Natureza Operação Impressa na NF" nao deve estar presente na tela estilo Input

  @ISDSTBOF14214 @webSNF
  Cenario: 14214 - Verificar campo 'Nat. Oper. Impressa na NF' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 14214 | ISDSTBOF-14214 | Verificar campo 'Nat. Oper. Impressa na NF' se torna visivel | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Natureza Operação Impressa na NF" deve estar presente na tela estilo Input

  @ISDSTBOF14216 @webSNF
  Cenario: 14216 - Verificar campo 'CFOP Operação Interna' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 14216 | ISDSTBOF-14216 | Verificar campo 'CFOP Operação Interna' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "CFOP Operação Interna" nao deve estar presente na tela estilo Input

  @ISDSTBOF14217 @webSNF
  Cenario: 14217 - Verificar campo 'CFOP Operação Interna' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 14217 | ISDSTBOF-14217 | Verificar campo 'CFOP Operação Interna' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "CFOP Operação Interna" deve estar presente na tela estilo Input

  @ISDSTBOF14219 @webSNF
  Cenario: 14219 - Verificar campo 'CFOP Operação Externa' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 14219 | ISDSTBOF-14219 | Verificar campo 'CFOP Operação Externa' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "CFOP Operação Externa" nao deve estar presente na tela estilo Input

  @ISDSTBOF14220 @webSNF
  Cenario: 14220 - Verificar campo 'CFOP Operação Externa' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 14220 | ISDSTBOF-14220 | Verificar campo 'CFOP Operação Externa' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "CFOP Operação Externa" deve estar presente na tela estilo Input

  @ISDSTBOF14222 @webSNF
  Cenario: 14222 - Verificar campo 'Código do Item' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 14222 | ISDSTBOF-14222 | Verificar campo 'Código do Item' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "Código do Item" nao deve estar presente na tela estilo Input

  @ISDSTBOF14223 @webSNF
  Cenario: 14223 - Verificar campo 'Código do Item' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 14223 | ISDSTBOF-14223 | Verificar campo 'Código do Item' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Código do Item" deve estar presente na tela estilo Input

  @ISDSTBOF14225 @webSNF
  Cenario: 14225 - Verificar campo 'Descrição do Item' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14225 | ISDSTBOF-14225 | Verificar campo 'Descrição do Item' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "Descrição do Item" nao deve estar presente na tela estilo Input

  @ISDSTBOF14226 @webSNF
  Cenario: 14226 - Verificar campo 'Descrição do Item' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14226 | ISDSTBOF-14226 | Verificar campo 'Descrição do Item' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Descrição do Item" deve estar presente na tela estilo Input

  @ISDSTBOF14228 @webSNF
  Cenario: 14228 - Verificar campo 'CST' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                              | Nome do executor | Sprint |
      | 14228 | ISDSTBOF-14228 | Verificar campo 'CST' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "CST" não deve estar presente na tela estilo Select

  @ISDSTBOF14229 @webSNF
  Cenario: 14229 - Verificar campo 'CST' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                             | Nome do executor | Sprint |
      | 14229 | ISDSTBOF-14229 | Verificar campo 'CST' se torna visivel | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "CST" deve estar presente na tela estilo Select

  @ISDSTBOF14231 @webSNF
  Cenario: 14231 - Verificar campo 'Destaca ST e FCP ST' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 14231 | ISDSTBOF-14231 | Verificar campo 'Destaca ST e FCP ST' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Sim" no campo "NF de Ressarcimento"
    Entao o campo "Destaca ST e FCP ST" não deve estar presente na tela estilo Select

  @ISDSTBOF14232 @webSNF
  Cenario: 14232 - Verificar campo 'Destaca ST e FCP ST' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                             | Nome do executor | Sprint |
      | 14232 | ISDSTBOF-14232 | Verificar campo 'Destaca ST e FCP ST' se torna visivel | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    Entao o campo "Destaca ST e FCP ST" deve estar presente na tela estilo Select

  @ISDSTBOF14233 @webSNF
  Cenario: 14233 - Verificar campo 'Destaca ST e FCP ST'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                            | Nome do executor | Sprint |
      | 14233 | ISDSTBOF-14233 | Verificar campo 'Destaca ST e FCP ST' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco um click no campo de selecao "Destaca ST e FCP ST"
    Entao deve ser apresentado os valores "Selecione...", "Sim", "Não" no campo "Destaca ST e FCP ST"

  @ISDSTBOF14234 @webSNF
  Cenario: 14234 - Verificar campo 'Opção de Destaque' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14234 | ISDSTBOF-14234 | Verificar campo 'Opção de Destaque' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco nova selecao do valor "Sim" no campo "Destaca ST e FCP ST"
    Entao o campo "Opção de Destaque" não deve estar presente na tela estilo Select

  @ISDSTBOF14235 @webSNF
  Cenario: 14235 - Verificar campo 'Opção de Destaque' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 14235 | ISDSTBOF-14235 | Verificar campo 'Opção de Destaque' se torna visivel | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco nova selecao do valor "Não" no campo "Destaca ST e FCP ST"
    Entao o campo "Opção de Destaque" deve estar presente na tela estilo Select

  @ISDSTBOF14236 @webSNF
  Cenario: 14236 - Verificar campo 'Opção de Destaque'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 14236 | ISDSTBOF-14236 | Verificar campo 'Opção de Destaque' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco nova selecao do valor "Não" no campo "Destaca ST e FCP ST"
    E faco um click no campo de selecao "Opcao de Destaque"
    Entao deve apresentar os valores "Selecione...", "Outros Despesas", "Ressarcimento" no campo "Opcao de Destaque"

  @ISDSTBOF14237 @webSNF
  Cenario: 14237 - Verificar campo 'Parâmetros de Ressarcimento' não está presente
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 14237 | ISDSTBOF-14237 | Verificar campo 'Parâmetros de Ressarcimento' não está presente | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco nova selecao do valor "Não" no campo "Destaca ST e FCP ST"
    E faco nova selecao do valor "Outros Despesas" no campo "Opcao de Destaque"
    Entao o campo "Parâmetros de Ressarcimento" não deve estar presente na tela estilo Select

  @ISDSTBOF14238 @webSNF
  Cenario: 14238 - Verificar campo 'Parâmetros de Ressarcimento' se torna visivel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                     | Nome do executor | Sprint |
      | 14238 | ISDSTBOF-14238 | Verificar campo 'Parâmetros de Ressarcimento' se torna visivel | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E seleciono o valor "Não" no campo "NF de Ressarcimento"
    E faco nova selecao do valor "Não" no campo "Destaca ST e FCP ST"
    E faco nova selecao do valor "Ressarcimento" no campo "Opcao de Destaque"
    Entao o campo "Parâmetros de Ressarcimento" deve estar presente na tela estilo Select

  @ISDSTBOF14245 @webSNF
  Cenario: 14245 - Validar botão 'HISTORICO' em registro editado
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14245 | ISDSTBOF-14245 | Validar botão 'HISTORICO' em registro editado | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "Acre" para os campos "Formato", "Estado de Origem"
    E clico no botao Editar do Grid de Resultado de Pesquisa
    E salvo o valor do campo usuario
    E clico no botao Historico
    Entao deve ser exibido a tela de Historico com os dados do registro

  @ISDSTBOF14246 @webSNF
  Cenario: 14246 - Validar botão 'Retornar' na tela de cadastro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 14246 | ISDSTBOF-14246 | Validar botão 'Retornar' na tela de cadastro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando clico no botao Mais
    E clico no botao Retornar da tela de Pesquisa de Parametros
    Entao deve apresentar os campos "Formato", "Empresa", "Estado de Origem" com os valores "Selecione...", "Selecione...", "Selecione..."

  @ISDSTBOF14247 @webSNF
  Cenario: 14247 - Validar a atualização de registro
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 14247 | ISDSTBOF-14247 | Validar a atualização de registro | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Parametros de Comportamento do ST em Operacoes de Devolucao"
    Quando seleciono os valores "Atacado", "Acre" para os campos "Formato", "Estado de Origem"
    E clico no botao Editar do Grid de Resultado de Pesquisa
    E altero o valor do campo "Codigo do Item" e clico em Salvar
    Entao deve ser exibida a seguinte mensagem "Alteração efetuada com sucesso!"
