package org.example.selfmade.record;

import java.util.List;

public record Team(
        String name,
        List<Person> member
) {
}
