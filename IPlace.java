package codingtonportal.model.interfaces.dao;


import java.io.IOException;

import codingtonportal.model.domain.Place;

public interface IPlace {
	public void insertplace(Place place) throws IOException, ClassNotFoundException;
	public void deleteplace(Place place) throws IOException, ClassNotFoundException;
	public void updateplace(Place place) throws IOException, ClassNotFoundException;
}
