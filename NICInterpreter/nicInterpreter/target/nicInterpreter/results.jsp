<%@page import="malaka.cse.maven.exception.InvalidNICException"%>
<%@page import="malaka.cse.maven.NICProp"%>
<%@page import="malaka.cse.maven.NICInterpreter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NIC Interpreter</title>
    <h1>Results of NIC Interpretation</h1>
    <%	try {
    String NICNumber = request.getParameter("NICNumber");
    NICInterpreter nICInterpreter = new NICInterpreter();
    NICProp NICProp = NICInterpreter.createNICProp( NICNumber );%>
    <h2>Birthday  :</h2>
<%    out.print(NICProp.getDate());%>
<br>
<h2>Gender    :</h2>
<%    out.print(NICProp.getGender()); %>

<h2>Is this person a voter ? </h2>
<%out.print(NICProp.isVoter());%>
    <br> 
    <%} catch (InvalidNICException ex) {
    out.println(ex.getMessage());
}	
    %>

</head>
<body>

</body>
</html>
