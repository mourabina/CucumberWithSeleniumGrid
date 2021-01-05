#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@Login
Funcionalidade: Pagina de Login

  @SENHORBARRIGA001 @web
  Cenario: 0001 - Validar autenticacao com sucesso no Site
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                               | Nome do executor   | Sprint |
      | 001 | SENHORBARRIGA - 001 | Validar autenticacao com sucesso no Site | Hilario Moura Bina | S1     |
    E digito usuario "h@h" e Senha "h"
    Quando clico no Botao Entrar
    Entao sistem exibi a mensagem "Bem vindo, Hilario!"

  @SENHORBARRIGA002 @web
  Cenario: 0002 - Validar Obrigatóriedade do campo Email na tela de Login
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                              | Nome do executor   | Sprint |
      | 002 | SENHORBARRIGA - 002 | Validar Obrigatóriedade do campo Email na tela de Login | Hilario Moura Bina | S1     |
    E preencho somente o valor Senha "h"
    Quando clico no Botao Entrar
    Entao sistem exibi a mensagem "Email é um campo obrigatório" na tela de Login"

  @SENHORBARRIGA003 @web
  Cenario: 0003 - Validar Obrigatóriedade do campo Senha na tela de Login
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                              | Nome do executor   | Sprint |
      | 003 | SENHORBARRIGA - 003 | Validar Obrigatóriedade do campo Senha na tela de Login | Hilario Moura Bina | S1     |
    E preencho somente o valor Email "h@h"
    Quando clico no Botao Entrar
    Entao sistem exibi a mensagem "Senha é um campo obrigatório" na tela de Login"

  @SENHORBARRIGA004 @web
  Cenario: 0004 - Validar autenticacao sem preencher nenhum campo
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                      | Nome do executor   | Sprint |
      | 004 | SENHORBARRIGA - 004 | Validar autenticacao sem preencher nenhum campo | Hilario Moura Bina | S1     |
    Quando clico no Botao Entrar
    Entao sistem exibi as mensagens "Email é um campo obrigatório" e "Senha é um campo obrigatório"
