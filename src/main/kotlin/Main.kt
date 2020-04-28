import kotlinx.css.*
import react.dom.*
import styled.css
import styled.styledDiv
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        child(App::class){}
    }
}
