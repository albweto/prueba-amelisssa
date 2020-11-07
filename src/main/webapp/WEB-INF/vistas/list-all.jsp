<%@ include file="header.jsp"%>
<%@ include file="navigation.jsp"%>

<div class="container">
 <div>
  <a type="button" class="btn btn-primary btn-md" href="/add">Add Tercero</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>List of Terceros</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
      <th width="30%">nombre</th>
      <th width="20%">documento</th>
      <th width="20%">direccion</th>
      <th width="20%"></th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${terceros}" var="terceros">
      <tr>
       <td>${terceros.nombre}</td>
       <td>${terceros.documento}</td>
       <td>${terceros.direccion}</td>
       <td><a type="button" class="btn btn-success"
        href="/update-todo?id=${terceros.id}">Update</a>
       <a type="button" class="btn btn-warning"
        href="/delete-todo?id=${terceros.id}">Delete</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="footer.jsp"%>