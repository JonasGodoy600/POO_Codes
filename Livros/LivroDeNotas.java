import javax.swing.JOptionPane;
public class LivroDeNotas{
    
    private String nomeDisciplina = null;

    //metodo setter
    public void setNomeDisciplina(String n){
        nomeDisciplina = n;

    }
    //metodo de instancia
    public void exibirMensagem(){
        //System.out.println("Bem Vindo ao Livro de Notas");
        JOptionPane.showMessageDialog(
            null, 
            String.format("Bem Vindo ao Livro de notas da disciplina %s", nomeDisciplina)
        );
        }
    
}