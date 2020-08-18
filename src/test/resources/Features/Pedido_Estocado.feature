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
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       028 | 3500684 |     4785 | T           |
    Quando clico no botao Consultar Tabela de Compra
    Então grid deve apresentar o produto pesquisado

  @BRITQEA2108 @web
  Cenario: 2108 - Incluir produto - pedido estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor     | Sprint |
      | 2108 | BRITQEA-2108 | Incluir produto - pedido estocado | Matheus Machado luiz | S1     |
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
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | T           |
    Quando pesquiso pelo fornecedor na SOLPD
    Entao deve ser exibido as informacoes do pedido com as informacoes utilizadas na tela GERPD

  @BRITQEA2110 @web
  Cenario: 2110 - Consulta de pedido 'Estocado'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2110 | BRITQEA-2110 | Consulta de pedido 'Estocado' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | T           |
    Quando clico no botao Consultar Pedido
    Entao deve ser exibido no GRID o "Codigo do Produto" e a "Descricao do Produto"

  @BRITQEA2169 @web @Tela
  Cenario: 2169 - Inserir caracteres especiais no campo 'Pesquisa Item'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                            | Nome do executor | Sprint |
      | 2169 | BRITQEA-2169 | Inserir caracteres especiais no campo 'Pesquisa Item' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Pesquisa" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2171 @web @Tela
  Cenario: 2171 - Inserir letras no campo 'Pesquisa Item'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                              | Nome do executor | Sprint |
      | 2171 | BRITQEA-2171 | Inserir letras no campo 'Pesquisa Item' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Pesquisa" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2191 @web @Tela
  Cenario: 2191 - Inserir caracteres especiais no campo 'Filial'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2191 | BRITQEA-2191 | Inserir caracteres especiais no campo 'Filial' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Filial" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."
 
  @BRITQEA2192 @web @Tela
  Cenario: 2192 - Inserir letras no campo 'Filial'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2192 | BRITQEA-2192 | Inserir letras no campo 'Filial' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Filial" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2193 @web @Tela
  Cenario: 2193 - Inserir caracteres especiais no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor | Sprint |
      | 2193 | BRITQEA-2193 | Inserir caracteres especiais no campo 'Comprador' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Comprador" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2194 @web @Tela
  Cenario: 2194 - Inserir letras no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                          | Nome do executor | Sprint |
      | 2194 | BRITQEA-2194 | Inserir letras no campo 'Comprador' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Comprador" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2195 @web @Tela
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
    Entao deve apresentar a mensagem "[1] 0 COMPRADOR NAO CADASTRADO"

  @BRITQEA2196 @web @Tela
  Cenario: 2196 - Inserir caracteres especiais no campo 'Fornec'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2196 | BRITQEA-2196 | Inserir caracteres especiais no campo 'Fornec' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Fornec" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2197 @web @Tela
  Cenario: 2197 - Inserir letras no campo 'Fornec'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2197 | BRITQEA-2197 | Inserir letras no campo 'Fornec' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E preencher o campo "Fornec" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2198 @web @Tela
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
    Entao deve apresentar a mensagem "[1] 0 FORNECEDOR NAO CADASTRADO"

  @BRITQEA2199 @web @Tela
  Cenario: 2199 - Inserir caracteres especiais no campo 'Contato'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2199 | BRITQEA-2199 | Inserir caracteres especiais no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Contato" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2200 @web @Tela
  Cenario: 2200 - Inserir letras no campo 'Contato'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2200 | BRITQEA-2200 | Inserir letras no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Contato" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2201 @web @Tela
  Cenario: 2201 - Inserir caracteres especiais no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2201 | BRITQEA-2201 | Inserir caracteres especiais no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Evento" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2202 @web @Tela
  Cenario: 2202 - Inserir letras no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2202 | BRITQEA-2202 | Inserir letras no campo 'Contato' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Evento" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2203 @web @Tela
  Cenario: 2203 - Inserir caracteres especiais no campo 'RedeSP'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2203 | BRITQEA-2203 | Inserir caracteres especiais no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "RedeSP" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2204 @web @Tela
  Cenario: 2204 - Inserir letras no campo 'RedeSP'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2204 | BRITQEA-2204 | Inserir letras no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "RedeSP" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2205 @web @Tela
  Cenario: 2205 - Inserir caracteres especiais no campo 'Dist'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2205 | BRITQEA-2205 | Inserir caracteres especiais no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Dist" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2206 @web @Tela
  Cenario: 2206 - Inserir letras no campo 'Dist'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2206 | BRITQEA-2206 | Inserir letras no campo 'RedeSP' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Dist" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2207 @web @Tela
  Cenario: 2207 - Inserir caracteres especiais no campo 'Transp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2207 | BRITQEA-2207 | Inserir caracteres especiais no campo 'Transp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Transp" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2208 @web @Tela
  Cenario: 2208 - Inserir letras no campo 'Transp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2208 | BRITQEA-2208 | Inserir letras no campo 'Transp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Transp" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2216 @web @Tela
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

  @BRITQEA2211 @web @Tela
  Cenario: 2211 - Inserir caracteres especiais no campo 'Emp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                  | Nome do executor | Sprint |
      | 2211 | BRITQEA-2211 | Inserir caracteres especiais no campo 'Emp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Emp" com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2212 @web @Tela
  Cenario: 2212 - Inserir letras no campo 'Emp'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2212 | BRITQEA-2212 | Inserir letras no campo 'Emp' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher o campo "Emp" com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2213 @web @Tela
  Cenario: 2213 - Inserir caracteres especiais no campo 'Datas'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor | Sprint |
      | 2213 | BRITQEA-2213 | Inserir caracteres especiais no campo 'Datas' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher os campos Datas com o valor "!@#$%&*"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2214 @web @Tela
  Cenario: 2214 - Inserir letras no campo 'Datas'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 2214 | BRITQEA-2214 | Inserir letras no campo 'Datas' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    Quando preencher os campos Datas com o valor "ABCDEF"
    Entao deve apresentar a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2215 @web @Tela
  Cenario: 2215 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'A'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2215 | BRITQEA-2215 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'A' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | A           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

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
    Quando pesquiso pelo fornecedor na SOLPD
    Entao deve retornar o item com situação "SOLICITACAO CANCELADA"

  @BRITQEA2112 @web
  Cenario: 2112 - Incluir mais de um produto
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                 | Nome do executor     | Sprint |
      | 2112 | BRITQEA-2112 | Incluir mais de um produto | Matheus Machado luiz | S1     |
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
    E pesquiso pelo fornecedor na SOLPD
    Entao a grid deve apresentar o item excluido com a situação "SOLICITACAO CANCELADA"

  @BRITQEA2175 @web
  Cenario: 2175 - Excluir todos os itens do pedido estocado
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                | Nome do executor     | Sprint |
      | 2175 | BRITQEA-2175 | Excluir todos os itens do pedido estocado | Matheus Machado luiz | S1     |
    E que estou na tela "GERPD"
    E que tenha 2 itens excluidos
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       017 | 3523912 |    56849 | T           |
    Quando pesquiso pelo fornecedor na SOLPD
    Entao a grid deve apresentar os itens excluidos com a situação "SOLICITACAO CANCELADA"

  @BRITQEA2270 @web
  Cenario: 2270 - Consulta Pedido - campo 'Comprador' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor     | Sprint |
      | 2270 | BRITQEA-2270 | Consulta Pedido - campo 'Comprador' em branco | Matheus Machado Luiz | S1     |
    E que estou na tela "GERPD"
    Quando clico no botao Consultar Pedido
    Entao deve apresentar a mensagem "[1] 0 COMPRADOR NAO CADASTRADO"

  @BRITQEA2271 @web
  Cenario: 2271 - Consulta Pedido - campo 'Fornec' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                 | Nome do executor     | Sprint |
      | 2271 | BRITQEA-2271 | Consulta Pedido - campo 'Fornec' em branco | Matheus Machado Luiz | S1     |
    E que estou na tela "GERPD"
    E preencho os campos da GERPD
      | Comprador |
      |       017 |
    Quando clico no botao Consultar Pedido
    Entao deve apresentar a mensagem "[1] 0 FORNECEDOR NAO CADASTRADO"

  @BRITQEA2272 @web
  Cenario: 2272 - Consulta Pedido - campo 'Datas' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                | Nome do executor     | Sprint |
      | 2272 | BRITQEA-2272 | Consulta Pedido - campo 'Datas' em branco | Matheus Machado Luiz | S1     |
    E que estou na tela "GERPD"
    E preencho os campos da GERPD
      | Comprador | Fornec  |
      |       017 | 3523912 |
    Quando clico no botao Consultar Pedido
    Entao deve apresentar a mensagem "[1] ATENÇÃO PARA Alterar, Excluir OU Consulta Pedido, INFORMAR SÓ UMA DATA."

  @BRITQEA2268 @web
  Cenario: 2268 - Incluir produto estocado INPE2
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                     | Nome do executor     | Sprint |
      | 2268 | BRITQEA-2268 | Incluir produto estocado INPE2 | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    Quando tento incluir 1 item na INPE2
      | Comprador | Fornec  | Classif Ped | Produto |
      |       017 | 3523912 | T           |   56849 |
    E consultar o fornecedor 3523912 na SOLPD
    Entao a grid da Tela SOLPD deve apresentar os 1 itens inclusos

  @BRITQEA2316 @web
  Cenario: 2316 - Consulta de produto CROSS na GERPD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                         | Nome do executor | Sprint |
      | 2316 | BRITQEA-2316 | Consulta de produto CROSS na GERPD | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    E preencho os campos da GERPD
      | Comprador | Fornec  | Pesquisa |
      |       028 | 3512102 |     6814 |
    Quando clico no botao Consultar Tabela de Compra
    Entao grid deve apresentar o produto pesquisado

  @BRITQEA2317 @web
  Cenario: 2317 - Incluir produto cross na GERPD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                     | Nome do executor | Sprint |
      | 2317 | BRITQEA-2317 | Incluir produto cross na GERPD | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    Quando tento incluir 1 item na GERPD
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       028 | 3512102 |     6814 | T           |
    Entao deve apresentar a mensagem "[1] ATENÇÃO ITEM CROSS. NAO FAZER PEDIDO ESTOCADO"

  @BRITQEA2320 @web
  Cenario: 2320 - Consulta de produto DSD na GERPD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2320 | BRITQEA-2320 | Consulta de produto DSD na GERPD | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    E preencho os campos da GERPD
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       043 | 3514753 |    32916 | T           |
    Quando clico no botao Consultar Tabela de Compra
    Entao grid deve apresentar o produto pesquisado

  @BRITQEA2321 @web
  Cenario: 2321 - Incluir produto DSD na GERPD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2321 | BRITQEA-2321 | Incluir produto DSD na GERPD | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    Quando tento incluir 1 item na GERPD
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       043 | 3514753 |    32916 | T           |
    Entao deve apresentar a mensagem "[1] ATENÇÃO ITEM DIRETO. NAO FAZER PEDIDO ESTOCADO"

  @BRITQEA2322 @web
  Cenario: 2322 - Alterar valores dos produtos estocados na GERPD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2322 | BRITQEA-2322 | Alterar valores dos produtos estocados na GERPD | Matheus Machado  | S1     |
    E que estou na tela "GERPD"
    E preencho os campos mais os campos de Data
      | Comprador | Fornec  | Pesquisa |
      |       028 | 3500684 |     4785 |
    Quando clico no botao Alterar
    Entao deve apresentar a mensagem "[1] ATENÇÃO DEVE PRIMEIRO CONSULTAR PEDIDO"

  @BRITQEA2798 @web
  Cenario: 2798 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'F'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2798 | BRITQEA-2798 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'F' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | F           |
   Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2799 @web
  Cenario: 2799 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'I'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2799 | BRITQEA-2799 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'I' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | F           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2800 @web
  Cenario: 2800 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'M'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2800 | BRITQEA-2800 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'M' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | M           |
   Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2801 @web
  Cenario: 2801 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2801 | BRITQEA-2801 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'N' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | N           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2802 @web
  Cenario: 2802 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'O'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2802 | BRITQEA-2802 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'O' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | O           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2803 @web
  Cenario: 2803 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'P'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2803 | BRITQEA-2803 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'P' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | P           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2804 @web
  Cenario: 2804 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2804 | BRITQEA-2804 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'S' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | P           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido

  @BRITQEA2805 @web
  Cenario: 2805 - Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'V'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                      | Nome do executor | Sprint |
      | 2805 | BRITQEA-2805 | Incluir e executar pedido estocado - Campo 'Classifc.Ped' - 'V' | Hiilário Bina    | S1     |
    E que estou na tela "GERPD"
    E que tenha um pedido com um item
      | Comprador | Fornec  | Pesquisa | Classif Ped |
      |       025 | 3509175 |     1661 | V           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem o numero do pedido
