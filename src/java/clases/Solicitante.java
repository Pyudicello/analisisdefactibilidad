
package clases;

public class Solicitante {
    
    
    private String nombre;
    private String dni;
    private String razonSocial;
    private String telefono;
    private String cuit;
    private String tipoTramite;
    private String actividad;
    
    
    public Solicitante(String nombre , String dni , String razonSocial ,
            String telefono , String cuit , String tipoTramite , String actividad){
        
        this.nombre=nombre;
        this.dni=dni;
        this.razonSocial=razonSocial;
        this.telefono= telefono;
        this.tipoTramite=tipoTramite;
        this.actividad=actividad;
        this.cuit= cuit;
                
        
    }
    
    
    
    
    
}
