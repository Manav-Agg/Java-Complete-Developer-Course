package com.manav;

public class Challenge {
    /**
     * When overriding the equals() method in the HeavenlyBody class, we
     * were careful to make sure that it would not return true if a HeavenlyBody
     * was compared to a subclass of itself.
     *
     * We did that to demonstrate that method, but it was a actually
     * unnecessary in the heavenlyBody.
     *
     * The mini challenge is just a question: why it is unnecessary?
     *
     * Answer:
     *
     * The HeavenlyBody class is declared final, so cannot be subclassed.
     * The java String class is also final, which is why it can safely
     * use the instanceof method without having to worry about
     * comparisons with a subclass.
     */
}