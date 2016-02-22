<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!-- RichFaces tag library -->
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h:form>
                <rich:dataTable
                    style="margin:auto;width:400px;margin-top:20px"
                    onRowMouseOver="this.style.backgroundColor='#def'"
                    onRowMouseOut="this.style.backgroundColor='#{a4jSkin.tableBackgroundColor}'"
                    var="usuario" value="#{usuarioMB.lstUsuarios}" id="dt" rows="3">

                    <f:facet name="header">
                        <rich:columnGroup>
                            <rich:column colspan="6">
                                <h:commandLink action="index-usuarioIns">
                                    <h:graphicImage
                                        value="images/ins.png"
                                        alt="Nuevo" title="Nuevo"
                                        style="vertical-align:bottom;border:0"/>
                                </h:commandLink>
                                <h:outputText value="  Lista de Usuarios" />
                            </rich:column>
   <%--                          
                            <rich:column>
                                <h:outputText value="Nro" />
                            </rich:column>
                            <rich:column>
                                <h:outputText value="Usuario" />
                            </rich:column>
                            <rich:column>
                                <h:outputText value="Nombres" />
                            </rich:column>    
                            <rich:column>
                                <h:outputText value="Correo" />
                            </rich:column>                    
                            <rich:column colspan="2" style="width:40px">
                                <h:outputText value="Acción" />
                            </rich:column>
    --%>                         
                        </rich:columnGroup>
                    </f:facet>

                    <rich:column>
                        <h:outputText value="#{usuario.id}" /> 
                    </rich:column>
                    <rich:column>
                        <h:outputText value="#{usuario.usuario}" />
                    </rich:column>
                    <rich:column>
                        <h:outputText value="#{usuario.nombreCompleto}" />
                    </rich:column>
 					<rich:column>
                        <h:outputText value="#{usuario.correo}" />
                    </rich:column>
                    <rich:column style="text-align:center">
                        <h:commandLink action="index-mensaje"
                                       onclick="return confirm('¿Retirar Usuario?');"
                                       actionListener="#{usuarioMB.usuarioDel}">
                            <f:param name="idusuario" value="#{usuario.id}"/>
                            <h:graphicImage value="images/del.png"
                                            alt="Retirar" title="Retirar"
                                            style="border:0"/>
                        </h:commandLink>
                    </rich:column>
                    
                    <rich:column style="text-align:center">
                        <h:commandLink action="index-usuarioUpd"
                                       actionListener="#{usuarioMB.seleccionarUsuario}">
                            <f:param name="idusuario" value="#{usuario.id}"/>
                            <h:graphicImage value="images/upd.png"
                                            alt="Actualizar" title="Actualizar"
                                            style="border:0"/>
                        </h:commandLink>
                    </rich:column>
 
                </rich:dataTable>
                <rich:datascroller align="center" for="dt" maxPages="6"/>
            </h:form>
        </body>
    </html>
</f:view>
