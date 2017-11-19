package pack1;

public class Gewinner {
	public static void Ermitteln() {
		if (Gui.gewinner == 0) {

			
			
			
			
	//Waagerecht
			for (int x = 0; x < 3; x++) {
				if (Gui.state[x * 3] == Gui.player + 1 && Gui.state[x * 3 + 1] == Gui.player + 1
						&& Gui.state[x * 3 + 2] == Gui.player + 1) {
					Gui.gewinner = Gui.player + 1;
					Gui.gewinnerpos[0] = x*3;
					Gui.gewinnerpos[1] = x*3 + 1;
					Gui.gewinnerpos[2] = x*3 + 2;
				}
			}

			
			//Senkrecht
			for (int x = 0; x < 3; x++) {
				if (Gui.state[x] == Gui.player + 1 && Gui.state[x + 3] == Gui.player + 1
						&& Gui.state[x + 6] == Gui.player + 1) {
					Gui.gewinner = Gui.player + 1;
					Gui.gewinnerpos[0] = x;
					Gui.gewinnerpos[1] = x+3;
					Gui.gewinnerpos[2] = x+6;
				}
			}

						
			//Schräg
			for (int x = 0; x < 2; x++) {
				if (Gui.state[x * 2] == Gui.player + 1 && Gui.state[4] == Gui.player + 1
						&& Gui.state[8 - 2 * x] == Gui.player + 1) {
					Gui.gewinner = Gui.player + 1;
					Gui.gewinnerpos[0] = x * 2;
					Gui.gewinnerpos[1] = 4;
					Gui.gewinnerpos[2] = 8 - 2 * x;
				}
			}

		}
	}

}
