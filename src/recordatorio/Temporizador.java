/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordatorio;

/**
 *
 * @author ANDRES TALERO
 */
import java.util.Calendar;
import java.util.TimerTask;
import javax.swing.JOptionPane;
 
public class Temporizador extends TimerTask{
 
	@Override
	public void run() {
		Calendar diaActual = Calendar.getInstance();
		
		switch (diaActual.get(Calendar.DAY_OF_WEEK)) {
			case 1: // Es domingo puedes seguir durmiendo y se apaga el despertador
				System.out.println("Zzz...");
				this.cancel();
				System.out.println("Temporizador apagado.");
				break;
			case 2:	// Durante los dias de diario suena el despertador
			case 3:
			case 4:
			case 5:
			case 6:
			                         
                            
                            JOptionPane.showMessageDialog(null,"Despierta!!!");
                                                 
                            //System.out.println("Despierta!!!");
				break;
			case 7: // Es sabado puedes seguir durmiendo
				System.out.println("Zzz...");
				break;
		}
	}
 
}
