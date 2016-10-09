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
import javax.persistence.Table;

/**
 * @author inti0210
 *
 */
@Entity
@Table(name = "agent")
public class Agent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_agent;

	@Column(name = "mail")
	private String login;
	@Column(name = "password")
	private String mdp;

	/**
	 * Constructeur vide
	 */
	public Agent() {
		super();
	}

	/**
	 * Constructeur avec param sans id
	 * 
	 * @param login
	 * @param mdp
	 */
	public Agent(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}

	/**
	 * Constructeur avec param et id
	 * 
	 * @param id_agent
	 * @param login
	 * @param mdp
	 */
	public Agent(int id_agent, String login, String mdp) {
		super();
		this.id_agent = id_agent;
		this.login = login;
		this.mdp = mdp;
	}

	/**
	 * Getters et Setters
	 */
	/**
	 * @return the id_agent
	 */
	public int getId_agent() {
		return id_agent;
	}

	/**
	 * @param id_agent
	 *            the id_agent to set
	 */
	public void setId_agent(int id_agent) {
		this.id_agent = id_agent;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp
	 *            the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
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
		return "Agent [id_agent=" + id_agent + ", login=" + login
				+ ", mdp=" + mdp + "]";
	}

}
