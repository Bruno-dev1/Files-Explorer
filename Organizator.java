import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public static void relatório(Path path)throws IOException{
        Visitor visitor = new Visitor();
        Files.walkFileTree(path, visitor);
        Path rela = Paths.get("Relatório.txt");
        if(Files.notExists(rela)){
           Files.createFile(rela); 
        }
        try (BufferedWriter writer = Files.newBufferedWriter(rela)) {
            writer.write("Relatório de arquivos");
            writer.newLine();
            writer.write("Arquivos-----");
            for(String arquivo:visitor.getFiles()){
                writer.write(arquivo);
                writer.newLine();
            }
            for(String pats: visitor.getPasta()){
                writer.write(pats);
                writer.newLine();;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
