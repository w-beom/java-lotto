package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottosTest {

    @Test
    @DisplayName("구입한_개수만큼_로또번호_생성")
    void 구입한_개수만큼_로또번호_생성(){
        Lottos lottos = Lottos.of(5);

    }
}
