package pack1;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	static Image imgX, imgO, imgOWin, imgXWin;
	
	public ImageLoader() {
		try {
			imgX = ImageIO.read(new File("C:\\Users\\Matij\\eclipse-workspace\\TickTackTou/res/x.png"));
			imgO = ImageIO.read(new File("res/o.png"));
     		imgOWin = ImageIO.read(new File("res/O-HatGewonnenJo.png"));
    		imgXWin = ImageIO.read(new File("res/X-HatGewonnenJo.png"));
		} catch (IOException e) {
            e.printStackTrace();
		}
	}
		
}
