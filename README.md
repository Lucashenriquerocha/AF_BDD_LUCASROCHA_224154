# Sistema de Locacação de Carros
## Etapa 1
## Story - Tarefa
_Imagine que você está planejando alugar um carro para uma viagem. Para facilitar esse processo, uma empresa de locação de carros desenvolveu um sistema com diferentes comportamentos, dependendo das circunstâncias da locação e do cliente._

_Inicialmente, considere um cliente que deseja alugar um carro de luxo. Se esse cliente realizar a reserva com antecedência de pelo menos uma semana, o sistema deve oferecer um desconto especial no valor total da locação. Por outro lado, suponha um cliente que necessita alugar um carro utilitário de última hora, sem qualquer reserva prévia. Nesse caso, o sistema deve ainda conseguir encontrar um veículo disponível e processar a locação rapidamente, mesmo que isso implique em um custo um pouco mais elevado devido à demanda urgente._

_Esses cenários exemplificam como o sistema de locação de carros responde às diferentes necessidades e condições dos clientes, adaptando-se para garantir uma experiência satisfatória de locação, seja para reservas antecipadas ou demandas de última hora._
### Gherkin Cenário 1
```
Funcionalidade: Reserva de Carro de Luxo com Antecedência

  Cenário: Cliente realiza a reserva de um carro de luxo com antecedência de pelo menos uma semana
    Dado que o cliente deseja alugar um carro de luxo
    E o cliente realiza a reserva com antecedência de pelo menos uma semana
    Quando o cliente finaliza a reserva
    Então o sistema deve oferecer um desconto especial no valor total da locação
```
### Gherkin Cenário 2
```
Funcionalidade: Locação de Carro Utilitário de Última Hora

  Cenário: Cliente necessita alugar um carro utilitário de última hora sem reserva prévia
    Dado que o cliente deseja alugar um carro utilitário
    E o cliente não possui uma reserva prévia
    Quando o cliente solicita a locação do carro
    Então o sistema deve encontrar um veículo disponível
    E o sistema deve processar a locação rapidamente
    E o sistema deve aplicar um custo adicional devido à demanda urgente
```
