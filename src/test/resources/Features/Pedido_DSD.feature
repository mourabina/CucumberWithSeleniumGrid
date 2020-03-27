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


  @BRITQEA2821 @web
  Cenario: 2821 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'I'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2821 | BRITQEA-2821 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'I' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | I           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2820 @web
  Cenario: 2820 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'G'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2820 | BRITQEA-2820 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'G' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | G           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2819 @web
  Cenario: 2819 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'F'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2819 | BRITQEA-2819 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'F' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | F           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2818 @web
  Cenario: 2818 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'A'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2818 | BRITQEA-2818 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'A' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | A           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2817 @web
  Cenario: 2817 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'A'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2817 | BRITQEA-2817 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'A' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos DSD
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | A           |

  @BRITQEA2822 @web
  Cenario: 2822 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'M'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2822 | BRITQEA-2822 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'M' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | M           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2823 @web
  Cenario: 2823 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2823 | BRITQEA-2823 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'N' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | N           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2824 @web
  Cenario: 2824 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'O'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2824 | BRITQEA-2824 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'O' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | O           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2825 @web
  Cenario: 2825 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'P'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2825 | BRITQEA-2825 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'P' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | P           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2826 @web
  Cenario: 2826 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2826 | BRITQEA-2826 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'S' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | S           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2827 @web
  Cenario: 2827 - SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'V'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 2827 | BRITQEA-2827 | SAD -Incluir e executar pedido DSD - Campo 'ClassifcPed' - 'V' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       043 | 3514753 |   32916 | V           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"
