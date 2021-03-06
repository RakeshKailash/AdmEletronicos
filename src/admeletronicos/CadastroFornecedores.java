/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admeletronicos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Desenvolvimento
 */
public class CadastroFornecedores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCategorias
     */
    public CadastroFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomeForn = new javax.swing.JTextField();
        txt_telefoneForn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_enderecoForn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cnpjForn = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_fornecedores = new javax.swing.JTable();
        btn_cadastrarForn = new javax.swing.JButton();
        btn_atualizarForn = new javax.swing.JButton();
        btn_excluirForn = new javax.swing.JButton();
        btn_limparForn = new javax.swing.JButton();
        txt_idForn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar, Editar ou Excluir Fornecedores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        txt_nomeForn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_telefoneForn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        txt_enderecoForn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("CNPJ:");

        try {
            txt_cnpjForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cnpjForn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cnpjForn.setText("00.000.000/0000-00"); // NOI18N
        txt_cnpjForn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        table_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "CNPJ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_fornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_fornecedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_fornecedores);
        if (table_fornecedores.getColumnModel().getColumnCount() > 0) {
            table_fornecedores.getColumnModel().getColumn(0).setResizable(false);
            table_fornecedores.getColumnModel().getColumn(0).setPreferredWidth(30);
            table_fornecedores.getColumnModel().getColumn(1).setResizable(false);
            table_fornecedores.getColumnModel().getColumn(2).setResizable(false);
            table_fornecedores.getColumnModel().getColumn(3).setResizable(false);
            table_fornecedores.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_cadastrarForn.setText("Cadastrar");
        btn_cadastrarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarFornActionPerformed(evt);
            }
        });

        btn_atualizarForn.setText("Atualizar");
        btn_atualizarForn.setEnabled(false);
        btn_atualizarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarFornActionPerformed(evt);
            }
        });

        btn_excluirForn.setText("Excluir");
        btn_excluirForn.setEnabled(false);
        btn_excluirForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirFornActionPerformed(evt);
            }
        });

        btn_limparForn.setText("Limpar e Desselecionar");
        btn_limparForn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limparFornMouseClicked(evt);
            }
        });

        txt_idForn.setEditable(false);
        txt_idForn.setBackground(new java.awt.Color(204, 204, 204));
        txt_idForn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cnpjForn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_enderecoForn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefoneForn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cadastrarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_atualizarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluirForn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limparForn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idForn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_idForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_nomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_telefoneForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_enderecoForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cnpjForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadastrarForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizarForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limparForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection getConnection() throws SQLException {
        String username = "root", password = "", port = "3306", mydatabase = "admeletronicos", serverName = "localhost", type = "mysql";

        Connection conn;

        String url = "jdbc:" + type + "://" + serverName + ":" + port + "/" + mydatabase;
        try {
            conn = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Conectado com sucesso ao Banco de Dados");
            return conn;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao Banco de Dados \n-->" + e);
            return null;
        }
    }

    public ResultSet retrieveDB(String table, String select, String where, String otherOptions, int limit) throws SQLException {
        if (table == null) {
            table = "fornecedores";
        }

        if (select == null) {
            select = "*";
        }

        if (where != null) {
            where = "WHERE " + where;
        } else {
            where = "";
        }

        if (otherOptions == null) {
            otherOptions = "";
        }

        String formatedLimit = "";

        if (limit != 0) {
            formatedLimit = "LIMIT " + Integer.toString(limit);
        }

        String query = "SELECT " + select + " FROM " + table + " " + where + " " + otherOptions + " " + formatedLimit;

        System.out.println(query);

        try {
            Connection conn = getConnection();
            Statement querySearch = conn.createStatement();
            ResultSet result = querySearch.executeQuery(query);

            return result;
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
            return null;
        }
    }

    public boolean deleteDB(String table, String where) throws SQLException {
        try {
            String query = "DELETE FROM " + table + " WHERE " + where;
            Connection conn = getConnection();
            Statement deleteSt = conn.createStatement();

            deleteSt.execute(query);

            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
            return false;
        }
    }

    public boolean updateDB(String table, String[] columns, String[] objeto, String where) throws SQLException {
        if (objeto == null) {
            return false;
        }

        String values = null;

        String sets = "";

        for (int i = 0; i < columns.length; i++) {
            if (sets.equals("")) {
                sets = "`" + columns[i] + "` = '" + objeto[i] + "'";
            } else {
                sets = sets + ", `" + columns[i] + "` = '" + objeto[i] + "'";
            }
        }

        String query = "UPDATE " + table + " SET " + sets + " WHERE " + where;

        System.out.println("Inserir: " + query);

        Connection conn = getConnection();

        Statement insertSt = conn.createStatement();

        try {
            insertSt.executeUpdate(query);
            System.out.println("Item inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e);
            return false;
        }
    }

    public boolean insertDB(String table, String[] keys, String[] objeto) throws SQLException {
        if (objeto == null) {
            return false;
        }

        String values;
        String columns = String.join("`, `", keys);

        values = String.join("', '", objeto);

        String query = "INSERT INTO " + table + " (`" + columns + "`) VALUES ('" + values + "');";

        System.out.println("Inserir: " + query);

        Connection conn = getConnection();

        Statement insertSt = conn.createStatement();

        try {
            insertSt.executeUpdate(query);
            System.out.println("Item inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e);
            return false;
        }

    }

    public void updateFornecedores() throws SQLException {
        Connection conn = getConnection();
        Statement retrieveStatement = conn.createStatement();

        String query = "SELECT * FROM fornecedores ORDER BY idFornecedor DESC";
        ResultSet colunas = retrieveStatement.executeQuery(query);

        while (table_fornecedores.getRowCount() > 0) {
            ((DefaultTableModel) table_fornecedores.getModel()).removeRow(0);
        }

        int columns = colunas.getMetaData().getColumnCount();

        while (colunas.next()) {
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++) {
                row[i - 1] = colunas.getObject(i);
            }
            ((DefaultTableModel) table_fornecedores.getModel()).insertRow(colunas.getRow() - 1, row);
        }

        table_fornecedores.setRowSelectionInterval(0, 0);
        txt_idForn.setText(table_fornecedores.getModel().getValueAt(0, 0).toString());
        btn_atualizarForn.setEnabled(true);
        btn_excluirForn.setEnabled(true);
        btn_cadastrarForn.setEnabled(false);
    }

    private void btn_cadastrarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarFornActionPerformed
        //Inserir no Banco
        try {
            String nomeFornecedor = "", enderecoFornecedor = "", telefoneFornecedor = "", cnpjFornecedor = "";

            if (!txt_nomeForn.getText().equals("")) {
                nomeFornecedor = txt_nomeForn.getText();
            }

            if (!txt_enderecoForn.getText().equals("")) {
                enderecoFornecedor = txt_enderecoForn.getText();
            }

            if (!txt_telefoneForn.getText().equals("")) {
                telefoneFornecedor = txt_telefoneForn.getText();
            }

            if (!txt_cnpjForn.getText().equals("")) {
                cnpjFornecedor = txt_cnpjForn.getText();
            }

            String[] fornecedor = new String[4];
            String[] keys = {"nomeFornecedor", "cnpjFornecedor", "telefoneFornecedor", "enderecoFornecedor"};

            fornecedor[0] = nomeFornecedor;
            fornecedor[1] = cnpjFornecedor;
            fornecedor[2] = telefoneFornecedor;
            fornecedor[3] = enderecoFornecedor;

            boolean resultInsert = insertDB("fornecedores", keys, fornecedor);

            if (resultInsert) {
                updateFornecedores();
            }

//            String queryCategoria = "SELECT idCategoria FROM categorias WHERE nomeCategoria = " + nomeCategoria + " LIMIT 1";
            // Executar a Query das Categorias e armazenar os resultados em um ResultSet
            //System.out.println("Nome: " + nomeProduto);
            //System.out.println("Fornecedor: " + nomeFornecedor);
            //System.out.println("Quantia: " + String.valueOf(quantiaProduto));
            //System.out.println("Valor: " + String.valueOf(valorProduto));
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

    }//GEN-LAST:event_btn_cadastrarFornActionPerformed

    private void btn_atualizarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarFornActionPerformed
        String nomeFornecedor = "", enderecoFornecedor = "", telefoneFornecedor = "", cnpjFornecedor = "";

        if (!txt_nomeForn.getText().equals("")) {
            nomeFornecedor = txt_nomeForn.getText();
        }

        if (!txt_enderecoForn.getText().equals("")) {
            enderecoFornecedor = txt_enderecoForn.getText();
        }

        if (!txt_telefoneForn.getText().equals("")) {
            telefoneFornecedor = txt_telefoneForn.getText();
        }

        if (!txt_cnpjForn.getText().equals("")) {
            cnpjFornecedor = txt_cnpjForn.getText();
        }

        //Atualizar no Banco

    }//GEN-LAST:event_btn_atualizarFornActionPerformed

    private void btn_excluirFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirFornActionPerformed
        int idFornecedor = 0;

        if (!txt_idForn.getText().equals("")) {
            idFornecedor = Integer.valueOf(txt_idForn.getText());
        }

        //Excluir

    }//GEN-LAST:event_btn_excluirFornActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String selectProdutos = "idFornecedor, nomeFornecedor, telefoneFornecedor, enderecoFornecedor, cnpjFornecedor";

            ResultSet result = retrieveDB("fornecedores", selectProdutos, null, " ORDER BY idFornecedor DESC", 0);

            int columns = result.getMetaData().getColumnCount();

            while (result.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = result.getObject(i);
                }
                ((DefaultTableModel) table_fornecedores.getModel()).insertRow(result.getRow() - 1, row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void table_fornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_fornecedoresMouseClicked
        int row = table_fornecedores.getSelectedRow();
        TableModel model = table_fornecedores.getModel();

        String[] produto = new String[5];

        if (!model.getValueAt(row, 0).toString().equals("")) {
            produto[0] = model.getValueAt(row, 0).toString();
            produto[1] = model.getValueAt(row, 1).toString();
            produto[2] = model.getValueAt(row, 2).toString();
            produto[3] = model.getValueAt(row, 3).toString();
            produto[4] = model.getValueAt(row, 4).toString();

            txt_idForn.setText(produto[0]);
            txt_nomeForn.setText(produto[1]);
            txt_telefoneForn.setText(produto[2]);
            txt_enderecoForn.setText(produto[3]);
            txt_cnpjForn.setText(produto[4]);
            btn_atualizarForn.setEnabled(true);
            btn_excluirForn.setEnabled(true);
            btn_cadastrarForn.setEnabled(false);
        }
    }//GEN-LAST:event_table_fornecedoresMouseClicked

    private void btn_limparFornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limparFornMouseClicked
        table_fornecedores.clearSelection();
        txt_idForn.setText(null);
        txt_nomeForn.setText(null);
        txt_enderecoForn.setText(null);
        txt_telefoneForn.setText(null);
        txt_cnpjForn.setText(null);
        btn_atualizarForn.setEnabled(false);
        btn_excluirForn.setEnabled(false);
        btn_cadastrarForn.setEnabled(true);
    }//GEN-LAST:event_btn_limparFornMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarForn;
    private javax.swing.JButton btn_cadastrarForn;
    private javax.swing.JButton btn_excluirForn;
    private javax.swing.JButton btn_limparForn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_fornecedores;
    private javax.swing.JFormattedTextField txt_cnpjForn;
    private javax.swing.JTextField txt_enderecoForn;
    private javax.swing.JTextField txt_idForn;
    private javax.swing.JTextField txt_nomeForn;
    private javax.swing.JTextField txt_telefoneForn;
    // End of variables declaration//GEN-END:variables
}
