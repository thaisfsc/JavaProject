
package componente;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class MeuCampoTexto extends JTextField implements FocusListener, MeuComponente{
    public MeuCampoTexto(int colunas) {
        setColumns(colunas);
        addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        setBackground(Color.WHITE);
    }

    @Override
    public boolean eVazio() {
       //String conteudo = getText();
       // String conteudoSemEspacos = conteudo.trim(); //o trim retira os espaços que estão sobrando antes ou depois da frase ou palavra que o usuário colocar
       //return conteudoSemEspacos.isEmpty();
       return getText().trim().isEmpty(); //é o resumo das três linhas acima comentadas, com o mesmo resultado
       
    }

    @Override
    public void limpar() {
        setText("");
    }

    @Override
    public void habilitar(boolean status) {
        setEnabled(status);
    }
    
}
    
