<form action="/add-task" method="post">
  <div class="row mt-3">
    <div class="col-12">
      <label>NAME : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" placeholder="Insert Name" class="form-control" name="task_name">
    </div>
  </div>
  <div class="row mt-3">
    <div class="col-12">
      <label>DESCRIPTION : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <textarea placeholder="Insert Description" class="form-control" name="task_details" rows="5"></textarea>
    </div>
  </div>
  <div class="row mt-3">
    <div class="col-12">
      <label>DATE : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <textarea placeholder="mm/dd/yyyy" class="form-control" name="task_date" rows="5"></textarea>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <button class="btn btn-success">ADD TASK</button>
    </div>
  </div>
</form>