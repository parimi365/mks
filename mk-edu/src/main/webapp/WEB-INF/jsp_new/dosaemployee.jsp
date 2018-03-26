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
						<div class="row">
							<form:form action="/dosaemployeeSave"
								enctype="multipart/form-data" modelAttribute="employee" id = "some_form">
								<div class="row">
									<div class="col-md-3">
										Name <input class="form-control" type="text"
											name="employeeName" placeholder=".col-md-3">
									</div>

									<div class="col-md-3">
										Phone Number <input class="form-control" type="text"
											name="employeePhoneNumber" placeholder=".col-md-3">
									</div>

									<div class="col-md-3">
										Salary <input class="form-control" type="text"
											name="employeeSalary" placeholder=".col-md-3">
									</div>
								</div>
								<div class="row">
									<div class="col-md-3">
										position <input class="form-control" type="text"
											name="position" name="description" placeholder=".col-md-3">
									</div>

									<div class="col-md-3">
										comments
										<textarea class="form-control" type="text" name = "description"
											placeholder=".col-md-3"></textarea>
									</div>
									<div class="form-group">
										<label for="exampleInputFile">File input</label> <input
											id="exampleInputFile" type="file" name="aadharCard">
									</div>
								</div>
								<input type="submit" value="save" class="btn btn-info">
							</form:form>
						</div>
						<c:if test="${not empty listOfEmployee}">
							<table class="table">

								<thead class=".table-bordered">
								<thead>
									<tr>

										<th>emp Id</th>
										<th>Name</th>
										<th>salry</th>
										<th>phone number</th>
										<th>position</th>
										<th>joning date</th>
										<th>descrption</th>
										<th>action</th>
									</tr>
								</thead>
								<c:forEach items="${listOfEmployee}" var="listOfEmployee">
									<tbody>
										<tr>
											<td><c:out value="${listOfEmployee.employeeId}" /></td>
											<td><c:out value="${listOfEmployee.employeeName}" /></td>
											<td><c:out value="${listOfEmployee.employeeSalary}" /></td>
											<td><c:out value="${listOfEmployee.employeePhoneNumber}" /></td>
											<td><c:out value="${listOfEmployee.position}" /></td>
											<td><c:out
													value="${listOfEmployee.employee_joiningDate}" /></td>
											<td><c:out value="${listOfEmployee.description}" /></td>
											<td><button><a href="editemp/${listOfEmployee.employeeId}">Edit</a></button>
												<button><a href="editemp/${listOfEmployee.employeeId}">delete</a></button></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>
						</c:if>
					</div>

				</div>
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript">

    $(function()
    {
        $('#exampleInputFile').on('change',function ()
        {
            var filePath = $(this).val();
            console.log(filePath);
            alert(filePath)
        });
    });
    
    $("#some_form").reset();
    </script>



</body>
