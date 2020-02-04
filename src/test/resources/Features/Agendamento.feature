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
  Cenario: 946 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 946 | BRITQEA-946  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA947 @web
  Cenario: 947 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' =  'S' e 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 947 | BRITQEA-947  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA950 @web
  Cenario: 950 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 950 | BRITQEA-950  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA952 @web
  Cenario: 952 -  Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                     | Nome do executor | Sprint |
      | 952 | BRITQEA-952  | Alterar agenda - Campo 'Perecivel' & 'Alto Risco' =  'N' e 'S' | Hiilário Bina    | S1     |
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
  Cenario: 954 -  Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'N'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                    | Nome do executor | Sprint |
      | 954 | BRITQEA-954  | Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'N' | Hiilário Bina    | S1     |
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
  Cenario: 955 - Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                              | Nome do executor | Sprint |
      | 955 | BRITQEA-955  | Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S' | Hiilário Bina    | S1     |
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
  Cenario: 956 - Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'N'
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

  @BRITQEA972 @web
  Cenario: 972 -   Incluir criar agendamento - Campo 'Agenda' preenchido
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                            | Nome do executor | Sprint |
      | 972 | BRITQEA-972  | Incluir criar agendamento - Campo 'Agenda' preenchido | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Agenda | Contato     | Fone        | Perecivel | Alto Risco |
      |   0005 | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] 5 *** AGENDA NAO PODE SER INFORMADA NA INCLUSAO ***"

  @BRITQEA973 @web
  Cenario: 973 -  Incluir criar agendamento - 'Transportadora' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                             | Nome do executor     | Sprint |
      | 973 | BRITQEA-973  | Incluir criar agendamento - 'Transportadora' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Contato     | Fone        | Perecivel | Alto Risco |
      | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** TRANSPORTADORA DEVE SER PREENCHIDA **"

  @BRITQEA974 @web
  Cenario: 974 -  Incluir criar agendamento - 'Contato' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                      | Nome do executor     | Sprint |
      | 974 | BRITQEA-974  | Incluir criar agendamento - 'Contato' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Fone        | Perecivel | Alto Risco |
      | TransAutomação | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** CONTATO DEVE SER PREENCHIDO **"

  @BRITQEA975 @web
  Cenario: 975 -  Incluir criar agendamento - 'Fone' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                   | Nome do executor     | Sprint |
      | 975 | BRITQEA-975  | Incluir criar agendamento - 'Fone' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** TELEFONE DEVE SER PREENCHIDO **"

  @BRITQEA976 @web
  Cenario: 976 -  Incluir criar agendamento - 'Perecivel' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                        | Nome do executor     | Sprint |
      | 976 | BRITQEA-976  | Incluir criar agendamento - 'Perecivel' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** PERECIVEL DEVE SER "S" OU "N" **"

  @BRITQEA977 @web
  Cenario: 977 -  Incluir criar agendamento - 'Alto Risco' em branco
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                         | Nome do executor     | Sprint |
      | 977 | BRITQEA-977  | Incluir criar agendamento - 'Alto Risco' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel |
      | TransAutomação | Sr Selenium | 11 31314040 | N         |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** RISCO DEVE SER "S" OU "N" **"

  @BRITQEA985 @web
  Cenario: 985 -  Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Alto Risco'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                     | Nome do executor     | Sprint |
      | 985 | BRITQEA-985  | Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Alto Risco' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | D          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] D ** RISCO DEVE SER "S" OU "N" **"

  @BRITQEA986 @web
  Cenario: 986 - Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Perecível'
    Dado que estou logado com usuario/filial "818181"/"7467"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                    | Nome do executor     | Sprint |
      | 986 | BRITQEA-986  | Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Perecível' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | D         | S          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] D ** PERECIVEL DEVE SER "S" OU "N" **"
