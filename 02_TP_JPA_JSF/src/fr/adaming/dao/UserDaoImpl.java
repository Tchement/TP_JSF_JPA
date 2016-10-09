package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.adaming.entities.Utilisateur;

public class UserDaoImpl implements IUserDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.adaming.dao.IUserDao#getArray()
	 */
	@Override
	public List<Utilisateur> getAllUsersDao() {

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		/**
		 * Créer un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Créer un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * Récupérer tous les utilisateurs
		 */
		/**
		 * Créer une requête JPQL
		 */
		String req = "SELECT u FROM Utilisateur u";

		/**
		 * Envoyer la requête
		 */
		Query getAllUserQuery = em.createQuery(req);

		listeUtilisateurs = getAllUserQuery.getResultList();
		
		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();

		return listeUtilisateurs;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.adaming.dao.IUserDao#getById()
	 */
	@Override
	public Utilisateur getByIdDao(int id_user) {

		Utilisateur utilisateur = new Utilisateur();

		/**
		 * Créer un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Créer un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * Récupérer un utilisateur par son ID
		 */
		/**
		 * Définir la requête JPQL
		 */
		String req = "SELECT u FROM Utilisateur u WHERE id_utilisateur=?1";

		/**
		 * Créer la requête et l'envoyer
		 */
		Query getUserByIdQuery = em.createQuery(req);

		utilisateur = (Utilisateur) getUserByIdQuery.getSingleResult();
		
		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();

		return utilisateur;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.adaming.dao.IUserDao#delete()
	 */
	@Override
	public void deleteDao(int id_user) {

		Utilisateur utilisateur = new Utilisateur();

		/**
		 * Créer un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Créer un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * Créer une transaction à partir de EM
		 */
		EntityTransaction tx = em.getTransaction();

		/**
		 * Ouvrir la transaction
		 */
		tx.begin();

		/**
		 * Rechercher l'utilisateur par son ID
		 */
		utilisateur = em.find(Utilisateur.class, id_user);

		/**
		 * Supprimer un utilisateur par son ID
		 */
		em.remove(utilisateur);

		/**
		 * Commiter la transaction
		 */
		tx.commit();

		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.adaming.dao.IUserDao#add()
	 */
	@Override
	public void addDao(Utilisateur utilisateur) {
		
		/**
		 * Créer un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Créer un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * Créer une transaction à partir de EM
		 */
		EntityTransaction tx = em.getTransaction();

		/**
		 * Ouvrir la transaction
		 */
		tx.begin();

		/**
		 * Ajouter un utilisateur
		 */
		em.persist(utilisateur);

		/**
		 * Commiter la transaction
		 */
		tx.commit();

		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.adaming.dao.IUserDao#update()
	 */
	@Override
	public void updateDao(Utilisateur utilisateur) {
		
		Utilisateur userToModify = new Utilisateur();
		
		/**
		 * Créer un Entity Manager Factory
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		/**
		 * Créer un Entity Manager
		 */
		EntityManager em = emf.createEntityManager();

		/**
		 * Créer une transaction à partir de EM
		 */
		EntityTransaction tx = em.getTransaction();

		/**
		 * Ouvrir la transaction
		 */
		tx.begin();
		
		
		/**
		 * Modifier un utilisateur
		 */
		
		/**
		 * Rechercher l'utilisateur par son ID
		 */
		userToModify = em.find(Utilisateur.class, utilisateur.getId_utilisateur());
		
		/**
		 * Instancier l'utilisateur modifié
		 */
		userToModify.setNom(utilisateur.getNom());
		userToModify.setPrenom(utilisateur.getPrenom());
		userToModify.setMail(utilisateur.getMail());
		userToModify.setPassword(utilisateur.getPassword());
		
		/**
		 * Envoyer la requête de modification
		 */
		em.merge(utilisateur);

		/**
		 * Commiter la transaction
		 */
		tx.commit();

		/**
		 * Fermer les flux
		 */
		em.close();
		emf.close();

	}
}
