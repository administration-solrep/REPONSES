package fr.dila.reponses.api.exception;

import org.nuxeo.ecm.core.api.NuxeoException;

/**
 * Exception lever si le dossier n'a pu être alloti
 * @author asatre
 *
 */
public class AllotissementException extends NuxeoException {

    public enum AllotissementExceptionRaison {
        ERROR_FDR,
        ERROR_LOCK,
        ERROR_ETAT_DOSSIER,
        ERROR_MINISTERE
    }

    private static final long serialVersionUID = -304730975762044062L;

    private AllotissementExceptionRaison raison;

    public AllotissementException(AllotissementExceptionRaison raison, String message) {
        super(message);
        this.setRaison(raison);
    }

    public void setRaison(AllotissementExceptionRaison raison) {
        this.raison = raison;
    }

    public AllotissementExceptionRaison getRaison() {
        return raison;
    }
}
