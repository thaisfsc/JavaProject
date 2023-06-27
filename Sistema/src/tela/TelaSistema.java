package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame; //Para fazer a importação apertar teclas: ctrl + shift + i
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
    public JDesktopPane jdp = new JDesktopPane();
    public JMenuBar jmb = new JMenuBar(); 
    public JMenu jmCadastros = new JMenu("Cadastros");
    public JMenu jmMovimentos = new JMenu ("Movimentos");
    public JMenu jmRelatorios = new JMenu ("Relatórios");
    public JMenuItem jmiEstado = new JMenuItem ("Estado");
    public JMenuItem jmiCidade = new JMenuItem ("Cidade");
    public JMenuItem jmiFornecedor = new JMenuItem ("Fornecedor");
    
   
    public TelaSistema() {
        getContentPane().add(jdp);
        setTitle("Sistema Comercial"); //para usar aspas duplas fn1 + shift 
        setSize(800, 600); //para usar a tela inteira automaticamente: setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para o programa sempre que fechar a janela.
        setJMenuBar(jmb);
        jmb.add(jmCadastros);
        jmb.add(jmMovimentos);
        jmb.add(jmRelatorios);
        jmCadastros.add(jmiEstado);
        jmCadastros.add(jmiCidade);
        jmCadastros.add(jmiFornecedor);
        jmiEstado.addActionListener(this);
        jmiCidade.addActionListener(this);
        jmiFornecedor.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiEstado) {
            TelaCadastroEstado telaCadastroEstado = new TelaCadastroEstado();
            jdp.add(telaCadastroEstado);
        } else if (ae.getSource() == jmiCidade) {
            TelaCadastroCidade telaCadastroCidade = new TelaCadastroCidade();
            jdp.add(telaCadastroCidade);
        } else if (ae.getSource() == jmiFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            jdp.add(telaCadastroFornecedor);
        } 
    }
}
