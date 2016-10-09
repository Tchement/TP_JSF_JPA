package fr.adamin.managedBeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import fr.adaming.entities.Utilisateur;
import fr.adaming.service.AgentServiceImpl;
import fr.adaming.service.IAgentService;
import fr.adaming.service.IUserService;
import fr.adaming.service.UserServiceImpl;

@ManagedBean(name = "agentMB")
@ViewScoped
public class AgentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mail;
	private String password;
	List<Utilisateur> listUser;

	// Instancier un agentService pour utiliser ses méthodes
	IAgentService agentService = new AgentServiceImpl();

	// Instancier un utilisateurService pour utiliser ses méthodes
	IUserService utilisateurService = new UserServiceImpl();

	/**
 * 
 */
	public AgentBean() {
		listUser = utilisateurService.getAllUsersService();
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the listUser
	 */
	public List<Utilisateur> getListUser() {
		return listUser;
	}

	/**
	 * @param listUser
	 *            the listUser to set
	 */
	public void setListUser(List<Utilisateur> listUser) {
		this.listUser = listUser;
	}

	// La methode de connexion
	public String authentification() {

		int verif = agentService.isExistService(this.mail, this.password);
		if (verif == 1) {

			listUser = utilisateurService.getAllUsersService();
			return "succes";
		} else {
			return "echec";
		}

	}
}
