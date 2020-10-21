#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PesquisaMensagemLegal
@Validado
Funcionalidade: 17.2 - Pesquisa Mensagem Legal

  @ISDSTBOF13308 @webSNF @TelaSNF
  Cenario: 13308 - Validar pesquisa de Mensagem por 'Código'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 13308 | ISDSTBOF-13308 | Validar pesquisa de Mensagem por 'Código' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando digito o valor "1" no campo "Codigo"
    E clico no botao Pesquisar
    Entao deve ser exibido o valor "1" na coluna "Código" do grid de Resultado

  @ISDSTBOF13309 @webSNF @TelaSNF
  Cenario: 13309 - Validar pesquisa de Mensagem por 'Descrição Completa'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 13309 | ISDSTBOF-13309 | Validar pesquisa de Mensagem por 'Descrição Completa' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando digito o valor "Teste 85" no campo "Descricao"
    Entao deve ser exibido o valor "Teste 85" na coluna "Descrição" do grid de Resultado

  @ISDSTBOF13310 @webSNF @TelaSNF
  Cenario: 13310 - Validar pesquisa de Mensagem por 'Descrição Parcial'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 13310 | ISDSTBOF-13310 | Validar pesquisa de Mensagem por 'Descrição Parcial' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando digito o valor "85" no campo "Descricao"
    E clico no botao Pesquisar
    Entao deve ser exibido o valor "85" na coluna "Descrição" do grid de Resultado

  @ISDSTBOF13311 @webSNF @TelaSNF
  Cenario: 13311 - Validar Pesquisa de Mensagem por Código + Descrição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 13311 | ISDSTBOF-13311 | Validar Pesquisa de Mensagem por Código + Descrição | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando digito os valores "1133", "Teste 85" nos campos "Codigo" e "Descricao"
    E clico no botao Pesquisar
    Entao deve ser exibido os valores "1133", "Teste 85" nas coluna "Código" e "Descrição" do grid de Resultado

  @ISDSTBOF13314 @webSNF @TelaSNF
  Cenario: 13314 - Validar ação de Click no Botão Editar
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                            | Nome do executor | Sprint |
      | 13314 | ISDSTBOF-13314 | Validar ação de Click no Botão Editar | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando digito os valores "1133", "Teste 85" nos campos "Codigo" e "Descricao"
    E clico no botao Pesquisar
    E clico no botao Editar da tela de Pesquisa de Mensagem Legal
    Entao deve ser exibido os campo "Inserir Codigo" nao habilitado e "Inserir Descricao" habilitado para edicao

  @ISDSTBOF13317 @webSNF @TelaSNF
  Cenario: 13317 - Validar ação de Click no Botão NOVO
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 13317 | ISDSTBOF-13317 | Validar ação de Click no Botão NOVO | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando clico no botao Novo
    Entao deve ser exibido o campo "Inserir Descricao" habilitado para edicao

  @ISDSTBOF13318 @webSNF @TelaSNF
  Cenario: 13318 - Validar Ação do Click no Botão PESQUISAR
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                               | Nome do executor | Sprint |
      | 13318 | ISDSTBOF-13318 | Validar Ação do Click no Botão PESQUISAR | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando clico no botao Pesquisar
    Entao deve ser exibido todas as mensagens Legais cadastradas

  @ISDSTBOF13319 @webSNF 
  Cenario: 13319 - Inserção de Mensagem preenchendo somente campo Descrição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 13319 | ISDSTBOF-13319 | Inserção de Mensagem preenchendo somente campo Descrição | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando clico no botao Novo
    E digito um valor no campo "Inserir Descricao" e clico em Salvar
    Entao deve ser exibido na tela a mensagem "Cadastro efetuado com sucesso!"

  @ISDSTBOF13320 @webSNF @TelaSNF
  Cenario: 13320 - Valdiar click no botão SALVAR sem preencher nenhum campo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 13320 | ISDSTBOF-13320 | Valdiar click no botão SALVAR sem preencher nenhum campo | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Mensagem Legal"
    Quando clico no botao Novo
    Entao deve ser exibido o botão "Salvar" desabilitado
