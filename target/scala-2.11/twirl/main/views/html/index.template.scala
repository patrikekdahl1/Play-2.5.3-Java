
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<a href="/person">"""),_display_(/*2.20*/message),format.raw/*2.27*/("""</a>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 26 15:59:01 CEST 2016
                  SOURCE: /Users/patrikekdahlspeddodator/IdeaProjects/playjava/app/views/index.scala.html
                  HASH: 6bebaa89da5cc597d3c2754abea51b895423efdf
                  MATRIX: 527->1|640->19|667->20|712->39|739->46
                  LINES: 20->1|25->1|26->2|26->2|26->2
                  -- GENERATED --
              */
          