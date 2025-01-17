package fr.dila.st.api.constant;

/**
 * Liste des fonctions unitaires du socle transverse. Ces fonctions déterminent la possibilité de cliquer sur un bouton,
 * afficher un menu, accéder à un document où à une vue.
 *
 * @author jtremeaux
 */
public class STBaseFunctionConstant {
    /**
     * Modification sur la feuille de route.
     */
    public static final String ROUTE_MANAGERS = "routeManagers";

    /**
     * Gestion des utilisateurs : création.
     */
    public static final String UTILISATEUR_CREATOR = "UtilisateurCreator";

    /**
     * Gestion des utilisateurs : mise à jour.
     */
    public static final String UTILISATEUR_UPDATER = "UtilisateurUpdater";

    /**
     * Gestion des utilisateurs du ministère : mise à jour.
     */
    public static final String UTILISATEUR_MINISTERE_UPDATER = "UtilisateurMinistereUpdater";

    /**
     * Gestion des utilisateurs : suppression.
     */
    public static final String UTILISATEUR_DELETER = "UtilisateurDeleter";

    /**
     * Gestion des utilisateurs du ministère : suppression.
     */
    public static final String UTILISATEUR_MINISTERE_DELETER = "UtilisateurMinistereDeleter";

    /**
     * Gestion des profils : création.
     */
    public static final String PROFIL_CREATOR = "ProfilCreator";

    /**
     * Gestion des profils : mise à jour.
     */
    public static final String PROFIL_UPDATER = "ProfilUpdater";

    /**
     * Gestion des profils : suppression.
     */
    public static final String PROFIL_DELETER = "ProfilDeleter";

    /**
     * Gestion des feuilles de route : administrateur ministériel.
     */
    public static final String FEUILLE_DE_ROUTE_MODEL_UDPATER = "FDRModelUpdater";

    /**
     * Gestion des feuilles de route : administrateur fonctionnel.
     */
    public static final String FEUILLE_DE_ROUTE_MODEL_VALIDATOR = "FDRModelValidator";

    /**
     * Gestion des feuilles de route : redémarrage d'une instance de feuille de route.
     */
    public static final String FEUILLE_DE_ROUTE_INSTANCE_RESTARTER = "FDRInstanceRestarter";

    /**
     * Organigramme : Admin unlocker
     */
    public static final String ORGANIGRAMME_ADMIN_UNLOCKER = "OrganigrammeAdminUnlocker";

    /**
     * Accès à l'interface
     */
    public static final String INTERFACE_ACCESS = "InterfaceAccess";

    /**
     * Autorise l'accès à l'application quand l'accès restreint est actif
     */
    public static final String ADMIN_ACCESS_UNRESTRICTED = "AdminAccessUnrestricted";

    /**
     * Nom du groupe "Administrateur fonctionnel"
     */
    public static final String ADMIN_FONCTIONNEL_GROUP_NAME = "Administrateur fonctionnel";

    /**
     * Nom du groupe "Administrateur ministeriel"
     */
    public static final String ADMIN_MINISTERIEL_GROUP_NAME = "Administrateur ministériel";

    /**
     * Nom du groupe "Administrateur nominations"
     */
    public static final String ADMIN_NOMINATIONS_GROUP_NAME = "Administrateur nominations";

    /**
     * Nom de groupe "Superviseur SGG"
     */
    public static final String SUPERVISEUR_SGG_GROUP_NAME = "Superviseur SGG";

    /**
     * Nom de groupe "Contributeur SPM"
     */
    public static final String CONTRIBUTEUR_SPM_GROUP_NAME = "Contributeur SPM";

    /**
     * Nom du grope "Vigie du SGG"
     */
    public static final String VIGIE_SGG_GROUP_NAME = "Vigie du SGG";

    /**
     * Nom du groupe "Web service DILA"
     */
    public static final String WEB_SERVICE_DILA_GROUP_NAME = "Web service DILA";

    /**
     * Nom du groupe "Web service DILA"
     */
    public static final String WEB_SERVICE_MINISTERIEL_GROUP_NAME = "Webservices Ministériels";

    /**
     * Nom du groupe "Contributeur DILA"
     */
    public static final String CONTRIBUTEUR_DILA_GROUP_NAME = "Contributeur DILA";

    /**
     * Profil SGG.
     */
    public static final String PROFIL_SGG = "ProfilSGG";

    public static final String ASSEMBLEES_PARLEMENTAIRES_READER = "AssembleesParlementairesReader";

    /**
     * Autorise la sélection d'un poste d'un autre ministère
     */
    public static final String ALLOW_ADD_POSTE_ALL_MINISTERE = "AllowAddPosteAllMinistere";

    /**
     * Email : réception des méls destinés aux administrateurs fonctionnels.
     */
    public static final String ADMIN_FONCTIONNEL_EMAIL_RECEIVER = "AdminFonctionnelEmailReceiver";

    /**
     * Consultation du journal d'administration : reader
     */
    public static final String ADMINISTRATION_JOURNAL_READER = "AdministrationJournalReader";

    /**
     * Dossier : affichage de l'onglet journal
     */
    public static final String JOURNAL_READER = "JournalReader";

    /**
     * Consultation des profils : reader
     */
    public static final String ADMINISTRATION_PROFIL_READER = "ProfilReader";

    /**
     * Consultation des utilisateurs : reader
     */
    public static final String ADMINISTRATION_UTILISATEUR_READER = "UtilisateurReader";

    /**
     * Administration paramètres application : reader
     */
    public static final String ADMINISTRATION_PARAMETRE_APPLICATION_READER = "AdministrationParamReader";

    /**
     * Gestion des batchs : lecture.
     */
    public static final String BATCH_READER = "BatchSuiviReader";

    /**
     * Supervision des connexions des utilisateurs : reader
     */
    public static final String ADMINISTRATION_UTILISATEUR_SUPERVISION = "EspaceSupervisionReader";

    /**
     * Organigramme : droit de mise à jour
     */
    public static final String ORGANIGRAMME_UPDATER = "OrganigrammeUpdater";

    /**
     * Organigramme : droit de mise à jour
     */
    public static final String ORGANIGRAMME_READER = "OrganigrammeReader";

    /**
     * Organigramme : droit de mise à jour ministère uniquement
     */
    public static final String ORGANIGRAMME_MINISTERE_UPDATER = "OrganigrammeMinistereUpdater";

    public static final String ESPACE_ADMINISTRATION_READER = "EspaceAdministrationReader";

    /*
     * Droit permettant de voir les dates de dernière connexion sur tous les utilisateurs
     */
    public static final String DATE_DERNIERE_CONNEXION_ALL_USERS_VIEW = "dateDerniereConnexionAllUsersView";

    /*
     * Droit permettant de voir les dates de dernière connexion sur les utilisateurs de son ministères
     */
    public static final String DATE_DERNIERE_CONNEXION_USER_FROM_MINISTERE_VIEW =
        "dateDerniereConnexionUsersFromMinistereView";

    /**
     * utility class
     */
    protected STBaseFunctionConstant() {
        // do nothing
    }
}
