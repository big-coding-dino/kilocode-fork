package ai.kilo.plugin.ui.components.chat.message.parts

import com.intellij.util.ui.JBUI
import java.awt.BorderLayout
import javax.swing.BorderFactory
import javax.swing.JLabel
import javax.swing.JPanel

/**
 * Panel that renders a user's own chat message with a distinct visual style:
 * a tinted background, rounded border, and padding to differentiate it from assistant messages.
 */
class UserSelfPanel(text: String) : JPanel() {

    init {
        layout = BorderLayout()
        isOpaque = true
        background = JBUI.CurrentTheme.ActionButton.pressedBackground()
        border = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(JBUI.CurrentTheme.CustomFrameDecorations.separatorForeground(), 1, true),
            JBUI.Borders.empty(8, 12)
        )
        add(JLabel("<html>${text.replace("\n", "<br/>")}</html>").apply {
            isOpaque = false
        }, BorderLayout.CENTER)
    }
}
