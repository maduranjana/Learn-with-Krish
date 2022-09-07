<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalculateToBdayProxyid" scope="session" class="soapApp.CalculateToBdayProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalculateToBdayProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalculateToBdayProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalculateToBdayProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        soapApp.CalculateToBday getCalculateToBday10mtemp = sampleCalculateToBdayProxyid.getCalculateToBday();
if(getCalculateToBday10mtemp == null){
%>
<%=getCalculateToBday10mtemp %>
<%
}else{
        if(getCalculateToBday10mtemp!= null){
        String tempreturnp11 = getCalculateToBday10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String year_1id=  request.getParameter("year16");
        int year_1idTemp  = Integer.parseInt(year_1id);
        String month_2id=  request.getParameter("month18");
        int month_2idTemp  = Integer.parseInt(month_2id);
        String day_3id=  request.getParameter("day20");
        int day_3idTemp  = Integer.parseInt(day_3id);
        int getDay13mtemp = sampleCalculateToBdayProxyid.getDay(year_1idTemp,month_2idTemp,day_3idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDay13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>