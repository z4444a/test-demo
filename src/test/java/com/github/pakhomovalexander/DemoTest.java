package com.github.pakhomovalexander;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoTest {
    @Test
    void main() {
        String string = "This is my first test!";

        assertThat(string).isEqualTo("This is my first test!");
    }
}
