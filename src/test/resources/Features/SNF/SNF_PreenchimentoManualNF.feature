#language: pt
#Author: Matheus Machado
#Version: 1.0
#Encoding: UTF-8
@PreenchimentoManual
@Validado
Funcionalidade: 4 - Preenchimento Manual de Nota Fiscal

  #@CTIPRSF001 @webSNF
  #Cenario: 001 - Preenchimento sucesso
  #Dado que estou logado no SNF com usuario "SVCautqea"
  #E estou executando o teste
  #| id    | Número do CT | Nome do CT | Nome do executor | Sprint |
  #| 00001 |          001 | Login SNF  | Matheus Machado  | T1     |
  #E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
  #E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
  #Quando criar um nota fiscal manual
  #Entao deve ser apresentado a seção pedido da nf
  @ISDSTBOF12873 @webSNF @TelaSNF
  Cenario: 12873 - Validar Click no Bot�o 'SALVAR' sem preencher nunhum campo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12873 | ISDSTBOF-12873 | Validar Click no Bot�o 'SALVAR' sem preencher nunhum campo | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12874 @webSNF @TelaSNF
  Cenario: 12874 - Validar a Obrigatoriedade do campo 'Numero de Serie'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 12874 | ISDSTBOF-12874 | Validar a Obrigat�riedade do campo 'Numero de Serie' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Numero de serie"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12875 @webSNF @TelaSNF
  Cenario: 12875 - Validar a Obrigatoriedade do campo 'Data de emissao NF'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 12875 | ISDSTBOF-12875 | Validar a Obrigatoriedade do campo 'Data de emissao NF' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Data de emissao NF"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12876 @webSNF @TelaSNF
  Cenario: 12876 - Validar a Obrigatoriedade do campo 'Data Vencimento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 12876 | ISDSTBOF-12876 | Validar a Obrigatoriedade do campo 'Data Vencimento' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Data Vencimento"
    Entao o botao Salvar deve estar habilitado

  @ISDSTBOF12880 @webSNF @TelaSNF
  Cenario: 12880 - Validar a Obrigatoriedade do campo 'CNPJ'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 12880 | ISDSTBOF-12880 | Validar a Obrigatoriedade do campo 'CNPJ' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "CNPJ"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12881 @webSNF @TelaSNF
  Cenario: 12881 - Validar a Obrigatoriedade do campo 'Inscrição Estadual'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                              | Nome do executor | Sprint |
      | 12881 | ISDSTBOF-12881 | Validar a Obrigatoriedade do campo 'Inscrição Estadual' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Inscricao Estadual"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12885 @webSNF @TelaSNF
  Cenario: 12885 - Validar a Obrigatoriedade do campo 'CFOP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 12885 | ISDSTBOF-12885 | Validar a Obrigatoriedade do campo 'CFOP' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "CFOP"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12886 @webSNF @TelaSNF
  Cenario: 12886 - Validar a Obrigatoriedade do campo 'Base ICMS'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 12886 | ISDSTBOF-12886 | Validar a Obrigatoriedade do campo 'Base ICMS' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Base ICMS"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12887 @webSNF @TelaSNF
  Cenario: 12887 - Validar a Obrigatoriedade do campo 'Valor ICMS'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                      | Nome do executor | Sprint |
      | 12887 | ISDSTBOF-12887 | Validar a Obrigatoriedade do campo 'Valor ICMS' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Valor ICMS"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12888 @webSNF @TelaSNF
  Cenario: 12888 - Validar a Obrigatoriedade do campo 'Base FCP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 12888 | ISDSTBOF-12888 | Validar a Obrigatoriedade do campo 'Base FCP' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Base FCP"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12889 @webSNF @TelaSNF
  Cenario: 12889 - Validar a Obrigatoriedade do campo 'Valor FCP'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 12889 | ISDSTBOF-12889 | Validar a Obrigatoriedade do campo 'Base FCP' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Valor FCP"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12890 @webSNF @TelaSNF
  Cenario: 12890 - Validar a Obrigatoriedade do campo 'Base ICMS ST'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 12890 | ISDSTBOF-12890 | Validar a Obrigatriedade do campo 'Base ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Base ICMS ST"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12892 @webSNF @TelaSNF
  Cenario: 12892 - Validar a Obrigatoriedade do campo 'Valor Total dos Produtos'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 12892 | ISDSTBOF-12892 | Validar a Obrigatriedade do campo 'Base ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Valor Total Produtos"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12893 @webSNF @TelaSNF
  Cenario: 12893 - Validar a Obrigatoriedade do campo 'Base FCP ST'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 12893 | ISDSTBOF-12893 | Validar a Obrigatriedade do campo 'Base ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Base FCP ST"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12894 @webSNF @TelaSNF
  Cenario: 12894 - Validar a Obrigatoriedade do campo 'Valor FCP ST'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12894 | ISDSTBOF-12894 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Valor FCP ST"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12895 @webSNF @TelaSNF
  Cenario: 12895 - Validar a Obrigatoriedade do campo 'Frete'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12895 | ISDSTBOF-12895 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Frete"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12896 @webSNF @TelaSNF
  Cenario: 12896 - Validar a Obrigatoriedade do campo 'Seguro'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12896 | ISDSTBOF-12896 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Seguro"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12897 @webSNF @TelaSNF
  Cenario: 12897 - Validar a Obrigatoriedade do campo 'Desconto'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12897 | ISDSTBOF-12897 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Desconto"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12900 @webSNF @TelaSNF
  Cenario: 12900 - Validar a Obrigatoriedade do campo 'Despesas Acessórias'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12900 | ISDSTBOF-12900 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Despesas Acessorias"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12901 @webSNF @TelaSNF
  Cenario: 12901 - Validar a Obrigatoriedade do campo 'IPI'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12901 | ISDSTBOF-12901 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "IPI"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF129051 @webSNF @TelaSNF
  Cenario: 12885 - Validar que o Campo 'Numero Nota' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                | Nome do executor | Sprint |
      | 12885 | ISDSTBOF-12885 | Validar a Obrigatoriedade do campo 'CFOP' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Numero nota fiscal" com letras
    Entao o campo "Data de emissao NF" deve estar vazio

  @ISDSTBOF12902 @webSNF @TelaSNF
  Cenario: 12902 - Validar a Obrigatoriedade do campo 'Valor Total Nota'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12902 | ISDSTBOF-12902 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Valor Total Nota"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12903 @webSNF @TelaSNF
  Cenario: 12903 - Validar a Não Obrigatoriedade do campo 'Data Vencimento'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12903 | ISDSTBOF-12903 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Data Vencimento"
    Entao o botao Salvar deve estar habilitado

  @ISDSTBOF12904 @webSNF @TelaSNF
  Cenario: 12904 - Validar a Não Obrigatoriedade do campo 'Código de Barra NF-e'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12904 | ISDSTBOF-12904 | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos os campos menos o campo "Codigo de Barra NFe"
    Entao o botao Salvar deve estar habilitado

  @ISDSTBOF12904A @webSNF @TelaSNF
  Cenario: 12904A - Validar a Obrigatoriedade do campo 'Unidade de Negocio'
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id     | Numero do CT    | Nome do CT                                        | Nome do executor | Sprint |
      | 12904A | ISDSTBOF-12904A | Validar a Obrigatriedade do campo 'Valor ICMS ST' | Hilario Bina     | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho todos e nao seleciono um valor no campo "Unidade de Negocio"
    Entao o botao Salvar deve estar desabilitado

  @ISDSTBOF12905 @webSNF @TelaSNF
  Cenario: 12905 - Validar que o Campo 'Data de emissao NF' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12905 | ISDSTBOF-12905 | Validar que o Campo 'Data de emissao NF' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Data de emissao NF" com letras
    Então deve ser exibido o valor "Invalid date" no campo "Data de emissao NF"

  @ISDSTBOF12906 @webSNF @TelaSNF
  Cenario: 12906 - Validar que o Campo 'Data de emissao NF' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 12906 | ISDSTBOF-12906 | Validar que o Campo 'Data de emissao NF' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Data de emissao NF" com caracteres especiais
    Então deve ser exibido o valor "Invalid date" no campo "Data de emissao NF"

  @ISDSTBOF12907 @webSNF @TelaSNF
  Cenario: 12907 - Validar que o Campo 'Numero Serie' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 12907 | ISDSTBOF-12907 | Validar que o Campo 'Numero Serie' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Numero de Serie" com caracteres especiais
    Entao o campo "Numero de Serie" deve estar vazio

  @ISDSTBOF12908 @webSNF @TelaSNF
  Cenario: 12908 - Validar que o Campo 'Data de emissao NF' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12908 | ISDSTBOF-12908 | Validar que o Campo 'Data de emissao NF' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Data de emissao NF" com letras
    Então deve ser exibido o valor "Invalid date" no campo "Data de emissao NF"

  @ISDSTBOF12909 @webSNF @TelaSNF
  Cenario: 12909 - Validar que o Campo 'Data de emissao NF' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 12909 | ISDSTBOF-12909 | Validar que o Campo 'Data de emissao NF' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Data de emissao NF" com caracteres especiais
    Então deve ser exibido o valor "Invalid date" no campo "Data de emissao NF"

  @ISDSTBOF12910 @webSNF @TelaSNF
  Cenario: 12910 - Validar que o Campo 'CNPJ' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 12910 | ISDSTBOF-12910 | Validar que o Campo 'CNPJ' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "CNPJ" com letras
    Entao o campo "CNPJ" deve estar vazio

  @ISDSTBOF12911 @webSNF @TelaSNF
  Cenario: 12911 - Validar que o Campo 'CNPJ' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12911 | ISDSTBOF-12911 | Validar que o Campo 'CNPJ' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "CNPJ" com caracteres especiais
    Entao o campo "CNPJ" deve estar vazio

  @ISDSTBOF12912 @webSNF @TelaSNF
  Cenario: 12912 - Validar que o Campo 'Inscricao Estadual' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12912 | ISDSTBOF-12912 | Validar que o Campo 'Inscricao Estadual' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Inscricao Estadual" com letras
    Entao o campo "Inscricao Estadual" nao deve estar vazio

  @ISDSTBOF12913 @webSNF @TelaSNF
  Cenario: 12913 - Validar que o Campo 'Inscricao Estadual' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                               | Nome do executor | Sprint |
      | 12913 | ISDSTBOF-12913 | Validar que o Campo 'Inscricao Estadual' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Inscricao Estadual" com caracteres especiais
    Entao o campo "Inscricao Estadual" deve estar vazio

  @ISDSTBOF12914 @webSNF @TelaSNF
  Cenario: 12914 - Validar que o Campo 'CFOP' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                   | Nome do executor | Sprint |
      | 12914 | ISDSTBOF-12914 | Validar que o Campo 'CFOP' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "CFOP" com letras
    Entao o campo "CFOP" deve estar vazio

  @ISDSTBOF12915 @webSNF @TelaSNF
  Cenario: 12915 - Validar que o Campo 'CFOP' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12915 | ISDSTBOF-12915 | Validar que o Campo 'CFOP' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "CFOP" com caracteres especiais
    Entao o campo "CFOP" deve estar vazio

  @ISDSTBOF12916 @webSNF @TelaSNF
  Cenario: 12916 - Validar que o Campo 'Base ICMS' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12916 | ISDSTBOF-12916 | Validar que o Campo 'Base ICMS' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS" com letras
    Entao o campo "Base ICMS" deve ter o valor "0.00"

  @ISDSTBOF12917 @webSNF @TelaSNF
  Cenario: 12917 - Validar que o Campo 'Base ICMS' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 12917 | ISDSTBOF-12917 | Validar que o Campo 'Base ICMS' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS" com caracteres especiais
    Entao o campo "Base ICMS" deve ter o valor "0.00"

  @ISDSTBOF12918 @webSNF @TelaSNF
  Cenario: 12918 - Validar que o Campo 'Base ICMS' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 12918 | ISDSTBOF-12918 | Validar que o Campo 'Base ICMS' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS" com valor negativo
    Entao o campo "Base ICMS" deve estar com valor positivo

  @ISDSTBOF12919 @webSNF @TelaSNF
  Cenario: 12919 - Validar que o Campo 'Valor ICMS' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                         | Nome do executor | Sprint |
      | 12919 | ISDSTBOF-12919 | Validar que o Campo 'Valor ICMS' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS" com letras
    Entao o campo "Valor ICMS" deve ter o valor "0.00"

  @ISDSTBOF12920 @webSNF @TelaSNF
  Cenario: 12920 - Validar que o Campo 'Valor ICMS' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                       | Nome do executor | Sprint |
      | 12920 | ISDSTBOF-12920 | Validar que o Campo 'Valor ICMS' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS" com caracteres especiais
    Entao o campo "Valor ICMS" deve ter o valor "0.00"

  @ISDSTBOF12921 @webSNF @TelaSNF
  Cenario: 12921 - Validar que o Campo 'Valor ICMS' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                 | Nome do executor | Sprint |
      | 12921 | ISDSTBOF-12921 | Validar que o Campo 'Valor ICMS' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS" com valor negativo
    Entao o campo "Valor ICMS" deve estar com valor positivo

  @ISDSTBOF12922 @webSNF @TelaSNF
  Cenario: 12922 - Validar que o Campo 'Base FCP' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 12922 | ISDSTBOF-12922 | Validar que o Campo 'Base FCP' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP" com letras
    Entao o campo "Base FCP" deve ter o valor "0.00"

  @ISDSTBOF12923 @webSNF @TelaSNF
  Cenario: 12923 - Validar que o Campo 'Base FCP' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 12923 | ISDSTBOF-12923 | Validar que o Campo 'Base FCP' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP" com caracteres especiais
    Entao o campo "Base FCP" deve ter o valor "0.00"

  @ISDSTBOF12924 @webSNF @TelaSNF
  Cenario: 12924 - Validar que o Campo 'Base FCP' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 12924 | ISDSTBOF-12924 | Validar que o Campo 'Base FCP' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP" com valor negativo
    Entao o campo "Base FCP" deve estar com valor positivo

  @ISDSTBOF12925 @webSNF @TelaSNF
  Cenario: 12925 - Validar que o Campo 'Valor FCP' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                        | Nome do executor | Sprint |
      | 12925 | ISDSTBOF-12925 | Validar que o Campo 'Valor FCP' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP" com letras
    Entao o campo "Valor FCP" deve ter o valor "0.00"

  @ISDSTBOF12926 @webSNF @TelaSNF
  Cenario: 12926 - Validar que o Campo 'Valor FCP' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                      | Nome do executor | Sprint |
      | 12926 | ISDSTBOF-12926 | Validar que o Campo 'Valor FCP' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP" com caracteres especiais
    Entao o campo "Valor FCP" deve ter o valor "0.00"

  @ISDSTBOF12927 @webSNF @TelaSNF
  Cenario: 12927 - Validar que o Campo 'Valor FCP' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 12927 | ISDSTBOF-12927 | Validar que o Campo 'Valor FCP' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP" com valor negativo
    Entao o campo "Valor FCP" deve ter o valor "1.00"

  @ISDSTBOF12931 @webSNF @TelaSNF
  Cenario: 12931 - Validar que o Campo 'Base ICMS ST' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 12931 | ISDSTBOF-12931 | Validar que o Campo 'Base ICMS ST' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS ST" com letras
    Entao o campo "Base ICMS ST" deve ter o valor "0.00"

  @ISDSTBOF12929 @webSNF @TelaSNF
  Cenario: 12929 - Validar que o Campo 'Base ICMS ST' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 12929 | ISDSTBOF-12929 | Validar que o Campo 'Base ICMS ST' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS ST" com caracteres especiais
    Entao o campo "Base ICMS ST" deve ter o valor "0.00"

  @ISDSTBOF12930 @webSNF @TelaSNF
  Cenario: 12930 - Validar que o Campo 'Base ICMS ST' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 12930 | ISDSTBOF-12930 | Validar que o Campo 'Base ICMS ST' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base ICMS ST" com valor negativo
    Entao o campo "Base ICMS ST" deve estar com valor positivo

  @ISDSTBOF12931 @webSNF @TelaSNF
  Cenario: 12931 - Validar que o Campo 'Valor ICMS ST' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 12931 | ISDSTBOF-12931 | Validar que o Campo 'Valor ICMS ST' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS ST" com letras
    Entao o campo "Valor ICMS ST" deve ter o valor "0.00"

  @ISDSTBOF12932 @webSNF @TelaSNF
  Cenario: 12932 - Validar que o Campo 'Valor ICMS ST' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                          | Nome do executor | Sprint |
      | 12932 | ISDSTBOF-12932 | Validar que o Campo 'Valor ICMS ST' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS ST" com caracteres especiais
    Entao o campo "Valor ICMS ST" deve ter o valor "0.00"

  @ISDSTBOF12933 @webSNF @TelaSNF
  Cenario: 12933 - Validar que o Campo 'Valor ICMS ST' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                    | Nome do executor | Sprint |
      | 12933 | ISDSTBOF-12933 | Validar que o Campo 'Valor ICMS ST' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor ICMS ST" com valor negativo
    Entao o campo "Valor ICMS ST" deve estar com valor positivo

  @ISDSTBOF12934 @webSNF @TelaSNF
  Cenario: 12934 - Validar que o Campo 'Valor total produtos' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 12934 | ISDSTBOF-12934 | Validar que o Campo 'Valor total produtos' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor total produtos" com letras
    Entao o campo "Valor total produtos" deve ter o valor "0.00"

  @ISDSTBOF12935 @webSNF @TelaSNF
  Cenario: 12935 - Validar que o Campo 'Valor total produtos' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                 | Nome do executor | Sprint |
      | 12935 | ISDSTBOF-12935 | Validar que o Campo 'Valor total produtos' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor total produtos" com caracteres especiais
    Entao o campo "Valor total produtos" deve ter o valor "0.00"

  @ISDSTBOF12936 @webSNF @TelaSNF
  Cenario: 12936 - Validar que o Campo 'Valor total produtos' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                           | Nome do executor | Sprint |
      | 12936 | ISDSTBOF-12936 | Validar que o Campo 'Valor total produtos' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor total produtos" com valor negativo
    Entao o campo "Valor total produtos" deve estar com valor positivo

  @ISDSTBOF12937 @webSNF @TelaSNF
  Cenario: 12937 - Validar que o Campo 'Base FCP ST' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 12937 | ISDSTBOF-12937 | Validar que o Campo 'Base FCP ST' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP ST" com letras
    Entao o campo "Base FCP ST" deve ter o valor "0.00"

  @ISDSTBOF12938 @webSNF @TelaSNF
  Cenario: 12938 - Validar que o Campo 'Base FCP ST' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                        | Nome do executor | Sprint |
      | 12938 | ISDSTBOF-12938 | Validar que o Campo 'Base FCP ST' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP ST" com caracteres especiais
    Entao o campo "Base FCP ST" deve ter o valor "0.00"

  @ISDSTBOF12939 @webSNF @TelaSNF
  Cenario: 12939 - Validar que o Campo 'Base FCP ST' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 12939 | ISDSTBOF-12939 | Validar que o Campo 'Base FCP ST' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Base FCP ST" com valor negativo
    Entao o campo "Base FCP ST" deve estar com valor positivo

  @ISDSTBOF12940 @webSNF @TelaSNF
  Cenario: 12940 - Validar que o Campo 'Valor FCP ST' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                           | Nome do executor | Sprint |
      | 12940 | ISDSTBOF-12940 | Validar que o Campo 'Valor FCP ST' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP ST" com letras
    Entao o campo "Valor FCP ST" deve ter o valor "0.00"

  @ISDSTBOF12941 @webSNF @TelaSNF
  Cenario: 12941 - Validar que o Campo 'Valor FCP ST' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                         | Nome do executor | Sprint |
      | 12941 | ISDSTBOF-12941 | Validar que o Campo 'Valor FCP ST' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP ST" com caracteres especiais
    Entao o campo "Valor FCP ST" deve ter o valor "0.00"

  @ISDSTBOF12942 @webSNF @TelaSNF 
  Cenario: 12942 - Validar que o Campo 'Valor FCP ST' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 12942 | ISDSTBOF-12942 | Validar que o Campo 'Valor FCP ST' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor FCP ST" com valor negativo
    Entao o campo "Valor FCP ST" deve estar com valor positivo

  @ISDSTBOF12943 @webSNF @TelaSNF
  Cenario: 12943 - Validar que o Campo 'Frete' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                    | Nome do executor | Sprint |
      | 12943 | ISDSTBOF-12943 | Validar que o Campo 'Frete' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Frete" com letras
    Entao o campo "Frete" deve ter o valor "0.00"

  @ISDSTBOF12944 @webSNF @TelaSNF
  Cenario: 12944 - Validar que o Campo 'Frete' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 12944 | ISDSTBOF-12944 | Validar que o Campo 'Frete' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Frete" com caracteres especiais
    Entao o campo "Frete" deve ter o valor "0.00"

  @ISDSTBOF12945 @webSNF @TelaSNF
  Cenario: 12945 - Validar que o Campo 'Frete' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                            | Nome do executor | Sprint |
      | 12945 | ISDSTBOF-12945 | Validar que o Campo 'Frete' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Frete" com valor negativo
    Entao o campo "Frete" deve estar com valor positivo

  @ISDSTBOF12946 @webSNF @TelaSNF
  Cenario: 12946 - Validar que o Campo 'Seguro' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                     | Nome do executor | Sprint |
      | 12946 | ISDSTBOF-12946 | Validar que o Campo 'Seguro' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Seguro" com letras
    Entao o campo "Seguro" deve ter o valor "0.00"

  @ISDSTBOF12947 @webSNF @TelaSNF
  Cenario: 12947 - Validar que o Campo 'Seguro' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                   | Nome do executor | Sprint |
      | 12947 | ISDSTBOF-12947 | Validar que o Campo 'Seguro' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Seguro" com caracteres especiais
    Entao o campo "Seguro" deve ter o valor "0.00"

  @ISDSTBOF12948 @webSNF @TelaSNF
  Cenario: 12948 - Validar que o Campo 'Seguro' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                             | Nome do executor | Sprint |
      | 12948 | ISDSTBOF-12948 | Validar que o Campo 'Seguro' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Seguro" com valor negativo
    Entao o campo "Seguro" deve estar com valor positivo

  @ISDSTBOF12949 @webSNF @TelaSNF
  Cenario: 12949 - Validar que o Campo 'Desconto' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                       | Nome do executor | Sprint |
      | 12949 | ISDSTBOF-12949 | Validar que o Campo 'Desconto' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Desconto" com letras
    Entao o campo "Desconto" deve ter o valor "0.00"

  @ISDSTBOF12950 @webSNF @TelaSNF
  Cenario: 12950 - Validar que o Campo 'Desconto' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                     | Nome do executor | Sprint |
      | 12950 | ISDSTBOF-12950 | Validar que o Campo 'Desconto' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Desconto" com caracteres especiais
    Entao o campo "Desconto" deve ter o valor "0.00"

  @ISDSTBOF12951 @webSNF @TelaSNF
  Cenario: 12951 - Validar que o Campo 'Desconto' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 12951 | ISDSTBOF-12951 | Validar que o Campo 'Desconto' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Desconto" com valor negativo
    Entao o campo "Desconto" deve estar com valor positivo

  @ISDSTBOF12952 @webSNF @TelaSNF
  Cenario: 12952 - Validar que o Campo 'Despesas Acessorias' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                  | Nome do executor | Sprint |
      | 12952 | ISDSTBOF-12952 | Validar que o Campo 'Despesas Acessorias' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Despesas Acessorias" com letras
    Entao o campo "Despesas Acessorias" deve ter o valor "0.00"

  @ISDSTBOF12953 @webSNF @TelaSNF
  Cenario: 12953 - Validar que o Campo 'Despesas Acessorias' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                                | Nome do executor | Sprint |
      | 12953 | ISDSTBOF-12953 | Validar que o Campo 'Despesas Acessorias' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Despesas Acessorias" com caracteres especiais
    Entao o campo "Despesas Acessorias" deve ter o valor "0.00"

  @ISDSTBOF12954 @webSNF @TelaSNF
  Cenario: 12954 - Validar que o Campo 'Despesas Acessorias' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                          | Nome do executor | Sprint |
      | 12954 | ISDSTBOF-12954 | Validar que o Campo 'Despesas Acessorias' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Despesas Acessorias" com valor negativo
    Entao o campo "Despesas Acessorias" deve estar com valor positivo

  @ISDSTBOF12955 @webSNF @TelaSNF
  Cenario: 12955 - Validar que o Campo 'IPI' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                  | Nome do executor | Sprint |
      | 12955 | ISDSTBOF-12955 | Validar que o Campo 'IPI' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "IPI" com letras
    Entao o campo "IPI" deve ter o valor "0.00"

  @ISDSTBOF12956 @webSNF @TelaSNF
  Cenario: 12956 - Validar que o Campo 'IPI' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                | Nome do executor | Sprint |
      | 12956 | ISDSTBOF-12956 | Validar que o Campo 'IPI' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "IPI" com caracteres especiais
    Entao o campo "IPI" deve ter o valor "0.00"

  @ISDSTBOF12957 @webSNF @TelaSNF
  Cenario: 12957 - Validar que o Campo 'IPI' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                          | Nome do executor | Sprint |
      | 12957 | ISDSTBOF-12957 | Validar que o Campo 'IPI' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "IPI" com valor negativo
    Entao o campo "IPI" deve estar com valor positivo

  @ISDSTBOF12958 @webSNF @TelaSNF
  Cenario: 12958 - Validar que o Campo 'Valor Total Nota' não aceita letras
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                               | Nome do executor | Sprint |
      | 12958 | ISDSTBOF-12958 | Validar que o Campo 'Valor Total Nota' não aceita letras | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor Total Nota" com letras
    Entao o campo "Valor Total Nota" deve ter o valor "0.00"

  @ISDSTBOF12959 @webSNF @TelaSNF
  Cenario: 12959 - Validar que o Campo 'Valor Total Nota' não aceita Caracteres Especiais
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                             | Nome do executor | Sprint |
      | 12959 | ISDSTBOF-12959 | Validar que o Campo 'Valor Total Nota' não aceita Caracteres Especiais | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor Total Nota" com caracteres especiais
    Entao o campo "Valor Total Nota" deve ter o valor "0.00"

  @ISDSTBOF12960 @webSNF @TelaSNF
  Cenario: 12960 - Validar que o Campo 'Valor Total Nota' não aceita valor negativo
    Dado que estou logado no SNF com usuario "SVCautqea"
    E estou executando o teste
      | id    | Numero do CT   | Nome do CT                                                       | Nome do executor | Sprint |
      | 12960 | ISDSTBOF-12960 | Validar que o Campo 'Valor Total Nota' não aceita valor negativo | Matheus Machado  | T1     |
    E utilizando o tipo de unidade "Centro de Distribuição" com a unidade "7467 - CENTRO DIST MURIBECA"
    E Acesso a tela "Recebimento" > "Nota Fiscal" > "Adicionar"
    Quando preencho o campo "Valor Total Nota" com valor negativo
    Entao o campo "Valor Total Nota" deve estar com valor positivo
