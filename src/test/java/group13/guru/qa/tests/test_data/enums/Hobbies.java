package group13.guru.qa.tests.test_data.enums;

import group13.guru.qa.tests.test_utils.randomizer.Capitalizer;
import org.jetbrains.annotations.NotNull;

public enum Hobbies implements Capitalizer {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private final String hobby;

    Hobbies(String hobby) {
        this.hobby = hobby;
    }

    public String hobby() {
        return hobby;
    }

    /**
     * returns the name of enumerate constant in Capitalize case
     */
    public @NotNull String nameToCapitalize() {
        return wordToCapitalize(name());
    }
}

