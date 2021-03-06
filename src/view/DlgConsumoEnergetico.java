/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ConsumoEnergeticoCTRL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.bean.ConsumoEnergetico;
import model.bean.UnidadeConsumidora;
import utils.Enumeradors;
import utils.Utilitarios;

/**
 *
 * @author KAI
 */
public class DlgConsumoEnergetico extends javax.swing.JDialog {

    private UnidadeConsumidora unidadeConsumidora;
    private boolean FirstRun = true;
    private List<ConsumoEnergetico> consumosEnergeticos = new ArrayList<>();

    /**
     * Creates new form DlgConsumoEnergetico
     *
     * @param parent
     * @param modal
     */
    public DlgConsumoEnergetico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgConsumoEnergetico(java.awt.Frame parent, boolean modal, UnidadeConsumidora pUnidCons) {
        super(parent, modal);
        initComponents();
        this.setUnidadeConsumidora(pUnidCons);
        this.IniciaForm();
        this.PopulaJTableConsumos();
        this.FirstRun = false;
    }

    public List<ConsumoEnergetico> getConsumosEnergeticos() {
        return consumosEnergeticos;
    }

    public void setConsumosEnergeticos(List<ConsumoEnergetico> consumosEnergeticos) {
        this.consumosEnergeticos = consumosEnergeticos;
    }

    public UnidadeConsumidora getUnidadeConsumidora() {
        return unidadeConsumidora;
    }

