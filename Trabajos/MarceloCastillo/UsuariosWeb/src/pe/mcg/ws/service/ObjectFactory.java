
package pe.mcg.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.mcg.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertarUsuario_QNAME = new QName("service.ws.mcg.pe", "insertarUsuario");
    private final static QName _ActualizarUsuarioResponse_QNAME = new QName("service.ws.mcg.pe", "actualizarUsuarioResponse");
    private final static QName _DesactivarUsuario_QNAME = new QName("service.ws.mcg.pe", "desactivarUsuario");
    private final static QName _ObtenerUsuario_QNAME = new QName("service.ws.mcg.pe", "obtenerUsuario");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("service.ws.mcg.pe", "listarUsuariosResponse");
    private final static QName _DesactivarUsuarioResponse_QNAME = new QName("service.ws.mcg.pe", "desactivarUsuarioResponse");
    private final static QName _InsertarUsuarioResponse_QNAME = new QName("service.ws.mcg.pe", "insertarUsuarioResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("service.ws.mcg.pe", "listarUsuarios");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("service.ws.mcg.pe", "obtenerUsuarioResponse");
    private final static QName _ActualizarUsuario_QNAME = new QName("service.ws.mcg.pe", "actualizarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.mcg.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link DesactivarUsuarioResponse }
     * 
     */
    public DesactivarUsuarioResponse createDesactivarUsuarioResponse() {
        return new DesactivarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link DesactivarUsuario }
     * 
     */
    public DesactivarUsuario createDesactivarUsuario() {
        return new DesactivarUsuario();
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link UsuarioEntity }
     * 
     */
    public UsuarioEntity createUsuarioEntity() {
        return new UsuarioEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "insertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "actualizarUsuarioResponse")
    public JAXBElement<ActualizarUsuarioResponse> createActualizarUsuarioResponse(ActualizarUsuarioResponse value) {
        return new JAXBElement<ActualizarUsuarioResponse>(_ActualizarUsuarioResponse_QNAME, ActualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesactivarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "desactivarUsuario")
    public JAXBElement<DesactivarUsuario> createDesactivarUsuario(DesactivarUsuario value) {
        return new JAXBElement<DesactivarUsuario>(_DesactivarUsuario_QNAME, DesactivarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesactivarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "desactivarUsuarioResponse")
    public JAXBElement<DesactivarUsuarioResponse> createDesactivarUsuarioResponse(DesactivarUsuarioResponse value) {
        return new JAXBElement<DesactivarUsuarioResponse>(_DesactivarUsuarioResponse_QNAME, DesactivarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "insertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.ws.mcg.pe", name = "actualizarUsuario")
    public JAXBElement<ActualizarUsuario> createActualizarUsuario(ActualizarUsuario value) {
        return new JAXBElement<ActualizarUsuario>(_ActualizarUsuario_QNAME, ActualizarUsuario.class, null, value);
    }

}
