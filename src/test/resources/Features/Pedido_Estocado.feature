#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PedidoEstocado
Funcionalidade: Pedido_Estocado SAD

  @BRITQEA2107 @web
  Cenario: 2107 - Consulta de produto item - 'Estocado'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                            | Nome do executor | Sprint |
      | 2107 | BRITQEA-2107 | Consulta de produto item - "Estocado" | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador | Fornec  | Pesquisa |
      |       028 | 3500684 |     4785 |
    E seleciono a opcao "T" no campo "Classif Ped"
    Quando clico no botao Consultar Pedido
    Então deve ser exibido o valor "4785" no campo "Codigo do Produto"

  @BRITQEA2108 @web
  Cenario: 2108 - Incluir produto&item - pedido estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                             | Nome do executor     | Sprint |
      | 2108 | BRITQEA-2108 | Incluir produto&item - pedido estocado | Matheus Machado luiz | S1     |
    E que estou na tela "GERPD"
    E que tenha um item incluso
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       017 | 3523912 |    56849 | T           |
    Quando clico no botao Consultar Pedido
    Entao a grid deve apresentar somente o item incluso

  @BRITQEA2109 @web
  Cenario: 2109 - Executando pedido estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                 | Nome do executor | Sprint |
      | 2109 | BRITQEA-2109 | Executando pedido estocado | Hilário Bina     | S1     |
    E que estou na tela "GERPD"
    E que tenha um item incluso
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | T           |
    E Seleciono produto e digito a quantidade "10" e clico nos botaes incluir e Executar Pedido
    Quando faco uma pesquisa na tela "SOLPD" com o campo "FORN"
    Entao deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD

  @BRITQEA2110 @web
  Cenario: 2110 - Consulta de pedido 'Estocado'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2110 | BRITQEA-2110 | Consulta de pedido 'Estocado' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador | Fornec  |
      |       028 | 3500684 |
    E seleciono a opcao "T" no campo "Classif Ped"
    Quando clico no botao Consultar Pedido
    Entao deve ser exibido no GRID o "Codigo do Produto" e a "Descricao do Produto"

  @BRITQEA2169 @web
  Cenario: 2169 - Inserir caracteres especiais no campo 'Pesquisa Item'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                            | Nome do executor | Sprint |
      | 2169 | BRITQEA-2169 | Inserir caracteres especiais no campo 'Pesquisa Item' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Pesquisa" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2171 @web
  Cenario: 2171 - Inserir letras no campo 'Pesquisa Item'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                              | Nome do executor | Sprint |
      | 2171 | BRITQEA-2171 | Inserir letras no campo 'Pesquisa Item' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Pesquisa" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

 
  @BRITQEA2191 @web
  Cenario: 2191 - Inserir caracteres especiais no campo 'Filial'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2191 | BRITQEA-2191 | Inserir caracteres especiais no campo 'Filial' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Filial" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2192 @web
  Cenario: 2192 - Inserir letras no campo 'Filial'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2192 | BRITQEA-2192 | Inserir letras no campo 'Filial' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Filial" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2193 @web
  Cenario: 2193 - Inserir caracteres especiais no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor | Sprint |
      | 2193 | BRITQEA-2193 | Inserir caracteres especiais no campo 'Comprador' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Comprador" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2194 @web
  Cenario: 2194 - Inserir letras no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                          | Nome do executor | Sprint |
      | 2194 | BRITQEA-2194 | Inserir letras no campo 'Comprador' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Comprador" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2195 @web
  Cenario: 2195 - Consulta Tabela Compra - campo 'Comprador' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                           | Nome do executor | Sprint |
      | 2195 | BRITQEA-2195 | Consulta Tabela Compra - campo 'Comprador' em branco | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Fornec  |
      | 3500684 |
    E seleciono a opcao "T" no campo "Classif Ped"
    Quando clico no botao Consultar Tabela de Compra
    Entao deve ser apresentado a mensagem "[1] 0 COMPRADOR NAO CADASTRADO"

  @BRITQEA2196 @web
  Cenario: 2196 - Inserir caracteres especiais no campo 'Fornec'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2196 | BRITQEA-2196 | Inserir caracteres especiais no campo 'Fornec' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Fornec" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2197 @web
  Cenario: 2197 - Inserir letras no campo 'Fornec'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2197 | BRITQEA-2197 | Inserir letras no campo 'Fornec' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Fornec" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2198 @web
  Cenario: 2198 - Consulta Tabela Compra - campo 'Fornec' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor | Sprint |
      | 2198 | BRITQEA-2198 | Consulta Tabela Compra - campo 'Fornec' em branco | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador |
      |       028 |
    E seleciono a opcao "T" no campo "Classif Ped"
    Quando clico no botao Consultar Tabela de Compra
    Entao deve ser apresentado a mensagem "[1] 0 FORNECEDOR NAO CADASTRADO"

  @BRITQEA2199 @web
  Cenario: 2199 - Inserir caracteres especiais no campo 'Contato'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2199 | BRITQEA-2199 | Inserir caracteres especiais no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Contato" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2200 @web
  Cenario: 2200 - Inserir letras no campo 'Contato'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2200 | BRITQEA-2200 | Inserir letras no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Contato" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2201 @web
  Cenario: 2201 - Inserir caracteres especiais no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2201 | BRITQEA-2201 | Inserir caracteres especiais no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Evento" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2202 @web
  Cenario: 2202 - Inserir letras no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2202 | BRITQEA-2202 | Inserir letras no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Evento" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2203 @web
  Cenario: 2203 - Inserir caracteres especiais no campo 'RedeSP'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2203 | BRITQEA-2203 | Inserir caracteres especiais no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "RedeSP" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2204 @web
  Cenario: 2204 - Inserir letras no campo 'RedeSP'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2204 | BRITQEA-2204 | Inserir letras no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "RedeSP" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2205 @web
  Cenario: 2205 - Inserir caracteres especiais no campo 'Dist'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2205 | BRITQEA-2205 | Inserir caracteres especiais no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Dist" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2206 @web
  Cenario: 2206 - Inserir letras no campo 'Dist'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2206 | BRITQEA-2206 | Inserir letras no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Dist" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2207 @web
  Cenario: 2207 - Inserir caracteres especiais no campo 'Transp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2207 | BRITQEA-2207 | Inserir caracteres especiais no campo 'Transp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Transp" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2208 @web
  Cenario: 2208 - Inserir letras no campo 'Transp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2208 | BRITQEA-2208 | Inserir letras no campo 'Transp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Transp" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2216 @web
  Cenario: 2216 - Consulta de produtos&itens sem preencher o campo 'Pesquisa Item' - estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                                  | Nome do executor | Sprint |
      | 2216 | BRITQEA-2216 | Consulta de produtos&itens sem preencher o campo 'Pesquisa Item' - estocado | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    E preencho os campos da GERPD
      | Comprador | Fornec  |
      |       028 | 3500684 |
    Quando clico no botao Consultar Tabela de Compra
    Entao grid deve estar populada

  @BRITQEA2211 @web
  Cenario: 2211 - Inserir caracteres especiais no campo 'Emp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                  | Nome do executor | Sprint |
      | 2211 | BRITQEA-2211 | Inserir caracteres especiais no campo 'Emp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Emp" com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2212 @web
  Cenario: 2212 - Inserir letras no campo 'Emp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2212 | BRITQEA-2212 | Inserir letras no campo 'Emp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Emp" com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2213 @web
  Cenario: 2213 - Inserir caracteres especiais no campo 'Datas'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor | Sprint |
      | 2213 | BRITQEA-2213 | Inserir caracteres especiais no campo 'Datas' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher os campos Datas com o valor "!@#$%&*"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2214 @web
  Cenario: 2214 - Inserir letras no campo 'Datas'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 2214 | BRITQEA-2214 | Inserir letras no campo 'Datas' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher os campos Datas com o valor "ABCDEF"
    Entao deve ser apresentado a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2215 @web
  Cenario: 2215 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'A'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2215 | BRITQEA-2215 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'A' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador | Fornec  | Pesquisa |
      |       025 | 3509175 |     1661 |
    E seleciono a opcao "A" no campo "Classif Ped"
    E Seleciono produto e digito a quantidade "10" e clico nos botaes incluir e Executar Pedido
    E deve ser gerado um numero do pedido
    Quando faco uma pesquisa na tela "SOLPD" com o campo "FORN"
    Entao deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD

  @BRITQEA2111 @web
  Cenario: 2111 - Excluir pedido estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT              | Nome do executor     | Sprint |
      | 2111 | BRITQEA-2111 | Excluir pedido estocado | Matheus Machado luiz | S1     |
    E que estou na tela "GERPD"
    E que tenha um item excluido
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       017 | 3523912 |    56849 | T           |
    Quando consultar o fornecedor 3523912 na SOLPD
    Entao deve retornar o item com situação "SOLICITACAO CANCELADA"

  @BRITQEA2112 @web
  Cenario: 2112 - Incluir mais de um produto&item
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor     | Sprint |
      | 2112 | BRITQEA-2112 | Incluir mais de um produto&item | Matheus Machado luiz | S1     |
    E que estou na tela "GERPD"
    E que tenha 2 itens inclusos
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       017 | 3523912 |    56849 | T           |
    Quando clico no botao Consultar Pedido
    Entao a grid deve apresentar os 2 itens inclusos

  @BRITQEA2174 @web
  Cenario: 2174 - Excluir um item de pedido estocado com mais de um item
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                             | Nome do executor     | Sprint |
      | 2174 | BRITQEA-2174 | Excluir um item de pedido estocado com mais de um item | Matheus Machado luiz | S1     |
    E que estou na tela "GERPD"
    E que tenha 2 itens inclusos
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       017 | 3523912 |    56849 | T           |
    Quando excluo um item do pedido
    E consultar o fornecedor 3523912 na SOLPD
    Entao a grid deve apresentar o item excluido com a situação "SOLICITACAO CANCELADA"
