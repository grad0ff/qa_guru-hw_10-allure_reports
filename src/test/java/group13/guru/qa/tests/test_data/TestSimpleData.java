package group13.guru.qa.tests.test_data;

import com.github.javafaker.Faker;
import group13.guru.qa.tests.test_utils.randomizer.Randomizer;

import java.io.File;

public class TestSimpleData {

    private static final Faker faker = new Faker();
    private static final Randomizer randomizer = new Randomizer();

    public static File filePhoto = randomizer.randomImage();
    public static String FIRST_NAME = faker.name().firstName(),
            LAST_NAME = faker.name().lastName(),
            EMAIL = faker.internet().emailAddress(),
            GENDER = randomizer.randomGender(),
            PHONE_NUMBER = randomizer.randomPhoneNumberString(),
            DAY = randomizer.randomDayString(),
            MONTH = randomizer.randomMonth(),
            YEAR = randomizer.randomYearString(),
            DATE_FOR_ASSERT = DAY + ' ' + MONTH + ',' + YEAR,
            SUBJECT = "Art",
            HOBBIES = "Sports",
            ADDRESS = faker.address().fullAddress(),
            STATE = "NCR",
            CITY = "Delhi";
    public static String[] FULL_DATE = new String[]{DAY, MONTH, YEAR};

}
