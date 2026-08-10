package design_pattern.structural_pattern.composite_pattern;

public class CompositePattern
{
    public static void main(String[] args) {
        FileSystem file1 = new File("file1.txt");
        FileSystem file2 = new File("file2.txt");

        Directory directory1 = new Directory("dir1");
        Directory directory2 = new Directory("dir2");

        directory1.addComponent(file1);
        directory1.addComponent(file2);
        directory2.addComponent(file2);

        directory1.showDetails();



    }
}
