<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar-sprint1.jsp"%>
<%@page import="sprint1.db.Task" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head-sprint1.jsp"%>
</head>
<body>
    <div class="container">
        <div class="row mt-3">
            <div class="col-12">
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#addTask">
                    + Add Task
                </button>

                <!-- Modal -->
                <div class="modal fade" id="addTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <%@include file="addform_sprint1.jsp"%>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row mt-5">
            <div class="col-12">
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>TASK</th>
                        <th>DATE</th>
                        <th>DONE</th>
                        <th width="10%">DESCRIPTION</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("tasks");
                        if (tasks!=null){
                            for (Task task : tasks){

                    %>
                    <tr>
                        <td><%=task.getId()%></td>
                        <td><%=task.getName()%></td>
                        <td><%=task.getDate()%></td>
                        <td><%=task.getFlag()%></td>
                        <td><a class="btn btn-success btn-sm" href="/details-sprint1?task_id=<%=task.getId()%>">DETAILS</a></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
