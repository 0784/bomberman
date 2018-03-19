
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;



/**
 *
 * @author carlos
 * 
 */

/**
 * 
 * Essa classe é responsável por criar a tela de menu do jogo. 
 *
 */
public class Menu extends Scene{
    Label  tx1 = new Label();
    Rectangle telaDefundo;
    /**
     * 
     * @param root é uma variável super gerada automaticamento.
     * @param width é uma variável que serve de parâmetro da largura.
     * @param height é uma variável que serve de parâmetro da altura.
     */
    public Menu(Pane root, double width, double height) {
        super(root, width, height);
        tx1.setLayoutX(110);
        tx1.setLayoutY(280);
        tx1.setTextFill(Color.RED);
        tx1.setScaleX(1.2); // Aumenta letra
        tx1.setScaleY(1.2);
        telaDefundo = new Rectangle(1.7,0,800, 400);
                
        telaDefundo.setFill(new ImagePattern(new Image("bomber/menu24.png")));
        
        root.getChildren().addAll(telaDefundo,tx1);
        
    }
    
}
