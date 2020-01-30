#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
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
