import java.awt.*;
import java.util.ArrayList;

public class UneSelection implements EtatSelection {
    public FormGeo courant;

    public UneSelection(FormGeo courant) {
        this.courant = courant;
    }

    @Override
    public void dessiner(IPanel panel, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo) {
        if (courant != null) {
            panel.lightSquares(g2, courant);
            panel.repaint();
        }
    }
}
