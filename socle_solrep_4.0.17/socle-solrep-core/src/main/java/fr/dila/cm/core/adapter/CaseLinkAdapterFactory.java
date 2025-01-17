/*
 * (C) Copyright 2006-2009 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Alexandre Russel
 *
 * $Id$
 */
package fr.dila.cm.core.adapter;

import static fr.dila.cm.caselink.CaseLinkConstants.CASE_LINK_FACET;
import static fr.dila.cm.caselink.CaseLinkConstants.CASE_LINK_SCHEMA;

import fr.dila.cm.core.caselink.ActionableCaseLinkImpl;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.NuxeoException;
import org.nuxeo.ecm.core.api.adapter.DocumentAdapterFactory;

/**
 * @author arussel
 */
public class CaseLinkAdapterFactory implements DocumentAdapterFactory {

    public Object getAdapter(DocumentModel doc, Class<?> arg1) {
        checkDocument(doc);
        return new ActionableCaseLinkImpl(doc);
    }

    protected void checkDocument(DocumentModel doc) {
        if (!doc.hasFacet(CASE_LINK_FACET)) {
            throw new NuxeoException("Document should have facet " + CASE_LINK_FACET);
        }
        if (!doc.hasSchema(CASE_LINK_SCHEMA)) {
            throw new NuxeoException("Document should contain schema " + CASE_LINK_SCHEMA);
        }
    }
}
