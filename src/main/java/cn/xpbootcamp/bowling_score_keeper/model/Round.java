package cn.xpbootcamp.bowling_score_keeper.model;

public class Round {

  private int score;

  public int getScore() {
    return score;
  }

  public void recordThrow(int score) {
    this.score += score;
  }
}
