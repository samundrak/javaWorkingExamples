package labwork;

/**
 *
 * @author Samundra kc <samundrak@yahoo.com>
 * Email: Samundrak@yahoo.com
 */
public class Object1 {
    public String name  = "ram";

    @Override
    public String toString() {
        return this.name;
    }
    
    
    public  class Inner {
        String name = "hello";
    }
    
}
