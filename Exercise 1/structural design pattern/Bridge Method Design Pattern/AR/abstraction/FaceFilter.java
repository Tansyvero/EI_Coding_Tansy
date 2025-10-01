
// Refined Abstraction - FaceFilter
package abstraction;

import implementor.AREngine;

public class FaceFilter extends ARFilter {

    public FaceFilter(AREngine engine) {
        super(engine);
    }

    @Override
    public void apply() {
        try {
            // Delegates rendering work to the engine
            engine.render("FaceFilter");
        } catch (Exception e) {
            // Handle errors gracefully
            System.err.println("Error applying FaceFilter: " + e.getMessage());
        }
    }
}
