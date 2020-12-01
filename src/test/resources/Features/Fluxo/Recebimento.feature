#language: pt
#Version: 1.0
#Encoding: UTF-8
@recebimento
Funcionalidade: Fluxo de recebimento SAD/SNF

  @Fluxo1 @web
  Cenario: Fluxo de recebimento com pedido do tipo Estocado
    Dado que estou logado com usuario/filial "818181"/"7458"
    E que tenho um pedido "Estocado" do modelo "1185701" com agendamento criado
    E esteja vinculado com uma Nota Fiscal
    Quando envio para o SAD confirmando o recebimento
    Então deve ser gerado a guia cega
