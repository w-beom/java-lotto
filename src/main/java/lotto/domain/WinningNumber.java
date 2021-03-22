package lotto.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WinningNumber {
    private final List<Integer> winningNumbers;
    private final static String REGEX = ",";

    public WinningNumber(String winningNumber) {
        String[] test = winningNumber.split(REGEX);
        winningNumbers = Arrays.stream(test)
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public Map getWinnerStatistics(Lottos lottos) {
        List<Lotto> lottoList = lottos.getLottos();
        Map<Integer, Integer> hitMap = new HashMap<>();
        hitMap.put(3, 0);
        hitMap.put(4, 0);
        hitMap.put(5, 0);
        hitMap.put(6, 0);
        for (Lotto lotto : lottoList) {
            long matchCount = getMatchCount(lotto);
            hitMap.computeIfPresent((int) matchCount, (match, hitCount) -> hitCount + 1);
        }
        return hitMap;
    }

    private long getMatchCount(Lotto lotto) {
        return lotto.getLottoNumbers()
                .stream()
                .filter(winningNumbers::contains)
                .count();
    }
}
