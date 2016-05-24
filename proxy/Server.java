package com.dyn.achievements.proxy;

import com.dyn.achievements.handlers.EventHandler;
import com.dyn.achievements.handlers.NotificationsManager;

import net.minecraftforge.common.MinecraftForge;

public class Server implements Proxy {

	@Override
	public NotificationsManager getNotificationsManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init() {
		EventHandler eH = new EventHandler();

		MinecraftForge.EVENT_BUS.register(eH);
	}

	/**
	 * @see forge.reference.proxy.Proxy#renderGUI()
	 */
	@Override
	public void renderGUI() {
		// Actions on render GUI for the server (logging)

	}

}