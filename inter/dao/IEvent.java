package codingtonportal.model.inter.dao;

import codingtonportal.model.domain.Event;

public interface IEvent {
	public void insertevent(Event event);
	public void deleteevent(Event event);
	public void updateevent(Event event);
}
