
// Concrete Implementor - ARCoreEngine
package implementor;

public class ARCoreEngine implements AREngine {
    @Override
    public void render(String filterName) throws Exception {
        // Validate filter name before rendering
        if(filterName == null || filterName.isEmpty()) {
            throw new Exception("Filter name cannot be empty for ARCoreEngine");
        }
        // Render filter using ARCore
        System.out.println("Rendering " + filterName + " using ARCore");
    }
}
