package group13.guru.qa.tests.test_utils.randomizer.services;

import com.github.javafaker.Faker;
import group13.guru.qa.tests.test_data.enums.ImageFormats;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RandomImageFormatService {

    private static final Faker faker = new Faker();

    /**
     * Returns pseudorandom image file format
     */
    public static @NotNull ImageFormats getRandomImageFormat() {
        int randomImageFormat = new Random().nextInt(ImageFormats.values().length);
        ImageFormats imageFormat = ImageFormats.BMP;
        switch (randomImageFormat) {
            case 1:
                imageFormat = ImageFormats.JPEG;
                break;
            case 2:
                imageFormat = ImageFormats.GIF;
                break;
            case 3:
                imageFormat = ImageFormats.PNG;
                break;
        }
        return imageFormat;
    }
}

