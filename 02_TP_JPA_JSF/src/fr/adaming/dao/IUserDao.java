package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import fr.adaming.entities.Utilisateur;

public interface IUserDao {
	
	public List<Utilisateur> getAllUsersDao();
	public Utilisateur getByIdDao(int id);
	public void deleteDao(int id);
	public void addDao(Utilisateur u);
	public void updateDao(Utilisateur u);

}
