#language: pt
#Author: Hilário Bina
#Version: 1.0
#Encoding: UTF-8
@Agendamento
Funcionalidade: Agendamento SAD

  @BRITQEA824 @web
  Cenario: 824 - Incluir criar agendamento via tela 'CPT85'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 826 | BRITQEA-826  | Deletar agendamento via tela 'CPT85' | Matheus Machado  | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando acionar o botão deletar
    Entao deve ser exibido a mensagem "*** ATENÇÃO! ESSA AGENDA ESTÁ CANCELADA ***" na CPT85

  @BRITQEA827 @web 
  Cenario: 827 - Alterar agendamento via tela 'CPT85'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 827 | BRITQEA-827  | Alterar agendamento via tela 'CPT85' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando pesquisar a agenda
    E altero as informacoes da Agenda e clico em Alterar
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***" na CPT85

  @BRITQEA946 @web @TelaSADSAMS
  Cenario: 946 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'S'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 946 | BRITQEA-946  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA2845 @web  @TelaSADSAMS
  Cenario: 2845 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'N'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 2845 | BRITQEA-2845 | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA947 @web @TelaSADSAMS
  Cenario: 947 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' =  'S' e 'N'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 947 | BRITQEA-947  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'N' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA950 @web @TelaSADSAMS
  Cenario: 950 - Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                               | Nome do executor | Sprint |
      | 950 | BRITQEA-950  | Incluir criar agendamento - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S' | Hiilário Bina    | S1     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | S          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA952 @web @TelaSADSAMS
  Cenario: 952 -  Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'N' e 'S'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***" na CPT85

  @BRITQEA954 @web @TelaSADSAMS
  Cenario: 954 -  Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S' e 'N'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***" na CPT85

  @BRITQEA955 @web @TelaSADSAMS
  Cenario: 955 - Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'S'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***" na CPT85

  @BRITQEA956 @web @TelaSADSAMS
  Cenario: 956 - Alterar agenda - Campo 'Perecivel' & 'Alto Risco' = 'N'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
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
    Entao deve ser exibido a mensagem "[1] ATENÇÃO *** ALTERACAO EFETUADO COM SUCESSO ***" na CPT85

  @BRITQEA972 @web @TelaSADSAMS
  Cenario: 972 -   Incluir criar agendamento - Campo 'Agenda' preenchido
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                            | Nome do executor | Sprint |
      | 972 | BRITQEA-972  | Incluir criar agendamento - Campo 'Agenda' preenchido | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Agenda | Contato     | Fone        | Perecivel | Alto Risco |
      |   0005 | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] 5 *** AGENDA NAO PODE SER INFORMADA NA INCLUSAO ***" na CPT85

  @BRITQEA973 @web @TelaSADSAMS
  Cenario: 973 -  Incluir criar agendamento - 'Transportadora' em branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                             | Nome do executor     | Sprint |
      | 973 | BRITQEA-973  | Incluir criar agendamento - 'Transportadora' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Contato     | Fone        | Perecivel | Alto Risco |
      | Sr Selenium | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** TRANSPORTADORA DEVE SER PREENCHIDA **" na CPT85

  @BRITQEA974 @web @TelaSADSAMS
  Cenario: 974 -  Incluir criar agendamento - 'Contato' em branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                      | Nome do executor     | Sprint |
      | 974 | BRITQEA-974  | Incluir criar agendamento - 'Contato' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Fone        | Perecivel | Alto Risco |
      | TransAutomação | 11 31314040 | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** CONTATO DEVE SER PREENCHIDO **" na CPT85

  @BRITQEA975 @web @TelaSADSAMS
  Cenario: 975 -  Incluir criar agendamento - 'Fone' em branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                   | Nome do executor     | Sprint |
      | 975 | BRITQEA-975  | Incluir criar agendamento - 'Fone' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | N         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** TELEFONE DEVE SER PREENCHIDO **" na CPT85

  @BRITQEA976 @web @TelaSADSAMS
  Cenario: 976 -  Incluir criar agendamento - 'Perecivel' em branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                        | Nome do executor     | Sprint |
      | 976 | BRITQEA-976  | Incluir criar agendamento - 'Perecivel' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** PERECIVEL DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA2843 @web @TelaSADSAMS
  Cenario: 2843 -  Inserir Letras (diferentes de 'S' ou 'N') - Campo `Alto Risco'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                     | Nome do executor     | Sprint |
      | 2843 | BRITQEA-2843 | Inserir Letras (diferentes de 'S' ou 'N') - Campo `Alto Risco' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | N         | X          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] X ** RISCO DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA977 @web @TelaSADSAMS
  Cenario: 977 -  Incluir criar agendamento - 'Alto Risco' em branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                         | Nome do executor     | Sprint |
      | 977 | BRITQEA-977  | Incluir criar agendamento - 'Alto Risco' em branco | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel |
      | TransAutomação | Sr Selenium | 11 31314040 | N         |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] ** RISCO DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA985 @web @TelaSADSAMS
  Cenario: 985 -  Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Alto Risco'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                     | Nome do executor     | Sprint |
      | 985 | BRITQEA-985  | Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Alto Risco' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | D          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] D ** RISCO DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA986 @web @TelaSADSAMS
  Cenario: 986 - Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Perecível'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                                    | Nome do executor     | Sprint |
      | 986 | BRITQEA-986  | Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Perecível' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | D         | S          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] D ** PERECIVEL DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA992 @web @TelaSADSAMS
  Cenario: 992 -  Inserir Agenda - Data Incorreta
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 992 | BRITQEA-992  | Inserir Agenda - Data Incorreta | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Hora
      | Data Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      |            050216 | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] 50216 ** PREVISAO ENTREGA NAO PODE SER INFERIOR A DATA DE HOJE **" na CPT85

  @BRITQEA993 @web @TelaSADSAMS
  Cenario: 993 -  Inserir Agenda - Hora Incorreta
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 993 | BRITQEA-993  | Inserir Agenda - Hora Incorreta | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Data
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao deve ser exibido a seguinte mensagem "[1] [HORA] ** HORA/MIN NAO PODE SER INFERIOR A HORA ATUAL **" na CPT85

  @BRITQEA994 @web @TelaSADSAMS
  Cenario: 994 -  Inserir Caracteres Especiais - Campo 'Data Agenda'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                         | Nome do executor | Sprint |
      | 994 | BRITQEA-994  | Inserir Caracteres Especiais - Campo 'Data Agenda' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Hora e Data Entrada
      | Data Agenda | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | !@#$%&*~    | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Data Agenda" deve esta vazio na CPT85

  @BRITQEA995 @web @TelaSADSAMS
  Cenario: 995 -  Inserir Letras - Campo 'Data Agenda'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                           | Nome do executor | Sprint |
      | 995 | BRITQEA-995  | Inserir Letras - Campo 'Data Agenda' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Hora e Data Entrada
      | Data Agenda | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | Agenda      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Data Agenda" deve esta vazio na CPT85

  @BRITQEA996 @web @TelaSADSAMS
  Cenario: 996 -  Inserir Caracteres Especiais - Campo 'Hora Prev Entrada'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                               | Nome do executor | Sprint |
      | 996 | BRITQEA-996  | Inserir Caracteres Especiais - Campo 'Hora Prev Entrada' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Hora e Data Agenda
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | !@$%&*~           | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Hora Prev Entrada" deve esta vazio na CPT85

  @BRITQEA2841 @web @TelaSADSAMS
  Cenario: 2841 -  Inserir Caracteres Especiais - Campo 'Fone'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                               | Nome do executor | Sprint |
      | 2841 | BRITQEA-2841 | Inserir Caracteres Especiais - Campo 'Fone' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone      | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | !@$%^&*() | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Fone" deve esta vazio na CPT85

  @BRITQEA997 @web @TelaSADSAMS
  Cenario: 997 -  Inserir Letras - Campo 'Hora Prev Entrada'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id  | Numero do CT | Nome do CT                                 | Nome do executor | Sprint |
      | 997 | BRITQEA-997  | Inserir Letras - Campo 'Hora Prev Entrada' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Hora e Data Agenda
      | Hora Prev Entrada | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | ABCD              | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando clico no botao incluir
    Entao o campo "Hora Prev Entrada" deve esta vazio na CPT85

  @BRITQEA1002 @web @TelaSADSAMS
  Cenario: 1002 -   Inserir Caracteres Especiais - Campo 'Agenda'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor | Sprint |
      | 1002 | BRITQEA-1002 | Inserir Caracteres Especiais - Campo 'Agenda' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    Quando preencho o campo "Agenda" com os valores "~!@#$%&*"
    Entao o campo "Agenda" deve esta vazio na CPT85

  @BRITQEA1003 @web @TelaSADSAMS
  Cenario: 1003 -   Inserir Letras - Campo 'Agenda'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 1003 | BRITQEA-1003 | Inserir Letras - Campo 'Agenda' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    Quando preencho o campo "Agenda" com os valores "ABCDE"
    Entao o campo "Agenda" deve esta vazio na CPT85

  @BRITQEA1004 @web @TelaSADSAMS
  Cenario: 1004 -  Alterar o valor campo 'Transportadora' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                         | Nome do executor | Sprint |
      | 1004 | BRITQEA-1004 | Alterar o valor campo 'Transportadora' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Transportadora" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem "[1] ** TRANSPORTADORA DEVE SER PREENCHIDA **" na CPT85

  @BRITQEA1009 @web @TelaSADSAMS
  Cenario: 1009 -  Alterar o valor campo 'Contato' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                  | Nome do executor | Sprint |
      | 1009 | BRITQEA-1009 | Alterar o valor campo 'Contato' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Contato" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem "[1] ** CONTATO DEVE SER PREENCHIDO **" na CPT85

  @BRITQEA1010 @web @TelaSADSAMS
  Cenario: 1010 -  Alterar o valor campo 'Fone' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                               | Nome do executor | Sprint |
      | 1010 | BRITQEA-1010 | Alterar o valor campo 'Fone' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Fone" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem "[1] ** TELEFONE DEVE SER PREENCHIDO **" na CPT85

  @BRITQEA1011 @web @TelaSADSAMS
  Cenario: 1011 -  Alterar o valor campo 'Perecível' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                    | Nome do executor | Sprint |
      | 1011 | BRITQEA-1011 | Alterar o valor campo 'Perecível' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Perecivel" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem "[1] ** PERECIVEL DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA1012 @web @TelaSADSAMS
  Cenario: 1012 -  Alterar o valor campo 'Alto Risco' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                     | Nome do executor | Sprint |
      | 1012 | BRITQEA-1012 | Alterar o valor campo 'Alto Risco' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Alto Risco" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem "[1] ** ALTO RISCO DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA1013 @web @TelaSADSAMS
  Cenario: 1013 -  Alterar o valor campo 'Agenda' para Branco
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                 | Nome do executor | Sprint |
      | 1013 | BRITQEA-1013 | Alterar o valor campo 'Agenda' para Branco | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Agenda" deixando ele em branco, depois aciono o botao Alterar
    Entao deve ser exibido a mensagem no Alert "[1] *** NUMERO DA AGENDA TEM QUE SER INFORMADO PARA CONSULTA DO PEDIDO ***"

  @BRITQEA1014 @web @TelaSADSAMS
  Cenario: 1014 -  Alterar Agenda - Hora Incorreta
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 1014 | BRITQEA-1014 | Alterar Agenda - Hora Incorreta | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Hora Prev Entrada" para Hora anterior a atual, depois aciono o botao Alterar
    Entao deve ser exibido a seguinte mensagem "[1] [HORA] ** HORA/MIN NAO PODE SER INFERIOR A HORA ATUAL **" na CPT85

  @BRITQEA1015 @web @TelaSADSAMS
  Cenario: 1015 -   Alterar Agenda - Data Incorreta
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                      | Nome do executor | Sprint |
      | 1015 | BRITQEA-1015 | Alterar Agenda - Data Incorreta | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E que tenha uma agenda criada
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | S          |
    Quando pesquisar a agenda
    E altero o campo "Data Prev Entrada" para "010115" depois clico em Alterar
    Entao deve ser exibido a mensagem "[1] 10115 ** PREVISAO ENTREGA NAO PODE SER INFERIOR A DATA DE HOJE **" na CPT85

  @BRITQEA1019 @web @TelaSADSAMS
  Cenario: 1019 -   Inserir Caracteres Especiais - Campo 'Perecível'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                       | Nome do executor     | Sprint |
      | 1019 | BRITQEA-1019 | Inserir Caracteres Especiais - Campo 'Perecível' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | @         | S          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] @ ** PERECIVEL DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA1020 @web @TelaSADSAMS
  Cenario: 1020 -   Inserir Caracteres Especiais - Campo 'Alto Risco'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                        | Nome do executor     | Sprint |
      | 1020 | BRITQEA-1020 | Inserir Caracteres Especiais - Campo 'Alto Risco' | Matheus Machado Luiz | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | S         | @          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] @ ** RISCO DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA2840 @web @TelaSADSAMS
  Cenario: 2840 -  Inserir Letras - Campo 'Fone'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                    | Nome do executor | Sprint |
      | 2840 | BRITQEA-2840 | Inserir Letras - Campo 'Fone' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | ZZ ABCDEFGH | S         | N          |
    Quando clico no botao incluir
    Entao o campo "Agenda" deve ser preenchido com o valor da Agenda

  @BRITQEA2842 @web @TelaSADSAMS
  Cenario: 2842 -    Inserir Letras (diferentes de 'S' ou 'N') - Campo 'Perecível'
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                                    | Nome do executor | Sprint |
      | 2842 | BRITQEA-2842 | Inserir Letras (diferentes de 'S' ou 'N') - Campo `Perecível' | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho os campos de Datas e Hora
      | Transportadora | Contato     | Fone        | Perecivel | Alto Risco |
      | TransAutomação | Sr Selenium | 11 31314040 | H         | N          |
    Quando clico no botao incluir
    Entao deve ser exibido a mensagem "[1] H ** PERECIVEL DEVE SER "S" OU "N" **" na CPT85

  @BRITQEA2844 @web  @TelaSADSAMS
  Cenario: 2844 -    Consultar agendamento - Somente com o campo Data Agenda
    Dado que estou logado no ambiente "SADSAMS" com usuario/filial "818181"/"7458"
    E estou executando o teste
      | id   | Numero do CT | Nome do CT                                              | Nome do executor | Sprint |
      | 2844 | BRITQEA-2844 | Consultar agendamento - Somente com o campo Data Agenda | Hilário Bina     | S3     |
    E que estou na tela "CPT85"
    E preencho somente os campos de Datas e Hora
    Quando clico no botao consultar
    Entao deve ser exibido a mensagem "[1] 0 *** NUMERO DA AGENDA TEM QUE SER INFORMADO PARA CONSULTA DO PEDIDO ***" na CPT85
