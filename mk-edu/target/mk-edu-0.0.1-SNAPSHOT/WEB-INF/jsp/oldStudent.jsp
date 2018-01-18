<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<style>
.entry:not
(:first-of-type)
{
margin-top:10px;
}
.glyphicon {
	font-size: 12px;
}
</style>

<!-- including the left jsp -->
<jsp:include page="left.jsp"></jsp:include>
<!-- including the header page -->
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="lib.jsp"></jsp:include>
<script type="text/javascript">
					$(function() {
						$(document)
								.on(
										'click',
										'.btn-add',
										function(e) {
											e.preventDefault();

											var controlForm = $('.controls form:first'), currentEntry = $(
													this).parents(
													'.entry:first'), newEntry = $(
													currentEntry.clone())
													.appendTo(controlForm);

											newEntry.find('input').val('');
											controlForm
													.find(
															'.entry:not(:last) .btn-add')
													.removeClass('btn-add')
													.addClass('btn-remove')
													.removeClass('btn-success')
													.addClass('btn-danger')
													.html(
															'<span class="glyphicon glyphicon-minus"></span>');
										}).on(
										'click',
										'.btn-remove',
										function(e) {
											$(this).parents('.entry:first')
													.remove();

											e.preventDefault();
											return false;
										});
					});
				</script>
				
				  
<div class="main-panel">
	<div class="content">
		<div class="container-fluid">
			
			<div class="card">
				<div class="card-content">
                    
					<div class="controls">
                      <div><p>Studnet id <c:out value="${studentId}"/></p></div>
						<form:form role="form"  action = "/saveOldStudent" modelAttribute="oldStudent" method="GET" autocomplete="off">
  
                 
							<input type = "hidden" name = "studentId" value ="<c:out value ="${studentId }"/>"/>
					
							<div class="entry">
								<div class="row ">
									<div class="col-sm-3">
										<div class="form-group label-floating">
											<label class="control-label">school</label> <input
												type="text" class="form-control" name="oldStudentSchool" type="text">
										</div>
									</div>
									<div class="col-sm-1">
										<div class="form-group label-floating">
											<label class="control-label">class</label> <input type="text"
												class="form-control" name="oldStudentClass" type="text">
										</div>
									</div>
									<div class="col-sm-1">
										<div class="form-group label-floating">
											<label class="control-label">%</label> <input type="text"
												class="form-control" name="percentage" type="text">
										</div>
									</div>

									<div class="col-sm-1">
										<div class="form-group label-floating">
											<label class="control-label">Year</label> <input type="text"
												class="form-control" name="year" type="text">
										</div>
									</div>

									<button class="btn btn-primary btn-sm btn-add">add</button>
								</div>
							</div>
								
					</div>
					<button  type="submit" class="btn btn-primary btn-sm">Save</button>
							</form:form>
				
					
</div>
</div>
</div>

		</div>
</div>
