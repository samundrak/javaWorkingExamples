package labwork;

import java.io.File;

/**
 *
 * @author Samundra kc <samundrak@yahoo.com>
 * Email: Samundrak@yahoo.com
 */
public class ListAllFilesOfDirectory {
    private String paths;

    public String getPath() {
        return paths;
    }

    public void setPath(String path) {
        this.paths = path;
    }
    
    public void listFiles(){
        File f = new File(paths);
        File[] lf =  f.listFiles();
        for (int i = 0; i < lf.length; i++) {
            if(lf[i].isFile()){
                System.out.println(lf[i]);
            }
        }
    }
}
