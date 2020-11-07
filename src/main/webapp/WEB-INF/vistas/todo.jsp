<%@ include file="header.jsp"%>
<%@ include file="navigation.jsp"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Add Tercero</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="terceros"  >
      <form:hidden path="id" />
      <fieldset class="form-group">
       <form:label path="nombre">Nombre</form:label>
       <form:input path="nombre" type="text" class="form-control"
        required="required" />
       <form:errors path="nombre" cssClass="text-warning" />
      </fieldset>

      <fieldset class="form-group">
       <form:label path="documento">Documento</form:label>
       <form:input path="documento" type="number" class="form-control"
        required="required" />
       <form:errors path="documento" cssClass="text-warning" />
      </fieldset>
      
       <fieldset class="form-group">
       <form:label path="direccion">Direccion</form:label>
       <form:input path="direccion" type="text" class="form-control"
        required="required" />
       <form:errors path="direccion" cssClass="text-warning" />
      </fieldset>

      <button type="submit" class="btn btn-success">Save</button>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="footer.jsp"%>