package DuckHunt.view

import DuckHunt.Main
import scalafxml.core.macros.sfxml

@sfxml
class HowToPlayController {
  def backHome(): Unit = {
    Main.showHome()
  }
}
