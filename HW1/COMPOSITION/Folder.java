package COMPOSITION;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<File> files;
    private List<Folder> subfolders;

    /**
     * Constructs the folder class
     * @param folderName    The name of the folder
     */
    public Folder(String folderName) {
        this.folderName = folderName;
        files = new ArrayList<>();
        subfolders = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void addSubfolder(Folder folder){
        subfolders.add(folder);
    }

    public void deleteSubfolder(Folder folder){
        subfolders.remove(folder);
        folder.setNull();
    }
    private void setNull(){
        folderName = null;
        files = null;
        subfolders = null;
    }

    public void printContent(String prefix) {
        System.out.println(prefix + "└── " + this.folderName);

        // Print files
        for (int i = 0; i < files.size(); i++) {
            if (i == files.size() - 1 && subfolders.isEmpty()) {
                System.out.println(prefix + "\t└── " + files.get(i).getFileName());
            } else {
                System.out.println(prefix + "\t├── " + files.get(i).getFileName());
            }
        }

        // Print subfolders recursively
        for (int i = 0; i < subfolders.size(); i++) {
            if (i == subfolders.size() - 1) {
                subfolders.get(i).printContent(prefix + "\t");
            } else {
                subfolders.get(i).printContent(prefix + "│\t");
            }
        }
    }

}
