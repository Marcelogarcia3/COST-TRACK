/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agregar extends JFrame {
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JTextField txtApellido;
    private JTextField txtNombre;
    private JTextField txtRut;
    private JTextField txtRol;
    private JTextField intTelefono;
    private JTextField intSalario;
    private JComboBox<String> txtEstado;
    private JButton btnGuardar;
    private JButton btnCancelar;
    private JLabel fondo;

    public Agregar() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        txtApellido = new JTextField();
        txtNombre = new JTextField();
        txtRut = new JTextField();
        txtRol = new JTextField();
        intTelefono = new JTextField();
        intSalario = new JTextField();
        txtEstado = new JComboBox<>();
        btnGuardar = new JButton();
        btnCancelar = new JButton();
        fondo = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel1.setLayout(null);

        jLabel1.setFont(new Font("MV Boli", Font.BOLD, 24));
        jLabel1.setText("Agregar");
        jLabel1.setBounds(148, 11, 200, 30);
        jPanel1.add(jLabel1);

        jLabel2.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel2.setText("Nombre");
        jLabel2.setBounds(58, 58, 100, 30);
        jPanel1.add(jLabel2);
        txtNombre.setBounds(167, 58, 200, 30);
        jPanel1.add(txtNombre);

        jLabel3.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel3.setText("Apellido");
        jLabel3.setBounds(58, 98, 100, 30);
        jPanel1.add(jLabel3);
        txtApellido.setBounds(167, 98, 200, 30);
        jPanel1.add(txtApellido);

        jLabel4.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel4.setText("Telefono");
        jLabel4.setBounds(58, 138, 100, 30);
        jPanel1.add(jLabel4);
        intTelefono.setBounds(167, 138, 200, 30);
        jPanel1.add(intTelefono);

        jLabel5.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel5.setText("Rut");
        jLabel5.setBounds(58, 178, 100, 30);
        jPanel1.add(jLabel5);
        txtRut.setBounds(167, 178, 200, 30);
        jPanel1.add(txtRut);

        jLabel6.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel6.setText("Salario");
        jLabel6.setBounds(58, 218, 100, 30);
        jPanel1.add(jLabel6);
        intSalario.setBounds(167, 218, 200, 30);
        jPanel1.add(intSalario);

        jLabel7.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel7.setText("Estado");
        jLabel7.setBounds(58, 258, 100, 30);
        jPanel1.add(jLabel7);
        txtEstado.setModel(new DefaultComboBoxModel<>(new String[]{"Activo", "Inactivo"}));
        txtEstado.setBounds(167, 258, 200, 30);
        jPanel1.add(txtEstado);

        jLabel8.setFont(new Font("MV Boli", Font.BOLD, 18));
        jLabel8.setText("Rol");
        jLabel8.setBounds(58, 298, 100, 30);
        jPanel1.add(jLabel8);
        txtRol.setBounds(167, 298, 200, 30);
        jPanel1.add(txtRol);

        btnGuardar.setFont(new Font("MV Boli", Font.BOLD, 14));
        btnGuardar.setText("Guardar");
        btnGuardar.setBounds(58, 338, 100, 42);
        jPanel1.add(btnGuardar);

        btnCancelar.setFont(new Font("MV Boli", Font.BOLD, 14));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBounds(263, 338, 100, 42);
        jPanel1.add(btnCancelar);

        fondo.setIcon(new ImageIcon("ruta/de/la/imagen.jpg"));
        fondo.setBounds(0, 0, 450, 400);
        jPanel1.add(fondo);

        getContentPane().add(jPanel1);

        pack();

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Agregar().setVisible(true);
        });
    }
}
