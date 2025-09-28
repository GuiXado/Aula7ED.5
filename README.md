# Aula7ED.5
## Atividade 5

### 5. No parque de diversões, forma-se uma fila de crianças para ir ao brinquedo denominado Boomerang. Para entrar no brinquedo, a criança deve ter mais de 1.60m e mais de 16 anos. Criar uma aplicação Java, baseada na biblioteca Fila Genérica, que faça:

1) Criar um objeto model com os atributos:

<img width="193" height="112" alt="image" src="https://github.com/user-attachments/assets/d9b08c14-6f23-4042-84d6-9cbd68bc81f1" />

2) Criar uma classe view (Principal.java) que, na main:
   
a. Inicialize uma nova fila

b. Insira 30 clientes com suas características, sendo:

i. Nome (Pessoa1, Pessoa2, Pessoa3, ...)
ii. Idade (Número entre 10 e 40)
iii. Altura (Número entre 1.35 e 2.00)

4) Criar uma classe controller chamada ParqueController, que tenha um método brinquedo(Fila fila): void, que receba a fila populada, como parâmetro, e faça, para cada Cliente:
   
a. Verificar se a pessoa está em condições de ir ao brinquedo

b. Exibir o nome do cliente, se passou para dentro do brinquedo ou não e a razão

6) O método main da classe Principal.java deve chamar o método brinquedo(Fila fila): void.

O método brinquedo(Fila fila): void deve estar baseado nas operações da fila (insert(), remove(), list(), size(), isEmpty())
