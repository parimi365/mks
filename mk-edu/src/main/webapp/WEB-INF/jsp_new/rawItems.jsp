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
				<!-- <div class="panel-heading">
                <h3 class="panel-title"><a href="javascript:void(0);" class="toggle-sidebar"><span class="fa fa-angle-double-left" data-toggle="offcanvas" title="Maximize Panel"></span></a> Panel Title</h3>
              </div> -->
				<div class="panel-body">

					<div class="panel panel-primary">

						<div class="panel-heading">
							<h3 class="panel-title">console</h3>
						</div>
						<div style="color: #22A7F0" class="panel-body">
							<c:if test="${not empty rawItems}">
  saved.........<c:out value = "${rawItems.rawItemsName}"/>
</c:if>
						</div>
					</div>

					<form:form action="/rawItemSave" modelAttribute="rawItems"
						method="post">
						<div class="panel-body">
							<div class="row">


								<div class="col-md-3">
									RAW ITEMS <input type="text" name="rawItemsName"
										class="form-control" placeholder=".col-md-3">
								</div>

								<div class="col-md-1">
									UNTIS(KGS) <input type="text" name="rawItemUnit"
										class="form-control" placeholder=".col-md-1">
								</div>
								<div class="col-md-1">
									PRICE <input type="text" name="rawItemPrice"
										class="form-control" placeholder=".col-md-1">
								</div>

							</div>

						</div>
						<input type="submit" value="save" class="btn btn-info" />

						<!--   <button class="btn btn-info" type="submit">save</button>
					 -->
					</form:form>
				</div>

			</div>

			<!-- content -->
		</div>

	</div>

</body>

