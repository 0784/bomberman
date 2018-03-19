
import java.util.ArrayList;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author carlos
 */

/**
 *
 * Essa classe é responsável por instanciar todos os objetos da primeira fase.
 */
public class Fase1 extends Scene {

    boolean status;
    int posicaox = 100;
    int posicaoy = 100;
    private Rectangle telaDefundo;
    Perso perso;
    Personagem personagem;
    
    Inimigo p6;
    Pane root;
    int statusMorte = 0;
    List<Inimigo> inimigos = new ArrayList();

    /**
     *
     * Esse construtor é responsável por receber os objetos da primeira fase.
     * 
     * @param root é um nó raiz.
     * @param i é um instanciamento do objeto super.
     * @param i0 é o segundo parâmetro do objeto super.
     */
    public Fase1(Pane root, int i, int i0) {
        super(root, i, i0);
        this.root = root;
        resetaFase1();

    }

    /**
     *
     * Esse método é responsável por resetar toda a fase 1 com seus respectivos objetos.
     */
    public void resetaFase1() {
        perso = new Perso(80, 80, 50, 50);
        personagem = new Personagem(89,87, 20, 20);
        
        p6 = new Inimigo(660, 330, 50, 50);

        telaDefundo = new Rectangle(0, 0, 800, 400);
        telaDefundo.setFill(new ImagePattern(new Image("bomber/fundo33.png")));
        root.getChildren().add(telaDefundo);

        
        inimigos.add(p6);

        root.getChildren().add(personagem);
        
        root.getChildren().add(p6);
        root.getChildren().add(perso);

    }
    
    /**
    * Esse método e responsável por fazer com que o perso ande a partir da comparação se o personagem está na sua mesma posição.
    * 
    */
    

    public void andar() {
        boolean statusCarro = perso.getBoundsInLocal().intersects(personagem.getBoundsInLocal());
        if (statusCarro == true) {
            root.getChildren().remove(personagem);

        }

    }

    /**
    * esse método é responsável por comparar se a posição do perso é a mesma se for verdadeiro ele seta uma imagem e o contador.
    * 
     */
    public void matar() {
        for (Inimigo inimigo : inimigos) {
            if (perso.getBoundsInParent().intersects(inimigo.getBoundsInLocal())) {
                inimigo.setFill(new ImagePattern(new Image("imagens/porta.png")));
                inimigos.remove(inimigo);

            }
        }

    }
    
  
    /**
    * 
    * 
    * @return personagens
    */

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

}
