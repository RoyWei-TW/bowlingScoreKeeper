package cn.xpbootcamp.bowling_score_keeper.model;

import java.util.ArrayList;

public class BowlingMatch {

  private ArrayList<Round> rounds;

  private int currentRound;

  public BowlingMatch() {
    currentRound = 0;
    rounds = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
      rounds.add(new Round());
    }
  }

  public int getTotalScore() {
    return rounds.stream().mapToInt(round -> round.getScore()).sum();
  }

  public int getRoundScore(int round) {
    return rounds.get(round-1).getScore();
  }

  public void recordThrow(int score) {
    boolean roundFinished = rounds.get(currentRound).recordThrow(score);
    updateStrikeOrSpare(currentRound - 1, score);
    updateStrikeOrSpare(currentRound - 2, score);
    if(roundFinished) {
      currentRound++;
    }
  }

  private void updateStrikeOrSpare(int roundIndex, int score) {
    if(roundIndex >= 0 && roundIndex < rounds.size()) {
      rounds.get(roundIndex).updateScoreWithNextThrow(score);
    }
  }
}
