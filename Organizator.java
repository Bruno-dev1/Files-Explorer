import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Organizator {
    public static void analise(Path path)throws IOException{
        Visitor visitor = new Visitor();
        Files.walkFileTree(path,  visitor);
        for(String archive:visitor.getFiles()){
            System.out.println(archive);
        }
        for(String psta:visitor.getPasta()){
            System.out.println(psta);
        }
        System.out.println("Quantidade de arquivos: "+ visitor.getArquivos());
        System.out.println("Total de pastas:"+visitor.getPastas());

    }

}
