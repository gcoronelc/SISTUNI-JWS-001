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
            <rich:panel header="Mensaje del Sistema"
                        style="width:315px;margin:auto">

                <h4 style="text-align:center">${msg}</h4>

                <h:form style="text-align:center">
                    <h:commandLink action="mensaje-index" value="Home"/>
                </h:form>

            </rich:panel>
        </body>
    </html>
</f:view>
