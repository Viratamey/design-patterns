package structural.composite;

import java.util.ArrayList;

//  composite
public class Directory implements FileSystem {

    ArrayList<FileSystem> list;
    String name;

    public Directory(String name) {
        this.name = name;
        list = new ArrayList<FileSystem>();
    }

    public void ls() {
        System.out.println(name + " :");
        for(FileSystem fileSystem : list) {
            fileSystem.ls();
        }
    }

    public void add(FileSystem file) {
        list.add(file);
    }

}
