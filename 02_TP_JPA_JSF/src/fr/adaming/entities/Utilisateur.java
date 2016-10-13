/**
 * 
 */
package fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author inti0210
 *
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utilisateur;

	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "mail")
	private String mail;
	@Column(name = "password")
	private String password;

	@ManyToOne
	private Agent agent;

	/**
	 * Constructeur vide
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * Constructeur avec paramètres sans id
	 * 
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param password
	 */
	public Utilisateur(String nom, String prenom, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
	}

	/**
	 * Constructeur avec paramètres et id
	 * 
	 * @param id_utilisateur
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param password
	 */
	public Utilisateur(int id_utilisateur, String nom, String prenom,
			String mail, String password) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
	}

	/**
	 * Getters et Setters
	 */
	/**
	 * @return the id_utilisateur
	 */
	public int getId_utilisateur() {
		return id_utilisateur;
	}

	/**
	 * @param id_utilisateur
	 *            the id_utilisateur to set
	 */
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}

	/**
	 * @param agent
	 *            the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	/**
	 * Redéfinition de toString
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UtilisateurEntity [id_utilisateur=" + id_utilisateur + ", nom="
				+ nom + ", prenom=" + prenom + ", mail=" + mail + ", password="
				+ password + "]";
	}

}
