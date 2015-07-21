package utfpr.ct.dainf.if62c.avaliacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Aviso extends TimerTask{
    
    protected final Compromisso compromisso;
    private final Date currentTime = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");


    public Aviso(Compromisso compromisso) {
       this.compromisso = compromisso;
    }

    Aviso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run(){
        currentTime.setTime(System.currentTimeMillis());
        long segundosFaltam = (compromisso.getData().getTime() - currentTime.getTime())/1000;
        System.out.println(compromisso.getDescricao()+" começa em "+segundosFaltam+"s"); 
    }
        
}
