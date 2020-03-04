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
  Cenario: 2186 - Incluir produto&item - pedido DSD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2186 | BRITQEA-2186 | Incluir produto&item - pedido DSD | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    E pesquiso uma loja com o campo "Produto" com o valor "32916"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  |
      |       043 | 3514753 |
    Quando consultar o fornecedor 3514753 na SOLPD
    Entao a grid da Tela "SOLPD" deve apresentar os 1 itens inclusos
