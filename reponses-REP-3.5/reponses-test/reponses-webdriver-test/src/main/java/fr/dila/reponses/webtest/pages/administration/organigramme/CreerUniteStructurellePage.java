package fr.dila.reponses.webtest.pages.administration.organigramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fr.dila.reponses.webtest.pages.ReponsesPage;
import fr.dila.st.webdriver.framework.CustomFindBy;
import fr.dila.st.webdriver.framework.CustomHow;
import fr.dila.st.webdriver.framework.STBy;
import fr.dila.st.webdriver.helper.NameShortener;

/**
 * Modélisation d'une unité structurelle
 * @author jgz
 *
 */
public class CreerUniteStructurellePage extends ReponsesPage{
	
	private static final String UNITÉS_STRUCTURELLES_DE_RATTACHEMENT = "Unités structurelles de rattachement";

	private static final String MINISTÈRES_DE_RATTACHEMENT = "Ministères de rattachement";

	private static final String LIBELLE = "Libellé";

	private static final String AUTRE = "Autre";

	private static final String DIRECTION = "Direction";

	@CustomFindBy(how = CustomHow.LABEL_TEXT, using = DIRECTION)
	private WebElement typeDirectionElt;
	
	@CustomFindBy(how = CustomHow.LABEL_TEXT, using = AUTRE)
	private WebElement typeAutreElt;
	
	@CustomFindBy(how = CustomHow.LABEL_ON_NUXEO_LAYOUT, using = LIBELLE)
	private WebElement libelleElt;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Enregistrer']")
	private WebElement enregisterBtnElt;	
	
	/**
	 * Le type de l'unité structurelle à créer est Direction
	 */
	public void setTypeDirection(){
		typeDirectionElt.click();
	}
	
	/**
	 * Le type de l'unité structurelle à créer est Autre
	 */
	public void setTypeAutre(){
		typeAutreElt.click();
	}
	
	/**
	 * Mise en place du libellé
	 * @param libelle
	 */
	public void setLibelle(String libelle){
		libelleElt.sendKeys(libelle);
	}
	
	/**
	 * Ajout d'un ministère de rattachement
	 * @param libelle
	 */
	public void addMinisteresRattachement(NameShortener ministereStructShortener){
		By uniteStrurelleRattachementBy = STBy.labelOnNuxeoLayoutForInput(MINISTÈRES_DE_RATTACHEMENT);
		setAutocompleteValue(ministereStructShortener, uniteStrurelleRattachementBy);
	}
	
	/**
	 * Ajout d'un ministère de rattachement
	 * @param libelle
	 * @throws InterruptedException 
	 */
	public void addUniteStructurelleRattachement(NameShortener uniteStructShortener){
		By uniteStructBy = STBy.labelOnNuxeoLayoutForInput(UNITÉS_STRUCTURELLES_DE_RATTACHEMENT);
		setAutocompleteValue(uniteStructShortener, uniteStructBy);
	}
	
	public void enregistrer(){
		enregisterBtnElt.click();
	}
	
	
}