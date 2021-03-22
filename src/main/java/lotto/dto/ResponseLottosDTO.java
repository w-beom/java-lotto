package lotto.dto;

import lotto.domain.Lotto;
import lotto.domain.Lottos;

import java.util.List;

public class ResponseLottosDTO {
    private final List<Integer> lottoNumbers;

    public ResponseLottosDTO(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }
}
