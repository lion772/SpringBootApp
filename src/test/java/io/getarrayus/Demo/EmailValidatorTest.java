package io.getarrayus.Demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmailValidatorTest {
    private final EmailValidator undertest = new EmailValidator();

    @Test
    public void itShouldValidateCorrectEmail() {
        assertThat(undertest.test("hello@gmail.com")).isTrue();
    }

    @Test
    public void itShouldValidateAnIncorrectEmail() {
        assertThat(undertest.test("hellogmail.com")).isFalse();
    }

    @Test
    public void itShouldValidateAnIncorrectEmailWithoutDotAtTheEnd() {
        assertThat(undertest.test("hello@gmail")).isFalse();
    }
}
