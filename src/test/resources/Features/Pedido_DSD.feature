#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PedidoDSD
Funcionalidade: Pedido_Dsd

  @BRITQEA2185 @web
  Cenario: 2185 - Consulta de produtos DSD na INPE2
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2185 | BRITQEA-2185 | Consulta de produtos - 'DSD' | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Produto" com o valor "9885" da tela INPE
    E clico no botao Consultar Lojas
    Entao deve ser exibido no GRID o "Codigo Filial" e a "Nome Filial" na Tela Inpe

  @BRITQEA2186 @web
  Cenario: 2186 - Incluir produto DSD na INPE2
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2186 | BRITQEA-2186 | Incluir produto&item - pedido DSD | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | T           |
    Quando pesquiso pelo fornecedor na SOLPD
    Entao a grid da Tela SOLPD deve apresentar os 1 itens inclusos

  @BRITQEA2266 @web
  Cenario: 2266 - Incluir pedido DSD - Campo 'Preço Compra' preenchido
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                           | Nome do executor | Sprint |
      | 2266 | BRITQEA-2266 | Incluir pedido DSD - Campo 'Preço Compra' preenchido | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Preco Compra | Produto | Classif Ped |
      |       043 | 3514753 |        45,00 |   32916 | T           |
    Quando consultar o fornecedor 3514753 na SOLPD
    Entao a grid da Tela SOLPD deve apresentar os 1 itens inclusos
