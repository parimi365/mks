<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


	<div class="sidebar" data-color="purple"
		data-image="<c:out value="img/sidebar-1.jpg" />">
		<!--
		        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

		        Tip 2: you can also add an image using data-image tag
		    -->

		<div class="logo">
			<a class="simple-text"> <c:out
					value="${pageContext.request.remoteUser}" />
			</a>
		</div>

		<div class="sidebar-wrapper">
			<ul class="nav">
				<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li class="active"><a href="dashboard.html"> <i
						class="material-icons">dashboard</i>
						<p>Dashboard</p>
				</a></li>
				</sec:authorize>
				<li><a  class = "active" href="user.jsp"> <i class="material-icons">person</i>
						<p>User Profile</p>
				</a></li>
				<li><a href="table.html"> <i class="material-icons">content_paste</i>
						<p>Table List</p>
				</a></li>
				<li><a href="typography.html"> <i class="material-icons">library_books</i>
						<p>Typography</p>
				</a></li>
				<li><a href="icons.html"> <i class="material-icons">bubble_chart</i>
						<p>Icons</p>
				</a></li>
				<li><a href="maps.html"> <i class="material-icons">location_on</i>
						<p>Maps</p>
				</a></li>
				<li><a href="notifications.html"> <i
						class="material-icons text-gray">notifications</i>
						<p>Notifications</p>
				</a></li>
				<li class="active-pro"><a href="upgrade.html"> <i
						class="material-icons">unarchive</i>
						<p>Upgrade to PRO</p>
				</a></li>
			</ul>
		</div>
	</div>
