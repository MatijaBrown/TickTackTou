package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (Gui.gewinner == 0) {

			for (int d = 0; d < 9; d++) {
				if (e.getSource() == Gui.btn[d]) {
					if (Gui.state[d] == 0) {
						Gui.state[d] = Gui.player + 1;
						Gewinner.Ermitteln();
						if (Gui.player == 0) {
							Gui.player = 1;
						} else {
							Gui.player = 0;
						}
					}
				}
			}

		}
	}
}
