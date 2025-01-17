package fr.dila.ss.ui.services.organigramme;

import fr.dila.st.core.proxy.ServiceEncapsulateComponent;

public class SSMigrationManagerUIComponent
    extends ServiceEncapsulateComponent<SSMigrationManagerUIService, SSMigrationManagerUIServiceImpl> {

    /**
     * Default constructor
     */
    public SSMigrationManagerUIComponent() {
        super(SSMigrationManagerUIService.class, new SSMigrationManagerUIServiceImpl());
    }
}
