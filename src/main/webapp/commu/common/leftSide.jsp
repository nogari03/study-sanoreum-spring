<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<jsp:include page="/common/header.jsp" flush="false" />
    <style>
		.card {
	margin: 10px auto;
}

#space {
	width: 50px;
}

.list-group-item.active {
	background-color: green;
	border-color: green;
}

/*  #list-tab {
	width: 100px;
	position: fixed;
}  */

#leftSide {
	position: fixed;
} 

 #rightSide {
width: 100px;
	position: fixed;
} 

	</style>
				<div class="container mt-4">
		<div class="row pt-5">
			<div class="col-md-3"  >
			<div id="leftSide">
				<div class="card col-sm-12" style="border: 2px solid green; width: 15rem; padding:0;">
					<img src="http://localhost:8080/resources/img/${m3.STOREDFILENAME}" style="width:100%; height:200px;"
						class="card-img-top" alt="산모임 기본 이미지">
					<div class="card-body">
						<h5 class="card-title">${m1.NAME}</h5>
						<small>멤버</small><small>${m1.STAFFCURRENT}</small> <br> <br>
						<p class="card-text">${m1.DETAIL}</p>
						<c:choose>
                    <c:when test="${0 eq m2.USERTYPE}">
						<a href="" style="color: gray;">관리하기></a> <br>
					</c:when>
                      <c:when test="${1 eq m2.USERTYPE}"><a href=""
							style="color: gray;">탈퇴하기></a> <br> <br>
						</c:when>
						</c:choose>
					</div>
				</div>
			<center>
				 <c:choose>
                        <c:when test="${0 eq m2.USERTYPE}"><button class="selectWaitingList btn btn-success col-11" data-toggle="modal" data-target="#listModal">요청 리스트보기</button></c:when>
                        <c:when test="${1 eq m2.USERSTATUS}"><button class="withdrawGroupBtn btn btn-btn-successcol-11" data-toggle="modal" data-target="#cancelModal">요청 취소하기</button></c:when>
                        <c:when test="${empty m2.USERSTATUS}"><button class="joinButton btn btn-outline-success col-11" data-toggle="modal" data-target="#joinModal">참여 신청하기</button></c:when>
                    </c:choose>
				</center>
				</div>
				</div>
				<div>
			</div>
			
			<!-- MODAL -->
			    <div class="modal fade" id="listModal">
        <div class="modal-dialog" id="modal1">
            <div class="modal-content">
                <!-- header -->
                <div class="modal-header">
                    <h4 class="modal-title">참여 리스트</h4>
                    <!-- 닫기(x) 버튼 -->
                    <button type="button" class="close" data-dismiss="modal" onclick="window.location.reload();">×</button>
                    <!-- header title -->
                </div>
                <!-- body -->
                <div class="modal-body">
                    <ul id="waitingList" class="pl-3 pr-3" style="font-size: 18px">
                    </ul>
                </div>
                <!-- Footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" onclick="window.location.reload();">닫기</button>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="joinModal">
        <div class="modal-dialog" id="modal2">
            <div class="modal-content">
                <!-- header -->
                <div class="modal-header">
                    <h4 class="modal-title">${group.NAME} 참여하기</h4>
                    <!-- 닫기(x) 버튼 -->
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <!-- header title -->
                </div>
                <!-- body -->
                <div class="modal-body">
                    <textarea id="userComment" class="form-control col-xs-12" placeholder="요청 메시지를 입력해주세요"></textarea>
                </div>
                <!-- Footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                    <button type="button" class="joinGroupBtn btn btn-success">신청</button>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="cancelModal">
        <div class="modal-dialog" id="modal3">
            <div class="modal-content">
                <!-- header -->
                <div class="modal-header">
                    <h4 class="modal-title">${group.NAME} 참여 신청 취소하기</h4>
                    <!-- 닫기(x) 버튼 -->
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <!-- header title -->
                </div>
                <!-- body -->
                <div class="modal-body">
                    정말로 취소하시겠습니까?
                </div>
                <!-- Footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                    <button type="button" class="cancelModalBtn btn btn-success">확인</button>
                </div>
            </div>
        </div>
    </div>
			
			
			