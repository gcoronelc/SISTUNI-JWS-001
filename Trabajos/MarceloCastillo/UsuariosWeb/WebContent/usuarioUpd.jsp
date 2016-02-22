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
            <rich:panel header="Actualizar datos de Usuario"
                        style="width:315px;margin:auto">

                <h:form style="text-align:center">
                    <fieldset>
                        <h:inputHidden value="#{usuarioMB.usuario.id}"/>

                        <label style="width:54px;display:inline-block;text-align:left">
                            <h:outputText value="Nombres "/>
                        </label>
                        <h:inputText value="#{usuarioMB.usuario.nombreCompleto}"
                                     required="true" id="nombres"
                                     style="width:200px"
                                     requiredMessage="Ingrese Nombres."
                                     validatorMessage="Entre [3, 50] caracteres.">
                            <f:validateLength minimum="3" maximum="50"/>
                        </h:inputText><br/>
                        <h:message for="nombres" style="color:red"/><br/>

                        <label style="width:54px;display:inline-block;text-align:left">
                            <h:outputText value="Usuario "/>
                        </label>
                        <h:inputText value="#{usuarioMB.usuario.usuario}"
                                     required="true" id="usuario"
                                     style="width:200px"
                                     requiredMessage="Ingrese Usuario."
                                     validatorMessage="Entre [3, 50] caracteres.">
                            <f:validateLength minimum="3" maximum="50"/>
                        </h:inputText><br/>
                        <h:message for="usuario" style="color:red"/><br/>

						<label style="width:54px;display:inline-block;text-align:left">
                            <h:outputText value="Clave "/>
                        </label>
                        <h:inputSecret value="#{usuarioMB.usuario.clave}"
                                       required="true" id="clave"
                                       style="width:200px"
                                       requiredMessage="Ingrese Clave."
                                       validatorMessage="Entre [3, 50] caracteres.">
                            <f:validateLength minimum="3" maximum="50"/>
                        </h:inputSecret><br/>
                        <h:message for="clave" style="color:red"/><br/>

                        <label style="width:54px;display:inline-block;text-align:left">
                            <h:outputText value="Correo "/>
                        </label>
                        <h:inputText value="#{usuarioMB.usuario.correo}"
                                     required="true" id="correo"
                                     style="width:200px"
                                     requiredMessage="Ingrese Correo."
                                     validatorMessage="Entre [3, 50] caracteres.">
                            <f:validateLength minimum="3" maximum="50"/>
                        </h:inputText><br/>
                        <h:message for="correo" style="color:red"/><br/>

                        <br/>
                        <h:commandButton action="#{usuarioMB.usuarioUpd}"
                                         value="Enviar Datos"/>
                    </fieldset>
                </h:form>
            </rich:panel>

            <h:form style="text-align:center;margin-top:20px">
                <h:commandLink action="usuarioUpd-index" value="Volver"/>
            </h:form>
        </body>
    </html>
</f:view>
