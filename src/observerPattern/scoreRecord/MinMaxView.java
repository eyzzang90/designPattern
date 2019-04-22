package observerPattern.scoreRecord;

import java.util.Collections;
import java.util.List;

/**
 * 출력형태2 : 최소/최대 값만을 출력하는 형태의 클래스
 */
public class MinMaxView implements Observer{

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    //점수의 변경을 통보받음
    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScored(record);
    }

    private void displayScored(List<Integer> record){
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + ", Max: " + max);

    }
}
