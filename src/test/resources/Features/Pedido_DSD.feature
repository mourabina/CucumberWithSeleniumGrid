#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PedidoEstocado
Funcionalidade: Pedido_Dsd

  @BRITQEA2185 @web
  Cenario: 2185 - Consulta de produtos - 'DSD'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2185 | BRITQEA-2185 | Consulta de produtos - 'DSD' | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Produto" com o valor "9885" da tela INPE
    E clico no botao Consultar Lojas
    Entao deve ser exibido no GRID o "Codigo Filial" e a "Nome Filial" na Tela Inpe

  @BRITQEA2186 @web
  Cenario: 2186 - Consulta de produtos - 'DSD'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2186 | BRITQEA-2186 | Consulta de produtos - 'DSD' | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Produto" com o valor "23084" da tela INPE
    E clico no botao Consultar Lojas
    E preencho os campos mais os campos de Data de Entrega e Classif Ped
      | Comprador | Fornecedor |
      |       049 |    3506921 |
    E Seleciono uma Loja preencho quantidade e clico em incluir
    #Entao deve ser exibido no GRID o "Codigo Filial" e a "Nome Filial" na Tela Inpe
