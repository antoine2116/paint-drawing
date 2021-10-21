import java.awt.*;
import java.util.ArrayList;

public interface EtatSelection {
    void dessiner(DessinPanel2 d, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo);
}