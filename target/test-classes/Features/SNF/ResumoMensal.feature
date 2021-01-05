#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
@ResumoMensal
Funcionalidade: Resumo Mensal

  @SENHORBARRIGA017 @web
  Cenario: 0017 - Deletar Movimentacao na tela Resumo Mensal
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                 | Nome do executor   | Sprint |
      | 017 | SENHORBARRIGA - 017 | Deletar Movimentacao na tela Resumo Mensal | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    E crio uma Movimentacao
    Quando deleto uma movimentacao
    Entao sistem exibi a mensagen "Movimentação removida com sucesso!"  na tela de Resumo Mensal
