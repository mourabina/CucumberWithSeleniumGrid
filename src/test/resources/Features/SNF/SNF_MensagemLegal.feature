#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@MensagemLegal
Funcionalidade: 17.2 - Mensagem Legal

  @ISDSTBOF13285 @webSNF @TelaSNF
  Cenario: 13285 - Insersão de Data menor que Data Atual no campo 'Data Início da Vigência'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 13285 | ISDSTBOF-13285 | Insersão de Data menor que Data Atual no campo 'Data Início da Vigência' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E preencho todos os campos Obrigatorios e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono o valor "Dados Adicionais" no campo "Local Mensagem Nacional" estilo selecao e clico em pesquisar da aba "Nacional"
    E faco a selecao da Mensagem Legal da aba "Nacional"
    E digito a data de "Fim da Vigencia" menor que a Data "Inicio da Vigencia"
    Entao deve ser exibido a seguinte mensagem "Intervalo de Datas da vigência inválidas."

  @ISDSTBOF13286 @webSNF @TelaSNF
  Cenario: 13286 - Validar o Clicar no Botão 'Histórico' da Aba Nacional
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 13286 | ISDSTBOF-13286 | Validar o Clicar no Botão 'Histórico' da Aba Nacional | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba Nacional
    E clico no botao Historico da aba "Aba Nacional"
    Entao deve ser exibida a tela Historico com o valor "SVCautqea" no campo Usuario

  @ISDSTBOF13287 @webSNF @TelaSNF
  Cenario: 13287 - Validar o Clicar no Botão 'Histórico' da Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 13287 | ISDSTBOF-13287 | Validar o Clicar no Botão 'Histórico' da Aba Estadual | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    E salvo o valor do campo Usuario
    E clico no botao Historico da aba "Aba Estadual"
    Entao deve ser exibida a tela Historico com o valor "SVCautqea" no campo Usuario

  @ISDSTBOF13288 @webSNF @TelaSNF
  Cenario: 13288 - Validar o Clicar no Botão 'Histórico' da Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 13288 | ISDSTBOF-13288 | Validar o Clicar no Botão 'Histórico' da Aba Filial | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    E salvo o valor do campo Usuario
    E clico no botao Historico da aba "Aba Filial"
    Entao deve ser exibida a tela Historico com o valor "SVCautqea" no campo Usuario

  @ISDSTBOF13289 @webSNF @TelaSNF
  Cenario: 13289 - Validar o Clicar no Botão 'Retornar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                         | Nome do executor | Sprint |
      | 13289 | ISDSTBOF-13289 | Validar o Clicar no Botão 'Voltar' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    E clico no botao Mensagem Legal
    Quando clico no botao Retornar
    Entao deve ser exibida a tela Natureza de Operacao

  @ISDSTBOF13290 @webSNF @TelaSNF
  Cenario: 13290 - Validar Calendário do campo ' Visualização por Local na data de referência'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                  | Nome do executor | Sprint |
      | 13290 | ISDSTBOF-13290 | Validar Calendário do campo ' Visualização por Local na data de referência' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao o valor apresentado no campo Visualização por Local na data de referência deve ser igual a data atual

  @ISDSTBOF13291 @webSNF @TelaSNF
  Cenario: 13291 - Validar exibição do campo 'Visualização por Local na data de referência'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 13291 | ISDSTBOF-13291 | Validar exibição do campo 'Visualização por Local na data de referência' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba Nacional
    Entao deve ser exibido no campo Visualização por Local na data de referência a mensagem selecionada da aba "Nacional"

  @ISDSTBOF13293 @webSNF @TelaSNF
  Cenario: 13293 - Validar Campo 'Natureza de operação' não Editavel
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 13293 | ISDSTBOF-13293 | Validar Campo 'Natureza de operação' não Editavel | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao deve ser exibido o campo Natureza de operacao nao Editavel

  @ISDSTBOF13295 @webSNF @TelaSNF
  Cenario: 13295 - Validar se a Visualização está respeitando a Ordem selecionada no Grid de Resultados
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                           | Nome do executor | Sprint |
      | 13295 | ISDSTBOF-13295 | Validar se a Visualização está respeitando a Ordem selecionada no Grid de Resultados | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba Nacional
    E seleciono uma nova Mensagem Legal para a Aba Nacional
    Entao deve ser exibido as duas mensagens selecionada no campo Visualização por local na data de referência

  @ISDSTBOF13296 @webSNF @TelaSNF
  Cenario: 13296 - Validar Ação de Clicar na LUPA
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                     | Nome do executor | Sprint |
      | 13296 | ISDSTBOF-13296 | Validar Ação de Clicar na LUPA | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono o valor "Dados adicionais" no campo "Local Mensagem Nacional" na tela de Mensagem legal
    E preencho os campos "Adicionar Registro Local", "Adicionar Registro Tipo" com os valores "Dados adicionais", "Padrão" e clico em  pesquisar
    Entao deve ser apresentado os campos "Codigo" e "Descricao" vazios

  @ISDSTBOF13305 @webSNF @TelaSNF
  Cenario: 13305 - Validar campo 'Usuário' da Aba Última Atualização' disponivel somente Leitura
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                    | Nome do executor | Sprint |
      | 13305 | ISDSTBOF-13305 | Validar campo 'Usuário' da Aba Última Atualização' disponivel somente Leitura | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal no final da pagina
    Entao deve ser apresentado o campo "Usuario" disponivel somente para leitura

  @ISDSTBOF13325 @webSNF @TelaSNF
  Cenario: 13325 - Validar opções do campo 'Local da Mensagem' - Item
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 13325 | ISDSTBOF-13325 | Validar opções do campo 'Local da Mensagem' - Item | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba Nacional
    Entao deve ser exibido na coluna "Mensagem Legal" do Grid a mensagem selecionada

  @ISDSTBOF13327 @webSNF @TelaSNF
  Cenario: 13327 - Validar Botão 'Editar ' do Grid de Resultados da Tela de Natureza de Operação X Mensagem Legal'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                      | Nome do executor | Sprint |
      | 13327 | ISDSTBOF-13327 | Validar Botão 'Editar ' do Grid de Resultados da Tela de Natureza de Operação X Mensagem Legal' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba Nacional
    E clico no botao Editar da aba Nacional
    Entao deve ser exibido a Tela "Editar Registro" com o campo "Mensagem Legal" preenchido
 
  @ISDSTBOF13328 @webSNF @TelaSNF
  Cenario: 13328 - Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                    | Nome do executor | Sprint |
      | 13328 | ISDSTBOF-13328 | Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal no final da pagina
    Entao deve ser apresentado o campo "Data" disponivel somente para leitura

  @ISDSTBOF13330 @webSNF @TelaSNF
  Cenario: 13330 - Validar Exibição de Lista do campo Estado - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 13330 | ISDSTBOF-13330 | Validar Exibição de Lista do campo Estado - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal no final da pagina
    E clico no campo "Estado" da aba "Aba Estadual"
    Entao deve ser exibido uma lista com o Estados Federativos do campo "Estado"

  @ISDSTBOF13331 @webSNF @TelaSNF
  Cenario: 13331 - Validar Exibição de Lista do Campo Tipo de Negocio - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                        | Nome do executor | Sprint |
      | 13331 | ISDSTBOF-13331 | Validar Exibição de Lista do Campo Tipo de Negocio - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal no final da pagina
    E clico no campo "Tipo de Negocio" da aba "Aba Estadual"
    Entao deve ser exibido as opcoes "Selecione...", "CD Virtual","Centro de Distribuição", "Clubes", "Escritório Central","Lojas", "Todos" no campo "Tipo de Negocio"

  @ISDSTBOF13332 @webSNF @TelaSNF
  Cenario: 13332 - Validar a não Exibição de FN na lista do Campo Tipo de Negocio - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                    | Nome do executor | Sprint |
      | 13332 | ISDSTBOF-13332 | Validar a não Exibição de FN na lista do Campo Tipo de Negocio - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal no final da pagina
    E clico no campo "Tipo de Negocio" da aba "Aba Estadual"
    Entao nao deve ser exibido o valor "FN" no campo "Tipo de Negocio"

  @ISDSTBOF13335 @webSNF @TelaSNF
  Cenario: 13335 - Validar se a Visualização está respeitando a Ordem selecionada no Grid de Resultados aba Estadual - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                                       | Nome do executor | Sprint |
      | 13335 | ISDSTBOF-13335 | Validar se a Visualização está respeitando a Ordem selecionada no Grid de Resultados aba Estadual - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E clico na aba "Aba Estadual"
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "1"
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "2"
    Entao deve ser exibido as duas mensagens selecionada no campo Visualização por local na data de referência

  @ISDSTBOF13341 @webSNF @TelaSNF
  Cenario: 13341 - Validar Ação de Clicar na LUPA - Tela de Selecionar Mensagem Legal - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                        | Nome do executor | Sprint |
      | 13341 | ISDSTBOF-13341 | Validar Ação de Clicar na LUPA - Tela de Selecionar Mensagem Legal - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico em pesquisar da tela Adicionar Resgistro da aba "Aba Estadual"
    Entao deve ser apresentado os campos "Codigo" e "Descricao" vazios

  @ISDSTBOF13344 @webSNF @TelaSNF
  Cenario: 13344 -Inserir Data Invalida no campo 'Data Fim da Vigência' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                           | Nome do executor | Sprint |
      | 13344 | ISDSTBOF-13344 | Inserir Data Invalida no campo 'Data Fim da Vigência' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E digito o valor "35/15/XXXX" invalido no campo "Fim da Vigencia"
    Entao deve ser apresentado o valor "Invalid date" no campo "Fim da Vigencia"

  @ISDSTBOF13345 @webSNF @TelaSNF
  Cenario: 13345 -Insersão de Data menor que Data Atual no campo 'Data Fim da Vigência' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                           | Nome do executor | Sprint |
      | 13345 | ISDSTBOF-13345 | Insersão de Data menor que Data Atual no campo 'Data Fim da Vigência' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E digito no campo "Inicio da Vigencia" o valor menor que o campo "Fim da Vigencia"
    Entao deve ser exibido a seguinte mensagem "Intervalo de Datas da vigência inválidas."

  @ISDSTBOF13348 @webSNF @TelaSNF
  Cenario: 13348 Clicar no Botão 'Histórico' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                 | Nome do executor | Sprint |
      | 13348 | ISDSTBOF-13348 | Clicar no Botão 'Histórico' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no bota Historico da aba "Aba Estadual"
    Entao deve ser exibida a tela Historico com o valor "SVCautqea" no campo Usuario

  @ISDSTBOF13349 @webSNF @TelaSNF
  Cenario: 13349 Clicar no Botão 'Retornar' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 13349 | ISDSTBOF-13349 | Clicar no Botão 'Retornar' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    E clico na aba "Aba Estadual"
    E clico no botao Retornar
    Entao deve ser exibida a tela Natureza de Operacao

  @ISDSTBOF13350 @webSNF @TelaSNF
  Cenario: 13350 Validar Calendário do campo ' Visualização por Local na data de referência' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                 | Nome do executor | Sprint |
      | 13350 | ISDSTBOF-13350 | Validar Calendário do campo ' Visualização por Local na data de referência' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    E clico na aba "Aba Estadual"
    Entao o valor apresentado no campo Visualização por Local na data de referência deve ser igual a data atual

  @ISDSTBOF13351 @webSNF @TelaSNF
  Cenario: 13351  Exibição do campo Visualização por Local na data de referência - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                    | Nome do executor | Sprint |
      | 13351 | ISDSTBOF-13351 | Exibição do campo Visualização por Local na data de referência - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao Mensagem Legal
    E clico na aba "Aba Estadual"
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "1"
    Entao o campo "Visualizar Por Local de Referencia" deve esta desabilitado para Edicao e deve exibir a mensagem legal selecionda

  @ISDSTBOF13354 @webSNF @TelaSNF
  Cenario: 13354  Campo 'Usuário' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                      | Nome do executor | Sprint |
      | 13354 | ISDSTBOF-13354 | Campo 'Usuário' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao deve ser apresentado o campo "Usuario" disponivel somente para leitura

  @ISDSTBOF13356 @webSNF @TelaSNF
  Cenario: 13356 - Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                   | Nome do executor | Sprint |
      | 13356 | ISDSTBOF-13356 | Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao deve ser apresentado o campo "Data" disponivel somente para leitura

  @ISDSTBOF13359 @webSNF @TelaSNF
  Cenario: 13359 - Validar adicionar Mensagem legal com Tipo de Neg. Club
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 13359 | ISDSTBOF-13359 | Validar adicionar Mensagem legal com Tipo de Negocio  Club | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "Clubes" para o campo "Adicionar Registro Tipo de Negocio"
    Entao deve ser exido na coluna "Tipo de Neg." o valor "CL" no Grid de Resultados

  @ISDSTBOF13360 @webSNF @TelaSNF
  Cenario: 13360 - Validar adicionar Mensagem legal com Tipo de Neg. Lojas
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 13360 | ISDSTBOF-13360 | Validar adicionar Mensagem legal com Tipo de Negocio  Lojas | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "Lojas" para o campo "Adicionar Registro Tipo de Negocio"
    Entao deve ser exido na coluna "Tipo de Neg." o valor "LJ" no Grid de Resultados

  @ISDSTBOF13361 @webSNF @TelaSNF
  Cenario: 13361 - Validar adicionar Mensagem legal com Tipo de Neg. todos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 13361 | ISDSTBOF-13361 | Validar adicionar Mensagem legal com Tipo de Negocio  Todos | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E seleciono uma mensagem Legal para a aba "Estadual" com o valor "Todos" para o campo "Adicionar Registro Tipo de Negocio"
    Entao deve ser exido na coluna "Tipo de Neg." o valor "Todos" no Grid de Resultados

  @ISDSTBOF13362 @webSNF @TelaSNF
  Cenario: 13362 - Validar campo 'Código' não letras - aba Estadual - Tela Selecionar Mensagem legal - Tipo Dinãmica
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                        | Nome do executor | Sprint |
      | 13362 | ISDSTBOF-13362 | Validar campo 'Código' não letras - aba Estadual - Tela Selecionar Mensagem legal - Tipo Dinãmica | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E digito o valor "ABCD" no campo "Codigo" da pesquisa de Mensagem legal
    Entao o campo "Codigo" deve esta vazio

  @ISDSTBOF13363 @webSNF @TelaSNF
  Cenario: 13363 - Validar pesquisa de Mensagem legal Dinamica por Titulo - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                            | Nome do executor | Sprint |
      | 13363 | ISDSTBOF-13363 | Validar pesquisa de Mensagem legal Dinamica por Titulo - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E digito o valor "IPI DEVOLVIDO" no campo "Titulo" da pesquisa de Mensagem legal
    Entao deve conter na coluna "Descrição" o valor "Total de IPI Devolvido <TOT_IPI_RTN_AMT>" do Grid de Resultado da Tela Selecionar mensagem legal

  @ISDSTBOF13364 @webSNF @TelaSNF
  Cenario: 13364 - Validar pesquisa de Mensagem legal Dinamica por Descrição - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 13364 | ISDSTBOF-13364 | Validar pesquisa de Mensagem legal Dinamica por Descrição - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E digito o valor "Total de IPI Devolvido" no campo "Descricao" da pesquisa de Mensagem legal
    Entao deve conter na coluna "Descrição" o valor "Total de IPI Devolvido <TOT_IPI_RTN_AMT>" do Grid de Resultado da Tela Selecionar mensagem legal

  @ISDSTBOF13365 @webSNF @TelaSNF
  Cenario: 13365 - Validar pesquisa de Mensagem legal Dinamica por Descrição - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 13365 | ISDSTBOF-13365 | Validar pesquisa de Mensagem legal Dinamica por Descrição - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao "Botao Pesquisar" sem preencher nehum campo
    Entao deve ser preenchido o Grid de Resultados com Mensagens já cadastradas

  @ISDSTBOF13366 @webSNF @TelaSNF
  Cenario: 13366 - Validar click no botão 'Cancelar' - Aba Estadual
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 13366 | ISDSTBOF-13366 | Validar click no botão 'Cancelar' - Aba Estadual | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao "Botao Cancelar" sem preencher nehum campo
    Entao deve ser apresentado a tela de Adicionar Registro com o campo "Mensagem Legal Dinamica" vazio e desabilitado para edicao

  @ISDSTBOF13370 @webSNF @TelaSNF
  Cenario: 13370 - Validar a exibição das opções 'Item' e 'Dados Adicionais' no campo 'Local da Mensagem' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                          | Nome do executor | Sprint |
      | 13370 | ISDSTBOF-13370 | Validar a exibição das opções 'Item' e 'Dados Adicionais' no campo 'Local da Mensagem' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico na aba "Aba Filial" e no campo "Local Mensagem Filial"
    Entao deve ser exibida uma lista com os itens "Dados Adicionais" e "Item" no campo "Local Mensagem Filial"

  @ISDSTBOF13371 @webSNF @TelaSNF
  Cenario: 13371 - Opção Selecionada no campo Local da Mensagem reflete no campo Local do Grid de Resultados - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                             | Nome do executor | Sprint |
      | 13371 | ISDSTBOF-13371 | Opção Selecionada no campo Local da Mensagem reflete no campo Local do Grid de Resultados - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba "Filial" com o valor "1"
    Entao deve ser exibida a mensagem "Cadastro efetuado com sucesso!" na aba Filial

  @ISDSTBOF13372 @webSNF @TelaSNF
  Cenario: 13372 - Validar Botão Editar - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 13372 | ISDSTBOF-13372 | Validar Botão Editar - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E clico no botao Editar do Grid de Resultado Aba Filial
    Entao deve ser exibido a Tela "Editar Registro" com o campo "Mensagem Legal" preenchido

  @ISDSTBOF13374 @webSNF @TelaSNF
  Cenario: 13374 - Validar Botão Editar - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 13374 | ISDSTBOF-13374 | Validar Botão Editar - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba "Filial" com o valor "1"
    Entao o campo "Visualizar Por Local de Referencia Filial" deve esta desabilitado para Edicao e deve exibir a mensagem legal selecionda

  @ISDSTBOF13377 @webSNF @TelaSNF
  Cenario: 13377 - Validar Opções exibidas para o Campo Tipo Padrão e Dinâmica - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 13377 | ISDSTBOF-13377 | Validar Opções exibidas para o Campo Tipo Padrão e Dinâmica - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E clico na aba "Aba Filial" e no campo "Adicionar Registro Tipo" da tela de Adicionar Mensagem
    Entao deve ser exibida uma lista com os itens "Selecione...", "Padrão" e "Dinâmica" no campo "Adicionar Registro Tipo"

  @ISDSTBOF13378 @webSNF @TelaSNF
  Cenario: 13378 - Validar Ação de Clicar na LUPA - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 13378 | ISDSTBOF-13378 | Validar Ação de Clicar na LUPA - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E clico no botao Pesquisar da tela de Adicionar Resgitro
    Entao deve ser apresentado os campos "Codigo" e "Descricao" vazios

  @ISDSTBOF13379 @webSNF @TelaSNF
  Cenario: 13379 - Validar campo 'Fim da Vigência' com data inferior a do campo 'Inicio da Vigência' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                     | Nome do executor | Sprint |
      | 13379 | ISDSTBOF-13379 | Validar campo 'Fim da Vigência' com data inferior a do campo 'Inicio da Vigência' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E digito no campo "Inicio da Vigencia" a data atual e no campo "Fim da Vigencia" uma data inferio a de Inicio da Vigencia
    Entao deve ser exibido a seguinte mensagem "Intervalo de Datas da vigência inválidas."

  @ISDSTBOF13380 @webSNF @TelaSNF
  Cenario: 13380 - Insersão de Data menor que Data Atual no campo 'Data Inicio da Vigência' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                            | Nome do executor | Sprint |
      | 13380 | ISDSTBOF-13380 | Insersão de Data menor que Data Atual no campo 'Data Inicio da Vigência' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E digito no campo "Inicio da Vigencia" valor inferior a data atual e no campo "Fim da Vigencia" uma data Superior a de Data Atual
    Entao deve ser exibido a seguinte mensagem "Data de inicio da vigência é inferior a data corrente"

  @ISDSTBOF13381 @webSNF @TelaSNF
  Cenario: 13381 - Clicar no Botão 'Gravar' para Novo Resgitro - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 13381 | ISDSTBOF-13381 | Clicar no Botão 'Gravar' para Novo Resgitro - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E seleciono uma mensagem Legal para a aba "Filial" com o valor "1"
    Entao deve ser exibida a mensagem "Cadastro efetuado com sucesso!" na aba Filial

  @ISDSTBOF13382 @webSNF @TelaSNF
  Cenario: 13382 - Clicar no Botão 'Gravar' para Alteração de Resgitro - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                       | Nome do executor | Sprint |
      | 13382 | ISDSTBOF-13382 | Clicar no Botão 'Gravar' para Alteração de Resgitro - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E altero a data do campo "Fim da Vigencia" para uma data futura e clico em Salvar
    Entao deve ser exibida a mensagem "Alteração efetuada com sucesso!" na aba Filial

  @ISDSTBOF13383 @webSNF @TelaSNF
  Cenario: 13383 - Clicar no Botão 'Histórico' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                               | Nome do executor | Sprint |
      | 13383 | ISDSTBOF-13383 | Clicar no Botão 'Histórico' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E devo clicar no botao Mensagem Legal
    E clico no botao Historico da Aba "Aba Filial"
    Entao deve ser exibida a tela Historico com o valor "SVCautqea" no campo Usuario

  @ISDSTBOF13385 @webSNF @TelaSNF
  Cenario: 13385 - Exibição do campo Visualização por Local na data de referência(Texto) - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                         | Nome do executor | Sprint |
      | 13385 | ISDSTBOF-13385 | Exibição do campo Visualização por Local na data de referência(Texto) - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao o campo "Visualizar Por Local de Referencia Texto" deve está disponivel somente para leitura

  @ISDSTBOF13386 @webSNF @TelaSNF
  Cenario: 13386 - Validar Calendário do campo ' Visualização por Local na data de referência' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                               | Nome do executor | Sprint |
      | 13386 | ISDSTBOF-13386 | Validar Calendário do campo ' Visualização por Local na data de referência' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao o campo "Visualizar Por Local de Referencia Filial" deve ser igual a data atual e habilitado para edicao

  @ISDSTBOF13388 @webSNF @TelaSNF
  Cenario: 13388 - Campo 'Usuário' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                    | Nome do executor | Sprint |
      | 13388 | ISDSTBOF-13388 | Campo 'Usuário' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao o campo "Usuario" deve ser exibido somente para leitura

  @ISDSTBOF13390 @webSNF @TelaSNF
  Cenario: 13390 - Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                                 | Nome do executor | Sprint |
      | 13390 | ISDSTBOF-13390 | Campo 'Data' da Aba Dados da natureza de operação' disponivel somente Leitura - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    E clico em pesquisar depois Editar
    Quando clico no botao Mensagem Legal
    Entao o campo "Data" deve ser exibido somente para leitura

  @ISDSTBOF13394 @webSNF @TelaSNF
  Cenario: 13394 - Validar click no botão 'Cancelar' - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 13394 | ISDSTBOF-13394 | Validar click no botão 'Cancelar' - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao "Botao Cancelar" sem preencher nehum campo da aba Filial
    Entao deve ser apresentado a tela de Adicionar Registro com o campo "Mensagem Legal Dinamica" vazio e desabilitado para edicao

  @ISDSTBOF13395 @webSNF @TelaSNF
  Cenario: 13395 - Validar o click no Botão pesquisar sem preencher nenhum campo - Aba Filial
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                 | Nome do executor | Sprint |
      | 13395 | ISDSTBOF-13395 | Validar o click no Botão pesquisar sem preencher nenhum campo - Aba Filial | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Natureza de Operacao"
    Quando clico no botao Mais
    E faco o preenchimento completo e clico em Salvar
    E clico no botao "Botao Pesquisar" sem preencher nehum campo da aba Filial
    Entao deve ser preenchido o Grid de Resultados com Mensagens já cadastradas
