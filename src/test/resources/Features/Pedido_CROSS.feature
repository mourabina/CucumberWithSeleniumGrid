#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@PedidoCROSS
Funcionalidade: Pedido_Cross SAD

  @BRITQEA2267 @web
  Cenario: 2267 - Consulta de produtos - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      | 2267 | BRITQEA-2267 | Consulta de produtos - CROSS | Hilário Bina     | S1     |
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
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Classif Ped | Produto |
      |       028 | 3512102 | T           |    6814 |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao a grid da Tela SOLPD deve apresentar os 1 itens inclusos

  @BRITQEA2183 @web
  Cenario: 2183 - Excluir pedido CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT           | Nome do executor | Sprint |
      | 2183 | BRITQEA-2183 | Excluir pedido CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha "1" item Cross Excluido
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | T           |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao deve retornar o item com situação "SOLICITACAO CANCELADA"

  @BRITQEA2184 @web
  Cenario: 2184 - Excluir mais de uma loja filial do pedido CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2184 | BRITQEA-2184 | Excluir mais de uma loja filial do pedido CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha "2" item Cross Excluido
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | T           |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao deve retornar o item com situação "SOLICITACAO CANCELADA"

  @BRITQEA2233 @web
  Cenario: 2233 - Consulta Lojas sem preencher o campo 'Produtos' - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                              | Nome do executor | Sprint |
      | 2233 | BRITQEA-2233 | Consulta Lojas sem preencher o campo 'Produtos' - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando clico no botao Pesquisar Lojas
    Entao deve exibir a mensagem "[1] ATENÇÃO PRODUTO DEVE SER INFORMADO"

  @BRITQEA2234 @web
  Cenario: 2234 - Consulta Pedido sem preencher o campo 'Produtos' - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                               | Nome do executor | Sprint |
      | 2234 | BRITQEA-2234 | Consulta Pedido sem preencher o campo 'Produtos' - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando clico no botao Pesquisar Pedido
    Entao deve exibir a mensagem "[1] ATENÇÃO PRODUTO DEVE SER INFORMADO"

  @BRITQEA2235 @web
  Cenario: 2235 - Consulta Pedido preenchendo o campo 'Produtos' - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                             | Nome do executor | Sprint |
      | 2235 | BRITQEA-2235 | Consulta Pedido preenchendo o campo 'Produtos' - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando realizo a consulta de pedido com o campo "Produto" contendo o valor "6814"
    Entao deve exibir a mensagem "[1] ATENÇÃO FORNECEDOR DEVE SER INFORMADO"

  @BRITQEA2236 @web
  Cenario: 2236 - Consulta Pedido preenchendo os campos 'Produtos' e 'Fornec' - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                          | Nome do executor | Sprint |
      | 2236 | BRITQEA-2236 | Consulta Pedido preenchendo os campos 'Produtos' e 'Fornec' - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando realizo a consulta de pedidos com os campos preenchidos
      | Produto | Fornec  |
      |    6814 | 3512102 |
    Entao deve exibir a mensagem "[1] ATENÇÃO COMPRADOR DEVE SER INFORMADO"

  @BRITQEA2237 @web
  Cenario: 2237 - Consulta Pedido preenchendo os campos 'Produtos', 'Fornec' e 'Comprador'- CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                                      | Nome do executor | Sprint |
      | 2237 | BRITQEA-2237 | Consulta Pedido preenchendo os campos 'Produtos', 'Fornec' e 'Comprador'- CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando realizo a consulta de pedidos com os campos preenchidos
      | Produto | Fornec  | Comprador | Classif Ped |
      |    6814 | 3512102 |       028 | T           |
    Entao deve exibir a mensagem "[1] ATENÇÃO DATA DE ENTREGA DEVE SER INFORMADA"

  @BRITQEA2238 @web
  Cenario: 2238 - Consulta Pedido preenchendo os campos 'Produtos', 'Fornec', 'Comprador' e 'Dt.Entrega' - CROSS
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                                                     | Nome do executor | Sprint |
      | 2238 | BRITQEA-2238 | Consulta Pedido preenchendo os campos 'Produtos', 'Fornec', 'Comprador' e 'Dt.Entrega' - CROSS | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando realizo a consulta de pedidos com os campos obrigatorios preenchidos
      | Produto | Fornec  | Comprador |
      |    6814 | 3512102 |       028 |
    Entao deve exibir a mensagem "[1] ATENÇÃO CLASSIFICACAO DO PEDIDO NAO CADASTRADA"

  @BRITQEA2240 @web
  Cenario: 2240 - Inserir caracteres especiais no campo 'Regional'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                       | Nome do executor | Sprint |
      | 2240 | BRITQEA-2240 | Inserir caracteres especiais no campo 'Regional' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Regional" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2241 @web
  Cenario: 2241 - Inserir letras no campo 'Regional'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                         | Nome do executor | Sprint |
      | 2241 | BRITQEA-2241 | Inserir letras no campo 'Regional' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Regional" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2242 @web
  Cenario: 2242 - Inserir caracteres especiais no campo 'Produto'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                      | Nome do executor | Sprint |
      | 2242 | BRITQEA-2242 | Inserir caracteres especiais no campo 'Produto' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Produto" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2243 @web
  Cenario: 2243 - Inserir letras no campo 'Produto'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                        | Nome do executor | Sprint |
      | 2243 | BRITQEA-2243 | Inserir letras no campo 'Produto' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Produto" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2244 @web
  Cenario: 2244 - Inserir caracteres especiais no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor | Sprint |
      | 2244 | BRITQEA-2244 | Inserir caracteres especiais no campo 'Comprador' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Comprador" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2245 @web
  Cenario: 2245 - Inserir letras no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                          | Nome do executor | Sprint |
      | 2245 | BRITQEA-2245 | Inserir letras no campo 'Comprador' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Comprador" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2246 @web
  Cenario: 2246 - Inserir caracteres especiais no campo 'DT Entrega'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                         | Nome do executor | Sprint |
      | 2246 | BRITQEA-2246 | Inserir caracteres especiais no campo 'DT Entrega' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "DT Entrega" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2247 @web
  Cenario: 2247 - Inserir letras no campo 'DT Entrega'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 2247 | BRITQEA-2247 | Inserir letras no campo 'DT Entrega' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "DT Entrega" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2248 @web
  Cenario: 2248 - Inserir caracteres especiais no campo 'Quant'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor | Sprint |
      | 2248 | BRITQEA-2248 | Inserir caracteres especiais no campo 'Quant' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Quant" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2249 @web
  Cenario: 2249 - Inserir letras no campo 'Quant'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 2249 | BRITQEA-2249 | Inserir letras no campo 'Quant' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Quant" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2250 @web
  Cenario: 2250 - Inserir caracteres especiais no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor | Sprint |
      | 2250 | BRITQEA-2250 | Inserir caracteres especiais no campo 'Comprador' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Comprador" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2251 @web
  Cenario: 2251 - Inserir letras no campo 'Comprador'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                          | Nome do executor | Sprint |
      | 2251 | BRITQEA-2251 | Inserir letras no campo 'Comprador' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Comprador" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2253 @web
  Cenario: 2253 - Inserir caracteres especiais no campo 'Desc'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                   | Nome do executor | Sprint |
      | 2253 | BRITQEA-2253 | Inserir caracteres especiais no campo 'Desc' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Desc" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2254 @web
  Cenario: 2254 - Inserir letras no campo 'Desc'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                     | Nome do executor | Sprint |
      | 2254 | BRITQEA-2254 | Inserir letras no campo 'Desc' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Desc" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2255 @web
  Cenario: 2255 - Inserir caracteres especiais no campo 'IPI'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                  | Nome do executor | Sprint |
      | 2255 | BRITQEA-2255 | Inserir caracteres especiais no campo 'IPI' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "ipi" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2256 @web
  Cenario: 2256 - Inserir letras no campo 'IPI'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2256 | BRITQEA-2256 | Inserir letras no campo 'IPI' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "ipi" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2257 @web
  Cenario: 2257 - Inserir caracteres especiais no campo 'ICM'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                  | Nome do executor | Sprint |
      | 2257 | BRITQEA-2257 | Inserir caracteres especiais no campo 'ICM' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "icm" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2258 @web
  Cenario: 2258 - Inserir letras no campo 'ICM'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2258 | BRITQEA-2258 | Inserir letras no campo 'ICM' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "icm" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2259 @web
  Cenario: 2259 - Inserir caracteres especiais no campo 'Contrato'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                       | Nome do executor | Sprint |
      | 2259 | BRITQEA-2259 | Inserir caracteres especiais no campo 'Contrato' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Contrato" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2260 @web
  Cenario: 2260 - Inserir letras no campo 'ICM'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                         | Nome do executor | Sprint |
      | 2260 | BRITQEA-2260 | Inserir letras no campo 'Contrato' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Contrato" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2261 @web
  Cenario: 2261 - Inserir caracteres especiais no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 2261 | BRITQEA-2261 | Inserir caracteres especiais no campo 'Evento' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Evento" com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2262 @web
  Cenario: 2262 - Inserir letras no campo 'Evento'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                       | Nome do executor | Sprint |
      | 2262 | BRITQEA-2262 | Inserir letras no campo 'Evento' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando preencho o campo "Evento" com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2263 @web
  Cenario: 2263 - Inserir caracteres especiais no campo 'Quantidade' - Segunda Grid
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                        | Nome do executor | Sprint |
      | 2263 | BRITQEA-2263 | Inserir caracteres especiais no campo 'Quantidade' - Segunda Grid | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E pesquiso uma loja com o campo "Produto" com o valor "6814"
    Quando preencho os campos Quantidade com o valor "@#$%&*~"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2264 @web
  Cenario: 2264 - Inserir letras no campo 'Quantidade' - Segunda Grid'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                           | Nome do executor | Sprint |
      | 2264 | BRITQEA-2264 | Inserir letras no campo 'Quantidade' - Segunda Grid' | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E pesquiso uma loja com o campo "Produto" com o valor "6814"
    Quando preencho os campos Quantidade com o valor "ABCDE"
    Entao deve exibir a mensagem "Caracter inválido em campos numéricos."

  @BRITQEA2267A @web
  Cenario: 2267A - Consulta de produtos - Estocados
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id    | Numero do CT  | Nome do CT                       | Nome do executor | Sprint |
      | 2267A | BRITQEA-2267A | Consulta de produtos - Estocados | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    Quando pesquiso uma loja com o campo "Produto" com o valor "1661"
    Entao deve ser populado o Grid de Resultados da INPE

  @BRITQEA2269 @web
  Cenario: 2269 - Incluir e executar pedido CROSS - Campo 'Preço Compra' preenchido
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                        | Nome do executor | Sprint |
      | 2269 | BRITQEA-2269 | Incluir e executar pedido CROSS - Campo 'Preço Compra' preenchido | Hilário Bina     | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Preco Compra | Produto | Classif Ped |
      |       028 | 3512102 |         45,0 |    6814 | T           |
    Quando consultar o fornecedor 3512102 na SOLPD
    Entao a grid da Tela SOLPD deve apresentar os 1 itens inclusos

  @BRITQEA2815 @web
  Cenario: 2815 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2815 | BRITQEA-2815 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'S' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | S           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2814 @web
  Cenario: 2814 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'P'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2814 | BRITQEA-2814 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'P' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | P           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2813 @web
  Cenario: 2813 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'O'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2813 | BRITQEA-2813 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'O' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | O           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2812 @web
  Cenario: 2812 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2812 | BRITQEA-2812 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'N' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | N           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"

  @BRITQEA2811 @web
  Cenario: 2811 - Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'M'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                   | Nome do executor     | Sprint |
      | 2811 | BRITQEA-2811 | Incluir e executar pedido CROSS - Campo 'Classifc Ped' - 'M' | Matheus Machado Luiz | S1     |
    E que estou na tela "INPE2"
    E que tenha 1 itens inclusos Cross
      | Comprador | Fornec  | Produto | Classif Ped |
      |       028 | 3512102 |    6814 | M           |
    Quando acionar o botao Executar Pedido
    Entao deve apresentar a mensagem "Seu número de requisição !"
