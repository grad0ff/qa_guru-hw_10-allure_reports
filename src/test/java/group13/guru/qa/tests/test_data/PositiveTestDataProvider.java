package group13.guru.qa.tests.test_data;

import com.github.javafaker.Faker;
import group13.guru.qa.tests.test_utils.randomizer.Randomizer;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.provider.Arguments;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class PositiveTestDataProvider {

    private static final Faker faker = new Faker();
    private static final Randomizer randomizer = new Randomizer();

    public static @NotNull Stream<String> firstNameData() {
        return Arrays.stream(new String[10]).map((String s) -> faker.name().firstName());
    }

    public static @NotNull Stream<String> lastNameData() {
        return Arrays.stream(new String[10]).map((String s) -> faker.name().lastName());
    }

    public static Stream<String> emailAddressData() {
        return Arrays.stream(new String[10]).map((String s) -> faker.internet().emailAddress());
    }

    public static Stream<String> phoneNumberData() {
        return Arrays.stream(new String[10]).map((String s) -> randomizer.randomPhoneNumberString());
    }

    public static Stream<Arguments> dateOfBirthData() {
        return Stream.of(new String[10][3]).map((String[] s) -> Arguments.of((Object) randomizer.randomDayMonthYear()));
    }

    public static Stream<Arguments> imageFileData() {
        return Stream.of(new File[10]).map((File f) -> (Arguments.of(randomizer.randomImage())));
    }

    public static Stream<String> addressData() {
        return Arrays.stream(new String[10]).map((String s) -> faker.address().fullAddress());
    }

}