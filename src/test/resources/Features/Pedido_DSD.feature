#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
@PedidoEstocado
Funcionalidade: Pedido_Dsd

 @BRITQEA2110 @web
  Cenario: 2110 - Consulta de produtos - 'DSD'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2110 | BRITQEA-2110 | Consulta de produtos - 'DSD'  | Hiilário Bina    | S1     |
    E que estou na tela "INPE2"
    Quando preencher o campo "Pesquisa" com o valor "!@#$%&*" da tela INPE2
    Entao deve ser exibido no GRID o "Codigo do Produto" e a "Descricao do Produto"