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
    E preencho os campos de Datas e
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
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
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
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
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
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
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e clico em Alterar
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***"
