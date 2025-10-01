
// Abstraction class in Bridge Pattern
package abstraction;

import implementor.AREngine;

public abstract class ARFilter {
    // Reference to Implementor
    protected AREngine engine;

    // Constructor to inject AREngine implementation
    public ARFilter(AREngine engine) {
        this.engine = engine;
    }

    // Abstract method to apply filter
    public abstract void apply();
}
