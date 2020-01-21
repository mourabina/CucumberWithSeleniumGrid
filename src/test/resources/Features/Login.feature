#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: Login SAD

  @Login @web
  Cenario: Verificar o login no SAD
    Dado que estou logado no "SADNEW06" com usuario/filial "250492"/"7467"
    E estou executando o teste
      | id | Número do CT | Nome do CT                     | Nome do executor | Sprint |
      |  1 |            1 | Validar o login no sistema SAD | Matheus MAchado  | T1     |
    E acessar a tela "CPC10" (SAD)
