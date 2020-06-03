package cn.xpbootcamp.bowling_score_keeper.model;

import java.util.ArrayList;

public class BowlingMatch {

  private int totalScore;

  private ArrayList<Round> rounds;

  public BowlingMatch() {
    rounds = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
      rounds.add(new Round());
    }
  }

  public int getTotalScore() {
    return totalScore;
  }

  public int getRoundScore(int round) {
    return rounds.get(round-1).getScore();
  }

  public void recordThrow(int score) {
    totalScore += score;
    rounds.get(0).recordThrow(score);
  }
}
