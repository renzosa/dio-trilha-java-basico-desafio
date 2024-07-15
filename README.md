# DIO - Trilha Java Básico
www.dio.me

#### Autores
> - [Gleyson Sampaio] (https://github.com/glysns)
> - [Renzo Sá] (https://github.com/renzosa)

## Sintaxe - Desafio :white_check_mark:

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.


#### Revise sobre regras de declaração de variáveis :white_check_mark:

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


#### Revise sobre terminal, main args e a classe Scanner :white_check_mark:
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

#### Revise sobre concatenação e classe String com método concat :white_check_mark:

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

#### Melhorias :sparkles:
* Foi criada uma Classe `Conta` para encapsular as funcionalidades e dos dados da conta ativa; :white_check_mark:
* foi organizado a ordem dos dados para se tornar mais semântico: Agencia, Conta, Nome Cliente, Saldo; :white_check_mark:
* Foram incluídos alguns validadores para a entrada de dados, tanto do terminal quanto da captura do scanner; :white_check_mark:
* Implementado um menu, para gerenciar as ações sobre a conta atual;
* Implementados alguns tratamentos de erros. :white_check_mark:



###### Fonte: [Link desafio original](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)