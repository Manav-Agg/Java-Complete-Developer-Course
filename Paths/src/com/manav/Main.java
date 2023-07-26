package com.manav;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
//                                              CREATE FILE
        try{
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last Modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last Modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

//                                              DELETE FILE
//        try{
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//                                          RENAME and MOVE FILE
//        try{
////            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
////            Path destination = FileSystems.getDefault().getPath("Examples","file1.txt");
////            Files.move(fileToMove, destination);
//
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1", "file1.txt");
//            Files.move(fileToMove, destination);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//                                             MOVE FILE
//        try{
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.move(fileToMove, destination);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//                                             COPY FILE
//        try{
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//                                          PATH and EXISTS
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        Path filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//        printFile(path);
//
////        Path filePath = FileSystems.getDefault().getPath("files","SubDirectoryFile.txt");
//        Path filePath1 = FileSystems.getDefault().getPath(".","files","SubDirectoryFile.txt");
//        printFile(filePath1);
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubDirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        filePath = Paths.get("D:\\Programs\\Java\\Reference Vs Object Vs Instance Vs Class.txt");
//        printFile(filePath);
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesNotExits.txt");
//        System.out.println(path3.toAbsolutePath());
//        System.out.println("Exists = " + Files.exists(path3));
//
//        Path path4 = Paths.get("Z:\\abcd\\whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//        System.out.println("Exists = " + Files.exists(path4));
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//    }
//
//    public static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }
}