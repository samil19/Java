<%-- 
    Document   : newjsp
    Created on : Nov 17, 2016, 6:05:44 PM
    Author     : Samil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="fusioncharts.FusionCharts" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="chart"></div>
<!--
This is a simple example on how to draw a chart using FusionCharts and JSP.
We have included fusioncharts.FusionCharts, which contains functions
to help us easily embed the charts.
-->


<--        
Create the chart - Column 2D Chart with data given in constructor parameter 
Syntax for the constructor -
	new FusionCharts("type of chart", 
		"unique chart id", 
		"width of chart", 
		"height of chart", 
		"div id to render the chart", 
		"type of data", 
		"actual data in string format")
-->
<%
FusionCharts column2DChart= new FusionCharts(
	"column2d",// chartType
	"chart1",// chartId
	"600", //   chartWidth
	"400",//    chartHeight
	"chart",//  chartContainer
	"json",//   dataFormat
	"{\"chart\": {\"caption\": \"Harry\'s SuperMart\",\"subCaption\": \"Top 5 stores in last month by revenue\",\"numberPrefix\": \"$\",\"theme\": \"ocean\"},\"data\": [{\"label\": \"Bakersfield Central\",\"value\": \"880000\"}, {\"label\": \"Garden Groove harbour\",\"value\": \"730000\"}, {\"label\": \"Los Angeles Topanga\",\"value\": \"590000\"}, {\"label\": \"Compton-Rancho Dom\",\"value\": \"520000\"}, {\"label\": \"Daly City Serramonte\",\"value\": \"330000\"}]}"
);
%>
<!--            
Render the chart
-->
<%=column2DChart.render()%>

    </body>
</html>
