package Exercicio1;


class Program {
    public static void main(String[] args) {
        
        Pessoa pessoaObj = new Pessoa("Lourence", 19);
        
        if(pessoaObj.Idade > 20) 
            System.out.println(pessoaObj.Nome); 
        else 
            System.out.println(pessoaObj.Idade);
    }

    private static class Pessoa {
        public String Nome;
        public int Idade;        

        public Pessoa(String nome, int idade){            
            this.Nome = nome;
            this.Idade = idade;
        }
        
    }
}
