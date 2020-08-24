#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
@TurnoCD
Funcionalidade: Turno CD e RF

  @BRITQEA5285 @web
  Cenario: 5285 - Abertura de turno CD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT           | Nome do executor     | Sprint |
      | 5285 | BRITQEA-5285 | Abertura de turno CD | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    Quando pressiono enter após preencher o campo com "S"
    Então sistema deve abrir o turno

  @BRITQEA5287 @web @Tela
  Cenario: 5287 - Abrir turno CD com caractere especial
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                            | Nome do executor     | Sprint |
      | 5287 | BRITQEA-5287 | Abrir turno CD com caractere especial | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    Quando pressiono enter após preencher o campo com "@"
    Então sistema não deve abrir o turno apresentando a mensagem "ATENÇÃO *** DIGITAR "N" OU "S" ***"

  @BRITQEA5286 @web @Tela
  Cenario: 5286 - Abrir turno CD com caractere divergente
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                              | Nome do executor     | Sprint |
      | 5286 | BRITQEA-5286 | Abrir turno CD com caractere divergente | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    Quando pressiono enter após preencher o campo com "Q"
    Então sistema não deve abrir o turno apresentando a mensagem "ATENÇÃO *** DIGITAR "N" OU "S" ***"

  @BRITQEA5292 @web
  Cenario: 5292 - Fechar turno CD
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT      | Nome do executor     | Sprint |
      | 5292 | BRITQEA-5292 | Fechar turno CD | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    E turno do CD está aberto
    Quando pressiono enter após preencher o campo com "S"
    Então sistema deve fechar o turno

  @BRITQEA5294 @web @Tela
  Cenario: 5294 - Fechar turno CD com caractere especial
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                             | Nome do executor     | Sprint |
      | 5294 | BRITQEA-5294 | Fechar turno CD com caractere especial | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    Quando pressiono enter após preencher o campo com "@"
    Então sistema não deve fechar o turno apresentando a mensagem "ATENÇÃO *** DIGITAR "N" OU "S" ***"

  @BRITQEA5295 @web @Tela
  Cenario: 5295 - Fechar turno CD com caractere divergente
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                               | Nome do executor     | Sprint |
      | 5295 | BRITQEA-5295 | Fechar turno CD com caractere divergente | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    Quando pressiono enter após preencher o campo com "Q"
    Então sistema não deve fechar o turno apresentando a mensagem "ATENÇÃO *** DIGITAR "N" OU "S" ***"

  @BRITQEA5288 @web
  Cenario: 5288 - Abrir turno RF
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT     | Nome do executor     | Sprint |
      | 5288 | BRITQEA-5288 | Abrir turno RF | Matheus Machado Luiz | S1     |
    E que estou na tela "RFABR"
    E acessar o RF com usuário "818181"
    Quando acionar o botão "Abrir" na tela de expedição
    Então sistema não deve apresentar erro

  @BRITQEA5290 @web
  Cenario: 5290 - Fechar turno RF
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT      | Nome do executor     | Sprint |
      | 5290 | BRITQEA-5290 | Fechar turno RF | Matheus Machado Luiz | S1     |
    E que estou na tela "RFABR"
    E acessar o RF com usuário "818181"
    Quando acionar o botão "Fechar" na tela de expedição
    Então sistema não deve apresentar erro

  @BRITQEA5289 @web
  Cenario: 5289 - Abrir turno repetido RF
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT              | Nome do executor     | Sprint |
      | 5289 | BRITQEA-5289 | Abrir turno repetido RF | Matheus Machado Luiz | S1     |
    E que estou na tela "RFABR"
    E acessar o RF com usuário "818181"
    Quando acionar o botão "Abrir" na tela de expedição
    Então sistema deve apresentar o alerta "JÁ EXISTE TURNO ABERTO"

  @BRITQEA5293 @web
  Cenario: 5293 - Fechar turno CD com menos de uma hora da abertura
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome sdo executor    | Sprint |
      | 5293 | BRITQEA-5293 | Fechar turno CD com menos de uma hora da abertura | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    E turno do CD está aberto
    Quando pressiono enter após preencher o campo com "S"
    Então sistema deve apresentar o alerta "TURNO A SER FECHADO FOI ABERTO A MENOS DE UM HORA"

  @BRITQEA5293 @web
  Cenario: 5293 - Fechar turno CD com menos de uma hora da abertura
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome sdo executor    | Sprint |
      | 5293 | BRITQEA-5293 | Fechar turno CD com menos de uma hora da abertura | Matheus Machado Luiz | S1     |
    E que estou na tela "FAT07"
    E turno do CD está aberto
    Quando pressiono enter após preencher o campo com "S"
    Então sistema deve apresentar o alerta "TURNO A SER FECHADO FOI ABERTO A MENOS DE UM HORA"

  @BRITQEA5291 @web
  Cenario: 5291 - Manutenção de turno do SADRF
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                   | Nome sdo executor    | Sprint |
      | 5291 | BRITQEA-5291 | Manutenção de turno do SADRF | Matheus Machado Luiz | S1     |
    E que estou na tela "RFA03"
    E consulto o turno de hoje
    Quando submeto o registro com os dados alterados
    Então o registro deve ser alterado
