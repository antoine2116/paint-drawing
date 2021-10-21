import java.awt.*;
import java.util.ArrayList;

public class ToutSelection implements EtatSelection {

    @Override
    public void dessiner(IPanel panel, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo) {
        for (FormGeo selec : selectedFormesGeo) {
            panel.lightSquares(g2, selec);
            panel.repaint();
        }
    }
}