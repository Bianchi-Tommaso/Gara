package Cavalli;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.*;

/**
 * 
 * <p> Questa Classe ha il Compito di rappresentare il singolo Cavallo. Ovvero all'interno del costruttore vengono eseguite delle istruzioni che impostano alla linea di partenza i cavalli </p>
 * <p> Inoltre gli viene assegnata un immagine per poter vedere l'avanzamento di ogni cavallo. Infine viene richiamato il metodo paint che tramite l'immagine e le cordinate verrà visualizzato nel Frame </p>
 */

class Cavallo extends JFrame
{
    int cordx;
    int cordy;
    Image img;
    
    public Cavallo(int yy, int xx)
    {
        cordx = 0;
        cordy = yy;
        setSize(80, 81);
        Toolkit tk = Toolkit.getDefaultToolkit();   
        
        switch(xx)
        {
            case 1:{img = tk.getImage("c.jpeg"); break;}
            case 2:{img = tk.getImage("c.jpeg"); break;}
            case 3:{img = tk.getImage("c.jpeg"); break;}
            case 4:{img = tk.getImage("c.jpeg"); break;}
            case 5:{img = tk.getImage("c.jpeg"); break;}
            case 6:{img = tk.getImage("c.jpeg"); break;}
        }
        
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);
        try{mt.waitForID(1);}
        catch(InterruptedException e){}
    }
    
    public void setCordx(int n)
    {
        cordx = n;
    }
    
    public int getCordx()
    {
        return cordx;
    }
    
public void paint(Graphics g)
{
    g.drawImage(img, cordx, cordy, null);
}
}

