package DuckHunt.view

import DuckHunt.Main
import DuckHunt.model.Data
import scalafx.application.Platform
import scalafx.scene.image.{Image, ImageView}
import scalafxml.core.macros.sfxml
import scala.util.Random
import scalafx.scene.canvas.Canvas
import scalafx.scene.control.Label
import java.util.{Timer, TimerTask}


@sfxml
class GameController (private val canvas: Canvas,
                      private val duckImage:ImageView,
                      private var scoreLabel:Label,
                      private var timerLabel:Label) {

  val random = new Random()
  var score = 0
  final val startTimer = 60;
  var timer = 0
  setDuckImage()
  scoreLabel.setText("Score: " + score.toString)
  timerLabel.setText("Timer: " + (startTimer - timer).toString)

  //Timer
  val t = new Timer()
  //Task to Run at each interval
  val task = new TimerTask {
    def run(): Unit = {
      timer += 1
      Platform.runLater(() -> timerLabel.setText("Timer: " + (startTimer - timer).toString))
      //When timer reached end task
      if (timer >= startTimer) {
        t.cancel()
        Platform.runLater(endTask())
      }
    }
  }
  t.scheduleAtFixedRate(task, 1000, 1000)




  //spawn ducks
  def spawnDuck(): Unit = {
    val x = random.nextInt((canvas.getWidth - duckImage.getFitWidth).toInt)
    val y = random.nextInt((canvas.getHeight - duckImage.getFitHeight).toInt)
    duckImage.setLayoutX(x)
    duckImage.setLayoutY(y)
  }

  //click interaction
  def onDuckClicked(): Unit = {
    score += 1
    spawnDuck()
    scoreLabel.setText("Score: " + score.toString)
  }

  def setDuckImage(): Unit = {
    val newImage = new Image(Data.duckPic.getText)
    duckImage.image = newImage
  }

  def endTask(): Unit = {
    Data.score.setText(score)
    Main.showCongratz()
  }
}