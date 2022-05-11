package org.indra.view;

import org.indra.model.IObserver;

public class FileSystemWatcher implements IObserver {

	@Override
	public void notificar(Object cambio) {
		System.out.println(cambio);	
	}

}
