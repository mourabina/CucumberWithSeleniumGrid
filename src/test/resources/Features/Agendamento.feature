#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
@Agendamento
Funcionalidade: Agendamento SAD

  @BRITQEA824 @web
  Cenario: 824 - Incluir criar agendamento via tela 'CPT851'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                 | Nome do executor | Sprint |
      | 824 | BRITQEA-824  | Incluir criar agendamento via tela 'CPT85' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA825 @web
  Cenario: 825 - Consultar agendamento via tela 'CPT85'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                             | Nome do executor | Sprint |
      | 825 | BRITQEA-825  | Consultar agendamento via tela 'CPT85' | Matheus Machado  | S2     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    Entao deve retornar os dados da agenda

  @BRITQEA826 @web
  Cenario: 826 - Deletar agendamento via tela 'CPT85'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 826 | BRITQEA-826  | Deletar agendamento via tela 'CPT85' | Matheus Machado  | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E acionar o botão deletar
    Entao deve ser exibido a mensagem "*** ESTA AGENDA ESTA CANCELADA **"

  @BRITQEA827 @web
  Cenario: 827 - Alterar agendamento via tela 'CPT85'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 827 | BRITQEA-827  | Alterar agendamento via tela 'CPT85' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e clico em Alterar
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"

  @BRITQEA946 @web
  Cenario: 946 - Incluir criar agendamento - 'S' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                            | Nome do executor | Sprint |
      | 946 | BRITQEA-946  | Incluir criar agendamento - 'S' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA947 @web
  Cenario: 947 - Incluir criar agendamento - 'S' e 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                            | Nome do executor | Sprint |
      | 947 | BRITQEA-947  | Incluir criar agendamento - 'S' e 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA950 @web
  Cenario: 950 - Incluir criar agendamento - 'N' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                            | Nome do executor | Sprint |
      | 950 | BRITQEA-950  | Incluir criar agendamento - 'N' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA952 @web
  Cenario: 952 -  Alterar agenda - 'N' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                 | Nome do executor | Sprint |
      | 952 | BRITQEA-952  | Alterar agenda - 'N' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e aciono o botao Alterar
      | Transportadora | Contato      | Fone      | Perecivel | Alto Risco |
      | BigAutomacao   | Sr Automacao | 11 525289 | N         | S          |
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"

  @BRITQEA954 @web
  Cenario: 954 -  Alterar agenda - 'S' e 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                 | Nome do executor | Sprint |
      | 954 | BRITQEA-954  | Alterar agenda - 'S' e 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e aciono o botao Alterar
      | Transportadora | Contato      | Fone      | Perecivel | Alto Risco |
      | BigAutomacao   | Sr Automacao | 11 525289 | S         | N          |
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"

  @BRITQEA955 @web
  Cenario: 955 - Alterar agenda - 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT           | Nome do executor | Sprint |
      | 955 | BRITQEA-955  | Alterar agenda - 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e aciono o botao Alterar
      | Transportadora | Contato      | Fone      | Perecivel | Alto Risco |
      | BigAutomacao   | Sr Automacao | 11 525289 | S         | S          |
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"

  @BRITQEA956 @web
  Cenario: 956 - Alterar agenda - 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT           | Nome do executor | Sprint |
      | 956 | BRITQEA-956  | Alterar agenda - 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e aciono o botao Alterar
      | Transportadora | Contato      | Fone      | Perecivel | Alto Risco |
      | BigAutomacao   | Sr Automacao | 11 525289 | N         | N          |
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"
