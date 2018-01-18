<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- including the left jsp -->
<jsp:include page="left.jsp"></jsp:include>
<!-- including the header page -->
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="lib.jsp"></jsp:include>
<div class="main-panel">
	<nav class="navbar navbar-transparent navbar-absolute">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Profile
					<div class="ripple-container"></div>
				</a>
			</div>
		</div>
	</nav>
	<div class="content">
		<div class="container-fluid">
			<div class="row" style="margin-right: -0px">
				<c:if test="${student ne null }">

					<div class="alert alert-success">
						<span><b> student is joined - </b> <c:out
								value="${student.firstname}"></c:out>.<c:out
								value="${student.lastname}"></c:out><c:out value ="${student.studentID }"/></span>
						<%--   <c:out value = "${lkg.1.term}"></c:out> --%>
						

 <div class = "col-md-8 col-md-offset-2">
						<div class="col-md-4">
							<button class="btn btn-primary btn-block"
								onclick="demo.showNotification('top','left')">
								New Student
								<div class="ripple-container"></div>
							</button>
						</div>

    <div class="col-md-4">
    <form:form action="/oldstudent">
          <input type = "hidden" name = "hiddenId" value ="<c:out value ="${student.studentID }"/>"></input>
							<button type="submit"  class="btn btn-primary btn-block"
								onclick="demo.showNotification('top','left')">
								Old Student</button>
							
			    </form:form>
						</div>

             
					</div>

</div>
				</c:if>
				<c:if test="${student eq null }">
					<div class="col-md-8">

						<div class="card">
							<div class="card-header" data-background-color="purple">
								<h4 class="title">Edit Profile</h4>
								<p class="category">Complete your profile</p>
							</div>
							<div class="card-content">

								<!-- first name and last name -->
								<form:form action="/studentinfo" modelAttribute="student">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Fist Name</label> <input
													type="text" name="firstname" class="form-control" required>
												<span class="material-input"></span>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Last Name</label> <input
													type="text" name="lastname" class="form-control"> <span
													class="material-input"></span>
											</div>
										</div>
									</div>
									<!-- first name and last name -->

									<!-- father name  and mother name -->
									<div class="row">
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Father Name</label> <input
													type="text" name="fathername" class="form-control">
												<span class="material-input"></span>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">mother Name</label> <input
													type="text" name="mothername" class="form-control">
												<span class="material-input"></span>
											</div>
										</div>
									</div>
									<!-- father name and mothers name -->

									<!-- Date Of birth  and Age-->
									<div class="row">
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Date Of Birth</label> <input
													type="date" name="dateOfBirth" id="dob"
													onBlur="ageCount(this.value)" class="form-control">
												<span class="material-input"></span>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Age</label> <input type="text"
													name="age" id="ageId" class="form-control"> <span
													class="material-input"></span>
											</div>
										</div>
									</div>
									<!-- Date Of birth  and Age-->
									<div class="row">
										<div class="col-md-12">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Adress</label> <input
													type="text" name="address" class="form-control"> <span
													class="material-input"></span>
											</div>

										</div>
									</div>

									<div class="row">
										<div class="col-md-4">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Area</label> <input type="text"
													name="area" class="form-control"> <span
													class="material-input"></span>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group label-floating is-empty">
												<label class="control-label">City</label> <input type="text"
													name="city" class="form-control"> <span
													class="material-input"></span>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Postal Code</label> <input
													type="text" name="postalCode" class="form-control">
												<span class="material-input"></span>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4">
											<div class="form-group label-floating is-empty">
												<label class="control-label">Mobile Number</label> <input
													type="text" name="mobileNumber" class="form-control">
												<span class="material-input"></span>
											</div>

										</div>
										<div class="col-md-4">
											<div class="form-group label-floating is-empty">
												<label class="control-label">aadhar Number</label> <input
													type="text" name="aadharNumber" class="form-control">
												<span class="material-input"></span>
											</div>

										</div>

									</div>

									<div class="row">
										<div class="col-md-6">

											<span class="btn btn-primary pull-right"><span>Choose
													photo</span><input type="file" name="photoLocation" /></span> <span
												class="fileinput-filename"></span>

										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label>About Me</label>
												<div class="form-group label-floating is-empty">
													<label class="control-label"> Lamborghini Mercy,
														Your chick she so thirsty, I'm in that two seat Lambo.</label>
													<textarea class="form-control" rows="5"></textarea>
													<span class="material-input"></span>
												</div>
											</div>
										</div>
									</div>

									<button type="submit" class="btn btn-primary pull-right">Update
										Profile</button>
									<div class="clearfix"></div>
								</form:form>
								>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="card card-profile">
							<div class="card-avatar">
								<a href="#pablo"> <img class="img"
									src="../assets/img/faces/marc.jpg">
								</a>
							</div>

							<div class="content">
								<h6 class="category text-gray">CEO / Co-Founder</h6>
								<h4 class="card-title">Krthik Muthyam</h4>
								<p class="card-content">Don't be scared of the truth because
									we need to restart the human foundation in truth And I love you
									like Kanye loves Kanye I love Rick Owens’ bed design but the
									back is...</p>
								<a href="#pablo" class="btn btn-primary btn-round">Follow</a>
							</div>
						</div>
					</div>
			</div>
		</div>
	</div>
	</c:if>

</div>
<script type="text/javascript">
	function getAge(birthDate) {

		var birthDate = new Date(birthDate);
		var currentDate = new Date();
		alert(currentDate);
		var years = (otherDate.getFullYear() - birthDate.getFullYear());

		if (currentDate.getMonth() < birthDate.getMonth()
				|| currentDate.getMonth() == birthDate.getMonth()
				&& currentDate.getDate() < birthDate.getDate()) {
			years--;
		}
		$('#ageId').val(years);
	}
</script>