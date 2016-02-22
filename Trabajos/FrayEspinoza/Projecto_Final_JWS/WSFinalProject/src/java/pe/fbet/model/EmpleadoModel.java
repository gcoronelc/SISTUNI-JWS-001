package pe.fbet.model;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class EmpleadoModel 
{
    private String CODIGO;
    private String PATERNO;
    private String MATERNO;
    private String NOMBRE;
    private String CIUDAD;
    private String DIRECCION;
    private String USUARIO;
    private String CLAVE;

    public EmpleadoModel() {
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
     * @return the USUARIO
     */
    public String getUSUARIO() {
        return USUARIO;
    }

    /**
     * @param USUARIO the USUARIO to set
     */
    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    /**
     * @return the CLAVE
     */
    public String getCLAVE() {
        return CLAVE;
    }

    /**
     * @param CLAVE the CLAVE to set
     */
    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }
    
}
