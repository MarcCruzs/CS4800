package COMPOSITION;

public class Test {
    public static void main(String[] args) {
        // Creating the file system structure
        Folder php_demo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // "Source File" subfolders
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // "app" subfolders
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        // "publicFolder" files
        File htacess = new File(".htaccess");
        File htrouterPhp = new File("htrouter.php");
        File indexHtml = new File("index.html");


        // php_demo1 subfolders
        php_demo1.addSubfolder(sourceFiles);
        php_demo1.addSubfolder(includePath);
        php_demo1.addSubfolder(remoteFiles);

        // "Source Files" subfolders
        sourceFiles.addSubfolder(phalcon);
        sourceFiles.addSubfolder(app);
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        // "app" subfolders
        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        // "publicFolder" files
        publicFolder.addFile(htacess);
        publicFolder.addFile(htrouterPhp);
        publicFolder.addFile(indexHtml);


        // Driver program
        System.out.println("Initial file system structure:");
        php_demo1.printContent("");

        // Deleting the 'app' folder
        System.out.println("\nDeleting the 'app' folder:");
        sourceFiles.deleteSubfolder(app);
        php_demo1.printContent("");

        // Deleting the 'public' folder
        System.out.println("\nDeleting the 'public' folder:");
        sourceFiles.deleteSubfolder(publicFolder);
        php_demo1.printContent("");
    }
}
