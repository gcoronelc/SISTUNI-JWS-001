package pe.fbet.model;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class ClienteModel 
{
    private String CODIGO;
    private String PATERNO;
    private String MATERNO;
    private String NOMBRE;
    private String DNI;
    private String CIUDAD;
    private String DIRECCION;
    private String TELEFONO;
    private String EMAIL;

    public ClienteModel() {
    }

    /**
     * @return the CODIGO
     */
    public String getCODIGO() {
        return CODIGO;
    }

    /**
     * @param CODIGO the CODIGO to set
     */
    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    /**
     * @return the PATERNO
     */
    public String getPATERNO() {
        return PATERNO;
    }

    /**
     * @param PATERNO the PATERNO to set
     */
    public void setPATERNO(String PATERNO) {
        this.PATERNO = PATERNO;
    }

    /**
     * @return the MATERNO
     */
    public String getMATERNO() {
        return MATERNO;
    }

    /**
     * @param MATERNO the MATERNO to set
     */
    public void setMATERNO(String MATERNO) {
        this.MATERNO = MATERNO;
    }

    /**
     * @return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param NOMBRE the NOMBRE to set
     */
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the CIUDAD
     */
    public String getCIUDAD() {
        return CIUDAD;
    }

    /**
     * @param CIUDAD the CIUDAD to set
     */
    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

    /**
     * @return the DIRECCION
     */
    public String getDIRECCION() {
        return DIRECCION;
    }

    /**
     * @param DIRECCION the DIRECCION to set
     */
    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    /**
     * @return the TELEFONO
     */
    public String getTELEFONO() {
        return TELEFONO;
    }

    /**
     * @param TELEFONO the TELEFONO to set
     */
    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
}
