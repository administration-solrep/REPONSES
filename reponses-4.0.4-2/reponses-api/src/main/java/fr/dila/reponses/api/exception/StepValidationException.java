package fr.dila.reponses.api.exception;

import org.nuxeo.ecm.core.api.NuxeoException;

/**
 * Exception lever si l'étape de feuille de route n'a pas pu être validée
 * @author asatre
 *
 */
public class StepValidationException extends NuxeoException {
    /**
     * Serial version uid
     */
    private static final long serialVersionUID = 8218374132964281330L;

    private final CAUSEEXC causeExc;

    public StepValidationException(String message) {
        super(message);
        this.causeExc = CAUSEEXC.UNKNOWN;
    }

    public StepValidationException(String message, CAUSEEXC causeExc) {
        super(message);
        this.causeExc = causeExc;
    }

    public CAUSEEXC getCauseExc() {
        return causeExc;
    }

    public enum CAUSEEXC {
        UNKNOWN,
        SIGNATURE_INVALID
    }
}
