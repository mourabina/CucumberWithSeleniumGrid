#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
@CriarMovimentacao
Funcionalidade: Criar Movimentacao

  @SENHORBARRIGA013 @web
  Cenario: 0013 - Criar Movimentacao com Sucesso
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                     | Nome do executor   | Sprint |
      | 013 | SENHORBARRIGA - 013 | Criar Movimentacao com Sucesso | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    Quando crio uma Movimentacao
    Entao sistem exibi a mensagen "Movimentação adicionada com sucesso!"  na tela de Criar Movimentacao

  @SENHORBARRIGA014 @web
  Cenario: 0014 - Obrigatoriedade do campo 'Data da Movimentação'
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                      | Nome do executor   | Sprint |
      | 014 | SENHORBARRIGA - 014 | Obrigatoriedade do campo 'Data da Movimentação' | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    Quando crio uma Movimentacao sem o campo Data Movimentacao
    Entao sistem exibi a mensagen "Data da Movimentação é obrigatório"  na tela de Criar Movimentacao

  @SENHORBARRIGA015 @web
  Cenario: 0015 - Obrigatoriedade do campo 'Data do Pagamento'
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                                   | Nome do executor   | Sprint |
      | 015 | SENHORBARRIGA - 015 | Obrigatoriedade do campo 'Data do Pagamento' | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    Quando crio uma Movimentacao sem o campo Data do Pagamento
    Entao sistem exibi a mensagen "Data do pagamento é obrigatório"  na tela de Criar Movimentacao

  @SENHORBARRIGA016 @web
  Cenario: 0016 - Obrigatoriedade do campo 'Valor'
    Dado que Logado na Pagina do Senhor Barriga
    E estou executando o teste
      | id  | Numero do CT        | Nome do CT                       | Nome do executor   | Sprint |
      | 016 | SENHORBARRIGA - 016 | Obrigatoriedade do campo 'Valor' | Hilario Moura Bina | S1     |
    E acesso a pagina Adicionar Conta
    E tenho uma conta já criada
    Quando crio uma Movimentacao sem o campo Valor
    Entao sistema exibi as mensagens "Valor é obrigatório" e "Valor deve ser um número"
