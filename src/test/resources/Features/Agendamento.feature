#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: Agendamento SAD

  @BRITQEA-824 @web
  Cenario: Incluir/criar agendamento via tela "CPT85"
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Número do CT | Nome do CT                                 | Nome do executor | Sprint |
      | 824 |          824 | Incluir/criar agendamento via tela "CPT85" | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    E faco a consulta com a agenda recem gerada
    Entao deve ser apresentado as informacoes da agenda
