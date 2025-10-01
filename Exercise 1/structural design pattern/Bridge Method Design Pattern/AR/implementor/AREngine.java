
// Interface for AR Engines (Implementor in Bridge Pattern)
package implementor;

public interface AREngine {
    // Method to render filter based on filter name
    void render(String filterName) throws Exception;
}
