import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

public aspect Logger {
	
	pointcut success() : call(* setColor(..));
	int cont = 0;
	after(): success() {
		Calendar cld = Calendar.getInstance();
		
		String fecha, msg, dia, mes, anio, hora, min, seg;
		   
		dia = Integer.toString(cld.get(Calendar.DATE));
		mes = Integer.toString(cld.get(Calendar.MONTH));
		anio = Integer.toString(cld.get(Calendar.YEAR));
		hora = Integer.toString(cld.get(Calendar.HOUR_OF_DAY));
	    min = Integer.toString(cld.get(Calendar.MINUTE));
	    seg = Integer.toString(cld.get(Calendar.SECOND));
		
	    fecha = mes + "/" + dia + "/" + anio + " " + hora + ":" + min + ":" + seg;
		msg = fecha + " -> ** Registro de cambio de color **\n";
		
		
		cont++;
		System.out.print(cont + " - " + msg);
		
		FileWriter f = null;
        PrintWriter pw = null;
        try
        {
            f = new FileWriter("log.txt",true);
            pw = new PrintWriter(f);
            pw.print(msg);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
        	   if (f != null)
        		   f.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }	
	}
}
