Boa! Vamos fazer um **exercício bem simples de POO em Java** para você treinar **Classe, Atributos, Construtor, Objeto e Método**.

## Exercício: Classe `Pessoa`

Imagine que você está criando pessoas em um programa.

### Regras

1. Crie uma **classe chamada `Pessoa`**
2. Ela deve ter **3 atributos**:

   * `nome`
   * `idade`
   * `cidade`
3. Crie um **construtor** que recebe esses 3 valores.
4. Crie um **método chamado `apresentar()`** que imprime algo assim:

```
Olá, meu nome é João, tenho 20 anos e moro em São Paulo
```

5. No `main`:

   * Crie **2 objetos Pessoa**
   * Chame o método `apresentar()` para cada um.

---

### Estrutura que você deve completar

```java
public class Main {
    public static void main(String[] args) {

        // criar duas pessoas aqui

    }
}

class Pessoa {

    String nome;
    int idade;
    String cidade;

    // construtor aqui

    // metodo apresentar aqui

}
```

---

### Desafio extra (se quiser subir de nível 🚀)

Crie outro método chamado:

```
fazerAniversario()
```

Que **aumenta a idade em +1**.

Exemplo:

```java
pessoa1.fazerAniversario();
pessoa1.apresentar();
```

Saída:

```
Olá, meu nome é João, tenho 21 anos e moro em São Paulo
```

---

✅ **Tenta fazer e manda seu código aqui.**
Se tiver erro eu **corrijo e explico linha por linha** para você entender de verdade.
