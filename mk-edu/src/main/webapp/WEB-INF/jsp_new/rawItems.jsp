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

					<%-- <div class="panel panel-primary">

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
				</div> --%>



					<div class="panel-body">
						<div class="row">
							<form:form action="/rawItemSave" modelAttribute="rawItems">

								<div class="input-group control-group  after-add-more">



									<div class="col-md-3">
										RAW ITEMS <input type="text" name="rawItemsName"
											class="form-control" placeholder=".col-md-3"><!--  <select
											 class="selecter_3"
											data-selecter-options='{"cover":"true"}' name = "rawItemsName">
											<option value="Rice">Rice</option>
											<option value="Mennapappu">Mennapappu</option>
											<option value="ravva">ravva</option>
											<option value="4">palli</option>
											<option value="5">ground nuts</option>
										</select>
 -->
									</div>

									<div class="col-md-3">
										UNTIS(KGS) <input type="text" name="rawItemUnit"
											class="form-control" placeholder=".col-md-3">
									</div>
									<div class="col-md-3">
										PRICE <input type="text" name="rawItemPrice"
											class="form-control" placeholder=".col-md-3">
									</div>
									<div class="input-group-btn">
										<button class="btn btn-success add-more" type="button">
											<i class="glyphicon glyphicon-plus"></i> Add
										</button>
									</div>
								</div>
								<input type="submit" value="save" class="btn btn-info" />

								<!--   <button class="btn btn-info" type="submit">save</button>
					 -->
							</form:form>


							<!-- Copy Fields-These are the fields which we get through jquery and then add after the above input,-->
							<div class="copy-fields hide">
								<div class="control-group  input-group" style="margin-top: 10px">
<div class="col-md-3">
										RAW ITEMS
									<input type="text" name="rawItemsName" class="form-control" placeholder="Enter Name Here">
									</div>
									<!-- <div class="col-md-3">
										RAW ITEMS <select
										 class="selecter_3"
											data-selecter-options='{"cover":"true"}' name = "rawItemsName">
											<option value="Rice">Rice</option>
											<option value="Mennapappu">Mennapappu</option>
											<option value="ravva">ravva</option>
											<option value="4">Four</option>
											<option value="5">Five</option>
										</select>
									</div>
 -->
									<div class="col-md-3">
										UNTIS(KGS) <input type="text" name="rawItemUnit"
											class="form-control" placeholder=".col-md-3">
									</div>
									<div class="col-md-3">
										PRICE <input type="text" name="rawItemPrice"
											class="form-control" placeholder=".col-md-3">

									</div>
									<div class="input-group-btn">
										<button class="btn btn-danger remove" type="button">
											<i class="glyphicon glyphicon-remove"></i> Remove
										</button>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
				<script type="text/javascript">
				
					$(document).ready(function() {
				
						//here first get the contents of the div with name class copy-fields and add it to after "after-add-more" div class.
						$(".add-more").click(function() {
							var html = $(".copy-fields").html();
							$(".after-add-more").after(html);
						});
						//here it will remove the current value of the remove button which has been pressed
						$("body").on("click", ".remove", function() {
							$(this).parents(".control-group").remove();
						});
				
					});
				</script>
			</div>

			<!-- content -->
		</div>

	</div>

</body>
<
<script type="text/javascript">

$(document).ready(function () {
    var counter = 0;

    $("#addrow").on("click", function () {
        var newRow = $("<tr>");
        var cols = "";

        cols += '<td><input type="text" class="form-control" name="name' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="mail' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="phone' + counter + '"/></td>';

        cols += '<td><input type="button" class="ibtnDel btn btn-md btn-danger "  value="Delete"></td>';
        newRow.append(cols);
        $("table.order-list").append(newRow);
        counter++;
    });



    $("table.order-list").on("click", ".ibtnDel", function (event) {
        $(this).closest("tr").remove();       
        counter -= 1
    });


});



function calculateRow(row) {
    var price = +row.find('input[name^="price"]').val();

}

function calculateGrandTotal() {
    var grandTotal = 0;
    $("table.order-list").find('input[name^="price"]').each(function () {
        grandTotal += +$(this).val();
    });
    $("#grandtotal").text(grandTotal.toFixed(2));
}
</script>
