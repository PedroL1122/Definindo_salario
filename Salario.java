 public class Informaçao_pessoa {

        // Propriedades

      String cargo;

      int idade;

      String nome;

      int Salario;



        // Construtor

        public Informaçao_pessoa(String cargo, int idade, String nome) {

            this.cargo = "Gerente";

            this.idade = 19;

            this.nome = "Pedro";

            this.Salario = 1500;

        }



        // aqui esta o metodo para exibir informaçoes da pessoa

        public void exibirInformacoes() {

            System.out.println("Cargo: " + cargo);

            System.out.println("Idade: " + idade);

            System.out.println("nome: " + nome);

            if (Salario > 3000){
              System.out.println("Voçe esta ganhando bem"); }
              else{
                System.out.println("Ainda não esta ganhando tão bem");
            }
        }
 }
