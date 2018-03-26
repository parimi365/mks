<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
	<!-- <!-- including the left jsp  -->
	<jsp:include page="left.jsp"></jsp:include>
	<!-- including the header page -->
	<jsp:include page="header.jsp"></jsp:include>

	<!--documents-->
	<div class="row row-offcanvas row-offcanvas-left">
		<div class="col-xs-12 col-sm-9 content">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="panel-body">
						<form:form action="/dosaemployeeAttandaceSave"
							enctype="multipart/form-data" modelAttribute="employeeAttendance"
							id="some_form">
							<c:if test="${not empty listEmployee}">
								<!-- <div class="row">
										<div class="col-md-3"> -->
											Name
											<c:forEach items="${listEmployee}" var="listOfEmployee">
									<div class="row">
										<div class="col-md-3">
											<input class="form-control" type="text"
												value="<c:out value="${listOfEmployee.employeeName}" />"
												name="employeeAttName" placeholder=".col-md-3">

										</div>
										
										<div class="col-md-3">
											<div class="form-check form-check-inline">
												<input class="form-check-input" type="checkbox"
													id="inlineCheckbox1" name = "isAttend" value="yes"> <label
													class="form-check-label" for="inlineCheckbox1">yes</label>
											<!-- /div>
											<div class="form-check form-check-inline"> -->
												<input class="form-check-input" type="checkbox"
													id="inlineCheckbox2" name = "isAttend" value="NO"> <label
													class="form-check-label" for="inlineCheckbox2">NO</label>
											</div>

										</div>
									</div>
								</c:forEach>
								
								<input type="submit" value="save" class="btn btn-info">
							</c:if>
							
						</form:form>
					</div>


				</div>

			</div>
		</div>
	</div>

	<script type="text/javascript">
			
			
				$("#some_form").reset();
			</script>
</body>
