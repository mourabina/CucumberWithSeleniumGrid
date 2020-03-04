#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PedidoCROSS
Funcionalidade: Pedido_Cross SAD

  @BRITQEA2176 @web
  Cenario: 2176 - Consulta de produtos - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2176 | BRITQEA-2176 | Consulta de produtos - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando pesquiso uma loja com o campo "Produto" com o valor "6814"
    Entao deve ser populado o Grid de Resultados da INPE

  @BRITQEA2177 @web
  Cenario: 2177 - Incluir produto&item - pedido CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                          | Nome do executor | Sprint |
      | 2177 | BRITQEA-2177 | Incluir produto&item - pedido CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E pesquiso uma loja com o campo "Produto" com o valor "6814"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  |
      |       028 | 3512102 |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao a grid da Tela "SOLPD" deve apresentar os 1 itens inclusos

  @BRITQEA2183 @web
  Cenario: 2183 - Excluir pedido CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT           | Nome do executor | Sprint |
      | 2183 | BRITQEA-2183 | Excluir pedido CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha "1" iten Cross Excluido com o Produto "6814"
      | Comprador | Fornec  | Produto |
      |       028 | 3512102 |    6814 |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao deve retornar o item com status "SOLICITACAO CANCELADA"

  @BRITQEA2184 @web
  Cenario: 2184 - Excluir mais de uma loja&filial do pedido CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2184 | BRITQEA-2184 | Excluir mais de uma loja&filial do pedido CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha "2" iten Cross Excluido com o Produto "6814"
      | Comprador | Fornec  | Produto |
      |       028 | 3512102 |    6814 |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao deve retornar o item com status "SOLICITACAO CANCELADA"
