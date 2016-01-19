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
/*    .panel-body1 {
        display: none;
    }
    
    .panel-body2 {
        display: none;
    }*/
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
#magic1{
	width:100px;
}
#magic2{
	width:140px;
}
#magicComment{
	width:150px;
}
#magicTime{
	width:70px;
}
</style>
<script>
	// $(function() {
	//     $(".panel-title1").click(function() {
	//         $(".panel-body1").slideToggle("slow");
	//     });
	//     $(".panel-title2").click(function() {
	//         $(".panel-body2").slideToggle("slow");
	//     });
	// })
	// $("#magicbutton").click(function(){
	//     alert("");
	// $("input[name='c_name']").val("張君雅");
	// $("input[name='c_addr']").val("台中市");
	// $("input[name='c_pay']").val("35000");
	$(function() {

		// var $username = $('#magic').$('#mname').val();
		// console.log($username);
		// $("#magicbutton").click(function() {
		//     // form1.name.value("123");
		//     // console.log(form1.name.value());
		//     alert($username);
		// });
		// console.log($('#magic1'));
		var $pattern = /^\d+$/;
//		var x = "newQty" + index;
//		var newQty = document.getElementById(x).value;
//		var aa=0;
//		for(aa=0;aa<= $('#magicComment')${vs.count} ; aa++){
//		console.log(aa);
//		}
//		var $magicComment = $('#magicComment').val();
//		console.log($magicComment);
		
		
//		if($magicComment == null){
//			$('td').css('background', 'gray');
//			} 
		
		
		
		
		$("form").submit(function() {
			switch (this.id) {
			//gg的神奇小按鈕
/* 			case "magic":
				var $mname = $('#mname').val();
				console.log($mname);
				$('#magic1').val($mname);
				$('#magic2').val($mname);
				$('#magic3').val($mname); */
				//return false;
//			case "search":
//				var $int = $('#int').val();
				// var $pattern = /^[1-9]$|^[1-9][0-9]$|^56[0-3]$/;
				// $int.trim().length == 0 || 
//				if (!$pattern.test($int)) {
//					alert("請檢察格式是否正確");
//					return false;
//			} else {
//					return true;
//				}
			case "updateForm":
				//0119
				return true;
				
//				console.log($('#intscore'));
//				if (!$pattern.test($int)) {
					
//					alert("請檢察分數格式是否正確");
//					return false;
//			} else {
				//第一種
				//alert("輸入完成!!轉回搜尋頁面");
				//第二種
//				alert("輸入完成!!轉回原先頁面");
//			}
//					return true;
//			case "getall":
				//return true;
			
				// var $lg_password = $('#login_password').val();
				//  var $Check_ver = $('#Check_ver').val();
				//  if ($lg_username == "ERROR") {
				//  msgChange($('#div-login-msg'),
				//  $('#icon-login-msg'),
				//  $('#text-login-msg'), "error",
				//  "glyphicon-remove", "Login error");
				//  } else {
				//  msgChange($('#div-login-msg'),
				//  $('#icon-login-msg'),
				//  $('#text-login-msg'), "success",
				//  "glyphicon-ok", "Login OK");
				//  }
				//  if ($Check_ver !== "java001Class") {
				//  msgChange($('#div-login-msg'),
				//  $('#icon-login-msg'),
				//  $('#text-login-msg'), "error",
				//  "glyphicon-remove", "驗證錯誤");

				//  return false;
				//  } else {
				//  msgChange($('#div-login-msg'),
				//  $('#icon-login-msg'),
				//  $('#text-login-msg'), "success",
				//  "glyphicon-ok", "驗證中....");
				//  return true;
				//  }
				// return false;
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
	<form id="login" class="form-inline autoname" action="queryCustomizedPlan"
		method="post">
		<div class="form-group">
			<label for="exampleInputName2">委員姓名</label> <input id=""
				type="text" class="form-control" placeholder="委員姓名"
				name="coname"> 
			<label for="exampleInputName2">日期</label> <input
				id="" type="text" class="form-control" placeholder="日期"
				name="cotime">
		</div>
		<button type="submit" class="btn btn-default" id="magicbutton">填寫完請點選我</button>
 	</form>
<!--	<form id="search" class="form-inline autoname" action="queryPlan"
		method="post">
		<div class="form-group">
			<label for="exampleInputName2">搜索編號</label> <input id="int"
				type="text" class="form-control" placeholder="例如：1~536的數字"
				name="word">
		</div>
		<button type="submit" class="btn btn-default" id="magicbutton">編號日期填寫完請點選我</button>
	</form> -->
	
	
<!-- 	<form id="getall" class="form-inline autoname" action="queryall"
		method="post">
		<button type="submit" class="btn btn-default" id="magicbutton">第一場</button>
	</form> -->
	<!-- gg的神奇小按鈕 -->
	<!-- 	<form id="magic" class="form-inline autoname">
		<div class="form-group">
			<label for="exampleInputName2">委員姓名</label> <input id="mname"
				type="text" class="form-control" placeholder="例如：XXX" value="">
		</div>
		<button type="submit" id="magicbutton" class="btn btn-default">輸入姓名後請點選我</button>
	</form> -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 text-center formTim">
				<div class="panel panel-default">
					<div class="panel-body1">
						<table class="table table-striped">
							<tr>
								<td class="active">委員名字</td>
								<td class="active">日期</td>
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
											type="hidden" name="plClass" value="${pp.plClass}"> <input
											type="hidden" name="plName" value="${pp.plName}"><input
											type="hidden" name="time" value="${pp.time}">
										<tr>
											<td class="active"><input id="magic1" type="text"
												name="name" value="${pp.coName}"></td>
											<td id="magicTime" class="active">${pp.time}</td>
											<td id="magic2" class="active">${pp.plClass}</td>
											<td class="success">${pp.plName}</td>
											<%-- ${vs.count} --%>
											<td class="active"><input id="intscore${vs.count}"
												class="wone" name="score" type="text" value="${pp.score}">
											</td>
											<td class="warning"><input id="magicComment" type="text" name="comment"
												value="${pp.comment}" size="30"></td>
											<td class="warning">
												<button class="btn btn-default" type="submit">確認</button>
											</td>
										</tr>

									</Form>
								</c:forEach>
								<%-- 
								<div class="col-md-4 portfolio-item ttt" style="color: black">
									<span class='zoom' id='ex1'> <img
										class="img-responsive tti" width="180" height='320'
										src="${pageContext.servletContext.contextPath}/getImage?id=${mb.productNo}"
										alt="">
									</span>
									<h3>${mb.productName}</h3>
									<p>${mb.productContent}</p>
									<h4>
										價格：
										<fmt:formatNumber value="${mb.productPrice}"
											pattern="#,###,###" />
										元
									</h4>
									<p>庫存數量：${mb.productStock}</p>
 --%>
								<%-- 									<FORM id="hiddencart" action="<c:url value='BuyBook.do' />"
										method="POST">
										<select name='qty'>
											<c:forEach var='x' begin='1' end='${mb.productStock}'>
												<option value='${x}'>${x}</option>

											</c:forEach>

										</select>
										<!-- </select> -->
										<!-- 這些隱藏欄位都會送到後端 -->
										<Input type='hidden' name='productNo' value='${mb.productNo}'>

										<Input type='hidden' name='productName'
											value='${mb.productName}'> <Input type='hidden'
											name='productPrice' value='${mb.productPrice}'> <Input
											type='hidden' name='productContent'
											value='${mb.productContent}'> <Input type='hidden'
											name='productStock' value='${mb.productStock}'> <Input
											type='hidden' name='pageNo' value='${param.pageNo}'>

										</p>
										<button type="submit" class="btn btn-danger">加入購物車</button>

										<!-- <Input type='submit' value='加入購物車'> -->
									</FORM> --%>

							</c:if>
						</table>

					</div>



					<!-- <table class="table table-striped">
							<tr>
								<td class="active">委員名字</td>
								<td class="active">組別</td>
								<td class="success">計畫名稱</td>
								<td class="active">分數</td>
								<td class="warning">委員意見</td>
								<td class="warning">填完請確認</td>
							</tr>
							<tr>
								<td class="active"><input id="magic1" type="text" value=" ">
								</td>
								<td class="active">新創事業組</td>
								<td class="success">書花公路-一條將文藝資訊載往東邊的道路</td>
								<td class="active"><input class="wone" type="text">
								</td>
								<td class="warning"><textarea class="form-control" rows="5"
										id="comment"></textarea></td>
								<td class="warning">
									<button class="btn btn-default" type="submit">確認</button>
								</td>
							</tr>
							<tr>
								<td class="active"><input id="magic2" type="text" value=" ">
								</td>
								<td class="active">新創事業組</td>
								<td class="success">書花公路-一條將文藝資訊載往東邊的道路</td>
								<td class="active"><input class="wone" type="text">
								</td>
								<td class="warning"><textarea class="form-control" rows="5"
										id="comment"></textarea></td>
								<td class="warning">
									<button class="btn btn-default" type="submit">確認</button>
								</td>
							</tr>
							<tr>
								<td class="active"><input id="magic3" type="text" value=" ">
								</td>
								<td class="active">創業圓夢組個人組</td>
								<td class="success">書花公路-一條將文藝資訊載往東邊的道路</td>
								<td class="active"><input class="wone" type="text">
									<div></td>
								<td class="warning"><textarea class="form-control" rows="5"
										id="comment"></textarea></td>
								<td class="warning">
									<button class="btn btn-default" type="submit">確認</button>
								</td>
							</tr>
						</table> -->
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>