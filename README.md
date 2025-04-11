# 📚 Sistema de Cadastro de Pessoas da Faculdade

Este é um trabalho de faculdade que simula o cadastro e exibição de dados de diferentes tipos de pessoas ligadas a uma instituição de ensino: **Alunos**, **Professores** e **Técnicos Administrativos**.

## ⚒️ Tecnologias usadas
- Java 17+
- VS Code


## 💡 Objetivo
Praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, como:

- Herança
- Encapsulamento
- Polimorfismo (via sobrescrita do método `exibirDados`)
- Uso de coleções (`List` com `ArrayList`)


## 🧩 Estrutura do Projeto
O projeto possui as seguintes entidades:

- `Pessoa` (classe Pai)
- `Aluno` (herda de Pessoa)
- `Professor` (herda de Pessoa)
- `Tecnico_administrativo` (herda de Pessoa)

## ✅ Funcionalidades implementadas
- Cadastro de alunos com curso e cadeiras.
- Cadastro de professores com disciplinas e SIAPE.
- Cadastro de técnicos administrativos com setor e cargo.
- Adição dinâmica de cadeiras/disciplinas com métodos `addCadeira()` e `addDisciplina()`.

## 💻 Exemplo do terminal

O programa cria objetos de cada tipo e mostra os dados no console:

```
----------Aluno----------
Nome: Bruno Prazeres
CPF: 22384722581
Idade: 19
Curso: Análise e Desenvolvimento de Sistema
Cadeiras: java, python
...

----------Professor----------
Nome: Fausto
CPF: 33484722581
Idade: 35
SIAPE: 1234
Disciplinas: java, sql data-base
...

----------Tecnico_administrativo----------
Nome: Leonardo
CPF: 73684722581
Idade: 25
Setor: ti
Cargo: estagiario
```


## 🚀 Como executar

1️⃣ Clone o repositório:
   ```bash
   git clone https://github.com/brunopaz8/Projeto_Sistema_universitario
   ```
2️⃣ Abra em uma IDE (como VS Code, IntelliJ ou Eclipse).

3️⃣ Compile e execute o arquivo `App.java`.

---

