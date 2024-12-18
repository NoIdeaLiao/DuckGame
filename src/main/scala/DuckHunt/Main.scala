package DuckHunt

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.Includes._
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import javafx.{scene => jfxs}


object Main extends JFXApp {
  // Get root layout
  val rootResource = getClass.getResource("/Build/RootLayout.fxml")
  //Initialize layout
  val loader = new FXMLLoader(rootResource, NoDependencyResolver)
  //Load root layout
  loader.load();
  //Retrieve the root component
  val roots = loader.getRoot[jfxs.layout.BorderPane]

  //Stage
  stage = new PrimaryStage{
    title = "Duck Hunt"
    scene = new Scene {
      root=roots
    }
  }

  //Start home screen
  def showHome(): Unit = {
    val resource = getClass.getResource("/Build/Home.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  }

  //Show Game Scene
  def showGame(): Unit = {
    val resource = getClass.getResource("/Build/Game.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  }

  //Show how to play
  def howToPlay(): Unit = {
    val resource = getClass.getResource("/Build/HowToPlay.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  }

  //Let Player Choose Duck
  def showDuck(): Unit = {
    val resource = getClass.getResource("/Build/ChooseDuck.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  }

  //Congratulate Player
  def showCongratz(): Unit = {
    val resource = getClass.getResource("/Build/Congratz.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  }

  showHome()
}