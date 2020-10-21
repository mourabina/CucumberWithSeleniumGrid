#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@InscricaoSubstituto
Funcionalidade: 17.3 - Inscrição Substituto

  @ISDSTBOF14169 @webSNF @TelaSNF
  Cenario: 14169 - Verificar campo 'Estado de Origem'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                         | Nome do executor | Sprint |
      | 14169 | ISDSTBOF-14169 | Verificar campo 'Estado de Origem' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    Entao o campo "Estado de Origem" deve exibir o valor "RS"

  @ISDSTBOF14170 @webSNF @TelaSNF
  Cenario: 14170 - Verificar campo 'CNPJ'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT             | Nome do executor | Sprint |
      | 14170 | ISDSTBOF-14170 | Verificar campo 'CNPJ' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    Entao o campo "CNPJ" deve exibir o valor "93209765000621"

  @ISDSTBOF14171 @webSNF @TelaSNF
  Cenario: 14171 - Verificar campo 'Situação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                 | Nome do executor | Sprint |
      | 14171 | ISDSTBOF-14171 | Verificar campo 'Situação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando clico no campo de pesquisa "Situacao"
    Entao deve exibir no campo "Situacao" os valores "Selecionar Situação...", "Ativo" e "Inativo"

  @ISDSTBOF14172 @webSNF @TelaSNF
  Cenario: 14172 - Verificar campo 'Estado de Destino'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                          | Nome do executor | Sprint |
      | 14172 | ISDSTBOF-14172 | Verificar campo 'Estado de Destino' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando clico no campo de pesquisa "Estado de Destino"
    Entao o campo "Estado de Destino" deve exibir todos os estados federativos

  @ISDSTBOF14173 @webSNF @TelaSNF
  Cenario: 14173 - Verificar consulta por 'Filial Emitente'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                               | Nome do executor | Sprint |
      | 14173 | ISDSTBOF-14173 | Verificar consulta por 'Filial Emitente' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar o campo "Filial Emitente" o valor "7400" no grid de resultados

  @ISDSTBOF14174 @webSNF @TelaSNF
  Cenario: 14174 - Verificar consulta por 'Estado de Destino'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                 | Nome do executor | Sprint |
      | 14174 | ISDSTBOF-14174 | Verificar consulta por 'Estado de Destino' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "São Paulo" no campo "Estado de Destino" e a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar no campo "Estado Destino" o valor "SP" e no campo "Filial Emitente" o valor "7400"

  @ISDSTBOF14175 @webSNF @TelaSNF
  Cenario: 14175 - Verificar consulta por 'Situação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                        | Nome do executor | Sprint |
      | 14175 | ISDSTBOF-14175 | Verificar consulta por 'Situação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "Ativo" no campo "Situacao" e a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar no campo "Situação" o valor "Ativo" e no campo "Filial Emitente" o valor "7400"

  @ISDSTBOF14176 @webSNF @TelaSNF
  Cenario: 14176 - Verificar consulta por 'Filial Emitente' + 'Estado de Destino'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                     | Nome do executor | Sprint |
      | 14176 | ISDSTBOF-14176 | Verificar consulta por 'Filial Emitente' + 'Estado de Destino' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "São Paulo" no campo "Estado de Destino" e a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar no campo "Filial Emitente" o valor "7400" e no campo "Estado Destino" o valor "SP"

  @ISDSTBOF14177 @webSNF @TelaSNF
  Cenario: 14177 - Verificar consulta por 'Filial Emitente' + 'Situação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 14177 | ISDSTBOF-14177 | Verificar consulta por 'Filial Emitente' + 'Situação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "Ativo" no campo "Situacao" e a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar no campo "Filial Emitente" o valor "7400" e no campo "Situação" o valor "Ativo"

  @ISDSTBOF14179 @webSNF @TelaSNF
  Cenario: 14179 - Verificar consulta por 'Filial Emitente' + 'Estado de Destino' + 'Situação'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                  | Nome do executor | Sprint |
      | 14179 | ISDSTBOF-14179 | Verificar consulta por 'Filial Emitente' + 'Estado de Destino' + 'Situação' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono opçao "Ativo" campo "Situacao" a opçao "7400 - CENTRO DIST SERTORIO" campo "Filial Emitente" e opcao "São Paulo" campo "Estado de Destino"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    Entao deve apresentar no campo "Filial Emitente" valor "7400" no campo "Situação" o valor "Ativo" no campo "Estado Destino" valor "SP"

  @ISDSTBOF14180 @webSNF @TelaSNF
  Cenario: 14180 - Verificar o comportamento da coluna 'Editar'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 14180 | ISDSTBOF-14180 | Verificar o comportamento da coluna 'Editar' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E clico no botao Editar do Grid de Resultado com load
    Entao deve apresentar a tela de Editar Inscricao Substituto com o titulo "Inscrição Substituto"

  @ISDSTBOF14181 @webSNF @TelaSNF
  Cenario: 14181 - Verificar campo 'Filial Emitente' na edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 14181 | ISDSTBOF-14181 | Verificar campo 'Filial Emitente' na edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E salvo o valor da coluna "Filial Emitente" no grid de resultado
    E clico no botao Editar do Grid de Resultado com load
    Entao campo "Filial Emitente" deve estar desabilitado
    E campo "Filial Emitente" de select deve conter o mesmo valor do cadastro

  @ISDSTBOF14182 @webSNF @TelaSNF
  Cenario: 14182 - Verificar campo 'Estado de Destino' na edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 14182 | ISDSTBOF-14182 | Verificar campo 'Estado de Destino' na edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "Pará" no campo "Estado de Destino"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E salvo o valor da coluna "Estado Destino" no grid de resultado
    E clico no botao Editar do Grid de Resultado
    Entao campo "Filial Emitente" nao deve estar habilitado
    E campo "Estado de Destino" de select deve conter o mesmo valor do cadastro

  @ISDSTBOF14183 @webSNF @TelaSNF
  Cenario: 14183 - Verificar campo 'Inscrição Substituto' na edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 14183 | ISDSTBOF-14183 | Verificar campo 'Inscrição Substituto' na edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E salvo o valor da coluna "Inscrição Substituto" no grid de resultado
    E clico no botao Editar do Grid de Resultado com load
    Entao campo "Inscricao do Substituto" deve estar habilitado
    E campo "Inscricao do Substituto" de input deve conter o mesmo valor do cadastro

  @ISDSTBOF14184 @webSNF @TelaSNF
  Cenario: 14184 - Verificar a funcionalidade do botão 'Histórico'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                      | Nome do executor | Sprint |
      | 14184 | ISDSTBOF-14184 | Verificar a funcionalidade do botão 'Histórico' | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E salvo o valor da coluna "Inscrição Substituto" no grid de resultado
    E clico no botao Editar do Grid de Resultado com load
    E clico no botao Historico
    Entao deve ser apresentado a Tela de Historico com o mesmo valor utilizado no cadastro do campo "Inscrição Substituto"

  @ISDSTBOF14186 @webSNF @TelaSNF
  Cenario: 14186 - Verificar o botão 'Salvar' na tela de cadastro sem campos obrigatórios preenchidos
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                         | Nome do executor | Sprint |
      | 14186 | ISDSTBOF-14186 | Verificar o botão 'Salvar' na tela de cadastro sem campos obrigatórios preenchidos | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando clico no botao Mais
    Entao o botao Salvar deve esta desabilitado

  @ISDSTBOF14189 @webSNF @TelaSNF
  Cenario: 14189 - Verificar o botão 'Salvar' na tela de edição
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 14189 | ISDSTBOF-14189 | Verificar o botão 'Salvar' na tela de edição | HIlario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7400 - CENTRO DIST SERTORIO"
    E Acesso a tela "Parametrizacoes Fiscais" > "Parametros Gerais" > "Inscricao Substituto"
    Quando seleciono a opçao "7400 - CENTRO DIST SERTORIO" no campo "Filial Emitente"
    E clico no botao Pesquisar da tela de Inscricao Substituto
    E clico no botao Editar do Grid de Resultado com load
    E altero o valor do campo Inscricao Substituto e clico em Salvar
    Entao deve ser exibido a mensagem "Cadastro efetuado com sucesso!"
