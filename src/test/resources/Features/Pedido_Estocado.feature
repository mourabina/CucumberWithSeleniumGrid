#language: pt
#Author: Matheus Machado
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
    Quando clico no botao Consultar Tabela  Compra
    Então deve ser exibido o valor "4785" no campo "Codigo do Produto"

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
    Quando clico no botao Consultar Tabela  Compra
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
