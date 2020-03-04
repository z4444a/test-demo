package com.github.pakhomovalexandr;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NameParserTest {
    @Test
    void shouldReturnSecondNameFromString() {
        NameParser parser = new NameParser();
        String firstAndSecondName = "Alexander Pakhomov";

        String secondName = parser.parse(firstAndSecondName);
        assertThat(secondName).isEqualTo("Pakhomov");
    }

    @Test
    void shouldReturnEmptyStringFromEmptyInput() {
        NameParser parser = new NameParser();
        String empty = "";

        String result = parser.parse(empty);
        assertThat(result).isEmpty();
    }

    @Test
    void shouldReturnSecondNameFromStringWithTwoSpaces() {
        NameParser parser = new NameParser();
        String firstAndSecondName = "Vasya  Pypkin";

        String result = parser.parse(firstAndSecondName);
        assertThat(result).isEqualTo("Pypkin");
    }

    @Test
    void shouldReturnSecondNameFromStringWithTwoSpacesAndSpacesAtTheStart() {
        NameParser parser = new NameParser();
        String firstAndSecondName = "  Vasya  Pypkin    ";

        String result = parser.parse(firstAndSecondName);
        assertThat(result).isEqualTo("Pypkin");
    }

    @Test
    void shouldReturnNullWhenNullPassed() {
        NameParser parser = new NameParser();

        String result = parser.parse(null);
        assertThat(result).isNull();
    }
}