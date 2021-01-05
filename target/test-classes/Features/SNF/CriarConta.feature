#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
@CriarConta
Funcionalidade: Criar Conta

  @SENHORBARRIGA009 @web
  Cenario: 0009 - Validar criacao de Nova Conta com Sucesso
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                | Nome do executor   | Sprint |
      | 009 | SENHORBARRIGA - 009 | Validar criacao de Nova Conta com Sucesso | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E preencho o campo Nome com novo valor
    Quando clico no Botao Salvar
    Entao sistem exibi a mensagen "Conta adicionada com sucesso!"  na tela de Adicionar Conta

  @SENHORBARRIGA010 @web
  Cenario: 0010 - Validar criacao de Nova Conta com Nome já existente
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                          | Nome do executor   | Sprint |
      | 010 | SENHORBARRIGA - 010 | Validar criacao de Nova Conta com Nome já existente | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    E preencho o campo nome com valor já criado
    Quando clico no Botao Salvar
    Entao sistem exibi a mensagen "Já existe uma conta com esse nome!"  na tela de Adicionar Conta

  @SENHORBARRIGA011 @web
  Cenario: 0011 - Validar criacao de Nova Conta sem preencher o Campo Nome
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                               | Nome do executor   | Sprint |
      | 011 | SENHORBARRIGA - 011 | Validar criacao de Nova Conta sem preencher o Campo Nome | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    Quando clico no Botao Salvar
    Entao sistem exibi a mensagen "Informe o nome da conta"  na tela de Adicionar Conta

  @SENHORBARRIGA012 @web
  Cenario: 0012 - Validar acao de Deletar Contana tela de Adicionar Conta
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                              | Nome do executor   | Sprint |
      | 012 | SENHORBARRIGA - 012 | Validar acao de Deletar Contana tela de Adicionar Conta | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    Quando clico no Botao Deletar Conta
    Entao sistem exibi a mensagen "Conta removida com sucesso!"  na tela de Adicionar Conta
