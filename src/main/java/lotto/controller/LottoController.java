package lotto.controller;

import lotto.domain.Lottos;
import lotto.domain.WinningNumber;
import lotto.dto.ResponseLottosDTO;
import lotto.dto.ResponsePurchaseCountDTO;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.Map;

public class LottoController {
    private static int PRICE_OF_A_PIECE_OF_LOTTO = 1_000;

    public void start() {
        int purchaseAmount = InputView.inputPurchaseAmount();

        int count = getLottoPurchaseCount(purchaseAmount);
        ResultView.printPurchaseCount(new ResponsePurchaseCountDTO(count));

        Lottos lottos = Lottos.of(count);
        printLottosForCount(count, lottos);

        printWinningStatistics(lottos);
    }

    public int getLottoPurchaseCount(int price) {
        return price / PRICE_OF_A_PIECE_OF_LOTTO;
    }

    private void printLottosForCount(int count, Lottos lottos) {
        for (int i = 0; i < count; i++) {
            ResultView.printLottoNumber(new ResponseLottosDTO(lottos.getLottos().get(i).getLottoNumbers()));
        }
    }

    private void printWinningStatistics(Lottos lottos) {
        WinningNumber winningNumber = new WinningNumber(InputView.inputLastWeekWinningNumber());
        Map winnerStatistics = winningNumber.getWinnerStatistics(lottos);
        System.out.println(winnerStatistics);
    }
}
