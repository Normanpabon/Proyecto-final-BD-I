/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author norma
 */
public class Contrato {
    
    public Contrato(){
        
    }
    
    // metodos para contratos
    
    public static void Registrar_Contrato(Statement mysql, int poliza, String localAsignado, int codigoPuestoAlmacenamiento, int contratante) throws SQLException{
        String comando = "INSERT INTO contrato ( poliza_amparo, local_asignado, codigo_puesto_almacenamiento, contratante) VALUES ( "+
                String.valueOf(poliza) + ", " + localAsignado + ", " + String.valueOf(codigoPuestoAlmacenamiento) + ", " + contratante + ");";
        
        
        mysql.execute(comando);
    }
    
    public static void Registrar_Contrato_temporal(Statement mysql, int numContrato, String fechaInicio, String fechaFinalizacion, char frecuenciaPago, int poliza, String localAsignado) throws SQLException{
        String comando = "INSERT INTO temporal ( numero_contrato, fecha_inicio, fecha_finalizacion, frecuencia_pago, poliza_amparo, local_asignado) VALUES ( " +
                String.valueOf(numContrato)+"," +fechaInicio + ", "+ fechaFinalizacion + ", "+ String.valueOf(frecuenciaPago) + ", " + poliza + ", " + localAsignado + ");";
        
        mysql.execute(comando);
        
    }
    
    public static void Registrar_Contrato_membresia(){
        
    }
    
    public static void Registrar_contrato_propietario(){
        
    }
    
    
}
