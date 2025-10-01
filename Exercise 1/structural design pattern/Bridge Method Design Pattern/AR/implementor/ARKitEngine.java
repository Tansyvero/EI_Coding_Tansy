
// Concrete Implementor - ARKitEngine
package implementor;

public class ARKitEngine implements AREngine {
    @Override
    public void render(String filterName) throws Exception {
        // Validate filter name before rendering
        if(filterName == null || filterName.isEmpty()) {
            throw new Exception("Filter name cannot be empty for ARKitEngine");
        }
        // Render filter using ARKit
        System.out.println("Rendering " + filterName + " using ARKit");
    }
}
