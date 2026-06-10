import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Path path = Paths.get(".1");
        int resp;
        do{
        System.out.println("O que você quer fazer");  
        System.out.println("1-Análise  de arquivos");
        System.out.println("2- Gerar relatório");
        System.out.println("0-Sair");
        resp = input.nextInt();
        input.nextLine();
        switch (resp) {
            case 1:
                Organizator.analise(path);
                
                break;
            case 2:

                break;
        
            default:
                break;
        }
        }while(resp != 0);
        
    }
   



}
