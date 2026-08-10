package design_pattern.structural_pattern.proxy_pattern;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        System.out.println("image is loading from disk");
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("loading: " +fileName);
    }
    @Override
    public void display() {
        System.out.println("display: " + fileName);
    }
}
