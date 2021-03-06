
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object person_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class person extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">

        <link type="text/css" href=""""),_display_(/*6.38*/routes/*6.44*/.Assets.at("stylesheets/style.css")),format.raw/*6.79*/("""" rel="stylesheet" />
        <script src=""""),_display_(/*7.23*/routes/*7.29*/.Assets.at("javascripts/nameCall.js")),format.raw/*7.66*/(""""></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="background">
            <div class="mid">
                <div id="logo"></div>
                <input type="text" id="textInput" onkeyup="showHint(this.value)">
                <div id="dropdown">
                    <ul id="txtHint">
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object person extends person_Scope0.person
              /*
                  -- GENERATED --
                  DATE: Thu May 26 15:49:43 CEST 2016
                  SOURCE: /Users/patrikekdahlspeddodator/IdeaProjects/playjava/app/views/person.scala.html
                  HASH: cc7b1700c59632af4e66d5642a8a96f8cf34be98
                  MATRIX: 611->0|750->113|764->119|819->154|889->198|903->204|960->241
                  LINES: 25->1|30->6|30->6|30->6|31->7|31->7|31->7
                  -- GENERATED --
              */
          