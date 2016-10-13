package fr.adaming.service;

import java.util.List;

import fr.adaming.entities.Utilisateur;

public interface IUserService {
	
	public List<Utilisateur> getAllUsersService();
	public Utilisateur getByIdService(int id);
	public void deleteService(int id);
	public void addService(Utilisateur u);
	public void updateService(Utilisateur utilisateur);

}
