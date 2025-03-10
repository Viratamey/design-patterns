package structural.composite;

public class MainClass {

    public static void main(String[] args) {
        File file1 = new File("file1");
        Directory dir1 = new Directory("dir1");
        dir1.add(file1);
        File file2 = new File("file2");
        Directory dir2 = new Directory("dir2");
        dir2.add(file2);
        dir2.add(new File("file3"));
        dir1.add(dir2);
        file2.ls();
        System.out.println();
        dir1.ls();
        System.out.println();
        dir2.ls();
    }
}
