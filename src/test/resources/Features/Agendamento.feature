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
    E acessar a tela "CPT85" (SAD)
    Quando preencho os campos de Datas e
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    E clicono botao incluir
    E salvo o valor do campo Agenda e faco uma nova consulta como Valor salvo
    Entao deve ser apresentado as informcoes da agenda
