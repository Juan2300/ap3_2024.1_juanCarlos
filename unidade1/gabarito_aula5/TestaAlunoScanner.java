package br.com.xico.unidade1.gabarito_aula5;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.xico.unidade1.gabarito_aula4.Aluno;

public class TestaAlunoScanner {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner leitor = new Scanner(system.in);
        System.out.println();

        System.out.println("Digite o nome do aluno");
        string nomeDoAluno = teclado.nextline();
        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite o nome da Maezinha: ");
        string nomeDaMae = teclado.next();
        System.out.println("Digite a data de Nascimento: ");
        LocalDate dataNascimento = teclado;

        umAluno.setnomeDoAluno(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setNomeDaMae(nomeDaMae);

        System.out.println(umAluno);

        
    }

}
