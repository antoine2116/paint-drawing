import java.awt.*;
import java.util.ArrayList;

/*
    Interface présente en attribut de la classe DessinPanel2 permettant d'instancier
    les différentes classes l'implémentant seulement au changement d'état.
 */

public interface EtatSelection {
    void dessiner(IPanel panel, Graphics2D g2, ArrayList<FormGeo> selectedFormesGeo);
}