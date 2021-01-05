#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@CriarNovoUsuario
Funcionalidade: Criar Novo Usuario

  @SENHORBARRIGA005 @web
  Cenario: 0005 - Validar criacao de Novo Usuario preenchenco somente o campo Nome
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                                       | Nome do executor   | Sprint |
      | 005 | SENHORBARRIGA - 005 | Validar criacao de Novo Usuario preenchenco somente o campo Nome | Hilario Moura Bina | S1     |
    E acesso a pagina Novo Usuario
    E preencho somente o campo "Nome" com o valor "Jose"
    Quando clico no Botao Cadastrar
    Entao sistem exibi as mensagens "Email é um campo obrigatório" e "Senha é um campo obrigatório" na tela de Novo Usuario

  @SENHORBARRIGA006 @web
  Cenario: 0006 - Validar criacao de Novo Usuario preenchenco somente o campo Email
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                                        | Nome do executor   | Sprint |
      | 006 | SENHORBARRIGA - 006 | Validar criacao de Novo Usuario preenchenco somente o campo Email | Hilario Moura Bina | S1     |
    E acesso a pagina Novo Usuario
    E preencho somente o campo "Email" com o valor "Jose@Jose"
    Quando clico no Botao Cadastrar
    Entao sistem exibi as mensagens "Nome é um campo obrigatório" e "Senha é um campo obrigatório" na tela de Novo Usuario

  @SENHORBARRIGA007 @web
  Cenario: 0007 - Validar criacao de Novo Usuario preenchenco somente o campo Senha
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                                        | Nome do executor   | Sprint |
      | 007 | SENHORBARRIGA - 007 | Validar criacao de Novo Usuario preenchenco somente o campo Senha | Hilario Moura Bina | S1     |
    E acesso a pagina Novo Usuario
    E preencho somente o campo "Senha" com o valor "Jose"
    Quando clico no Botao Cadastrar
    Entao sistem exibi as mensagens "Nome é um campo obrigatório" e "Email é um campo obrigatório" na tela de Novo Usuario

  @SENHORBARRIGA008 @web
  Cenario: 0008 - Validar criacao de Novo Usuario com Sucesso
    Dado que estou na pagina de Login do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                  | Nome do executor   | Sprint |
      | 008 | SENHORBARRIGA - 008 | Validar criacao de Novo Usuario com Sucesso | Hilario Moura Bina | S1     |
    E acesso a pagina Novo Usuario
    E preencho os campos "Nome", "Email" e "Senha" com os valore "Jose", "Jose@Jose" e "Jose"
    Quando clico no Botao Cadastrar
    Entao sistem exibi a mensagen "Usuário inserido com sucesso"  na tela de Novo Usuario
