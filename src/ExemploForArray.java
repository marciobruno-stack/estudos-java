public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "jonas", "Julia","Marcos"};

        //for (int i = 0; i < alunos.length; i++){
        //    System.out.println("O aluno no indice i = "+ i + " é " + alunos[i]);
        //}

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
            
        }
    }

}
