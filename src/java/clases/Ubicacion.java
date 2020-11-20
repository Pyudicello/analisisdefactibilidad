
package clases;


public class Ubicacion {
    
    private static String calle;
    private static int numero;

    
    public static String getCalle() {
        return calle;
    }

    
    public static void setCalle(String aCalle) {
        calle = aCalle;
    }

    
    public static int getNumero() {
        return numero;
    }

   
    public static void setNumero(int aNumero) {
        numero = aNumero;
    }
    
    public Ubicacion(String calle,  int numero){
        this.calle= calle;
        this.numero= numero;
    }
    
    public String analizar(String actividad,  int zona){
        if(zona == 1 && actividad.equalsIgnoreCase("Apicultura") 
                    || actividad.equalsIgnoreCase("Cría de ganado y producción de leche , lana y pelos")
                    || actividad.equalsIgnoreCase("Cultivos agricolas")
                    || actividad.equalsIgnoreCase("Cultivos de tabaco")
                    || actividad.equalsIgnoreCase("Elaboración de combustible nuclear")
                    || actividad.equalsIgnoreCase("Eliminación de desperdicios y aguas residuales, saneamiento y servicios similares")
                    || actividad.equalsIgnoreCase("Apicultura")
                    || actividad.equalsIgnoreCase("Explotación de minas y canteras n.c.p.")
                    || actividad.equalsIgnoreCase("Extracción de minerales de hierro")
                    || actividad.equalsIgnoreCase("Extracción de minerales y concentrados de uranio y torio")
                    || actividad.equalsIgnoreCase("Extracción de petróleo crudo y gas natural")
                    || actividad.equalsIgnoreCase("Extracción de sal en salinas y de roca")
                    || actividad.equalsIgnoreCase("Extracción y aglomeración de carbón")
                    || actividad.equalsIgnoreCase("Fabricación de armas y municiones")
                    || actividad.equalsIgnoreCase("Molienda de trigo")
                    || actividad.equalsIgnoreCase("Pesca y recolección de productos marinos")
                    || actividad.equalsIgnoreCase("Recolección, reducción y eliminación de desperdicios")
                    || actividad.equalsIgnoreCase("Apicultura")){
            return "No Factible";
            
        }else{
            return "Factible";
        }
    }
    
    
    
    
    
}
