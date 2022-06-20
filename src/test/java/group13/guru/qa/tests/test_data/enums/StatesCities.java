package group13.guru.qa.tests.test_data.enums;

import group13.guru.qa.tests.test_utils.randomizer.Capitalizer;
import org.jetbrains.annotations.NotNull;

public enum StatesCities implements Capitalizer {
    NCR("NCR", "Delhi"),
    UTTAR_PRADESH("Uttar Pradesh", "Agra"),
    HARYANA("Haryana", "Karnal"),
    RAJASTHAN("Rajasthan", "Jaipur");

    private final String state;
    private final String city;

    StatesCities(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String state() {
        return state;
    }

    public String city() {
        return city;
    }

    /**
     * returns the name of enumerate constant in Capitalize case
     */
    public @NotNull String nameToCapitalize() {
        return wordToCapitalize(name());
    }
}

