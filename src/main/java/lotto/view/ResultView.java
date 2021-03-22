package lotto.view;

import lotto.dto.ResponseLottosDTO;
import lotto.dto.ResponsePurchaseCountDTO;

public class ResultView {

    public static void printPurchaseCount(ResponsePurchaseCountDTO responsePurchaseCountDTO) {
        System.out.println(responsePurchaseCountDTO.getPurchaseCount() + "개를 구매했습니다.");
    }
    
    public static void printLottoNumber(ResponseLottosDTO responseLottosDTO) {
        System.out.println(responseLottosDTO.getLottoNumbers());
    }

}
