package demo.components.semanticui

import chandu0101.macros.tojs.GhPagesMacros
import chandu0101.scalajs.react.components.semanticui.{SuiHeader, SuiInput}
import demo.components.CodeExample
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object SuiInputDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START


  case class Backend($: BackendScope[Unit, Unit]) {

    def render() =
      <.div(
        CodeExample(code, "SuiInput")(
          <.b("A standard input field"),
          <.br(),
          SuiInput(placeholder = "Search ..")(),
          <.br(),
          <.b("Focus"),
          <.br(),
          SuiInput(placeholder = "Search ..",focus = true)(),
          <.br(),
          <.b("Error"),
          <.br(),
          SuiInput(placeholder = "Search ..",error = true)(),
          <.br(),
          <.b("Icon"),
          <.br(),
          SuiInput(placeholder = "Search ..",icon = "search")()
        )
      )
  }

  val component = ReactComponentB[Unit]("SuiInputDemo")
    .renderBackend[Backend]
    .build

  // EXAMPLE:END

  def apply() = component()
}
