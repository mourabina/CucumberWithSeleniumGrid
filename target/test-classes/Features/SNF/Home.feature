#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: Home Site do Senhor Barriga

  @SENHORBARRIGA018 @web
  Cenario: 0018 - Validar o valor do Saldo na tela Home da Aplicação
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                         | Nome do executor   | Sprint |
      | 018 | SENHORBARRIGA - 018 | Validar o valor do Saldo na tela Home da Aplicação | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    E crio uma Movimentacao
    Quando acesso a tela Home da Aplicacao
    Entao sistema exibi o valor do Saldo igual ao utilizado na criacao da Movimentacao
