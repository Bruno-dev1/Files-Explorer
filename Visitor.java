import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitor extends SimpleFileVisitor<Path> {
    protected int arquivos;
    protected int pasta;

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs)
                                     throws IOException {
        arquivos++;

        System.out.println("Arquivo: " + file.getFileName());

        return FileVisitResult.CONTINUE;
    }
    public int getArquivos() {
        return arquivos;
    }
    public int getPasta() {
        return pasta;
    }
    public void setArquivos(int arquivos) {
        this.arquivos = arquivos;
    }
    public void setPasta(int pasta) {
        this.pasta = pasta;
    }
}