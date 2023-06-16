import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Aluno aluno = new Aluno(1, "", 999999999, new Date());

        System.out.println("Infome o nome do aluno: ");
        aluno.setNome(teclado.next());

        System.out.println("Infome o rg do aluno: ");
        aluno.setRg(teclado.nextInt());

        System.out.println("Infome o data de nascimento do aluno: ");
        aluno.setDataNascimento(formatarData(teclado.next()));


        System.out.println("Dados do aluno: ");
        System.out.println("Nome: " + aluno.getNome() + " data de nascimento" + aluno.getDataNascimento());




    }

    public static Date formatarData(String data)  {
        Date dataRetornar = new Date();
        try {
            DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
             dataRetornar = dataFormat.parse(data);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dataRetornar;
    }
}
