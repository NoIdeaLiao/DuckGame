package DuckHunt.view

import DuckHunt.Main
import DuckHunt.model.Data
import scalafx.scene.control.{RadioButton, ToggleGroup}
import scalafxml.core.macros.sfxml

@sfxml
class ChooseDuckController(
                          val radioButton1: RadioButton,
                          val radioButton2: RadioButton,
                          val radioButton3: RadioButton,
                          ){

  //Grouping radio button
  val duckGroup = new ToggleGroup()
  radioButton1.setToggleGroup(duckGroup)
  radioButton2.setToggleGroup(duckGroup)
  radioButton3.setToggleGroup(duckGroup)

  //Images
  val duck1Image = "/Picture/Duck1.png"
  val duck2Image = "/Picture/Duck2.png"
  val duck3Image = "/Picture/Duck3.png"



  //Confirm Button
  def confirmButton(): Unit = {
    duckGroup.selectedToggle.value match {
      case `radioButton1` => changeDuckImage(duck1Image)
      case `radioButton2` =>  changeDuckImage(duck2Image)
      case `radioButton3` =>  changeDuckImage(duck3Image)
      case _ => changeDuckImage(duck1Image)
    }
    Main.showHome()
  }

  def goHome(): Unit = {
    Main.showHome()
  }

  def changeDuckImage(url:String): Unit = {
    Data.duckPic.setText(url)
  }

}