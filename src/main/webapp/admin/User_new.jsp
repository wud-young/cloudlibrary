<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>设备总览</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pagination.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/pagination.js"></script>
    <script src="${pageContext.request.contextPath}/js/my.js"></script>
</head>
<body class="hold-transition skin-red sidebar-mini">
<!--数据展示头部-->
<div class="box-header with-border">
    <h3 class="box-title">人员总览</h3>
</div>
<!--数据展示头部-->
<!--数据展示内容区-->
<div class="box-body">
    <!-- 数据表格 -->
    <table id="dataList" class="table table-bordered table-striped table-hover dataTable text-center">
        <thead>
        <tr>
            <th class="sorting">id</th>
            <th class="sorting_asc">姓名</th>
            <th class="sorting">邮箱</th>
            <th class="sorting">管理权限</th>
           <%-- <th class="sorting">操作</th>--%>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageResult.rows}" var="User">

            <tr>

                <td>${User.getU_id()}</td>
                <td> ${User.getU_name()}</td>
                <td>${User.getU_email()}</td>
                <td>${User.getU_Permissions().getaPermissions()}</td>
                <td class="text-center">
                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==2}">
                        <button type="button" class="btn bg-olive btn-xs" data-toggle="modal" data-target="#borrowModal"
                                onclick="DeleteUser(${User.getU_id()})"> 删除
                        </button>
                    </c:if>
                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==1}">
                        <button type="button" class="btn bg-olive btn-xs" disabled="true">只读</button>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <!-- 数据表格 /-->
</div>
<!-- 数据展示内容区/ -->
<%--引入存放模态窗口的页面--%>
<jsp:include page="/admin/book_modal.jsp"></jsp:include>
</body>
</html>
