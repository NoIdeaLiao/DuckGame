package DuckHunt.view

import DuckHunt.Main
import scalafxml.core.macros.sfxml

@sfxml
class HomeController {

  def startGame():Unit={
    Main.showGame()
  }

  def howToPlay(): Unit = {
    Main.howToPlay()
  }

  def chooseDuck(): Unit = {
    Main.showDuck()
  }
}
