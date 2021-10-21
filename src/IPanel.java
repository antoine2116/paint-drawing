import java.awt.*;

/*
    Interface permettant de garder un couplage faible lors du passage en paramètre
    En vue de la mise en place de tests
 */

public interface IPanel {
    void lightSquares(Graphics2D g2D, FormGeo f);

    void repaint();
}
