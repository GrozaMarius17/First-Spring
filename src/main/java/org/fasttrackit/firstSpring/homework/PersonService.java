package org.fasttrackit.firstSpring.homework;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final PersonReader personReader;

    public PersonService(PersonReader personReader) {
        this.personReader = personReader;
    }

    public List<String> getNames(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("add");
        return strings;
    }
}
