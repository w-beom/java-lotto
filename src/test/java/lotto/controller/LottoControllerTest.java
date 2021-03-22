package lotto.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoControllerTest {

    @ParameterizedTest
    @CsvSource(value = {"14000,14","3000,3"})
    @DisplayName("로또 구입한 개수 구하기")
    void lottoTest(int price, int count){
        LottoController lottoController = new LottoController();
        assertThat(lottoController.getLottoPurchaseCount(price)).isEqualTo(count);
    }

}
