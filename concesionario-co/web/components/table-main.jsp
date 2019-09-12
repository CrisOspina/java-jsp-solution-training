
<div class="row">
  <div class="col-xs-12">
    <div class="table-header">
      Resultados de vehículos registrados
    </div>

    <div>
      <table id="dynamic-table" class="table table-striped table-bordered table-hover">
        <thead>
          <tr>
            <th>Id Vehículo</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th class="hidden-480">Matricula</th>

            <th>
              <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
              Año
            </th>
            <th>
              Tipo Vehículo
            </th>
            <!-- <th class="hidden-480">Categoría</th> -->
            <th></th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>
              <a href="#">101</a>
            </td>
            <td class="hidden-480">Chevrolet</td>
            <td>Sail</td>

            <td>2017-2012-1331</td>
            <td><span class="label label-sm label-success">2017</span></td>
            <td>
              <span class="label label-sm label-success">Automovil</span>
            </td>

            <td>
              <div class="hidden-sm hidden-xs action-buttons">
                <a class="blue" href="#">
                  <i class="ace-icon fa fa-search-plus bigger-130"></i>
                </a>

                <a class="green" href="#">
                  <i class="ace-icon fa fa-pencil bigger-130"></i>
                </a>

                <a class="red" href="#">
                  <i class="ace-icon fa fa-trash-o bigger-130"></i>
                </a>
              </div>

              <div class="hidden-md hidden-lg">
                <div class="inline pos-rel">
                  <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown" data-position="auto">
                    <i class="ace-icon fa fa-caret-down icon-only bigger-120"></i>
                  </button>

                  <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                    <li>
                      <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
                        <span class="blue">
                          <i class="ace-icon fa fa-search-plus bigger-120"></i>
                        </span>
                      </a>
                    </li>

                    <li>
                      <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
                        <span class="green">
                          <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                        </span>
                      </a>
                    </li>

                    <li>
                      <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
                        <span class="red">
                          <i class="ace-icon fa fa-trash-o bigger-120"></i>
                        </span>
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>

    <div class="modal-footer no-margin-top">
      <button class="btn btn-sm btn-danger pull-left" data-dismiss="modal">
        <i class="ace-icon fa fa-times"></i>
        Close
      </button>

      <ul class="pagination pull-right no-margin">
        <li class="prev disabled">
          <a href="#">
            <i class="ace-icon fa fa-angle-double-left"></i>
          </a>
        </li>

        <li class="active">
          <a href="#">1</a>
        </li>

        <li>
          <a href="#">2</a>
        </li>

        <li>
          <a href="#">3</a>
        </li>

        <li class="next">
          <a href="#">
            <i class="ace-icon fa fa-angle-double-right"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->