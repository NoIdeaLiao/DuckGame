package DuckHunt.model

class Score {
  private var score = 0

  def getValue: Int = score

  def setText(Score: Int): Unit = score=Score
}