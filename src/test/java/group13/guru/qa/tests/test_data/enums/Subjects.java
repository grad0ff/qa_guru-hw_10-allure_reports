package group13.guru.qa.tests.test_data.enums;

import group13.guru.qa.tests.test_utils.randomizer.Capitalizer;
import org.jetbrains.annotations.NotNull;

public enum Subjects implements Capitalizer {
    ART("Art"),
    BIOLOGY("Art"),
    CHEMISTRY("Chemistry"),
    ENGLISH("English");

    private final String subject;

    Subjects(String subject) {
        this.subject = subject;
    }

    public String subject() {
        return subject;
    }

    /**
     * returns the name of enumerate constant in Capitalize case
     */
    public @NotNull String nameToCapitalize() {
        return wordToCapitalize(name());
    }
}

