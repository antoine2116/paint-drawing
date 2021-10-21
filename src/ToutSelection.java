import java.awt.*;
import java.util.ArrayList;

public class ToutSelection implements EtatSelection {

    @Override
    public void dessiner(DessinPanel2 d, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo) {
        for (FormGeo selec : selectedFormesGeo) {
            d.lightSquares(g2, selec);
            d.repaint();
        }
    }
}