package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoTest {

    @Test
    @DisplayName("로또생성 테스트")
    void generatorLottoNumberTest() {
        List<Integer> lotto = Lotto.extractionLottoNumber();
        assertThat(lotto.size()).isEqualTo(6);
    }
}
