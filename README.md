# **Atividade de Programação em Java - Fundamentos**

Este repositório contém a solução para as tarefas propostas na atividade de programação em Java. O objetivo da atividade é praticar conceitos fundamentais da linguagem, como manipulação de dados, controle de fluxo, entrada e saída, e cálculos matemáticos.

---

## **Sumário**

- [Descrição do Projeto](#descrição-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Instruções para Execução](#instruções-para-execução)
- [Detalhes das Tarefas](#detalhes-das-tarefas)
  - [1. Calculadora de Desconto](#1-calculadora-de-desconto)
  - [2. Calculadora de ITBI](#2-calculadora-de-itbi)
  - [3. Sistema de Avaliação](#3-sistema-de-avaliação)
  - [4. Calculadora de Aposentadoria](#4-calculadora-de-aposentadoria)
  - [5. Circuito de Resistências](#5-circuito-de-resistências)
  - [6. Sistema de Login](#6-sistema-de-login)
  - [7. Gerador de Tabuada](#7-gerador-de-tabuada)
- [Como Contribuir](#como-contribuir)
- [Licença](#licença)

---

## **Descrição do Projeto**

Este projeto é composto por sete programas desenvolvidos em Java, cada um abordando um caso específico que explora funcionalidades como:
- Uso da classe `Scanner` para entrada de dados via terminal.
- Uso de `JOptionPane` para interfaces gráficas básicas.
- Estruturas condicionais e de repetição.
- Manipulação de dados e cálculos matemáticos.

O repositório foi estruturado para facilitar a execução e compreensão de cada tarefa, com instruções claras no código e neste README.

---

## **Pré-requisitos**

Antes de executar os programas, certifique-se de que você tem:
- **Java Development Kit (JDK)** instalado (versão 8 ou superior).
- Um editor de código como **Eclipse**, **IntelliJ IDEA**, ou **Visual Studio Code**, ou um terminal para compilar e executar os programas.

---

## **Estrutura do Projeto**

```plaintext
Atividade_Java_Fundamentos/
├── src/
│   ├── CalculadoraDesconto.java       # Classe para cálculo de desconto
│   ├── CalculadoraITBI.java           # Classe para cálculo de imposto ITBI
│   ├── SistemaAvaliacao.java          # Classe para avaliação de aluno
│   ├── CalculadoraAposentadoria.java  # Classe para cálculo de aposentadoria
│   ├── CircuitoResistencias.java      # Classe para cálculo de resistências
│   ├── SistemaLogin.java              # Classe para login com tentativa limitada
│   ├── GeradorTabuada.java            # Classe para geração de tabuadas
├── README.md                          # Documentação do projeto
└── .gitignore                         # Arquivo para ignorar arquivos desnecessários no Git
```

---

## **Instruções para Execução**

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/Atividade_Java_Fundamentos.git
   cd Atividade_Java_Fundamentos
   ```

2. **Compile o programa desejado:**
   ```bash
   javac src/NomeDoPrograma.java
   ```

3. **Execute o programa:**
   ```bash
   java -cp src NomeDoPrograma
   ```

4. **(Opcional)** Utilize um IDE para compilar e executar os programas diretamente.

---

## **Detalhes das Tarefas**

### **1. Calculadora de Desconto**

**Objetivo:** Calcular o desconto de um produto com base no valor informado pelo usuário e exibir o preço final.  
**Entrada:** Valor do produto e porcentagem do desconto.  
**Saída:** Valor do desconto e preço final do produto.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src CalculadoraDesconto
```

---

### **2. Calculadora de ITBI**

**Objetivo:** Calcular o imposto ITBI com base no maior valor entre o preço de transação e o valor venal do imóvel.  
**Entrada:** Valor de transação, valor venal e porcentagem do imposto (via `JOptionPane`).  
**Saída:** Valor do imposto a ser pago.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src CalculadoraITBI
```

---

### **3. Sistema de Avaliação**

**Objetivo:** Receber notas de um aluno, calcular a média e indicar se ele está aprovado ou reprovado.  
**Entrada:** Duas notas de prova e uma nota de trabalho (via `JOptionPane`).  
**Saída:** Média das notas e status ("Aprovado" ou "Reprovado").  

**Como executar:**  
Digite no terminal:
```bash
java -cp src SistemaAvaliacao
```

---

### **4. Calculadora de Aposentadoria**

**Objetivo:** Verificar se uma pessoa pode se aposentar com base na idade, sexo e anos de contribuição.  
**Entrada:** Idade, sexo e anos de contribuição (via `Scanner`).  
**Saída:** Mensagem indicando se a pessoa pode se aposentar ou quantos anos faltam.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src CalculadoraAposentadoria
```

---

### **5. Circuito de Resistências**

**Objetivo:** Calcular a resistência equivalente de quatro resistores em série e determinar a maior e menor resistência.  
**Entrada:** Valores das quatro resistências (via `Scanner`).  
**Saída:** Resistência equivalente, maior e menor resistência.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src CircuitoResistencias
```

---

### **6. Sistema de Login**

**Objetivo:** Simular um sistema de login com até três tentativas.  
**Entrada:** Login e senha (via `Scanner`).  
**Saída:** Mensagem de sucesso ou erro após cada tentativa.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src SistemaLogin
```

---

### **7. Gerador de Tabuada**

**Objetivo:** Gerar a tabuada de um número de 1 a 10.  
**Entrada:** Número desejado (via `Scanner`).  
**Saída:** Tabuada do número informado.  

**Como executar:**  
Digite no terminal:
```bash
java -cp src GeradorTabuada
```

---

## **Como Contribuir**

Se você encontrou algum problema ou tem sugestões de melhoria, sinta-se à vontade para contribuir com este projeto.  
1. Faça um fork do repositório.  
2. Crie uma nova branch para sua feature/bugfix:
   ```bash
   git checkout -b minha-contribuicao
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Descrição clara da alteração"
   ```
4. Envie suas alterações:
   ```bash
   git push origin minha-contribuicao
   ```
5. Abra um pull request no repositório original.