class Program {
    public static void main(String[] args) {

        Pessoa pessoaObj = new Pessoa("Lourence", 19);
        pessoaObj.Check();

    }

    static class Pessoa {
        private String Nome;
        private int Idade;

        private Pessoa(String nome, int idade) {
            this.Nome = nome;
            this.Idade = idade;
        }

        private void Check() {
            if (Idade > 20)
                System.out.println(Nome);
            else
                System.out.println(Idade);
        }

    }
}
/*
class Program {
    public static void main(String[] args) {
        
        Pessoa.Check("Lourence", 19);
    }

    static class Pessoa {
        static String Nome;
        static int Idade;

        static void Check(String Nome, int Idade) {
            if (Idade > 20)
                System.out.println(Nome);
            else
                System.out.println(Idade);
        }
    }
}
*/
