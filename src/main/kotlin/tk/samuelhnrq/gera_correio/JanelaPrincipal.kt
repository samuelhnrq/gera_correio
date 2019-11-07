package tk.samuelhnrq.gera_correio

import tornadofx.View
import tornadofx.borderpane
import tornadofx.hbox
import tornadofx.label

class JanelaPrincipal : View() {
    override val root = borderpane {
        center = hbox {
            label("Hello world")
            label("Teste")
        }
    }

    init {
        primaryStage.width = 800.0
        primaryStage.height = 600.0
        title = "Hello darkness my old friend"
    }
}
