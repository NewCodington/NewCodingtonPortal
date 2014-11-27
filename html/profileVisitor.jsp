<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="codingtonportal.model.domain.Event"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>

<title>New Codington</title>

<meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
<meta name="author" content="Erwin Aligam - styleshout.com" />
<meta name="description" content="Site Description Here" />
<meta name="keywords" content="keywords, here" />
<meta name="robots" content="index, follow, noarchive" />
<meta name="googlebot" content="noarchive" />

<link rel="stylesheet" type="text/css" media="screen" href="images/BrightSide.css" />

</head>

<body>
<!-- wrap starts here -->
<div id="wrap">
	
	<div id="header">				
			
		<h1 id="logo">New<span class="green">Codington</span></h1>	
		<h2 id="slogan">One of the World's Best Cities 2014</h2> 
		
		<form method="post" class="searchform" action="#">
			<p><input type="text" name="search_query" class="textbox" />
  			<input type="submit" name="search" class="button" value="Search" /></p>
		</form>
			
		<!-- Menu Tabs -->
		<ul>
			<li id="current"><a href="index.html"><span>History</span></a></li>
			<li><a href="index.html"><span>Site Map</span></a></li>
			<li><a href="index.html"><span>About</span></a></li>
	
		</ul>	
													
	</div>	

	<!-- content-wrap starts here -->
	<div id="content-wrap">		
											
	<img src="images/headerphoto.jpg" width="820" height="120" alt="headerphoto" class="header-photo" />
		
		<div id="sidebar" >							
				
			<h1><%=session.getAttribute("Visitor") %>'s Menu</h1>
			<ul class="sidemenu">
				<li><a href="index.html">My Page</a></li>
				<li><a href="#TemplateInfo">Update Information</a></li>
				<li><a href="#SampleTags">Update Password</a></li>
				<li><a href="http://www.styleshout.com/">Logout</a></li>

			</ul>		
				
			<h1>Site Partners</h1>
            <ul class="sidemenu">
                <li><a href="http://www.dreamtemplate.com" title="Website Templates">
				DreamTemplate</a></li>
                <li><a href="http://www.themelayouts.com" title="WordPress Themes">
				ThemeLayouts</a></li>
                <li><a href="http://www.imhosted.com" title="Website Hosting">
				ImHosted.com</a></li>
                <li><a href="http://www.dreamstock.com" title="Stock Photos">
				DreamStock</a></li>
                <li><a href="http://www.evrsoft.com" title="Website Builder">
				Evrsoft</a></li>
                <li><a href="http://www.ehostinfo.com/" title="Web Hosting">Web 
				Hosting</a></li>
            </ul>
			
			<h1>Wise Words</h1>
			<p>&quot;Men are disturbed, not by the things that happen, but by their 
			opinion of the things that happen.&quot;</p>		
				
			<p class="align-right">- Epictetus</p>					
		
		</div>
			
		<div id="main">	
			
			<div id="content">

			<div class="right_nav">
				
				<div class="message"><%= session.getAttribute("Success")!=null?session.getAttribute("Success").toString():""%></div>
				
				
				
					<div class="search">		
						<form method="post" action="visitor">	
							<input type = "text" name="search" id="search" placeholder="Search" />
							<input type= "submit" value="Search" />
						</form>
					</div>

					<div class="title">EVENTS <hr></hr></div>
					<%
						ArrayList<Event> eventList = new ArrayList<Event>();
						eventList = (ArrayList<Event>) session.getAttribute("EVENTLIST");
						if (eventList == null){
					%>

					<div class="message"><p>Not found Events</p></div>
					<%	
						}
						else {	
					%>
					<table>
						<tr>
							<th>Event Name</th>
							<th>Description</th>
							<th>Place</th>
							<th>Date</th>
							<th>Duration</th>
							<th>Event Type</th>
							<th>Seats Available</th>
							<th>Start Time</th>
							<th>Action</th>
						</tr>
		
						<%
							for (Event event : eventList) {
						%>
									
						<tr>
							<td><%=event.getName()%></td>
							<td><%=event.getDescription()%></td>
							<td><%=event.getPlaceString()%></td>
							<td><%=event.getDate_eventString()%></td>
							<td><%=event.getDuration()%></td>
							<td><%=event.getEventType()%></td>
							<td><%=event.getSeatsAvailable()%></td>
							<td><%=event.getStartTime()%></td>
							<td><a href = <%="visitor?register=" + event.getEventId() %>>Register</a></td>
						</tr>
						<%
							}
						%>
					</table>
					<%
						}
					%>
			
				<div class="title">Events Resgistration<hr /></div>

					<%
					ArrayList<Event> eventRegisterList = new ArrayList<Event>();
					eventRegisterList = (ArrayList<Event>) session.getAttribute("EVENTREGISTERLIST");
					if (eventRegisterList == null){
					%>
				
				<div class="message"><p>There are no Events Registered for you</p></div>	
				
				<%	
					}
					else {	
				%>

				<table>
					<tr>
						<th>Event Name</th>
						<th>Description</th>
						<th>Place</th>
						<th>Date</th>
						<th>Duration</th>
						<th>Event Type</th>
						<th>Seats Available</th>
						<th>Start Time</th>
						<th>Action</th>
					</tr>
						<%
							for (Event event : eventRegisterList) {
						%>
					<tr>
						<td><%=event.getName()%></td>
						<td><%=event.getDescription()%></td>
						<td><%=event.getPlaceString()%></td>
						<td><%=event.getDate_eventString()%></td>
						<td><%=event.getDuration()%></td>
						<td><%=event.getEventType()%></td>
						<td><%=event.getSeatsAvailable()%></td>
						<td><%=event.getStartTime()%></td>
						<td><a href = "<%="visitor?unregister=" + event.getEventId() %>">Unregister</a></td>
					</tr>
						<%
							}
						%>
				</table>						
					<%
						}
					%>		
			
		</div>

		
							
		</div>	
			
					
	<!-- content-wrap ends here -->		
	</div>

<!-- footer starts here -->	
<div id="footer">
	
	<div class="footer-left">
		<p class="align-left">			
		© 2010 Company Name |Design by <a href="http://www.styleshout.com/">
		styleshout</a>|
		<a href="http://www.cssportal.com/">CSS Portal</a>

		</p>		
	</div>
	
	<div class="footer-right">
		<p class="align-right">
		<a href="index.html">Home</a> |
  		<a href="index.html">SiteMap</a> |
   	    <a href="index.html">RSS Feed</a> |
        <a href="http://validator.w3.org/check/referer">XHTML</a> |
		<a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a>
		</p>
	</div>
	
</div>
<!-- footer ends here -->
	
<!-- wrap ends here -->
</div>

</body>
</html>
