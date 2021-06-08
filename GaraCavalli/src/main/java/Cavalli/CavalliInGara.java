package Cavalli;

/**
 * 
 * <p> Questa classe rappresenta i nostri Thread che gareggiano, quindi saranno i nostri cavalli in gara </p> 
 * <p> Abbiamo il metodo Run() che una volta lanciato il Thread verrà eseguito, il suo compito è quello di far avanzare i cavalli. </p> 
 * <p> Quindi nel nostro Frame vedremo l'immagine dei cavalli avanzare fino al traguardo, e infine visualizzare la classifica </p> 
 */

public class CavalliInGara implements Runnable
{
    Cavallo cavallo;
    GaraCavalliGrafica campo;
    Thread t;
    int conta;
    int posizione;
    int velocita;
    
    public CavalliInGara(Cavallo c, GaraCavalliGrafica g)
    {
        cavallo = c;
        campo = g;
        conta = 0;
        velocita = 2;
        t = new Thread(this);
        t.start();
        posizione = 0;
    }

    @Override
    public void run()
    {
        int dimImmagine = 79;
        int dimPista = 960;
        
        while((cavallo.getCordx() + dimImmagine) < dimPista)
        {
            
               velocita = (int) (Math.random()* 4 + 1);
               System.out.println("Velocita: " + velocita);
               cavallo.setCordx(cavallo.getCordx() + velocita);
               conta++;
               
               try
               {Thread.sleep(75);}
               catch(Exception e)
                       {
                       
                       } 
            campo.repaint();
        }
        posizione = campo.getPosizione();
        campo.ControllaArrivi();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
