-- Corbeille
CREATE UNIQUE INDEX "IDX_CASE_LINK_DATE" ON "CASE_LINK" ("DATE", "ID");
CREATE UNIQUE INDEX "IDX_DOS_REP_LINK_MIN_TASK_ID" ON "DOSSIER_REPONSES_LINK" ("IDMINISTEREATTRIBUTAIRE", "ROUTINGTASKTYPE", "ID");

-- Jeton
CREATE UNIQUE INDEX "IDX_JETON_DOC_COUNT" ON "JETON_DOC" ("ID_JETON", "ID_OWNER", "ID_DOC", "ID");

DROP INDEX "IDX_JETON_MAITRE_1";
DROP INDEX "IDX_JETON_MAITRE_2";

CREATE UNIQUE INDEX "IDX_JETON_MAITRE_2" ON "JETON_MAITRE" ("NUMERO_JETON", "ID");
CREATE UNIQUE INDEX "IDX_JETON_MAITRE_1" ON "JETON_MAITRE" ("ID_PROPRIETAIRE", "TYPE_WEBSERVICE", "ID");

-- Allotissement
CREATE INDEX "LOT_NAME_ID" ON "ALLOTISSEMENT" ("NOM", "ID");
CREATE UNIQUE INDEX "LOT_DOSSIER_ID" ON "DOSSIER_REPONSE" ("IDDOCUMENTQUESTION", "IDDOSSIERLOT", "ID");

commit;