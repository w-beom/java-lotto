package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1","2,2","3,3"})
    @DisplayName("숫자 파싱 테스트")
    void parserInt(String str, int num) {
        Number number = new Number(str);
        assertThat(number.parserInt(str)).isEqualTo(num);
    }

    @Test
    @DisplayName("문자열을 숫자로 테스트")
    void convertStringToNumber() {
    }

    @Test
    void validationCheck() {
    }

    @Test
    void isNegativeNumber() {
    }

    @Test
    void isBlankOrNull() {
    }

}
