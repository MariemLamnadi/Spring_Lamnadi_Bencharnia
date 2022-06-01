package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Developpeur;


public interface DevService {
	List<Developpeur> getDevs();

	void ajouter(Developpeur dev);

	void supprimer(int idDev);

	void modifier(Developpeur dev);

	Developpeur getDeveloppeur(int idDev);
	
}
