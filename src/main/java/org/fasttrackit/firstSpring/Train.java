package org.fasttrackit.firstSpring;

import org.springframework.beans.factory.annotation.Qualifier;

public class Train {
    private final Engine engine;

    public Train(@Qualifier("Defaul engine") Engine engine) {
        System.out.println("Building train");
        System.out.println(engine);
        this.engine = engine;
    }
}
