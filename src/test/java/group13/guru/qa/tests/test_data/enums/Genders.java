package group13.guru.qa.tests.test_data.enums;

import group13.guru.qa.tests.test_utils.randomizer.Capitalizer;
import org.jetbrains.annotations.NotNull;

public enum Genders implements Capitalizer {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String gender;

    Genders(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return gender;
    }

    /**
     * returns the name of enumerate constant in Capitalize case
     */
    public @NotNull String nameToCapitalize() {
        return wordToCapitalize(name());
    }
}
