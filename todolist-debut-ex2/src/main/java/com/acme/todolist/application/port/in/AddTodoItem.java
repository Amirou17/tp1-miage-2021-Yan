package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

public interface AddTodoItem {
	
	/**
	 * Ajoute un item dans la liste
	 * @param item l'item à ajouter
	 */
	void addTodoItem(TodoItem item);

}
