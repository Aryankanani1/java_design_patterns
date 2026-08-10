package design_pattern.structural_pattern.composite_pattern;

// leaf
public class File implements FileSystem{
    private String name;
    public File(String name){
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("file: " + name);
    }

}