    public void setUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) {
        this.unidadeConsumidora = unidadeConsumidora;
        if (this.FirstRun) {
            this.setConsumosEnergeticos(ConsumoEnergeticoCTRL.BuscaPorUnidadeConsumidora(this.unidadeConsumidora));
            this.PopulaJTableConsumos();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConsumos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsumoEnergetico = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnAdicionarConsumoEnergetico = new javax.swing.JButton();
        btnGravarConsumosEnergeticos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consumo Energético");
        setResizable(false);

        pnlConsumos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblConsumoEnergetico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblConsumoEnergetico);

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ação"));

        btnAdicionarConsumoEnergetico.setText("Adicionar Consumo (fatura)");
        btnAdicionarConsumoEnergetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarConsumoEnergeticoActionPerformed(evt);
            }
        });

        btnGravarConsumosEnergeticos.setText("Gravar Consumos Energéticos");
        btnGravarConsumosEnergeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarConsumosEnergeticosActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarConsumoEnergetico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravarConsumosEnergeticos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarConsumoEnergetico)
                    .addComponent(btnGravarConsumosEnergeticos)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConsumosLayout = new javax.swing.GroupLayout(pnlConsumos);
        pnlConsumos.setLayout(pnlConsumosLayout);
        pnlConsumosLayout.setHorizontalGroup(
            pnlConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlConsumosLayout.setVerticalGroup(
            pnlConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarConsumoEnergeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarConsumoEnergeticoActionPerformed
        this.AdicionarConsumoEnergertico();
    }//GEN-LAST:event_btnAdicionarConsumoEnergeticoActionPerformed

    private void btnGravarConsumosEnergeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarConsumosEnergeticosActionPerformed
        this.GravarConsumoEnergetico();
    }//GEN-LAST:event_btnGravarConsumosEnergeticosActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgConsumoEnergetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DlgConsumoEnergetico dialog = new DlgConsumoEnergetico(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    private void IniciaForm() {
        this.setTitle(this.getTitle().concat(": ").concat(this.unidadeConsumidora.getNumeroMedidor()));
        Utilitarios.RePosicionaBotoes(new JButton[]{btnAdicionarConsumoEnergetico, btnGravarConsumosEnergeticos}, pnlBotoes, 230, true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarConsumoEnergetico;
    private javax.swing.JButton btnGravarConsumosEnergeticos;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlConsumos;
    private javax.swing.JTable tblConsumoEnergetico;
    // End of variables declaration//GEN-END:variables

    private void PopulaJTableConsumos() {
        int ContRecord = this.getConsumosEnergeticos() != null ? (!this.getConsumosEnergeticos().isEmpty() ? this.getConsumosEnergeticos().size() : 0) : 0;
        String[] ColunasTabela = new String[]{"Id", "Consumo (kW)", "Grupo", "Valor Fatura", "Tipo Ligação", "Mês", "Ano"};
        Object[][] dados = new Object[ContRecord][ColunasTabela.length];
        for (int linha = 0; linha < ContRecord; linha++) {
            int coluna = 0;
            dados[linha][coluna++] = this.consumosEnergeticos.get(linha).getId();
            dados[linha][coluna++] = String.valueOf(this.consumosEnergeticos.get(linha).getConsumo()).replace(",", "").replace(".", ",");
            dados[linha][coluna++] = this.consumosEnergeticos.get(linha).getGrupo();
            dados[linha][coluna++] = String.valueOf(this.consumosEnergeticos.get(linha).getValorFatura()).replace(",", "").replace(".", ",");
            dados[linha][coluna++] = this.consumosEnergeticos.get(linha).getTipoLigacao();
            dados[linha][coluna++] = this.consumosEnergeticos.get(linha).getMesReferencia();
            dados[linha][coluna++] = this.consumosEnergeticos.get(linha).getAnoReferencia();
        }
        DefaultTableModel mdl = new DefaultTableModel(dados, ColunasTabela) {
            boolean[] canEdit = new boolean[]{
                false, true, true, true, true, true, true
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        tblConsumoEnergetico.setModel(mdl);
        tblConsumoEnergetico.setAutoCreateRowSorter(true);
        tblConsumoEnergetico.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblConsumoEnergetico.setShowGrid(true);
        tblConsumoEnergetico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        int widthColumn0 = 40;
        int widthColumn1 = 80 * 2;
        int widthColumn2 = 60 * 2;
        int widthColumn4 = 50 * 2;
        int widthColumn5 = 120;
        int widthColumn3 = tblConsumoEnergetico.getWidth() - widthColumn0 - widthColumn1 - widthColumn2 - widthColumn4 - widthColumn5;

        tblConsumoEnergetico.getColumnModel().getColumn(0).setPreferredWidth(widthColumn0);
        tblConsumoEnergetico.getColumnModel().getColumn(1).setPreferredWidth(widthColumn1);
        tblConsumoEnergetico.getColumnModel().getColumn(2).setPreferredWidth(widthColumn2);
        tblConsumoEnergetico.getColumnModel().getColumn(3).setPreferredWidth(widthColumn3);
        tblConsumoEnergetico.getColumnModel().getColumn(4).setPreferredWidth(widthColumn4);
        tblConsumoEnergetico.getColumnModel().getColumn(5).setPreferredWidth(widthColumn5);

        // valor fatura
        javax.swing.JFormattedTextField txtVlrFatura = new javax.swing.JFormattedTextField();
        txtVlrFatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        tblConsumoEnergetico.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(txtVlrFatura));
        tblConsumoEnergetico.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(txtVlrFatura));

        tblConsumoEnergetico.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(new JComboBox(Enumeradors.TipoSaidaAC.values())));

        javax.swing.JFormattedTextField txtInteiro = new javax.swing.JFormattedTextField();
        txtInteiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

//        MeuEditorCellColumnJTable_Int xxx = null;
        tblConsumoEnergetico.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txtInteiro));
        tblConsumoEnergetico.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(txtInteiro));
    }

    private void AdicionarConsumoEnergertico() {
        List<ConsumoEnergetico> CEs = new ArrayList<>();
        this.consumosEnergeticos.removeAll(this.consumosEnergeticos);
        for (int i = 0; i < tblConsumoEnergetico.getRowCount(); i++) {
            int z = 0;
            ConsumoEnergetico ce = new ConsumoEnergetico();
            ce.setId((int) tblConsumoEnergetico.getValueAt(i, z++));
            ce.setConsumo(Double.parseDouble(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++)).replace(".", "").replace(",", ".")));
            ce.setGrupo((String) tblConsumoEnergetico.getValueAt(i, z++));
            ce.setValorFatura(Double.parseDouble(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++)).replace(".", "").replace(",", ".")));
            ce.setTipoLigacao(Enumeradors.TipoSaidaAC.valueOf(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setMesReferencia(Utilitarios.RetornaApenasNumeroInteiro(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setAnoReferencia(Utilitarios.RetornaApenasNumeroInteiro(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setUnidadeConsumidora(this.getUnidadeConsumidora());
            CEs.add(ce);
        }
        CEs.add(new ConsumoEnergetico());
        this.setConsumosEnergeticos(CEs);
        this.PopulaJTableConsumos();
    }

    private void GravarConsumoEnergetico() {
        this.consumosEnergeticos.removeAll(this.consumosEnergeticos);
        for (int i = 0; i < tblConsumoEnergetico.getRowCount(); i++) {
            int z = 0;
            ConsumoEnergetico ce = new ConsumoEnergetico();
            ce.setId(Integer.parseInt(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setConsumo(Utilitarios.ConverteTextoEmDouble(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setGrupo((String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setValorFatura(Utilitarios.ConverteTextoEmDouble(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setTipoLigacao(Enumeradors.TipoSaidaAC.valueOf(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setMesReferencia(Utilitarios.RetornaApenasNumeroInteiro(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setAnoReferencia(Utilitarios.RetornaApenasNumeroInteiro(String.valueOf(tblConsumoEnergetico.getValueAt(i, z++))));
            ce.setUnidadeConsumidora(this.getUnidadeConsumidora());
//            System.out.println(ce.toString());

            if (ce.getAnoReferencia() > 0
                    && ce.getConsumo() > 0
                    && ce.getMesReferencia() > 0
                    && ce.getValorFatura() > 0) {
                ConsumoEnergeticoCTRL.Gravar(ce);
            }
        }
        this.setConsumosEnergeticos(ConsumoEnergeticoCTRL.BuscaPorUnidadeConsumidora(this.unidadeConsumidora));
        this.PopulaJTableConsumos();
    }
}
