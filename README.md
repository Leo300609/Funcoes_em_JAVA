# Calculadora em Java ☕

Uma aplicação de calculadora interativa via terminal desenvolvida em Java. O projeto utiliza uma estrutura de repetição `do-while` integrada a menus interativos e operações matemáticas modulares.

## 🚀 Funcionalidades

- **Operações Matemáticas:** Soma, Subtração, Multiplicação e Divisão.
- **Histórico Rápido:** Opção de verificar o último resultado calculado sem reiniciar o programa.
- **Validação de Segurança:** Tratamento básico para evitar a quebra do programa ao tentar dividir por zero.

## 🛠️ Correções Aplicadas

Esta versão resolveu problemas críticos encontrados na lógica inicial do código:
1. **Bug do Buffer do Scanner:** Corrigido o problema onde o método `scanner.nextLine()` pulava a leitura do operador devido à quebra de linha (`\n`) deixada no buffer por métodos anteriores (`nextInt()`).
2. **Escopo de Variáveis:** O histórico do último cálculo foi corrigido movendo a variável `resultado` para fora do loop `do-while`, garantindo a persistência dos dados entre as iterações do menu.
3. **Fluxo do Menu:** Ajustada a condição de parada do laço de repetição para respeitar o número correto da opção de saída (Opção 3).

## 💻 Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter o **Java JDK** (versão 11 ou superior) instalado em sua máquina.

### Passos para rodar no Terminal
1. Clone o repositório:
   ```bash
   git clone https://github.com/Leo300609/Funcoes_em_JAVA.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd Funcoes_em_JAVA
   ```
3. Compile o arquivo fonte (ajuste o caminho se estiver dentro de pacotes):
   ```bash
   javac src/com/example/Main.java
   ```
4. Execute o programa:
   ```bash
   java com.example.Main
   ```

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.
