package observerPattern.scoreRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * 구체적인 변경 감시 대상 데이터
 */
public class ScoreRecord extends Subject {

    private List<Integer> scores = new ArrayList<>();

    /**
     * 점수가 추가될 때마다 observer 에게 알린다.
     * @param score
     */
    public void addScore(int score){
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }




}
