package cn.xpbootcamp.bowling_score_keeper.model;

public class Round {

  private int score = 0;

  private int firstThrow = -1;
  private int secondThrow = -1;

  private int additionalThrowsCount = 0;

  public int getScore() {
    return score;
  }

  /// returns if the round is finished
  public boolean recordThrow(int score) {
    if (firstThrow == -1) {
      firstThrow = score;
      if(firstThrow == 10) {
        additionalThrowsCount++;
      }
    } else {
      secondThrow = score;
    }

    this.score = firstThrow + (secondThrow < 0 ? 0 : secondThrow);
    if(this.score == 10) {
      additionalThrowsCount++;
    }

    return firstThrow == 10 || secondThrow > -1;
  }

  public void updateScoreWithNextThrow(int score) {
    if(additionalThrowsCount > 0) {
      this.score += score;
      additionalThrowsCount--;
    }
  }
}
