package graficos;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

//Sophia Molina 28.470.485

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		marcoCentrado miMarco = new marcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class marcoCentrado extends JFrame {
	
	public marcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tama�oPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tama�oPantalla.height;
		int anchoPantalla = tama�oPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}