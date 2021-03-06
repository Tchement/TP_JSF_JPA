/**
 * 
 */
package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.adaming.entities.Agent;
import fr.adaming.managedBeans.AgentBean;

/**
 * @author inti0210
 *
 */
public class AgentDaoImpl implements IAgentDao {

	@Override
	public List<Agent> isExistDao(String login, String mdp) {

		/**
		 * Cr�er un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Cr�er un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * R�cup�rer un agent par ses mail et mot de passe
		 */
		/**
		 * D�finir la requ�te JPQL
		 */
		String req = "SELECT a FROM Agent a WHERE a.login=?1 and a.mdp=?2";

		/**
		 * Cr�er la requ�te et l'envoyer
		 */
		Query isExistAgentQuery = em.createQuery(req);
		isExistAgentQuery.setParameter(1, login);
		isExistAgentQuery.setParameter(2, mdp);

		@SuppressWarnings("unchecked")
		List<Agent> listeAgent = isExistAgentQuery.getResultList();

		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();

		if (listeAgent.size() == 1) {
			System.out.println("______________________________ On a trouv� un utilisateur____________________");
			return listeAgent;

		} else {
			System.out.println("\n______________________________ On n'a pas trouv� un utilisateur____________________");
			return null;
		}
	}
}
