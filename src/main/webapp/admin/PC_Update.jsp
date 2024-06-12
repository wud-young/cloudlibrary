<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- 图书借阅信息的模态窗口，默认是隐藏的 -->
<div class="modal fade" id="PCupdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 id="myModalLabel">设备信息</h3>
            </div>
            <div class="modal-body">
                <form id="borrowBook">
                    <table class="table table-bordered table-striped" width="800px">
                        <%--图书的id，不展示在页面--%>
                        <span><input type="hidden" id="bid" name="id"></span>
                        <tr>
                            <td>合同id</td>
                            <td><input class="form-control" readonly name="P_id" id="UP_id"></td>
                            <td>合同编号</td>
                            <td><input class="form-control"  name="P_number" id="UP_number"></td>
                        </tr>
                        <tr>
                            <td>合同设备编号</td>
                            <td>
                                <select readonly name="E_id" id="PCE_id">
                                    <option value="audi">奥迪</option>
                                    <option value="byd">比亚迪</option>
                                    <option value="geely">吉利</option>
                                    <option value="volvo">沃尔沃</option>
                                </select>
                            </td>
                            <td>合同签订价格</td>
                            <td><input class="form-control"  name="P_date" id="UP_date"></td>
                        </tr>
                            <tr>
                                <td>合同签订公司</td>
                                <td><input class="form-control"  name="P_price" id="UP_price"></td>
                                <td>合同签订人员</td>
                                <td><input class="form-control"  name="author" id="PCv"></td>
                            </tr>
                        <tr>
                            <td>设备折旧率</td>
                            <td><input class="form-control" name="pagination" id="bpagination"></td>
                            <td>合同签订日期<br/><span style="color: red">*</span></td>
                            <%--时间控件中的内容改变时，调用js文件中的cg()方法--%>
                            <td><input class="form-control" type="date" name="returnTime" id="time" onchange="cg()">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <%--点击保存按钮时，隐藏模态窗口并调用js文件中的borrow()方法--%>
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true" onclick="borrow()"
                        disabled="true" id="savemsg">保存
                </button>
                <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">关闭</button>
            </div>
        </div>
    </div>
</div>
