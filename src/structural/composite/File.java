package structural.composite;

//  Leaf
public class File implements FileSystem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(name);
    }
}
