import java.awt.*;
import java.util.ArrayList;

public interface EtatSelection {
    void dessiner(IPanel panel, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo);
}