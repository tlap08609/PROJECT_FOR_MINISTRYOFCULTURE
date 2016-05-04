<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文創創業圓夢計畫－評分系統</title>
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/jquery-1.12.0.min.js"></script>
<style>
* {
	font-family: 微軟正黑體;
}

h3 {
	font-size: 23px;
	margin-top: 3px;
}

.tim {
	margin-bottom: 50px;
	line-height: 75px;
	font-size: 48px;
}

.panel-heading {
	height: 50px;
	margin-bottom: 10px;
}

body {
	font-size: 23px;
}

.wone {
	width: 50px;
}

.wtwo {
	width: 130px;
}

.autoname {
	margin: 10px 0 50px 30px;
}

#magic1 {
	width: 100px;
}

#magic2 {
	width: 140px;
}

#magicComment {
	width: 150px;
}

#magicTime {
	width: 70px;
}
</style>
<script>
	$(function() {
		$("form").submit(function() {
			switch (this.id) {
			case "updateForm":
				alert("輸入完成!!轉回原先頁面");
				return true;
			case "login":
				return true;
			default:
				return false;
			}
		});
	})
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 tim">
				<div class="col-md-3">
					<img src="culture1.png" alt="">
				</div>
				<div class="col-md-8">文創創業圓夢計畫－評分系統</div>
				<a class="btn btn-default linked" href="index.html" role="button">回上一頁</a>
			</div>
		</div>
	</div>
	<form id="login" class="form-inline autoname"
		action="queryCustomizedPlan" method="post">
		<div class="form-group">
			<label for="exampleInputName2">委員姓名</label> <input id="" type="text"
				class="form-control" placeholder="委員姓名" name="coname"> <label
				for="exampleInputName2">日期</label> <input id="" type="text"
				class="form-control" placeholder="日期" name="cotime">
		</div>
		<button type="submit" class="btn btn-default" id="magicbutton">填寫完請點選我</button>
	</form>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 text-center formTim">
				<div class="panel panel-default">
					<div class="panel-body1">
						<table class="table table-striped">
							<tr>
								<td class="active">委員名字</td>
								<td class="active">編號</td>
								<td class="active">組別</td>
								<td class="success">計畫名稱</td>
								<td class="active">分數</td>
								<td class="warning">委員意見</td>
								<td class="warning">確認</td>
							</tr>
							<c:if test='${not empty plans_lp}'>
								<c:forEach var='pp' varStatus='vs' items='${plans_lp}'>
									<Form id="updateForm" Action="updateVote" method="POST">

										<input type="hidden" name="pk" value="${pp.no}"> <input
											type="hidden" name="plName" value="${pp.plName}"> <input
											type="hidden" name="plClass" value="${pp.plClass}"> <input
											type="hidden" name="plName" value="${pp.plName}"><input
											type="hidden" name="time" value="${pp.time}"> <input
											type="hidden" name="plNo" value="${pp.plNo}">
										<tr>
											<td class="active"><input id="magic1" type="text"
												name="name" value="${pp.coName}"></td>
											<td id="magicTime" class="active">${pp.plNo}</td>
											<td id="magic2" class="active">創業個人</td>
											<td class="success">${pp.plName}</td>
											<%-- ${vs.count} --%>
											<td class="active"><input id="intscore${vs.count}"
												class="wone" name="score" type="text" value="${pp.score}">
											</td>
											<td class="warning"><input id="magicComment" type="text"
												name="comment" value="${pp.comment}" size="30"></td>
											<td class="warning">
												<button class="btn btn-default" type="submit">確認</button>
											</td>
										</tr>

									</Form>
								</c:forEach>
							</c:if>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>