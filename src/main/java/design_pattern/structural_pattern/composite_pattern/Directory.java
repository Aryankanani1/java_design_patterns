package design_pattern.structural_pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

// composite
public class Directory implements FileSystem {

    private String name;
    private List<FileSystem>  fileSystemList = new ArrayList<>();
    public Directory(String name){
        this.name = name;
    }

    public void addComponent(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    public void removeComponent(FileSystem fileSystem){
        fileSystemList.remove(fileSystem);
    }

    @Override
    public void showDetails() {
        System.out.println("directory: " + name);
        for(FileSystem fileSystem  : fileSystemList){
           fileSystem.showDetails();
        }
    }
}

