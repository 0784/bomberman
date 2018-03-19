
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * 
 * 
 * essa classe é reponsável por criar um inimigo que herda de uma classe retângulo senod assim um objeto rectangle.
 */

public class Inimigo extends Rectangle{

    
    private int posicaoX = 100,posicaoY = 100;
    
    public Inimigo p6;
   
        
    /**
     * 
     * @param posicaox retorna posição x.
     * @param posicaoy retorna posição y.
     * @param width é o parâmetro de largura.
     * @param height é o parâmetro de altura.
     */

    Inimigo(int posicaox, int posicaoy, int width, int height) {
        //configurações
        this.setX(posicaox);
        this.setY(posicaoy);
        this.setWidth(width);
        this.setHeight(height);
        this.setFill(new ImagePattern(new Image("imagens/inimigo10.png")));
        
    }
}