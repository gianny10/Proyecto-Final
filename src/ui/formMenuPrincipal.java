package ui;

import code.Cliente;
import code.DetalleVenta;
import code.Venta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sql.C_Cliente;
import sql.C_Ventas;
import sql.Conexion;

public class formMenuPrincipal extends javax.swing.JFrame {

    // Variables venta
    DefaultTableModel model = new DefaultTableModel();
    String codigoClienteVenta = "";
    String codigoProductoVenta = "";
    String nombreProductoVenta = "";
    double precioProductoVenta = 0;
    int stockProductoBBDDVenta = 0;
    int nProductosVenta = 1;
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();

    public formMenuPrincipal() {
        initComponents();
        abrirPanel(null);

        // Ventana Ventas
        iniciarTablaVentas();
        cargarProductosParaVenta();

        // Ventana Productos
        cargarTablaProductos();

        // Ventana Cliente
        cargarTablaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        Ventanas = new javax.swing.JPanel();
        jPanelVentanaProductos = new javax.swing.JPanel();
        jScrollPaneProductos = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnActualizarStock = new javax.swing.JButton();
        btnCategoriaProductos = new javax.swing.JButton();
        btnNuevaCategoriaProducto = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelVentanaVender = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbxBuscarProductoVenta = new javax.swing.JComboBox<>();
        txtCantidadVender = new javax.swing.JTextField();
        txtClienteDNI = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        txtClienteDatosVenta = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        btnCancelarVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        jPanelVentanaClientes = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollClientes = new javax.swing.JScrollPane();
        tablaClientesVentanaCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFieldCodigoCliente = new javax.swing.JTextField();
        btnBuscarClienteVentanaCliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtNombreRegistroCliente = new javax.swing.JTextField();
        txtApellidoRegistroCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDNIRegistroCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTelefonoRegistroCliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDireccionRegistroCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSexoRegistroCliente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEdadRegistroCliente = new javax.swing.JTextField();
        btnAgregarClienteVentanaCliente = new javax.swing.JButton();
        btnBorrarBusquedaVentanaCliente = new javax.swing.JButton();
        jPanelVentanaUsuarios = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtCodigo5 = new javax.swing.JTextField();
        btnEliminarUsuario = new javax.swing.JButton();
        btnActualizarInformacion = new javax.swing.JButton();
        txtCodigo1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtCodigo3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnActualizarInformacion2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanelVentanaHistorial = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbxBusquedaHistorial = new javax.swing.JComboBox<>();
        txtBusquedaHistorial = new javax.swing.JTextField();
        JPanelProveedor = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        btnRegistrarIngreso = new javax.swing.JButton();
        btnVerProveedores = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botones.setBackground(new java.awt.Color(156, 105, 57));
        Botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vega");

        btnVender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnVender.setText("Vender");
        btnVender.setPreferredSize(new java.awt.Dimension(180, 40));
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.setPreferredSize(new java.awt.Dimension(180, 40));
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setPreferredSize(new java.awt.Dimension(180, 40));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setPreferredSize(new java.awt.Dimension(180, 40));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setPreferredSize(new java.awt.Dimension(180, 40));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setPreferredSize(new java.awt.Dimension(180, 40));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(180, 40));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(39, 39, 39))
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ventanas.setBackground(new java.awt.Color(34, 33, 33));

        jPanelVentanaProductos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentanaProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelVentanaProductos.setEnabled(false);

        jTableProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "PRECIO", "STOCK", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneProductos.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnActualizarStock.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnActualizarStock.setText("Actualizar");
        btnActualizarStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarStockActionPerformed(evt);
            }
        });

        btnCategoriaProductos.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCategoriaProductos.setText("Categorias");
        btnCategoriaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaProductosActionPerformed(evt);
            }
        });

        btnNuevaCategoriaProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnNuevaCategoriaProducto.setText("Nueva Categoria");
        btnNuevaCategoriaProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaCategoriaProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaProductoActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Productos:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setText("0");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total:");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.setText("0");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Categorias:");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField3.setText("0");

        btnRegistrarProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnRegistrarProducto.setText("Registrar");
        btnRegistrarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnNuevaCategoriaProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoriaProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Productos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaProductosLayout = new javax.swing.GroupLayout(jPanelVentanaProductos);
        jPanelVentanaProductos.setLayout(jPanelVentanaProductosLayout);
        jPanelVentanaProductosLayout.setHorizontalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneProductos)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVentanaProductosLayout.setVerticalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setText("Facturación");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(501, 501, 501))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Boleta:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Cantidad:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Producto:");

        cbxBuscarProductoVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxBuscarProductoVenta.setForeground(new java.awt.Color(255, 255, 255));
        cbxBuscarProductoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto:", "Item 2", "Item 3", "Item 4" }));
        cbxBuscarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProductoVentaActionPerformed(evt);
            }
        });

        txtCantidadVender.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtCantidadVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVenderActionPerformed(evt);
            }
        });

        txtClienteDNI.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtClienteDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteDNIActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cliente:");

        txtBoleta.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        btnAñadirProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        txtClienteDatosVenta.setEditable(false);
        txtClienteDatosVenta.setBackground(new java.awt.Color(153, 153, 153));
        txtClienteDatosVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtClienteDatosVenta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxBuscarProductoVenta, 0, 210, Short.MAX_VALUE)
                    .addComponent(txtClienteDatosVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadVender))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirProducto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtClienteDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteDatosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBuscarProductoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCantidadVender)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo", "Nombre", "Cantidad", "Total", "Editar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVenta.getTableHeader().setReorderingAllowed(false);
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setResizable(false);
            tablaVenta.getColumnModel().getColumn(1).setResizable(false);
            tablaVenta.getColumnModel().getColumn(2).setResizable(false);
            tablaVenta.getColumnModel().getColumn(3).setResizable(false);
            tablaVenta.getColumnModel().getColumn(4).setResizable(false);
            tablaVenta.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Subtotal:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("IGV:");

        txtIGV.setEditable(false);
        txtIGV.setBackground(new java.awt.Color(153, 153, 153));
        txtIGV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIGV)
                            .addComponent(txtTotal))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIGV)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCancelarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaVenderLayout = new javax.swing.GroupLayout(jPanelVentanaVender);
        jPanelVentanaVender.setLayout(jPanelVentanaVenderLayout);
        jPanelVentanaVenderLayout.setHorizontalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelVentanaVenderLayout.setVerticalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanelVentanaClientes.setBackground(new java.awt.Color(102, 102, 102));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Clientes");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaClientesVentanaCliente.setBackground(new java.awt.Color(204, 204, 204));
        tablaClientesVentanaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "DNI", "TELEFONO", "DIRECCION", "SEXO", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollClientes.setViewportView(tablaClientesVentanaCliente);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollClientes)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(94, 94, 94));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Código");

        btnBuscarClienteVentanaCliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBuscarClienteVentanaCliente.setText("Buscar");
        btnBuscarClienteVentanaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteVentanaClienteActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nombre");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Apellido");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("DNI");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Telefono");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Direccion");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Sexo");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Edad");

        btnAgregarClienteVentanaCliente.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregarClienteVentanaCliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAgregarClienteVentanaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarClienteVentanaCliente.setText("Agregar");
        btnAgregarClienteVentanaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteVentanaClienteActionPerformed(evt);
            }
        });

        btnBorrarBusquedaVentanaCliente.setBackground(new java.awt.Color(255, 51, 51));
        btnBorrarBusquedaVentanaCliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBorrarBusquedaVentanaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarBusquedaVentanaCliente.setText("Cancelar");
        btnBorrarBusquedaVentanaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarBusquedaVentanaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFieldCodigoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarClienteVentanaCliente)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnAgregarClienteVentanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrarBusquedaVentanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtTelefonoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtDireccionRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtSexoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtEdadRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel17))
                                            .addGap(13, 13, 13)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDNIRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApellidoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNombreRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteVentanaCliente))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNIRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefonoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdadRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarClienteVentanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarBusquedaVentanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaClientesLayout = new javax.swing.GroupLayout(jPanelVentanaClientes);
        jPanelVentanaClientes.setLayout(jPanelVentanaClientesLayout);
        jPanelVentanaClientesLayout.setHorizontalGroup(
            jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaClientesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVentanaClientesLayout.setVerticalGroup(
            jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaClientesLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentanaClientesLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 232, Short.MAX_VALUE))
                    .addGroup(jPanelVentanaClientesLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Gestionar Usuarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel24)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        tableUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Usuario", "Contraseña", "Nombre", "Apellido", "Telefono", "Edad", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableUsuarios);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        txtCodigo5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnEliminarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnEliminarUsuario.setText("Eliminar");

        btnActualizarInformacion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnActualizarInformacion.setText("Actualizar");

        txtCodigo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel25.setText("Usuario:");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel26.setText("Password:");

        txtCodigo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel27.setText("Teléfono:");

        txtCodigo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel28.setText("Código:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtCodigo2))
                .addGap(103, 103, 103)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarInformacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnActualizarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnActualizarInformacion2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnActualizarInformacion2.setText("Registrar");
        btnActualizarInformacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInformacion2ActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel34.setText("Nuevo usuario");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnActualizarInformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(31, 31, 31))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(10, 10, 10)
                .addComponent(btnActualizarInformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelVentanaUsuariosLayout = new javax.swing.GroupLayout(jPanelVentanaUsuarios);
        jPanelVentanaUsuarios.setLayout(jPanelVentanaUsuariosLayout);
        jPanelVentanaUsuariosLayout.setHorizontalGroup(
            jPanelVentanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVentanaUsuariosLayout.setVerticalGroup(
            jPanelVentanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(36, 121, 121));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de ventas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°", "Cliente", "Fecha", "Monto"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Buscar por:");

        cbxBusquedaHistorial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxBusquedaHistorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "N° Venta", "Fecha" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusquedaHistorial)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBusquedaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxBusquedaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtBusquedaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelVentanaHistorialLayout = new javax.swing.GroupLayout(jPanelVentanaHistorial);
        jPanelVentanaHistorial.setLayout(jPanelVentanaHistorialLayout);
        jPanelVentanaHistorialLayout.setHorizontalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanelVentanaHistorialLayout.setVerticalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        JPanelProveedor.setBackground(new java.awt.Color(51, 51, 51));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel40.setText("CODIGO:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel41.setText("TELEFONO:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel42.setText("E-MAIL:");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel43.setText("PRODUCTO:");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setText("CANTIDAD:");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setText("NOMBRE:");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setText("MODIFICAR");

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField12)
                            .addComponent(jTextField11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrarIngreso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarIngreso.setText("REGISTRAR INGRESO");
        btnRegistrarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngresoActionPerformed(evt);
            }
        });

        btnVerProveedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVerProveedores.setText("VER PROVEEDORES");
        btnVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProveedoresActionPerformed(evt);
            }
        });

        btnRegistrarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarProveedor.setText("REGISTRAR PROVEEDOR");
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Telefono", "E-Mail", "Producto", "Cantidad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Gestionar Proveedores");

        javax.swing.GroupLayout JPanelProveedorLayout = new javax.swing.GroupLayout(JPanelProveedor);
        JPanelProveedor.setLayout(JPanelProveedorLayout);
        JPanelProveedorLayout.setHorizontalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelProveedorLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel47))
                    .addGroup(JPanelProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelProveedorLayout.setVerticalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProveedorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JPanelProveedorLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanelVentanaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanelVentanaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(JPanelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jPanelVentanaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jPanelVentanaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(JPanelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaVender);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaHistorial);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaClientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        abrirPanel(JPanelProveedor);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaUsuarios);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void cbxBuscarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProductoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProductoVentaActionPerformed

    private void txtCantidadVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVenderActionPerformed

    private void txtClienteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDNIActionPerformed

    private void btnBuscarClienteVentanaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteVentanaClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBuscarClienteVentanaClienteActionPerformed

    private void btnActualizarInformacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInformacion2ActionPerformed
        formRegistrarUsuarios ru = new formRegistrarUsuarios();
        ru.setVisible(true);
    }//GEN-LAST:event_btnActualizarInformacion2ActionPerformed

    private void btnRegistrarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngresoActionPerformed
        formRegistrarProveedor r = new formRegistrarProveedor();
        r.setVisible(true);
    }//GEN-LAST:event_btnRegistrarIngresoActionPerformed

    private void btnAgregarClienteVentanaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteVentanaClienteActionPerformed
        // TODO add your handling code here:
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteVentanaClienteActionPerformed

    private void btnBorrarBusquedaVentanaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarBusquedaVentanaClienteActionPerformed
        // TODO add your handling code here:
        cancelarBusqueda();
    }//GEN-LAST:event_btnBorrarBusquedaVentanaClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        if (buscarClienteVentas()) {
            cargarClienteVentas();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no existe en BD.");
            txtClienteDNI.setText(null);
            txtClienteDNI.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarStockActionPerformed
        // TODO add your handling code here:
        formActualizarProducto actualizarProducto = new formActualizarProducto();
        actualizarProducto.setVisible(true);
    }//GEN-LAST:event_btnActualizarStockActionPerformed

    private void btnCategoriaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaProductosActionPerformed
        // TODO add your handling code here:
        formCategorias categorias = new formCategorias();
        categorias.setVisible(true);
        categorias.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCategoriaProductosActionPerformed

    private void btnNuevaCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaProductoActionPerformed
        // TODO add your handling code here:
        formNuevaCategoria nuevaCategoria = new formNuevaCategoria();
        nuevaCategoria.setVisible(true);
        nuevaCategoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNuevaCategoriaProductoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        // TODO add your handling code here:
        formRegistrarProducto registrarProducto = new formRegistrarProducto();
        registrarProducto.setVisible(true);
        registrarProducto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaProductos();
            }
        });
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        // TODO add your handling code here:
        cancelarVenta();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerProveedoresActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        // TODO add your handling code here:
        agregarProductoParaVenta();
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        // TODO add your handling code here:
        int fila = tablaVenta.rowAtPoint(evt.getPoint());
        int columna = 0;
        int id = 0;
        if (fila > -1) {
            id = (int) model.getValueAt(fila, columna);
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto?");
        switch (opcion) {
            case 0:
                listaProductos.remove(id - 1);
                agregarProductoATabla();
                calcularImporteVenta();
                break;
            case 1:
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_tablaVentaMouseClicked

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // TODO add your handling code here:
        registrarVenta();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    // Permite activar SOLO el panel seleccionado
    private void abrirPanel(JPanel panel) {
        jPanelVentanaVender.setVisible(false);
        jPanelVentanaProductos.setVisible(false);
        jPanelVentanaClientes.setVisible(false);
        jPanelVentanaUsuarios.setVisible(false);
        jPanelVentanaHistorial.setVisible(false);
        JPanelProveedor.setVisible(false);
        if (panel != null) {
            panel.setVisible(true);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Ventana Ventas">
    private void iniciarTablaVentas() {
        model.addColumn("N");
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("Editar");
        tablaVenta.setModel(model);

        txtSubtotal.setText("0.00");
        txtIGV.setText("0.00");
        txtTotal.setText("0.00");
    }

    private void registrarVenta() {
        Venta venta = new Venta();
        DetalleVenta detalle = new DetalleVenta();
        C_Ventas cv = new C_Ventas();
        C_Cliente cc = new C_Cliente();

        if (listaProductos.size() <= 0) {
            JOptionPane.showMessageDialog(null, "Error: Llenar los campos.");
        } else {
            venta.setCodigo(txtBoleta.getText().trim());
            venta.setCodigoCliente(cc.obtenerCodigoCliente(codigoClienteVenta));
            venta.setImporte(Double.parseDouble(txtTotal.getText()));
            // Intentamos registrar la venta en la BBDD
            if (cv.registrarVenta(venta)) {
                JOptionPane.showMessageDialog(null, "Venta registrada.");
                // Registramos cada detalle de venta a la BBDD
                for (DetalleVenta d : listaProductos) {
                    detalle.setCodigoVenta(d.getCodigoVenta()); System.out.println(d.getCodigoVenta());
                    detalle.setCodigoDetalleVenta(d.getCodigoDetalleVenta());System.out.println(d.getCodigoDetalleVenta());
                    detalle.setCodigoProducto(d.getCodigoProducto());System.out.println(d.getCodigoProducto());
                    detalle.setCantidad(d.getCantidad());
                    detalle.setImporte(d.getImporte());
                    if (cv.registrarDetalleVenta(detalle)) {
                        System.out.println("Producto registrado.");
                        txtSubtotal.setText("0.00");
                        txtIGV.setText("0.00");
                        txtTotal.setText("0.00");
                        nProductosVenta = 1;
                        cargarProductosParaVenta();
                        cancelarVenta();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar detalle de venta.....");
                    }
                }

                listaProductos.clear();
                agregarProductoATabla();
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar venta.");
            }
        }
    }

    // Permite obtener los valores de un producto y agregarlo a la tabla
    private void agregarProductoParaVenta() {
        String productoSeleccionado = cbxBuscarProductoVenta.getSelectedItem().toString();
        if (productoSeleccionado.equals("Seleccionar producto:")) {
            JOptionPane.showMessageDialog(null, "Error: Seleccionar un producto válido.");
        } else if (txtClienteDatosVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Ingresar Cliente.");
        } else {
            if (txtCantidadVender.getText().isEmpty() || Integer.parseInt(txtCantidadVender.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Ingresar cantidad.");
            } else {

                int cantidadVenta = Integer.parseInt(txtCantidadVender.getText());
                obtenerDatosProductoParaVenta();
                if (stockProductoBBDDVenta >= cantidadVenta) {
                    double importe = redondear(cantidadVenta * precioProductoVenta);
                    DetalleVenta producto = new DetalleVenta(codigoClienteVenta + codigoProductoVenta.trim() + txtBoleta.getText().trim(), txtBoleta.getText().trim(), 
                            codigoProductoVenta,nombreProductoVenta, Integer.parseInt(txtCantidadVender.getText()), importe);
                    listaProductos.add(producto);
                    agregarProductoATabla();
                    cargarProductosParaVenta();
                    calcularImporteVenta();

                    JOptionPane.showMessageDialog(null, "Producto agregado.");
                    nProductosVenta++;
                    txtCantidadVender.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Cantidad supera el stock\nStock: " + stockProductoBBDDVenta);
                }
            }
        }
    }

    private void agregarProductoATabla() {
        model.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            model.setValueAt(i + 1, i, 0);
            model.setValueAt(listaProductos.get(i).getCodigoProducto(), i, 1);
            model.setValueAt(listaProductos.get(i).getNombre(), i, 2);
            model.setValueAt(listaProductos.get(i).getCantidad(), i, 3);
            model.setValueAt(listaProductos.get(i).getImporte(), i, 4);
            model.setValueAt("Eliminar", i, 5);
        }
        tablaVenta.setModel(model);
    }

    private void calcularImporteVenta() {
        double total = 0;
        for (DetalleVenta producto : listaProductos) {
            total += producto.getImporte();
        }

        double IGV = redondear(total * 0.18);
        double importeSubTotal = total - IGV;
        txtSubtotal.setText(String.valueOf(importeSubTotal));
        txtIGV.setText(String.valueOf(IGV));
        txtTotal.setText(String.valueOf(total));

    }

    // Obtiene los datos del producto seleccionado del Cbx
    private void obtenerDatosProductoParaVenta() {
        String query = "select * from Producto where nombre = '" + cbxBuscarProductoVenta.getSelectedItem() + "'";
        try {
            Connection c = Conexion.Conectar();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                codigoProductoVenta = rs.getString("codigo");
                nombreProductoVenta = rs.getString("nombre");
                precioProductoVenta = rs.getDouble("precio");
                stockProductoBBDDVenta = rs.getInt("stock");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto" + e.getMessage());
        }
    }

    private boolean buscarClienteVentas() {
        C_Cliente cliente = new C_Cliente();
        boolean existe = cliente.existeCliente(txtClienteDNI.getText());
        return existe;
    }

    private void cargarClienteVentas() {
        C_Cliente cliente = new C_Cliente();
        String nombre = cliente.obtenerNombreCliente(txtClienteDNI.getText());
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DNI no existe en la BD.");
        } else {
            txtClienteDatosVenta.setText(nombre);
            codigoClienteVenta = txtClienteDNI.getText();
            txtClienteDNI.setEditable(false);
            txtClienteDNI.setText(null);
        }
    }

    private void cargarProductosParaVenta() {
        Connection c = Conexion.Conectar();
        String query = "select * from Producto";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            cbxBuscarProductoVenta.removeAllItems();
            cbxBuscarProductoVenta.addItem("Seleccionar producto:");
            while (rs.next()) {
                cbxBuscarProductoVenta.addItem(rs.getString("Nombre"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar productos " + e.getMessage());
        }
    }

    private void cancelarVenta() {
        txtClienteDatosVenta.setText(null);
        txtClienteDNI.setEditable(true);
        txtClienteDNI.requestFocus();
    }

    private double redondear(double n) {
        return (Math.round(n) * 100) / 100;
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Productos">
    private void cargarTablaProductos() {
        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from Producto";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            jTableProductos = new JTable(model);
            jScrollPaneProductos.setViewportView(jTableProductos);
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Descripcion");
            model.addColumn("Stock");
            model.addColumn("Precio");
            model.addColumn("Categoria");
            while (rs.next()) {
                Object[] data = new Object[6];
                for (int i = 0; i < 6; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }

            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar los productos a la tabla.");
        }
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Cliente">
    private void agregarCliente() {
        Cliente cliente = new Cliente();
        C_Cliente cc = new C_Cliente();
        cliente.setCodigo(txtDNIRegistroCliente.getText());
        cliente.setNombre(txtNombreRegistroCliente.getText());
        cliente.setApellidos(txtApellidoRegistroCliente.getText());
        cliente.setDni(txtDNIRegistroCliente.getText());
        cliente.setTelefono(txtTelefonoRegistroCliente.getText());
        cliente.setDireccion(txtDireccionRegistroCliente.getText());
        cliente.setSexo(txtSexoRegistroCliente.getText());
        cliente.setEdad(txtEdadRegistroCliente.getText());
        if (registroEstaVacio()) {
            JOptionPane.showMessageDialog(null, "Completar campos vacios.");
        } else {
            if (cc.existeCliente(txtDNIRegistroCliente.getText()) == false) {
                if (cc.agregarCliente(cliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
                    reiniciarRegistroCliente();
                    cargarTablaClientes();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente ya registrado en BD.");
            }
        }
    }

    // Crear nuevo cliente en la base
    private void cargarTablaClientes() {

        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from TB_Cliente";
        Statement st;

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            tablaClientesVentanaCliente = new JTable(model);
            jScrollClientes.setViewportView(tablaClientesVentanaCliente);
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("DNI");
            model.addColumn("Telefono");
            model.addColumn("Direccion");
            model.addColumn("Sexo");
            model.addColumn("Edad");
            while (rs.next()) {
                Object[] data = new Object[8];
                for (int i = 0; i < 8; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al cargar las categorías.");
        }
    }

    private void cancelarBusqueda() {
        // cargarClientesEnTabla();
        txtFieldCodigoCliente.setText(null);
        txtFieldCodigoCliente.requestFocus();
    }

    private boolean registroEstaVacio() {
        return (txtNombreRegistroCliente.getText().trim().isEmpty()
                || txtApellidoRegistroCliente.getText().trim().isEmpty()
                || txtDNIRegistroCliente.getText().trim().isEmpty()
                || txtTelefonoRegistroCliente.getText().trim().isEmpty()
                || txtDireccionRegistroCliente.getText().trim().isEmpty()
                || txtSexoRegistroCliente.getText().trim().isEmpty()
                || txtEdadRegistroCliente.getText().trim().isEmpty());
    }

    // Reinicia la tabla de registro
    private void reiniciarRegistroCliente() {
        txtFieldCodigoCliente.setText(null);
        txtNombreRegistroCliente.setText(null);
        txtApellidoRegistroCliente.setText(null);
        txtDNIRegistroCliente.setText(null);
        txtTelefonoRegistroCliente.setText(null);
        txtDireccionRegistroCliente.setText(null);
        txtSexoRegistroCliente.setText(null);
        txtEdadRegistroCliente.setText(null);
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Extras">
    // </editor-fold> 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMenuPrincipal().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel JPanelProveedor;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton btnActualizarInformacion;
    private javax.swing.JButton btnActualizarInformacion2;
    private javax.swing.JButton btnActualizarStock;
    private javax.swing.JButton btnAgregarClienteVentanaCliente;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnBorrarBusquedaVentanaCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClienteVentanaCliente;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCategoriaProductos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnNuevaCategoriaProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegistrarIngreso;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVerProveedores;
    private javax.swing.JComboBox<String> cbxBuscarProductoVenta;
    private javax.swing.JComboBox<String> cbxBusquedaHistorial;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelVentanaClientes;
    private javax.swing.JPanel jPanelVentanaHistorial;
    private javax.swing.JPanel jPanelVentanaProductos;
    private javax.swing.JPanel jPanelVentanaUsuarios;
    private javax.swing.JPanel jPanelVentanaVender;
    private javax.swing.JScrollPane jScrollClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneProductos;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tablaClientesVentanaCliente;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtApellidoRegistroCliente;
    private javax.swing.JTextField txtBoleta;
    private javax.swing.JTextField txtBusquedaHistorial;
    private javax.swing.JTextField txtCantidadVender;
    private javax.swing.JTextField txtClienteDNI;
    private javax.swing.JTextField txtClienteDatosVenta;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo5;
    private javax.swing.JTextField txtDNIRegistroCliente;
    private javax.swing.JTextField txtDireccionRegistroCliente;
    private javax.swing.JTextField txtEdadRegistroCliente;
    private javax.swing.JTextField txtFieldCodigoCliente;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtNombreRegistroCliente;
    private javax.swing.JTextField txtSexoRegistroCliente;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelefonoRegistroCliente;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    // </editor-fold> 
}
