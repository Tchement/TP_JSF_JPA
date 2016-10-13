package fr.adaming.managedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import fr.adaming.entities.Utilisateur;
import fr.adaming.service.IUserService;
import fr.adaming.service.UserServiceImpl;

@ManagedBean(name = "utilisateurMB")
@ViewScoped
public class UtilisateurBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Utilisateur utilisateur;

	// Instancier un utilisateurService pour utiliser ses m�thodes
	private IUserService utilisateurService = new UserServiceImpl();

	/**
	 * Constructeur vide
	 */
	public UtilisateurBean() {
		utilisateur = new Utilisateur();
		
	}

	/**
	 * Getters et Setters
	 */

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur
	 *            the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	// Les m�thodes du managedBean ne prennent jamais de parametres
	// M�thode pour ajouter un utilisateur � la base de donn�es
	public String ajout() {

		utilisateurService.addService(utilisateur);

		return "affichage";
	}

	// M�thode pour modifier un utilisateur de la base de donn�es

	public String modification() {

		utilisateurService.updateService(utilisateur);

		return "affichage";
	}

	// M�thode pour supprimer un utilisateur de la base de donn�es

	public String suppression() {

		utilisateurService.deleteService(utilisateur.getId_utilisateur());

		return "affichage";
	}

}
