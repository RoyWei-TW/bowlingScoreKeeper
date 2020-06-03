package cn.xpbootcamp.bowling_score_keeper.mdoel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.xpbootcamp.bowling_score_keeper.model.BowlingMatch;
import org.junit.jupiter.api.Test;

public class BowlingMatchTest {

  @Test
  void should_have_round1_and_total_score_equal_first_throw_when_record_throw_given_it_is_round1_first_throw() {
    // Arrange
    BowlingMatch match = new BowlingMatch();

    // Act
    match.recordThrow(7);

    // Assert
    assertEquals(7, match.getRoundScore(1));
    assertEquals(7, match.getTotalScore());
  }
}
