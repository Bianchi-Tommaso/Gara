package Cavalli;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 
 * <p> Il Compito di questa classe è di richiamare un metodo della classe Canvas (paint) dove verrà disegnato il campo </p>
 */
class Campo extends JPanel
{
    private int corsia;
    
    public Campo(int corsia)
    {
        this.corsia = corsia;
    }
    
    /**
     * 
     * <p> All'interno del metodo passiamo un oggetto di tipo Graphics che tramite quel parametro possiamo richiamare metodi come il setColor(Disegna il frame con un tipo di colore)
     * fillRect(Disegna un rettangolo)</p>
     */
    public void paint(Graphics g)
    {
        
            g.setColor(Color.green);
            g.fillRect(0, 0, 1000, corsia * 100);
        
            g.setColor(Color.white);
            for(int i = 0; i < corsia; i++)
            {
        
            g.fillRect(0, i*100, 1000, 10);
            
            }
        
            g.fillRect(960, 0, 5, corsia * 100);
            g.fillRect(970, 0, 5, corsia * 100);
            g.fillRect(980, 0, 5, corsia * 100);
 
        
    }
}
