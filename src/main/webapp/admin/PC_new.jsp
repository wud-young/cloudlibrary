<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>合同总览</title>
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
    <h3 class="box-title">合同总览</h3>
    <table id="actList" class="table table-bordered table-striped table-hover dataTable text-center">
        <tbody>
            <tr>

                <td class="text-center">

                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==2}">
                        <button type="button" class="btn bg-olive btn-xs" data-toggle="modal" data-target="#PCinsertModal"
                                > 增加
                        </button>
                    </c:if>
                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==1}">
                        <button type="button" class="btn bg-olive btn-xs" disabled="true">只读</button>
                    </c:if>
                </td>

            </tr>
        </tbody>
    </table>
</div>
<!--数据展示头部-->
<!--数据展示内容区-->
<div class="box-body">
    <!-- 数据表格 -->
    <table id="dataList" class="table table-bordered table-striped table-hover dataTable text-center">
        <thead>
        <tr>
            <th class="sorting">合同id</th>
            <th class="sorting_asc">合同编号</th>
            <th class="sorting">合同设备编号</th>
            <th class="sorting">合同签订日期</th>
            <th class="sorting">合同签订价格</th>
            <th class="sorting">设备折旧率</th>
            <th class="sorting">合同签订公司</th>
            <th class="sorting">合同签订人员</th>-

           <%-- <th class="sorting">操作</th>--%>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageResult.rows}" var="PurchaseContract">

            <tr>

                <td>${PurchaseContract.getP_id()}</td>
                <td>${PurchaseContract.getP_number()}</td>
                <td>${PurchaseContract.getP_Equipment().getE_id()}</td>
                <td>${PurchaseContract.getP_date()}</td>
                <td>${PurchaseContract.getP_price()}</td>
                <td>${PurchaseContract.getP_sale()}</td>
                <td>${PurchaseContract.getP_Supplier().getS_name()}</td>
                <td>${PurchaseContract.getP_name()}</td>

                <td class="text-center">
                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==2}">
                        <button type="button" class="btn bg-olive btn-xs"
                                onclick="Delete(${PurchaseContract.getP_id()},'PC')"> 删除
                        </button>
                    </c:if>
                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==1}">
                        <button type="button" class="btn bg-olive btn-xs" disabled="true">只读</button>
                    </c:if>
                </td>
                <td class="text-center">

                    <c:if test="${USER_SESSION.getU_Permissions().getP_id()==2}">
                        <button type="button" class="btn bg-olive btn-xs" data-toggle="modal" data-target="#PCupdateModal"
                                onclick="findPCById(${PurchaseContract.getP_id()},'up')"> 更改
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
<jsp:include page="/admin/PC_insert.jsp"></jsp:include>
<jsp:include page="/admin/PC_Update.jsp"></jsp:include>
<div class="modal fade" id="addOrEditModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 id="myModalLabel">设备信息</h3>
            </div>
            <div class="modal-body">
                <form id="addOrEditBook">
                    <span><input type="hidden" id="ebid" name="U_id"></span>
                    <table id="addOrEditTab" class="table table-bordered table-striped" width="800px">
                        <%--图书的id,不展示在页面--%>
                        <tr>
                            <td>设备名称</td>
                            <td><input class="form-control" placeholder="图书名称" name="U_name" id="ebname"></td>
                            <td>标准ISBN</td>
                            <td><input class="form-control" placeholder="标准ISBN" name="isbn" id="ebisbn"></td>
                        </tr>
                        <tr>
                            <td>出版社</td>
                            <td><input class="form-control" placeholder="出版社" name="press" id="ebpress"></td>
                            <td>作者</td>
                            <td><input class="form-control" placeholder="作者" name="author" id="ebauthor"></td>
                        </tr>
                        <tr>
                            <td>书籍页数</td>
                            <td><input class="form-control" placeholder="书籍页数" name="pagination" id="ebpagination"></td>
                            <td>书籍价格<br/></td>
                            <td><input class="form-control" placeholder="书籍价格" name="price" id="ebprice"></td>
                        </tr>
                        <tr>
                            <td>上架状态</td>
                            <td>
                                <select class="form-control" id="ebstatus" name="status" >
                                    <option value="0">上架</option>
                                    <option value="3">下架</option>
                                </select>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true" id="aoe" disabled onclick="addOrEdit()">保存
                </button>
                <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">关闭</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
