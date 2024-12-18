package DuckHunt.view

import DuckHunt.Main
import DuckHunt.model.Data
import scalafx.scene.control.Label
import scalafxml.core.macros.sfxml

@sfxml
class CongratzController(scoreLabel:Label){

  scoreLabel.setText("Your score is "+Data.score.getValue)
  def backHome(): Unit = {
    Main.showHome()
  }
}