-- Ajout de colonne idministererattachement et intituleMinistereRattachement dans la table Question

ALTER TABLE QUESTION ADD IDMINISTERERATTACHEMENT NVARCHAR2(50);
ALTER TABLE QUESTION ADD INTITULEMINISTERERATTACHEMENT NVARCHAR2(2000);

update question set IDMINISTERERATTACHEMENT=IDMINISTEREATTRIBUTAIRE, INTITULEMINISTERERATTACHEMENT=INTITULEMINISTEREATTRIBUTAIRE where LEGISLATUREQUESTION=14 and TYPEQUESTION='QE';
update question set IDMINISTERERATTACHEMENT='60002312', INTITULEMINISTERERATTACHEMENT='Ministère du travail, de l''emploi, de la formation professionnelle et du dialogue social' where IDMINISTEREATTRIBUTAIRE='60002541';
update question set IDMINISTERERATTACHEMENT='60003334', INTITULEMINISTERERATTACHEMENT='Ministère chargé des affaires européennes' where IDMINISTEREATTRIBUTAIRE='60002326';
update question set IDMINISTERERATTACHEMENT='60003331', INTITULEMINISTERERATTACHEMENT='Ministère chargé du budget' where IDMINISTEREATTRIBUTAIRE='60002592';

commit;


-- Ajout de colonne idDirectionPilote et intituleMinistereRattachement dans la table Question 

ALTER TABLE QUESTION ADD IDDIRECTIONPILOTE NVARCHAR2(50);
ALTER TABLE QUESTION ADD INTITULEDIRECTIONPILOTE NVARCHAR2(2000);

commit;


-- Ajout de colonne idDirectionPilote et intituleMinistereRattachement dans la table FeuilleRoute 

ALTER TABLE FEUILLE_ROUTE ADD IDDIRECTIONPILOTE NVARCHAR2(50);
ALTER TABLE FEUILLE_ROUTE ADD INTITULEDIRECTIONPILOTE NVARCHAR2(2000);


commit;


-- Ajout de colonne MINISTEREID dans la table ROUTING_TASK

ALTER TABLE ROUTING_TASK 
ADD
  (
    "MINISTEREID" NVARCHAR2(2000)
  )
;
COMMIT;

