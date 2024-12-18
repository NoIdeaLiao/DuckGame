package DuckHunt.model

import scalafx.beans.property.StringProperty

class DuckPic {
  private val imageURL = new StringProperty("/Picture/Duck1.png")

  def textProperty: StringProperty = imageURL

  def getText: String = textProperty.get()

  def setText(imageurl: String): Unit = textProperty.set(imageurl)
}
