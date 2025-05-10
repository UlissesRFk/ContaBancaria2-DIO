# 💳 Simulador de Conta Bancária em Java

Este projeto é uma aplicação de console desenvolvida em Java que simula operações bancárias básicas, como criação de contas, depósitos, saques, transferências e solicitação de cheque especial. O objetivo é praticar conceitos de Programação Orientada a Objetos (POO) e interação com o usuário via terminal.

## Descrição

O sistema permite que o usuário:

- Crie uma conta bancária (corrente ou poupança).
- Escolha o banco de preferência (Inter, Nubank, C6 Bank).
- Realize operações como saque, depósito, transferência e solicitação de cheque especial (para contas correntes).

## Funcionalidades

- [x] Criação de contas com dados do cliente.
- [x] Depósito de valores.
- [x] Saque de valores com verificação de saldo.
- [x] Transferência entre contas.
- [x] Solicitação de cheque especial com base no saldo da conta corrente.
- [x] Exibição de informações da conta e do banco.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


- `Banco.java`: Representa o banco e suas informações.
- `Cliente.java`: Contém os dados do cliente.
- `Conta.java`: Interface que define as operações básicas de uma conta.
- `ContaCorrente.java`: Implementa uma conta corrente com funcionalidade de cheque especial.
- `ContaPoupanca.java`: Implementa uma conta poupança.
- `App.java`: Classe principal que executa a aplicação e interage com o usuário.


