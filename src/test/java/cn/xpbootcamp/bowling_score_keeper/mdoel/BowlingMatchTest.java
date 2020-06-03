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

  @Test
  void should_have_round1_and_total_score_equal_10_when_record_throw_given_round1_is_strike() {
    // Arrange
    BowlingMatch match = new BowlingMatch();

    // Act
    match.recordThrow(10);

    // Assert
    assertEquals(10, match.getRoundScore(1));
    assertEquals(10, match.getTotalScore());
  }

  @Test
  void should_have_round1_and_total_score_equal_10_when_record_throw_given_round1_is_spare() {
    // Arrange
    BowlingMatch match = new BowlingMatch();

    // Act
    match.recordThrow(7);
    match.recordThrow(3);

    // Assert
    assertEquals(10, match.getRoundScore(1));
    assertEquals(10, match.getTotalScore());
  }

  @Test
  void should_have_round1_and_total_score_equal_9_when_record_throw_given_round1_is_not_strike_or_spare() {
    // Arrange
    BowlingMatch match = new BowlingMatch();

    // Act
    match.recordThrow(7);
    match.recordThrow(2);

    // Assert
    assertEquals(9, match.getRoundScore(1));
    assertEquals(9, match.getTotalScore());
  }

  @Test
  void should_have_round1_equal_10_plus_round2_score_and_total_score_equal_2times_round2_score_plus_10_when_record_throw_given_round1_strike_and_round2_not_spare() {
    // Arrange
    BowlingMatch match = new BowlingMatch();

    // Act
    match.recordThrow(10);
    match.recordThrow(8);
    match.recordThrow(1);


    // Assert
    assertEquals(10 + 9, match.getRoundScore(1));
    assertEquals(2 * 9 + 10, match.getTotalScore());
  }
}
