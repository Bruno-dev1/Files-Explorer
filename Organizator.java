import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Organizator {
    public static void analise(Path path)throws IOException{
        Visitor visitor = new Visitor();
        Files.walkFileTree(path,  visitor);
        System.out.println("Quantidade de arquivos: "+ visitor.getArquivos());

    }

}
