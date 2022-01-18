package cn.dbdj1201.interview.nio;

import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

/**
 * @Author: yz1201
 * @Date: 2022/1/18 9:45
 */
@Slf4j
public class TestFileCoy {

    public static void main(String[] args) throws IOException {
//        FileChannel in = new FileInputStream("E:\\develop\\temp\\test\\src\\1.txt").getChannel(),
//                out = new FileOutputStream("E:\\develop\\temp\\test\\target\\1.txt").getChannel();
//        in.transferTo(0, in.size(), out);

//        Files.co
//        Path path

        copy("E:\\develop\\temp\\test\\src\\4.txt", "E:\\develop\\temp\\test\\target");
    }

    private static void copyDir(String srcPath, String targetPath) throws IOException {
        boolean srcFlag = Files.exists(Paths.get(srcPath), LinkOption.NOFOLLOW_LINKS);
        Path src = Paths.get(srcPath);
        if (srcFlag) {
            Path target = Paths.get(targetPath);
            Path targetDir;
            if (!Files.exists(target, LinkOption.NOFOLLOW_LINKS)) {
                targetDir = Files.createFile(target);
            } else {
                targetDir = target;
            }
            Files.copy(src, targetDir, StandardCopyOption.REPLACE_EXISTING);
        } else {
            throw new FileSystemNotFoundException();
        }
    }

    private static void copy(String srcDir, String targetDir) throws IOException {
        final Path source = Paths.get(srcDir);
        final Path target = Paths.get(targetDir);
        Files.walkFileTree(source, EnumSet.of(FileVisitOption.FOLLOW_LINKS), Integer.MAX_VALUE,
                new SimpleFileVisitor<>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                            throws IOException {
                        Path targetdir = target.resolve(source.relativize(dir));
                        try {
                            Files.copy(dir, targetdir);
                        } catch (FileAlreadyExistsException e) {
                            if (!Files.isDirectory(targetdir))
                                throw e;
                        }
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                            throws IOException {
                        Files.copy(file, target.resolve(source.relativize(file)));
                        return FileVisitResult.CONTINUE;
                    }
                });
    }

    private static void copyByApache(String fromUri, String toUri){

//        FileUtils.copyFileToDirectory();



    }
}
