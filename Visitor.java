import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class Visitor extends SimpleFileVisitor<Path> {
    private ArrayList<String> files;
    private ArrayList<String> pasta;
    protected int arquivos;
    protected int pastas;

    public Visitor() {
        pasta = new ArrayList<>();
        files = new ArrayList<>();
    }

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs)
                                     throws IOException {
        arquivos++;

        files.add("[ARQUIVO] "+ file.getFileName());

        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(
            Path dir,
            BasicFileAttributes attrs) throws IOException{

        pastas++;
        pasta.add("[PASTA] "+ dir.getFileName());

        return FileVisitResult.CONTINUE;
    }
    public int getArquivos() {
        return arquivos;
    }
    public int getPastas() {
        return pastas;
    }
    public void setArquivos(int arquivos) {
        this.arquivos = arquivos;
    }
    public void setPastas(int pasta) {
        this.pastas = pasta;
    }
    public ArrayList<String> getFiles() {
        return files;
    }
    public ArrayList<String> getPasta() {
        return pasta;
    }
}