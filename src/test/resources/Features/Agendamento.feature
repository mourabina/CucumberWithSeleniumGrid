#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: Agendamento SAD

  @Agendamento @web
  Cenario: Verificar o login no SAD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id | Número do CT | Nome do CT                     | Nome do executor | Sprint |
      |  1 |            1 | Validar o login no sistema SAD | Matheus MAchado  | T1     |
    E acessar a tela "CPT85" (SAD)
    Quando preencho os campos
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |              1500 | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
