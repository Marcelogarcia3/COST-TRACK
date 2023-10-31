package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlador_tabla implements ActionListener {

    private Agregar agregar;
    private TablaPrincipal tabla;

    Empleado[] empleados = new Empleado[0];

    public controlador_tabla(Agregar agregar, TablaPrincipal tabla) {
// tabla donde se ingresa al empleado 
        this.agregar = agregar;
        this.tabla = tabla;
        this.tabla.btnAgregar.addActionListener(this);
        this.tabla.btnActualizar.addActionListener(this);
        this.tabla.btnEliminar.addActionListener(this);
        this.tabla.btnSalir.addActionListener(this);
        this.agregar.btnCancelar.addActionListener(this);
        this.agregar.btnGuardar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent a) { //se manejan todas la acciones del componente

        if (a.getSource() == tabla.btnAgregar) {
            agregar.setLocationRelativeTo(null); //se centraliza la tabla
            agregar.setVisible(true); //se muestra 
        }

        if (a.getSource() == agregar.btnGuardar) {

            if (agregar.txtNombre.getText().isEmpty() || agregar.txtApellido.getText().isEmpty() || agregar.txtRut.getText().isEmpty() || agregar.txtRol.getText().isEmpty() || agregar.intSalario.getText().isEmpty() || agregar.intTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese todos los campos"); //ventana emergente donde no se ingresan los datos correctamente en la ventana agregar
            } else {
                Empleado empleadoTemp = new Empleado(agregar.txtNombre.getText(), agregar.txtApellido.getText(), agregar.txtRut.getText(),
                        Integer.parseInt(agregar.intTelefono.getText()), agregar.txtRol.getText(), Integer.parseInt(agregar.intSalario.getText()),
                        (String) agregar.txtEstado.getSelectedItem());
                empleados = agregarEmpleado(empleados, empleadoTemp);
                agregar.setVisible(false); //se oculta la ventana ya que se agrego correctamente un empleado
                vaciarAgregar();
                DefaultTableModel model = (DefaultTableModel) tabla.getTablaTrabajadores().getModel();
                model.addRow(empleadoTemp.getDatos(empleadoTemp));
                System.out.println("Se agregó un empleado");
            }
        }

        if (a.getSource() == agregar.btnCancelar) {
            agregar.setVisible(false);  //se oculta la ventana si se presiona el boton cancelar
            vaciarAgregar(); //se eliminan los datos que se llenaron
        }

        if (a.getSource() == tabla.btnSalir) { //al oprimir el boton salir , se redirige a la ventana inicial login
            tabla.dispose();
            Login login = new Login();
            controlador_login cl = new controlador_login(login);
        }
        /*

        if (a.getSource() == tabla.btnEliminar) {
            DefaultTableModel model = (DefaultTableModel) tabla.getTablaTrabajadores().getModel();
            model.removeRow(model.getRowCount() - 1);

        }
         */

    }

    public Empleado setData(String nombre, String apellido, String rut, int telefono, String rol, int salario, String estado) {
        Empleado empleado = new Empleado(nombre, apellido, rut, telefono, rol, salario, estado);
        return empleado;
    }

    public void vaciarAgregar() {
        agregar.getTxtNombre().setText("");
        agregar.getTxtApellido().setText("");
        agregar.getTxtRut().setText("");
        agregar.getTxtRol().setText("");
        agregar.getIntSalario().setText("");
        agregar.getIntTelefono().setText("");
    }

    public Empleado[] agregarEmpleado(Empleado[] empleados, Empleado empleado) { 
        int length = (empleados.length + 1);
        Empleado[] empleadosTemp = new Empleado[length];
        System.arraycopy(empleados, 0, empleadosTemp, 0, empleados.length);
        empleadosTemp[length - 1] = empleado;
        empleados = empleadosTemp;
        return empleados;
    }
}
