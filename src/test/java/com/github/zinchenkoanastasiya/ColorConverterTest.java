package com.github.zinchenkoanastasiya;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ColorConverterTest {

    @Test
    void shouldReturnHexFromRGB() {
        ColorConverter converter = new ColorConverter();
        String rgb = "  124, 100, 34  ";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("#7c6422");
    }

    @Test
    void shouldReturnEmptyStringWhenNotThreeNumbers() {
        ColorConverter converter = new ColorConverter();
        String rgb = "124, 100, 45, 5";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("");
    }

    @Test
    void shouldReturnEmptyStringWhenNotNumbers() {
        ColorConverter converter = new ColorConverter();
        String rgb = "gfdf, dfgd, fdger";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("");
    }

    @Test
    void shouldReturnEmptyStringWhenOutOfBounds() {
        ColorConverter converter = new ColorConverter();
        String rgb = "124, 1900, 34";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("");
    }

    @Test
    void shouldReturnEmptyStringWhenSplittersAreNotCommas() {
        ColorConverter converter = new ColorConverter();
        String rgb = "124. 190. 34";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("");
    }

    @Test
    void shouldReturnSecondNameFromStringSpacesAtTheStart() {
        ColorConverter converter = new ColorConverter();
        String rgb = "   124, 100, 34";

        String hex = converter.convert(rgb);
        assertThat(hex).isEqualTo("#7c6422");
    }

    @Test
    void shouldReturnNullWhenNullPassed() {
        ColorConverter converter = new ColorConverter();

        String result = converter.convert(null);
        assertThat(result).isNull();
    }
}
